package com.zedler.entity;
// Generated Aug 12, 2017 12:37:35 PM by Hibernate Tools 4.3.1



/**
 * Video generated by hbm2java
 */
public class Video  implements java.io.Serializable {


     private int videoId;
     private User user;
     private String videoTitle;
     private Boolean videoLocationStatus;
     private Boolean videoChatStatus;
     private Integer videoViews;
     private String userVideoUrl;

    public Video() {
    }

	
    public Video(int videoId, User user, String videoTitle, String userVideoUrl) {
        this.videoId = videoId;
        this.user = user;
        this.videoTitle = videoTitle;
        this.userVideoUrl = userVideoUrl;
    }
    public Video(int videoId, User user, String videoTitle, Boolean videoLocationStatus, Boolean videoChatStatus, Integer videoViews, String userVideoUrl) {
       this.videoId = videoId;
       this.user = user;
       this.videoTitle = videoTitle;
       this.videoLocationStatus = videoLocationStatus;
       this.videoChatStatus = videoChatStatus;
       this.videoViews = videoViews;
       this.userVideoUrl = userVideoUrl;
    }
   
    public int getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getVideoTitle() {
        return this.videoTitle;
    }
    
    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }
    public Boolean getVideoLocationStatus() {
        return this.videoLocationStatus;
    }
    
    public void setVideoLocationStatus(Boolean videoLocationStatus) {
        this.videoLocationStatus = videoLocationStatus;
    }
    public Boolean getVideoChatStatus() {
        return this.videoChatStatus;
    }
    
    public void setVideoChatStatus(Boolean videoChatStatus) {
        this.videoChatStatus = videoChatStatus;
    }
    public Integer getVideoViews() {
        return this.videoViews;
    }
    
    public void setVideoViews(Integer videoViews) {
        this.videoViews = videoViews;
    }
    public String getUserVideoUrl() {
        return this.userVideoUrl;
    }
    
    public void setUserVideoUrl(String userVideoUrl) {
        this.userVideoUrl = userVideoUrl;
    }




}

