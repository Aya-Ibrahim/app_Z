package com.zedler.entity;
// Generated Aug 12, 2017 12:37:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Status generated by hbm2java
 */
public class Status  implements java.io.Serializable {


     private int statusId;
     private String statusType;
    // private Set friendships = new HashSet(0);

    public Status() {
    }

	
    public Status(int statusId) {
        this.statusId = statusId;
    }
    public Status(int statusId, String statusType, Set friendships) {
       this.statusId = statusId;
       this.statusType = statusType;
     //  this.friendships = friendships;
    }
   
    public int getStatusId() {
        return this.statusId;
    }
    
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    public String getStatusType() {
        return this.statusType;
    }
    
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }
//    public Set getFriendships() {
//        return this.friendships;
//    }
//    
//    public void setFriendships(Set friendships) {
//        this.friendships = friendships;
//    }




}


