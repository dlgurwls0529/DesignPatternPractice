package Structure.Proxy._01_after;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<TextFile> textFileList = new ArrayList<>();

        textFileList.addAll(TextFileProvider.getSecretTextFile(0, 3));
        textFileList.addAll(TextFileProvider.getProxyTextFile(3, 20));

        textFileList.stream().map(TextFile::fetch).forEach(System.out::println);
    }
}
