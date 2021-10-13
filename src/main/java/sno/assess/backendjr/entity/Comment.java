package sno.assess.backendjr.entity;

public class Comment {

    private String commentId;
    private String body;
    private User user;
    private Post post;

    protected Comment() {
    }

    private Comment(Builder b) {
        this.commentId = b.commentId;
        this.body = b.body;
        this.user = b.user;
        this.post = b.post;
    }

    public String getCommentId() {
        return commentId;
    }

    public String getBody() {
        return body;
    }

    public User getUser() {
        return user;
    }

    public Post getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", body='" + body + '\'' +
                ", user=" + user +
                ", post=" + post +
                '}';
    }

    public static class Builder {

        private String commentId;
        private String body;
        private User user;
        private Post post;

        public Builder setCommentId(String commentId) {
            this.commentId = commentId;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setPost(Post post) {
            this.post = post;
            return this;
        }

        public Builder copy(Comment c) {
            this.commentId = c.commentId;
            this.body = c.body;
            this.user = c.user;
            this.post = c.post;
            return this;
        }

        public Comment build() {
            return new Comment(this);
        }
    }

}
