package mn.hello.java.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Controller("/user")
public class UserController {

    @Get
    @Secured(SecurityRule.IS_AUTHENTICATED)
    public String index(){
        return "Hello user";
    }
}
