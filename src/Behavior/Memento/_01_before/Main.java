package Behavior.Memento._01_before;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        game.setBlueTeamScore(100);
        game.setRedTeamScore(50);

        game.setBlueTeamScore(blueTeamScore);
        game.setRedTeamScore(redTeamScore);
    }
}
