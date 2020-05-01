package com.example.demo.entity;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.CID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.UID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.PID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.CONTEXT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.GMT_CREATE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.COMMENTER_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String commenterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.REPLAY_COUNT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Integer replayCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.LIKE_COUNT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.TYPE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.CID
     *
     * @return the value of comment.CID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.CID
     *
     * @param cid the value for comment.CID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.UID
     *
     * @return the value of comment.UID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.UID
     *
     * @param uid the value for comment.UID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.PID
     *
     * @return the value of comment.PID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.PID
     *
     * @param pid the value for comment.PID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.CONTEXT
     *
     * @return the value of comment.CONTEXT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.CONTEXT
     *
     * @param context the value for comment.CONTEXT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.GMT_CREATE
     *
     * @return the value of comment.GMT_CREATE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.GMT_CREATE
     *
     * @param gmtCreate the value for comment.GMT_CREATE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.COMMENTER_NAME
     *
     * @return the value of comment.COMMENTER_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getCommenterName() {
        return commenterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.COMMENTER_NAME
     *
     * @param commenterName the value for comment.COMMENTER_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName == null ? null : commenterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.REPLAY_COUNT
     *
     * @return the value of comment.REPLAY_COUNT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Integer getReplayCount() {
        return replayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.REPLAY_COUNT
     *
     * @param replayCount the value for comment.REPLAY_COUNT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.LIKE_COUNT
     *
     * @return the value of comment.LIKE_COUNT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.LIKE_COUNT
     *
     * @param likeCount the value for comment.LIKE_COUNT
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.TYPE
     *
     * @return the value of comment.TYPE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.TYPE
     *
     * @param type the value for comment.TYPE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }
}