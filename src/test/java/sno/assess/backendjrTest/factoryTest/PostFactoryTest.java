package sno.assess.backendjrTest.factoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Justin Scott Jenecke
 * PostFactoryTest.java for PostFactory unit testing
 * Date: 13/10/2021
 * */


public class PostFactoryTest {

    //Data
    Post post;
    Set<Comment> testComments;
    Comment comment;

    @BeforeEach
    void setUp() {
        testComments = new HashSet<>();

        comment = new Comment.Builder().build();
    }

    @Test
    void test(){

        post = new Post.Builder()
                .setPostId("01012")
                .setTitle("A Title")
                .setBody("Lorem ipsum")
                .setLikes(0)
                .setDislikes(0)
                .setComments(testComments)
                .build();

        post.getComments().add(comment);

        //Testing all object was created successfully
        assertEquals("01012", post.getPostId());
        assertEquals("A Title", post.getTitle());
        assertEquals("Lorem ipsum", post.getBody());
        assertEquals(0, post.getLikes());
        assertEquals(0, post.getDislikes());
        assertNotNull(post.getComments());

        //Test whether object can be added to Set successfully
        assertEquals(1, post.getComments().size());

    }

}
