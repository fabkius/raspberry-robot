package cl.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan({"cl.robot"})
public class Robot {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(Robot.class, args);
    }


    @RequestMapping("/robot/greeting")
    public String greeting() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello from servicio robot!");
        return stringBuilder.toString();
    }

}