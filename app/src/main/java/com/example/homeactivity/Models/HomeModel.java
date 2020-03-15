package com.example.homeactivity.Models;

public class HomeModel {
    private String Name;
    private String Time;
    private String LikeBy;
    private String Tags;
    private int Likes;
    private int ProPic;
    private int LikerPic;
    private int UploderPic;
    private int Postpic;
public  HomeModel(){

}
    public HomeModel(String name, String time, String likeBy, String tags, int likes, int proPic, int likerPic, int uploderPic, int postpic) {
        Name = name;
        Time = time;
        LikeBy = likeBy;
        Tags = tags;
        Likes = likes;
        ProPic = proPic;
        LikerPic = likerPic;
        UploderPic = uploderPic;
        Postpic = postpic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getLikeBy() {
        return LikeBy;
    }

    public void setLikeBy(String likeBy) {
        LikeBy = likeBy;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int likes) {
        Likes = likes;
    }

    public int getProPic() {
        return ProPic;
    }

    public void setProPic(int proPic) {
        ProPic = proPic;
    }

    public int getLikerPic() {
        return LikerPic;
    }

    public void setLikerPic(int likerPic) {
        LikerPic = likerPic;
    }

    public int getUploderPic() {
        return UploderPic;
    }

    public void setUploderPic(int uploderPic) {
        UploderPic = uploderPic;
    }

    public int getPostpic() {
        return Postpic;
    }

    public void setPostpic(int postpic) {
        Postpic = postpic;
    }
}
