package examples.graphql.graphqlApp2.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
})
public class GraphqlApp2Application {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApp2Application.class, args);
    }

}
