package totorial.security.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "app")
public class AppSecurityConfigProperties {

    private List<AppUser> users;

    @Data
    public static class AppUser {
        private String username;
        private String password;
        private String role;
    }
}
