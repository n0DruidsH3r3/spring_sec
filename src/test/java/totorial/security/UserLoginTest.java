package totorial.security;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@Slf4j
public class UserLoginTest {

    @Test
    public void testLogin() {
        var encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        var x = encoder.encode("qwe");
        log.info(x);
    }
}
