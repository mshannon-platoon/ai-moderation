package ie.ai.util;

import ie.ai.user.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestUtils {

  public User createUser() {
    return User
        .builder()
        .username("userName")
        .email("email@email.com")
        .password("password")
        .mobileNumber("mobileNumber")
        .roles("PLAT_ADMIN,PLAT_USER")
        .build();
  }

}
