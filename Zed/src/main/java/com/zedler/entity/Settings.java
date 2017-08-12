package com.zedler.entity;
// Generated Aug 12, 2017 12:37:35 PM by Hibernate Tools 4.3.1



/**
 * Settings generated by hbm2java
 */
public class Settings  implements java.io.Serializable {


     private Integer settingsId;
     private User user;
     private boolean broadcasting;
     private byte followMe;
     private byte showFnameOnly;
     private boolean showPpToFollowers;
     private byte aboutMeToFollowers;

    public Settings() {
    }

    public Settings(User user, boolean broadcasting, byte followMe, byte showFnameOnly, boolean showPpToFollowers, byte aboutMeToFollowers) {
       this.user = user;
       this.broadcasting = broadcasting;
       this.followMe = followMe;
       this.showFnameOnly = showFnameOnly;
       this.showPpToFollowers = showPpToFollowers;
       this.aboutMeToFollowers = aboutMeToFollowers;
    }
   
    public Integer getSettingsId() {
        return this.settingsId;
    }
    
    public void setSettingsId(Integer settingsId) {
        this.settingsId = settingsId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public boolean isBroadcasting() {
        return this.broadcasting;
    }
    
    public void setBroadcasting(boolean broadcasting) {
        this.broadcasting = broadcasting;
    }
    public byte getFollowMe() {
        return this.followMe;
    }
    
    public void setFollowMe(byte followMe) {
        this.followMe = followMe;
    }
    public byte getShowFnameOnly() {
        return this.showFnameOnly;
    }
    
    public void setShowFnameOnly(byte showFnameOnly) {
        this.showFnameOnly = showFnameOnly;
    }
    public boolean isShowPpToFollowers() {
        return this.showPpToFollowers;
    }
    
    public void setShowPpToFollowers(boolean showPpToFollowers) {
        this.showPpToFollowers = showPpToFollowers;
    }
    public byte getAboutMeToFollowers() {
        return this.aboutMeToFollowers;
    }
    
    public void setAboutMeToFollowers(byte aboutMeToFollowers) {
        this.aboutMeToFollowers = aboutMeToFollowers;
    }




}


