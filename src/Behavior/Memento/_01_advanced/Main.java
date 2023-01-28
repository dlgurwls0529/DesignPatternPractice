package Behavior.Memento._01_advanced;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(30);

        /*
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("GameSave.hex"));
        objectOutputStream.writeObject(game);
        objectOutputStream.close();
        // object close 만 하면 내부에서 fileOutput 까지 닫아줌
        */

        game.save();

        game.setBlueTeamScore(50);
        game.setRedTeamScore(100);

        /*
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("GameSave.hex"));
        game = (Game) objectInputStream.readObject();
        objectInputStream.close();
        */

        game.restore();

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
