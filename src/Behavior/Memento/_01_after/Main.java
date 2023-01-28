package Behavior.Memento._01_after;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave gameSave = game.save();

        game.setBlueTeamScore(40);
        game.setRedTeamScore(50);

        game.restore(gameSave);
    }
}
