import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // HelloWorld
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        // Cat
        Cat cat =
                (Cat) applicationContext.getBean("cat");
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");

        System.out.printf("HelloWorld: %s\nCat: %s", (bean == bean1), (cat == cat1));
    }
}