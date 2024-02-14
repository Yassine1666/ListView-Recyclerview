package com.example.recycleview;

public class President {
    private int id ;
    private String name;
    private int dateofElection;
    private String imageUrl;

    public President(int id, int dateofElection, String name, String imageUrl) {
        this.id = id;
        this.dateofElection = dateofElection;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Presidents{" +
                "id=" + id +
                ", dateofElection='" + dateofElection + '\'' +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setdateofElection(int dateofElection) {
        this.dateofElection = dateofElection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
