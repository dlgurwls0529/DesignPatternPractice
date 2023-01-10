package Creation.Factory.Example;

public class Client {
    public static void main(String[] args) {
        Ship blackShip = new BlackShipFactory().orderShip("maverick", "dlgurwls0529@gmail.com");
        blackShip.checkAttribute();

        Ship whiteShip = new WhiteShipFactory().orderShip("tomcat", "dlgurwls0529@gmail.com");
        whiteShip.checkAttribute();

        Ship fastShip = new FastShipFactory().orderShip("Jason", "dlgurwls0529@gmail.com");
        fastShip.checkAttribute();

    }
}
