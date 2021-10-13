package sno.assess.backendjr.entity;

/**
 * Author: Justin Scott Jenecke
 * POJO class for User entity
 * Date Created: 12/10/2021
 * */

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    private String username;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Comment> createdComments;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Post> createdPosts;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Post> likes;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Post> dislikes;

    protected User() {
    }

    private User(Builder b) {
        this.userId = b.userId;
        this.username = b.username;
        this.createdComments = b.createdComments;
        this.createdPosts = b.createdPosts;
        this.likes = b.likes;
        this.dislikes = b.dislikes;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public Set<Comment> getCreatedComments() {
        return createdComments;
    }

    public Set<Post> getCreatedPosts() {
        return createdPosts;
    }

    public Set<Post> getLikes() {
        return likes;
    }

    public Set<Post> getDislikes() {
        return dislikes;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", createdComments=" + createdComments +
                ", createdPosts=" + createdPosts +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                '}';
    }

    public static class Builder {

        private String userId;
        private String username;

        private Set<Comment> createdComments;

        private Set<Post> createdPosts;
        private Set<Post> likes;
        private Set<Post> dislikes;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setCreatedComments(Set<Comment> createdComments) {
            this.createdComments = createdComments;
            return this;
        }

        public Builder setCreatedPosts(Set<Post> createdPosts) {
            this.createdPosts = createdPosts;
            return this;
        }

        public Builder setLikes(Set<Post> likes) {
            this.likes = likes;
            return this;
        }

        public Builder setDislikes(Set<Post> dislikes) {
            this.dislikes = dislikes;
            return this;
        }

        public Builder copy(User u) {
            this.userId = u.userId;
            this.username = u.username;
            this.createdComments = u.createdComments;
            this.createdPosts = u.createdPosts;
            this.likes = u.likes;
            this.dislikes = u.dislikes;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
