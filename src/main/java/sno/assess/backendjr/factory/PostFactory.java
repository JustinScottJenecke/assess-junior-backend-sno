package sno.assess.backendjr.factory;

/**
 * Author: Justin Scott Jenecke
 * Factory class for Post.Class instances
 * Date: 13/10/2021
 * */


import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.entity.User;

import java.util.Set;

public class PostFactory {

    public static Post createPost(User author,
                                  String title,
                                  String body,
                                  int likes,
                                  int dislikes,
                                  Set<Comment> comments) {

        return new Post.Builder()
                .setAuthor(author)
                .setTitle(title)
                .setBody(body)
                .setLikes(likes)
                .setDislikes(dislikes)
                .setComments(comments)
                .build();

    }

}
