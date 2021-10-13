package sno.assess.backendjrTest.factoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.entity.User;
import sno.assess.backendjr.factory.PostFactory;
import sno.assess.backendjr.factory.UserFactory;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Justin Scott Jenecke
 * CommentFactoryTest.java for CommentFactory unit testing
 * Date: 13/10/2021
 * */

public class CommentFactoryTest {

    User mockUser;
    Post mockPost;

    @BeforeEach
    void setup() {

        mockUser = new User.Builder().build();
        mockPost = new Post.Builder().build();
    }

    @Test
    void createCommentTest(){

        Comment testComment = new Comment.Builder()
                .setCommentId("C74U8P2")
                .setBody("Lorem ipsum")
                .setUser(mockUser)
                .setPost(mockPost)
                .build();

        assertEquals("C74U8P2", testComment.getCommentId());
        assertEquals("Lorem ipsum", testComment.getBody());
        assertEquals(mockUser, testComment.getUser());
        assertEquals(mockPost, testComment.getPost());
    }

}
