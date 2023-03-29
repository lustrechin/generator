package com.lanzh.model;

import java.io.Serializable;
import java.util.Date;

public class PrdmgrBuWindowplan implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 窗口日期
     *
     * @mbg.generated
     */
    private Date windowDate;

    /**
     * 星期
     *
     * @mbg.generated
     */
    private String week;

    /**
     * 窗口类型，1-常规，2-非常规，3-节假日
     *
     * @mbg.generated
     */
    private Byte windowType;

    /**
     * 版本号
     *
     * @mbg.generated
     */
    private String version;

    /**
     * 计划UAT封版日期
     *
     * @mbg.generated
     */
    private Date planUatSealDate;

    /**
     * 计划投产封版日期
     *
     * @mbg.generated
     */
    private Date planPrdSealDate;

    /**
     * 窗口状态，1-打开，2-UAT封版
     *
     * @mbg.generated
     */
    private Byte windowStatus;

    /**
     * 状态，1-未发布，2-已发布
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 系统变更需求数量
     *
     * @mbg.generated
     */
    private Integer systemChangeReqNumber;

    /**
     * 涉及系统数量
     *
     * @mbg.generated
     */
    private Integer involvedSystemNumber;

    /**
     * 涉及需求单数量
     *
     * @mbg.generated
     */
    private Integer involvedReqNumber;

    /**
     * 涉及缺陷单数量
     *
     * @mbg.generated
     */
    private Integer involvedDefectNumber;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getWindowDate() {
        return windowDate;
    }

    public void setWindowDate(Date windowDate) {
        this.windowDate = windowDate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Byte getWindowType() {
        return windowType;
    }

    public void setWindowType(Byte windowType) {
        this.windowType = windowType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getPlanUatSealDate() {
        return planUatSealDate;
    }

    public void setPlanUatSealDate(Date planUatSealDate) {
        this.planUatSealDate = planUatSealDate;
    }

    public Date getPlanPrdSealDate() {
        return planPrdSealDate;
    }

    public void setPlanPrdSealDate(Date planPrdSealDate) {
        this.planPrdSealDate = planPrdSealDate;
    }

    public Byte getWindowStatus() {
        return windowStatus;
    }

    public void setWindowStatus(Byte windowStatus) {
        this.windowStatus = windowStatus;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSystemChangeReqNumber() {
        return systemChangeReqNumber;
    }

    public void setSystemChangeReqNumber(Integer systemChangeReqNumber) {
        this.systemChangeReqNumber = systemChangeReqNumber;
    }

    public Integer getInvolvedSystemNumber() {
        return involvedSystemNumber;
    }

    public void setInvolvedSystemNumber(Integer involvedSystemNumber) {
        this.involvedSystemNumber = involvedSystemNumber;
    }

    public Integer getInvolvedReqNumber() {
        return involvedReqNumber;
    }

    public void setInvolvedReqNumber(Integer involvedReqNumber) {
        this.involvedReqNumber = involvedReqNumber;
    }

    public Integer getInvolvedDefectNumber() {
        return involvedDefectNumber;
    }

    public void setInvolvedDefectNumber(Integer involvedDefectNumber) {
        this.involvedDefectNumber = involvedDefectNumber;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", windowDate=").append(windowDate);
        sb.append(", week=").append(week);
        sb.append(", windowType=").append(windowType);
        sb.append(", version=").append(version);
        sb.append(", planUatSealDate=").append(planUatSealDate);
        sb.append(", planPrdSealDate=").append(planPrdSealDate);
        sb.append(", windowStatus=").append(windowStatus);
        sb.append(", status=").append(status);
        sb.append(", systemChangeReqNumber=").append(systemChangeReqNumber);
        sb.append(", involvedSystemNumber=").append(involvedSystemNumber);
        sb.append(", involvedReqNumber=").append(involvedReqNumber);
        sb.append(", involvedDefectNumber=").append(involvedDefectNumber);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}