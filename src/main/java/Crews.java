import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Crews {

    public static final List<String> names;

    static {
        names = FileReaderUtil.read("src/main/resources/crews_nickname.txt");
        Collections.shuffle(names);
    }

}
