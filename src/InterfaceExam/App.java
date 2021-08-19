package InterfaceExam;

public class App {

    public static void main(String[] args) {

        Foo foo = new DefaultFoo("ys");
        foo.printName();
        foo.printNameUpperCase();
        Foo.printAnything();

    }

}
