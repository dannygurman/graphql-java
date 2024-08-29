package examples.graphql.graphqlApp2.intro.web;

import examples.graphql.graphqlApp2.intro.dao.PostDao;
import examples.graphql.graphqlApp2.intro.model.Author;
import examples.graphql.graphqlApp2.intro.model.Post;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    private final PostDao postDao;

    public AuthorController(PostDao postDao) {
        this.postDao = postDao;
    }

    @SchemaMapping
    public List<Post> posts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}