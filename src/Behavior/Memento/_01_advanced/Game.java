package Behavior.Memento._01_advanced;

import java.io.*;

public class Game implements Serializable {
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

    public void save() {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("GameSave.hex"));) {
            objectOutputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void restore() {
        // 괄호 안에 넣으면 try 끝나고 인스턴스 자동 close
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("GameSave.hex"));) {
            Game game = (Game) objectInputStream.readObject();
            this.blueTeamScore = game.blueTeamScore;
            this.redTeamScore = game.redTeamScore;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
