package optional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(5, "rest api development",false));

        Optional<OnlineClass> onlineClass = springClasses.stream()
                .filter(c -> c.getTitle().startsWith("rest"))
                .findFirst();


        onlineClass.ifPresent(c -> System.out.println(c.getTitle()));
        OnlineClass onlineClass1 = onlineClass.orElseGet(App::createNewClass);
        OnlineClass onlineClass2 = onlineClass.orElseThrow(()->{
            return new IllegalStateException();
        });
        Optional<OnlineClass> onlineClass3 = onlineClass
                .filter(c->c.getId()==5);
        System.out.println(onlineClass3.get().getTitle());

    }

    private static OnlineClass createNewClass() {
        return null;
    }
}
