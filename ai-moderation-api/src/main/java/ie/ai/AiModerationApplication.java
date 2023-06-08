package ie.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AiModerationApplication {

  public static void main(String[] args) {
    SpringApplication.run(AiModerationApplication.class, args);
  }

}
