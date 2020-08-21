package mn.hello.java.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Controller("/helloworld")
public class HelloWorldController {

    @Get
    @Secured(SecurityRule.IS_ANONYMOUS)
    public String getOK() {
        return "Hello world";
    }
}
