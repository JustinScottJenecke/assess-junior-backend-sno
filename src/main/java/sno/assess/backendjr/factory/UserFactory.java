package sno.assess.backendjr.factory;

import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.entity.User;

import java.util.Set;

/**
 * Author: Justin Scott Jenecke
 * Factory class for User.Class instances
 * Date: 13/10/2021
 * */

public class UserFactory {

    public static User createUser(String username,
                                  Set<Comment> comments,
                                  Set<Post> createdPosts,
                                  Set<Post> liked,
                                  Set<Post> disliked) {

        return new User.Builder()
                .setUsername(username)
                .setCreatedComments(comments)
                .setCreatedPosts(createdPosts)
                .setLikes(liked)
                .setDislikes(disliked)
                .build();

    }

}
