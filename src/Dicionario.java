import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dicionario  {

    private static List<String>tokens = new ArrayList<>();

    static List<String>AdicionarTokens(List<String> dicionario){
        dicionario.forEach(token ->{
           String[] vetor = token.split("\\|");
           for (String s: vetor){
               tokens.add(s);
           }
        });
        return tokens;
    }
}
