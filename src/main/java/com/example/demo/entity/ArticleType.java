package com.example.demo.entity;

public class ArticleType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_type.aid
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    private String aid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_type.TID
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    private String tid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_type.aid
     *
     * @return the value of article_type.aid
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public String getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_type.aid
     *
     * @param aid the value for article_type.aid
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_type.TID
     *
     * @return the value of article_type.TID
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public String getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_type.TID
     *
     * @param tid the value for article_type.TID
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }
}