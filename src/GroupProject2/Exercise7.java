package GroupProject2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple", "Banana", "Apricot", "Cherry", "Avocado");

        List<String> filteredList = stringList.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        filteredList.forEach(System.out::println);
    }
}

