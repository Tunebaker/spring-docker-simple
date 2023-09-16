package y.springdockersimple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @GetMapping("/")
    public String hello(){
        System.out.println("...some output to console...");
        return "Hello my new Docker!";
    }
}
