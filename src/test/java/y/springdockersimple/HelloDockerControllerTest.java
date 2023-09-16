package y.springdockersimple;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class HelloDockerControllerTest {

    HelloDockerController helloDockerController;

    @Test
    void hello() {
        helloDockerController = new HelloDockerController();
        assertEquals(3, 2+1);
        log.info("тестик тестик");
        System.out.println("ТЕСТИЩЕ!");
    }
}