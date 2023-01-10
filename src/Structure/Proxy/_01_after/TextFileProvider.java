package Structure.Proxy._01_after;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextFileProvider {

    public static List<SecretTextFile> getSecretTextFile(int start, int end) {
        return IntStream.range(start, end)
                .mapToObj(i -> new SecretTextFile(String.valueOf(i)))
                .collect(Collectors.toList());
    }

    public static List<VirtualProxy> getProxyTextFile(int start, int end) {
        return IntStream.range(start, end)
                .mapToObj(i -> new VirtualProxy(String.valueOf(i)))
                .collect(Collectors.toList());
    }
}
