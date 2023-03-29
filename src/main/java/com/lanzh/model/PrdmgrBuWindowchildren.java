package com.lanzh.model;

import java.io.Serializable;
import java.util.Date;

public class PrdmgrBuWindowchildren implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 变更号
     *
     * @mbg.generated
     */
    private String changeCode;

    /**
     * 来源分类，1-缺陷单，2-需求单
     *
     * @mbg.generated
     */
    private Byte sourceType;

    /**
     * 投产需求单
     *
     * @mbg.generated
     */
    private String reqOrder;

    /**
     * 投产缺陷单
     *
     * @mbg.generated
     */
    private String defectOrder;

    /**
     * 变更系统
     *
     * @mbg.generated
     */
    private String changeSystem;

    /**
     * 申请人
     *
     * @mbg.generated
     */
    private String applicant;

    /**
     * 申请人名称
     *
     * @mbg.generated
     */
    private String applicantName;

    /**
     * 子系统/模块
     *
     * @mbg.generated
     */
    private String module;

    /**
     * 投产情况
     *
     * @mbg.generated
     */
    private Byte prdSituation;

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

    public String getChangeCode() {
        return changeCode;
    }

    public void setChangeCode(String changeCode) {
        this.changeCode = changeCode;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public String getReqOrder() {
        return reqOrder;
    }

    public void setReqOrder(String reqOrder) {
        this.reqOrder = reqOrder;
    }

    public String getDefectOrder() {
        return defectOrder;
    }

    public void setDefectOrder(String defectOrder) {
        this.defectOrder = defectOrder;
    }

    public String getChangeSystem() {
        return changeSystem;
    }

    public void setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Byte getPrdSituation() {
        return prdSituation;
    }

    public void setPrdSituation(Byte prdSituation) {
        this.prdSituation = prdSituation;
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
        sb.append(", changeCode=").append(changeCode);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", reqOrder=").append(reqOrder);
        sb.append(", defectOrder=").append(defectOrder);
        sb.append(", changeSystem=").append(changeSystem);
        sb.append(", applicant=").append(applicant);
        sb.append(", applicantName=").append(applicantName);
        sb.append(", module=").append(module);
        sb.append(", prdSituation=").append(prdSituation);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}