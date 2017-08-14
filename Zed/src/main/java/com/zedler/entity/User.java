package com.zedler.entity;
// Generated Aug 12, 2017 12:37:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable,Entity {


     private Integer userId;
     private String userFirstName;
     private String userSecondName;
     private String userName;
     private String userMail;
     private String userPassword;
     private String userAboutMe;
     private String userCountry;
     private Integer userCoinNo;
     private Double userLongitude;
     private Double userLatitude;
     private String userPic;
     private String userCurrentLocation;
     private String userStatus;
     private String fakeHomeLocLangitude;
     private String fakeHomeLocLatitude;
     private byte isLive;
     private Set followshipsForUserFrom = new HashSet(0);
     private Set settingses = new HashSet(0);
     private Set friendshipsForUserTo = new HashSet(0);
     private Set friendshipsForUserFrom = new HashSet(0);
     private Set videos = new HashSet(0);
     private Set followshipsForUserTo = new HashSet(0);
     private Set settingscontrolsForUserTo = new HashSet(0);
     private Set settingscontrolsForUserFrom = new HashSet(0);

    public User() {
    }

	
    public User(String userFirstName, String userSecondName, String userMail, String userPassword, String userCountry, String fakeHomeLocLangitude, String fakeHomeLocLatitude, byte isLive) {
        this.userFirstName = userFirstName;
        this.userSecondName = userSecondName;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.userCountry = userCountry;
        this.fakeHomeLocLangitude = fakeHomeLocLangitude;
        this.fakeHomeLocLatitude = fakeHomeLocLatitude;
        this.isLive = isLive;
    }
    public User(String userFirstName, String userSecondName, String userName, String userMail, String userPassword, String userAboutMe, String userCountry, Integer userCoinNo, Double userLongitude, Double userLatitude, String userPic, String userCurrentLocation, String userStatus, String fakeHomeLocLangitude, String fakeHomeLocLatitude, byte isLive, Set followshipsForUserFrom, Set settingses, Set friendshipsForUserTo, Set friendshipsForUserFrom, Set videos, Set followshipsForUserTo, Set settingscontrolsForUserTo, Set settingscontrolsForUserFrom) {
       this.userFirstName = userFirstName;
       this.userSecondName = userSecondName;
       this.userName = userName;
       this.userMail = userMail;
       this.userPassword = userPassword;
       this.userAboutMe = userAboutMe;
       this.userCountry = userCountry;
       this.userCoinNo = userCoinNo;
       this.userLongitude = userLongitude;
       this.userLatitude = userLatitude;
       this.userPic = userPic;
       this.userCurrentLocation = userCurrentLocation;
       this.userStatus = userStatus;
       this.fakeHomeLocLangitude = fakeHomeLocLangitude;
       this.fakeHomeLocLatitude = fakeHomeLocLatitude;
       this.isLive = isLive;
       this.followshipsForUserFrom = followshipsForUserFrom;
       this.settingses = settingses;
       this.friendshipsForUserTo = friendshipsForUserTo;
       this.friendshipsForUserFrom = friendshipsForUserFrom;
       this.videos = videos;
       this.followshipsForUserTo = followshipsForUserTo;
       this.settingscontrolsForUserTo = settingscontrolsForUserTo;
       this.settingscontrolsForUserFrom = settingscontrolsForUserFrom;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserFirstName() {
        return this.userFirstName;
    }
    
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getUserSecondName() {
        return this.userSecondName;
    }
    
    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserMail() {
        return this.userMail;
    }
    
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserAboutMe() {
        return this.userAboutMe;
    }
    
    public void setUserAboutMe(String userAboutMe) {
        this.userAboutMe = userAboutMe;
    }
    public String getUserCountry() {
        return this.userCountry;
    }
    
    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
    public Integer getUserCoinNo() {
        return this.userCoinNo;
    }
    
    public void setUserCoinNo(Integer userCoinNo) {
        this.userCoinNo = userCoinNo;
    }
    public Double getUserLongitude() {
        return this.userLongitude;
    }
    
    public void setUserLongitude(Double userLongitude) {
        this.userLongitude = userLongitude;
    }
    public Double getUserLatitude() {
        return this.userLatitude;
    }
    
    public void setUserLatitude(Double userLatitude) {
        this.userLatitude = userLatitude;
    }
    public String getUserPic() {
        return this.userPic;
    }
    
    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }
    public String getUserCurrentLocation() {
        return this.userCurrentLocation;
    }
    
    public void setUserCurrentLocation(String userCurrentLocation) {
        this.userCurrentLocation = userCurrentLocation;
    }
    public String getUserStatus() {
        return this.userStatus;
    }
    
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public String getFakeHomeLocLangitude() {
        return this.fakeHomeLocLangitude;
    }
    
    public void setFakeHomeLocLangitude(String fakeHomeLocLangitude) {
        this.fakeHomeLocLangitude = fakeHomeLocLangitude;
    }
    public String getFakeHomeLocLatitude() {
        return this.fakeHomeLocLatitude;
    }
    
    public void setFakeHomeLocLatitude(String fakeHomeLocLatitude) {
        this.fakeHomeLocLatitude = fakeHomeLocLatitude;
    }
    public byte getIsLive() {
        return this.isLive;
    }
    
    public void setIsLive(byte isLive) {
        this.isLive = isLive;
    }
    public Set getFollowshipsForUserFrom() {
        return this.followshipsForUserFrom;
    }
    
    public void setFollowshipsForUserFrom(Set followshipsForUserFrom) {
        this.followshipsForUserFrom = followshipsForUserFrom;
    }
    public Set getSettingses() {
        return this.settingses;
    }
    
    public void setSettingses(Set settingses) {
        this.settingses = settingses;
    }
    public Set getFriendshipsForUserTo() {
        return this.friendshipsForUserTo;
    }
    
    public void setFriendshipsForUserTo(Set friendshipsForUserTo) {
        this.friendshipsForUserTo = friendshipsForUserTo;
    }
    public Set getFriendshipsForUserFrom() {
        return this.friendshipsForUserFrom;
    }
    
    public void setFriendshipsForUserFrom(Set friendshipsForUserFrom) {
        this.friendshipsForUserFrom = friendshipsForUserFrom;
    }
    public Set getVideos() {
        return this.videos;
    }
    
    public void setVideos(Set videos) {
        this.videos = videos;
    }
    public Set getFollowshipsForUserTo() {
        return this.followshipsForUserTo;
    }
    
    public void setFollowshipsForUserTo(Set followshipsForUserTo) {
        this.followshipsForUserTo = followshipsForUserTo;
    }
    public Set getSettingscontrolsForUserTo() {
        return this.settingscontrolsForUserTo;
    }
    
    public void setSettingscontrolsForUserTo(Set settingscontrolsForUserTo) {
        this.settingscontrolsForUserTo = settingscontrolsForUserTo;
    }
    public Set getSettingscontrolsForUserFrom() {
        return this.settingscontrolsForUserFrom;
    }
    
    public void setSettingscontrolsForUserFrom(Set settingscontrolsForUserFrom) {
        this.settingscontrolsForUserFrom = settingscontrolsForUserFrom;
    }




}


