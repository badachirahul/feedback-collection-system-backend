package com.fcs.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback_table")
public class FeedBack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comments")
    private String comments;

    @Column(name = "reviewed")
    private boolean reviewed;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }


    @Override
    public String toString() {
        return "FeedBack{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                ", reviewed=" + reviewed +
                '}';
    }
}
