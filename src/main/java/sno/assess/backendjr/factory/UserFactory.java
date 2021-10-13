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

/**    private String username;

 private Set<Comment> createdComments;

 private Set<Post> createdPosts;
 private Set<Post> likes;
 private Set<Post> dislikes;*/

public class UserFactory {

    public static User createUser(String username,
                                  Set<Comment> comments,
                                  Set<Post> liked,
                                  Set<Post> disliked) {

        User user = new User.Builder()
                .setUsername(username)
                .setCreatedComments(comments)
                .setLikes(liked)
                .setDislikes(disliked)
                .build();

        return user;
    }

}
