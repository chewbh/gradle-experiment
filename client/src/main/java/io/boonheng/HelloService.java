package io.boonheng;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

  @RequestMapping("/hello")
  public String index() {
    return "Greetings from Spring Boot with Gradle!";
  }

}
