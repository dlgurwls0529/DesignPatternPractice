package Structure.Bridge._01_after;

public class DefaultProfessor implements Professor{

    protected Skin skin;
    protected String name;

    public DefaultProfessor(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void teach() {
        System.out.println(skin.getName() + name + "is teaching");
    }

    @Override
    public void evaluate() {
        System.out.println(skin.getName() + name + "is evaluating");
    }

    @Override
    public void move() {
        System.out.println(skin.getName() + name + "is moving");
    }
}
