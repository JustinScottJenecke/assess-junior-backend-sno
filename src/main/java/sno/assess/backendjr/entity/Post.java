package sno.assess.backendjr.entity;

/**
 * Author: Justin Scott Jenecke
 * POJO class for Post entity
 * Date Created: 12/10/2021
 * */

import java.util.Set;

public class Post {

    private String postId;
    private User author;
    private String title;
    private String body;

    private int likes;
    private int dislikes;

    private Set<Comment> comments;

    protected Post() {
    }

    private Post(Builder b) {
        this.postId = b.postId;
        this.author = b.author;
        this.title = b.title;
        this.body = b.body;
        this.likes = b.likes;
        this.dislikes = b.dislikes;
        this.comments = b.comments;
    }

    public String getPostId() {
        return postId;
    }

    public User getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", comments=" + comments +
                '}';
    }

    public static class Builder {

        private String postId;
        private User author;
        private String title;
        private String body;

        private int likes;
        private int dislikes;

        private Set<Comment> comments;

        public Builder setPostId(String postId) {
            this.postId = postId;
            return this;
        }

        public Builder setAuthor(User author) {
            this.author = author;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setLikes(int likes) {
            this.likes = likes;
            return this;
        }

        public Builder setDislikes(int dislikes) {
            this.dislikes = dislikes;
            return this;
        }

        public Builder setComments(Set<Comment> comments) {
            this.comments = comments;
            return this;
        }

        public Builder copy(Post p) {
            this.postId = p.postId;
            this.author = p.author;
            this.title = p.title;
            this.body = p.body;
            this.likes = p.likes;
            this.dislikes = p.dislikes;
            this.comments = p.comments;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}
