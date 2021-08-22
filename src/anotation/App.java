package anotation;

import java.util.Arrays;
import java.util.List;

@Chicken("양념")
@Chicken("간장")
public class App {

    public static void main(String[] args) {
        ChickenContainer chickenContainer = App.class.getAnnotation(ChickenContainer.class);
        Arrays.stream(chickenContainer.value()).forEach(chicken -> System.out.println(chicken.value()));
    }

    /*public static void main(@Chicken String[] args) throws @Chicken RuntimeException {

        List<@Chicken String> name = Arrays.asList("keesun");

    }
    static class FeelsLikeChicken<@Chicken T>{

        public static <@Chicken C> void print (@Chicken C c){*/

}