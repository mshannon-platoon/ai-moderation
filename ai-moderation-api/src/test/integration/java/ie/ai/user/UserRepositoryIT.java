package ie.ai.user;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import ie.ai.BaseIntegrationTest;
import ie.ai.AiModerationApplication;
import ie.ai.util.TestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AiModerationApplication.class)
@ActiveProfiles("integration")
public class UserRepositoryIT extends BaseIntegrationTest {

  @Autowired
  private UserRepository userRepository;

  @Before
  public void before() {
    userRepository.deleteAll();
  }

  @Test
  public void testSave() {
    User user = userRepository.save(TestUtils.createUser());
    assertNotNull(user);
    assertNotNull(user.getId());
  }

}
