package com.betterit.kaligia.dao.model.kaligia;

import java.io.Serializable;
import java.util.Date;

public class AppConfig implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.appconfig.config_id
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private Integer configId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.appconfig.name
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.appconfig.value
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.appconfig.status
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.appconfig.last_mod_on
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private Date lastModOn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column kaligia.appconfig.last_mod_by
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private Integer lastModBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table kaligia.appconfig
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.appconfig.config_id
     *
     * @return the value of kaligia.appconfig.config_id
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public Integer getConfigId() {
        return configId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.appconfig.config_id
     *
     * @param configId the value for kaligia.appconfig.config_id
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.appconfig.name
     *
     * @return the value of kaligia.appconfig.name
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.appconfig.name
     *
     * @param name the value for kaligia.appconfig.name
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.appconfig.value
     *
     * @return the value of kaligia.appconfig.value
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.appconfig.value
     *
     * @param value the value for kaligia.appconfig.value
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.appconfig.status
     *
     * @return the value of kaligia.appconfig.status
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.appconfig.status
     *
     * @param status the value for kaligia.appconfig.status
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.appconfig.last_mod_on
     *
     * @return the value of kaligia.appconfig.last_mod_on
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public Date getLastModOn() {
        return lastModOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.appconfig.last_mod_on
     *
     * @param lastModOn the value for kaligia.appconfig.last_mod_on
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public void setLastModOn(Date lastModOn) {
        this.lastModOn = lastModOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column kaligia.appconfig.last_mod_by
     *
     * @return the value of kaligia.appconfig.last_mod_by
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public Integer getLastModBy() {
        return lastModBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column kaligia.appconfig.last_mod_by
     *
     * @param lastModBy the value for kaligia.appconfig.last_mod_by
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    public void setLastModBy(Integer lastModBy) {
        this.lastModBy = lastModBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kaligia.appconfig
     *
     * @mbggenerated Mon Mar 28 12:28:14 EDT 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configId=").append(configId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", status=").append(status);
        sb.append(", lastModOn=").append(lastModOn);
        sb.append(", lastModBy=").append(lastModBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}