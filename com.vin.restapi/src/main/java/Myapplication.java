import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.vin.restapi")
@SpringBootApplication
 
//The main class serves two purpose in a spring boot application: Configuration and bootstrapping.
public class Myapplication {
 
    public static void main(String[] args) {
        SpringApplication.run(Myapplication.class, args);
    }
}