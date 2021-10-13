package sno.assess.backendjr.factory;

/**
 * Author: Justin Scott Jenecke
 * Factory class for Comment.Class instances
 * Date: 13/10/2021
 * */

import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.entity.User;

public class CommentFactory {

    public static Comment createComment(String body,
                                        User author,
                                        Post post) {

        return new Comment.Builder()
                .setBody(body)
                .setUser(author)
                .setPost(post)
                .build();
    }
}
