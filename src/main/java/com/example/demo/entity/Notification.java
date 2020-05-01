package com.example.demo.entity;

import java.util.Date;

public class Notification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String nid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIER
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String notifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.RECEIVER
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.AID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String aid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIER_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String notifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIED_TYPE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Integer notifiedType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.ARTICLE_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private String articleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.GMT_CREATE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notification.NOTIFIED_STATUS
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    private Integer notifiedStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NID
     *
     * @return the value of notification.NID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getNid() {
        return nid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NID
     *
     * @param nid the value for notification.NID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIER
     *
     * @return the value of notification.NOTIFIER
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getNotifier() {
        return notifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIER
     *
     * @param notifier the value for notification.NOTIFIER
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setNotifier(String notifier) {
        this.notifier = notifier == null ? null : notifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.RECEIVER
     *
     * @return the value of notification.RECEIVER
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.RECEIVER
     *
     * @param receiver the value for notification.RECEIVER
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.AID
     *
     * @return the value of notification.AID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.AID
     *
     * @param aid the value for notification.AID
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIER_NAME
     *
     * @return the value of notification.NOTIFIER_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getNotifierName() {
        return notifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIER_NAME
     *
     * @param notifierName the value for notification.NOTIFIER_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setNotifierName(String notifierName) {
        this.notifierName = notifierName == null ? null : notifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIED_TYPE
     *
     * @return the value of notification.NOTIFIED_TYPE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Integer getNotifiedType() {
        return notifiedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIED_TYPE
     *
     * @param notifiedType the value for notification.NOTIFIED_TYPE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setNotifiedType(Integer notifiedType) {
        this.notifiedType = notifiedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.ARTICLE_NAME
     *
     * @return the value of notification.ARTICLE_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public String getArticleName() {
        return articleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.ARTICLE_NAME
     *
     * @param articleName the value for notification.ARTICLE_NAME
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setArticleName(String articleName) {
        this.articleName = articleName == null ? null : articleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.GMT_CREATE
     *
     * @return the value of notification.GMT_CREATE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.GMT_CREATE
     *
     * @param gmtCreate the value for notification.GMT_CREATE
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notification.NOTIFIED_STATUS
     *
     * @return the value of notification.NOTIFIED_STATUS
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public Integer getNotifiedStatus() {
        return notifiedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notification.NOTIFIED_STATUS
     *
     * @param notifiedStatus the value for notification.NOTIFIED_STATUS
     *
     * @mbg.generated Fri May 01 15:16:22 CST 2020
     */
    public void setNotifiedStatus(Integer notifiedStatus) {
        this.notifiedStatus = notifiedStatus;
    }
}