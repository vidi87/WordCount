import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessor {


    public Map<String, Long> getWordsCount(String fileName) {
        List<String> list = new ArrayList<>();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(s -> {
                s = s.replaceAll("[^\\s\\w]", "");
                String[] array = s.split(" ");
                list.addAll(Arrays.asList(array));
            });
        } catch (IOException e) {
            System.out.println("Can't read file!");
            return new HashMap<>();
        }


        Map<String, Long> result =
                list.stream().filter(x-> x.matches("[a-zA-Z]+")).collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

       return result;
    }


}
