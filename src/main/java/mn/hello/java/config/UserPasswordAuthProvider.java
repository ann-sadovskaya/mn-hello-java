package mn.hello.java.config;

import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.*;
import io.reactivex.Flowable;
import org.reactivestreams.Publisher;

import javax.inject.Singleton;
import java.util.Arrays;

@Singleton
public class UserPasswordAuthProvider implements AuthenticationProvider {

    @Override
    public Publisher<AuthenticationResponse> authenticate( HttpRequest<?> httpRequest, AuthenticationRequest<?, ?> authenticationRequest) {
        if (authenticationRequest.getIdentity().equals("username") &&
        authenticationRequest.getIdentity().equals("password")){
            UserDetails u = new UserDetails(authenticationRequest.getIdentity().toString(), Arrays.asList("ROLE_USER"));
            return Flowable.just(u);
        }
        return Flowable.just(new AuthenticationFailed());
    }
}
