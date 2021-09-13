import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cport {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("../Cport/src/cport.txt");
        // Files.lines(path).forEach(System.out::println);
        List<String> variaveis = new ArrayList<>();
        List<String> linhas = Files.lines(path).collect(Collectors.toList());
        List<String> dicionario = Files.lines(Paths.get("../Cport/src/dicionario.txt")).collect(Collectors.toList());
        List<String> tokens = Dicionario.AdicionarTokens(dicionario);
        linhas.forEach(linha -> {
            String[] palavras = linha.trim().split("\\s");
            for (String p :palavras ){
              if(!p.isEmpty()) variaveis.add(p);
            }
        });


        tokens.forEach(token -> validar(token,variaveis));

    }


    static void validar(String tokens, List<String> palavras) {
        for (String variavel : palavras) {
            if (variavel.contains(tokens)) {
                System.out.println("tem no dicionario : " + variavel);
            }
        }


    }

}
