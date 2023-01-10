package Structure.FlyWeight._01_after;

public class Main {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character character1 = new Character('a', "red", fontFactory.getFont("nanum:12"));
        Character character2 = new Character('b', "black", fontFactory.getFont("nanum:12"));
        Character character3 = new Character('c', "blue", fontFactory.getFont("nanum:12"));
        Character character4 = new Character('d', "white", fontFactory.getFont("nanum:12"));

        System.out.println(character1.getFont() == character2.getFont());
        System.out.println(character1.getFont() == character3.getFont());

        String str1 = "test";
        String str2 = "test";

        System.out.println(str1 == str2);
    }
}
