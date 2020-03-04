package totorial.security.rest;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTController {

    @GetMapping("/hello")
    @Secured("ROLE_ADMIN")
    public String hello() {
        return "Hello, World!";
    }

}
