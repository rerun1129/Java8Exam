package Java8APIMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class App  {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("이윤석");
        name.add("김윤석");
        name.add("고윤석");
        name.add("최윤석");
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        name.forEach(System.out::println);
    }
}
