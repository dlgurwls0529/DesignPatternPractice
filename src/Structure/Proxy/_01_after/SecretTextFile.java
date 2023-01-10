package Structure.Proxy._01_after;

public class SecretTextFile implements TextFile {

    private String plainText;

    public SecretTextFile(String plainText) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.plainText = plainText;
    }

    @Override
    public String fetch() {
        return plainText;
    }
}
