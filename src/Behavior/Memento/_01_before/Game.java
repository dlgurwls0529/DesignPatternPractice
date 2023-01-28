package Behavior.Memento._01_before;

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
}
