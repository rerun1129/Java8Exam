package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Lee 윤석");
        name.add("Kim 윤석");
        name.add("Ko 윤석");
        name.add("Choi 윤석");

        Stream<String> stringStream = name.stream().map(String::toUpperCase);
        List<String> stringStream1 = name.stream().map(String::toUpperCase).collect(Collectors.toList());

        name.forEach(System.out::println);
    }
}
