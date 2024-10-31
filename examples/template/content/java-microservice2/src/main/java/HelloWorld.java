import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {

  @GetMapping("/")
  public String helloWorld() {
    return "Hello World of Backstage!";
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloWorld.class, args);
  }
}