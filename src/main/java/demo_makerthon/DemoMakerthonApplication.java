package demo_makerthon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@SpringBootApplication
public class DemoMakerthonApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMakerthonApplication.class, args);
    }

}

