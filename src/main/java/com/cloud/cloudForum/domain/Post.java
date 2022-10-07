package com.cloud.cloudForum.domain;

import java.util.Date;

public class Post {
    private int id;
    private int userId;
    private String post;
    private Date postDate;

    public Post() {};

    public Post(int id, int userID, String post, Date postDate) {
        this.id = id;
        this.userId = userID;
        this.post = post;
        this.postDate = postDate;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userID=" + userId +
                ", post='" + post + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}
