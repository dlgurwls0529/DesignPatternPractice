package Structure.Proxy._01_after;

public class VirtualProxy implements TextFile{

    private String fileName;
    private TextFile textFile;

    public VirtualProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String fetch() {
        if(textFile == null) {
            textFile = new SecretTextFile(fileName);
        }
        return "[proxy]" + textFile.fetch();
    }
}
