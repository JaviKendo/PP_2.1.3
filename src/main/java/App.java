import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean1 = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("Бины HelloWorld равны? " + (helloWorldBean1 == helloWorldBean2));
        System.out.println("Бины Cat равны? " + (catBean1 == catBean2));
    }
}