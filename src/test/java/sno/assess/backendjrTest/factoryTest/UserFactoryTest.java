package sno.assess.backendjrTest.factoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.entity.User;
import sno.assess.backendjr.factory.PostFactory;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Justin Scott Jenecke
 * UserFactoryTest.java for UserFactory unit testing
 * Date: 13/10/2021
 * */

public class UserFactoryTest {

    //Data
    User testUser;

    Set<Comment> createdComments;
    Comment sampleComment;

    Set<Post> createdPosts;
    Set<Post> liked;
    Set<Post> disliked;

    Post samplePost;

    @BeforeEach
    void setup() {

        //Mock data
        createdComments = new HashSet<>();
        sampleComment = new Comment.Builder().setBody("Lorem Ipsum").build();

        createdPosts = new HashSet<>();
        liked = new HashSet<>();
        disliked = new HashSet<>();
        samplePost = new Post.Builder().setBody("Ipsum lorem pi cen").build();
    }

    @Test
    void testCreateUser(){
        testUser = new User.Builder()
                .setUserId("U456")
                .setUsername("userOne")
                .setCreatedComments(createdComments)
                .setCreatedPosts(createdPosts)
                .setLikes(liked)
                .setDislikes(disliked)
                .build();

        //Checking to ensure instance of User is created successfully
        assertEquals("U456", testUser.getUserId());
        assertEquals("userOne", testUser.getUsername());

        assertNotNull(testUser.getCreatedComments());
        assertNotNull(testUser.getCreatedPosts());
        assertNotNull(testUser.getLikes());
        assertNotNull(testUser.getDislikes());

        //ensuring Sets are correctly initialized and behave as expected
        testUser.getCreatedComments().add(sampleComment);
        testUser.getCreatedPosts().add(samplePost);
        testUser.getLikes().add(samplePost);
        testUser.getDislikes().add(samplePost);

        assertEquals(1, testUser.getCreatedComments().size());
        assertEquals(1, testUser.getCreatedPosts().size());
        assertEquals(1, testUser.getLikes().size());
        assertEquals(1, testUser.getDislikes().size());

    }

}
