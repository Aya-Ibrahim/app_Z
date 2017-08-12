package com.zedler.entity;
// Generated Aug 12, 2017 12:37:35 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Friendship generated by hbm2java
 */
public class Friendship  implements java.io.Serializable {


     private FriendshipId id;
     private Status status;
     private User userByUserTo;
     private User userByUserFrom;
     private Date fsRequestTime;

    public Friendship() {
    }

	
    public Friendship(FriendshipId id, User userByUserTo, User userByUserFrom) {
        this.id = id;
        this.userByUserTo = userByUserTo;
        this.userByUserFrom = userByUserFrom;
    }
    public Friendship(FriendshipId id, Status status, User userByUserTo, User userByUserFrom, Date fsRequestTime) {
       this.id = id;
       this.status = status;
       this.userByUserTo = userByUserTo;
       this.userByUserFrom = userByUserFrom;
       this.fsRequestTime = fsRequestTime;
    }
   
    public FriendshipId getId() {
        return this.id;
    }
    
    public void setId(FriendshipId id) {
        this.id = id;
    }
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public User getUserByUserTo() {
        return this.userByUserTo;
    }
    
    public void setUserByUserTo(User userByUserTo) {
        this.userByUserTo = userByUserTo;
    }
    public User getUserByUserFrom() {
        return this.userByUserFrom;
    }
    
    public void setUserByUserFrom(User userByUserFrom) {
        this.userByUserFrom = userByUserFrom;
    }
    public Date getFsRequestTime() {
        return this.fsRequestTime;
    }
    
    public void setFsRequestTime(Date fsRequestTime) {
        this.fsRequestTime = fsRequestTime;
    }




}


