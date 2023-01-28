package Behavior.Memento._01_after;

// Memento
public final class GameSave {
    private final int blueTeamScore;
    private final int redTeamScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return this.blueTeamScore;
    }

    public int getRedTeamScore() {
        return this.redTeamScore;
    }
}
