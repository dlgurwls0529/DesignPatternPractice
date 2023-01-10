package Creation.Prototype._01;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        Ship ship1 = ship.clone();
        BlackShip blackShip = (BlackShip) ship.clone();
        RedShip redShip = (RedShip) ship.clone();


    }
}
