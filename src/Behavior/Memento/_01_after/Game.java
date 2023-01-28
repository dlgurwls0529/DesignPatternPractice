package Behavior.Memento._01_after;

// Originator
public class Game {
    private int blueTeamScore;
    private int redTeamScore;

    public Game() {
        this.blueTeamScore = 0;
        this.redTeamScore = 0;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    // create memento
    public GameSave save() {
        return new GameSave(blueTeamScore, redTeamScore);
    }

    // restore
    public void restore(GameSave gameSave) {
        this.redTeamScore = gameSave.getRedTeamScore();
        this.blueTeamScore = gameSave.getBlueTeamScore();
    }
}
