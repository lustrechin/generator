package com.lanzh.model;

import java.io.Serializable;
import java.util.Date;

public class PrdmgrBuChangeorder implements Serializable {
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
     * 投产类型，1-项目投产，2-任务投产
     *
     * @mbg.generated
     */
    private Byte prdType;

    /**
     * 项目编号
     *
     * @mbg.generated
     */
    private String projectCode;

    /**
     * 项目名称
     *
     * @mbg.generated
     */
    private String projectName;

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
     * 任务
     *
     * @mbg.generated
     */
    private String task;

    /**
     * 变更系统
     *
     * @mbg.generated
     */
    private String changeSystem;

    /**
     * 是否补更，0-否，1-是
     *
     * @mbg.generated
     */
    private Boolean replenishChangeFlag;

    /**
     * 变更类型，1-常规变更，2-紧急变更
     *
     * @mbg.generated
     */
    private Byte changeType;

    /**
     * 补更类型
     *
     * @mbg.generated
     */
    private Byte replenishChangeType;

    /**
     * 投产方式，1-运维投产，2-自主投产，3-自主+运维投产
     *
     * @mbg.generated
     */
    private Byte prdMode;

    /**
     * 是否涉及账户类交易改造，0-否，1-是
     *
     * @mbg.generated
     */
    private Boolean involvedTradeRemold;

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
     * 部门
     *
     * @mbg.generated
     */
    private String dept;

    /**
     * 部门名称
     *
     * @mbg.generated
     */
    private String deptName;

    /**
     * 窗口（投产）日期
     *
     * @mbg.generated
     */
    private Date windowDate;

    /**
     * 窗口类型，1-常规，2-非常规，3-节假日
     *
     * @mbg.generated
     */
    private Byte windowType;

    /**
     * 是否加急，0-否，1-是
     *
     * @mbg.generated
     */
    private Boolean urgentFlag;

    /**
     * 原因说明
     *
     * @mbg.generated
     */
    private String cause;

    /**
     * 开发版本号
     *
     * @mbg.generated
     */
    private String developVersion;

    /**
     * 入版状态，1-未入版，2-入版审批中，3-已入版，4-退版审批中，5-已退版
     *
     * @mbg.generated
     */
    private Byte versionStatus;

    /**
     * 系统集成测试报告
     *
     * @mbg.generated
     */
    private String testReport;

    /**
     * 风险评估报告
     *
     * @mbg.generated
     */
    private String riskAssessReport;

    /**
     * 上线流程
     *
     * @mbg.generated
     */
    private String onlineProcess;

    /**
     * 投产前验证报告
     *
     * @mbg.generated
     */
    private String verifyReport;

    /**
     * 业务验收报告
     *
     * @mbg.generated
     */
    private String receivingReport;

    /**
     * 其他投产文档
     *
     * @mbg.generated
     */
    private String otherDoc;

    /**
     * 投产部署情况，1-未部署，2-申请中，3-已部署，4-已拒绝
     *
     * @mbg.generated
     */
    private Byte deploySituation;

    /**
     * 特批申请信息
     *
     * @mbg.generated
     */
    private String specialApplication;

    /**
     * 涉及机构，1-东莞银行，2-村镇银行
     *
     * @mbg.generated
     */
    private Byte involvedOrg;

    /**
     * 特批类型，1-新增需求，2-补充更新，3-bug修复
     *
     * @mbg.generated
     */
    private Byte specialApprovalType;

    /**
     * 项目类型，1-新增需求，2-修复问题，3-功能优化
     *
     * @mbg.generated
     */
    private Byte projectType;

    /**
     * 特批原因
     *
     * @mbg.generated
     */
    private String specialApprovalCause;

    /**
     * 是否涉账，0-否，1-是
     *
     * @mbg.generated
     */
    private Boolean involvedAccountFlag;

    /**
     * 上线时间要求
     *
     * @mbg.generated
     */
    private Date onlineTime;

    /**
     * 战略规划要求类型，1-抢占市场，2-客群，3-营销机会
     *
     * @mbg.generated
     */
    private Byte strategicPlanType;

    /**
     * 状态，1-已开发，2-测试中，3-已定版待预投产
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 是否触及小高压线，0-否，1-是
     *
     * @mbg.generated
     */
    private Boolean highVoltageFlag;

    /**
     * 触及规则
     *
     * @mbg.generated
     */
    private String touchRule;

    /**
     * 计划投产时间
     *
     * @mbg.generated
     */
    private Date planPrdTime;

    /**
     * 变更投产时间
     *
     * @mbg.generated
     */
    private Date changePrdTime;

    /**
     * 变更内容
     *
     * @mbg.generated
     */
    private String changeContent;

    /**
     * 特批原因说明
     *
     * @mbg.generated
     */
    private String specialApprovalDescription;

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

    public Byte getPrdType() {
        return prdType;
    }

    public void setPrdType(Byte prdType) {
        this.prdType = prdType;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getChangeSystem() {
        return changeSystem;
    }

    public void setChangeSystem(String changeSystem) {
        this.changeSystem = changeSystem;
    }

    public Boolean getReplenishChangeFlag() {
        return replenishChangeFlag;
    }

    public void setReplenishChangeFlag(Boolean replenishChangeFlag) {
        this.replenishChangeFlag = replenishChangeFlag;
    }

    public Byte getChangeType() {
        return changeType;
    }

    public void setChangeType(Byte changeType) {
        this.changeType = changeType;
    }

    public Byte getReplenishChangeType() {
        return replenishChangeType;
    }

    public void setReplenishChangeType(Byte replenishChangeType) {
        this.replenishChangeType = replenishChangeType;
    }

    public Byte getPrdMode() {
        return prdMode;
    }

    public void setPrdMode(Byte prdMode) {
        this.prdMode = prdMode;
    }

    public Boolean getInvolvedTradeRemold() {
        return involvedTradeRemold;
    }

    public void setInvolvedTradeRemold(Boolean involvedTradeRemold) {
        this.involvedTradeRemold = involvedTradeRemold;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getWindowDate() {
        return windowDate;
    }

    public void setWindowDate(Date windowDate) {
        this.windowDate = windowDate;
    }

    public Byte getWindowType() {
        return windowType;
    }

    public void setWindowType(Byte windowType) {
        this.windowType = windowType;
    }

    public Boolean getUrgentFlag() {
        return urgentFlag;
    }

    public void setUrgentFlag(Boolean urgentFlag) {
        this.urgentFlag = urgentFlag;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDevelopVersion() {
        return developVersion;
    }

    public void setDevelopVersion(String developVersion) {
        this.developVersion = developVersion;
    }

    public Byte getVersionStatus() {
        return versionStatus;
    }

    public void setVersionStatus(Byte versionStatus) {
        this.versionStatus = versionStatus;
    }

    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public String getRiskAssessReport() {
        return riskAssessReport;
    }

    public void setRiskAssessReport(String riskAssessReport) {
        this.riskAssessReport = riskAssessReport;
    }

    public String getOnlineProcess() {
        return onlineProcess;
    }

    public void setOnlineProcess(String onlineProcess) {
        this.onlineProcess = onlineProcess;
    }

    public String getVerifyReport() {
        return verifyReport;
    }

    public void setVerifyReport(String verifyReport) {
        this.verifyReport = verifyReport;
    }

    public String getReceivingReport() {
        return receivingReport;
    }

    public void setReceivingReport(String receivingReport) {
        this.receivingReport = receivingReport;
    }

    public String getOtherDoc() {
        return otherDoc;
    }

    public void setOtherDoc(String otherDoc) {
        this.otherDoc = otherDoc;
    }

    public Byte getDeploySituation() {
        return deploySituation;
    }

    public void setDeploySituation(Byte deploySituation) {
        this.deploySituation = deploySituation;
    }

    public String getSpecialApplication() {
        return specialApplication;
    }

    public void setSpecialApplication(String specialApplication) {
        this.specialApplication = specialApplication;
    }

    public Byte getInvolvedOrg() {
        return involvedOrg;
    }

    public void setInvolvedOrg(Byte involvedOrg) {
        this.involvedOrg = involvedOrg;
    }

    public Byte getSpecialApprovalType() {
        return specialApprovalType;
    }

    public void setSpecialApprovalType(Byte specialApprovalType) {
        this.specialApprovalType = specialApprovalType;
    }

    public Byte getProjectType() {
        return projectType;
    }

    public void setProjectType(Byte projectType) {
        this.projectType = projectType;
    }

    public String getSpecialApprovalCause() {
        return specialApprovalCause;
    }

    public void setSpecialApprovalCause(String specialApprovalCause) {
        this.specialApprovalCause = specialApprovalCause;
    }

    public Boolean getInvolvedAccountFlag() {
        return involvedAccountFlag;
    }

    public void setInvolvedAccountFlag(Boolean involvedAccountFlag) {
        this.involvedAccountFlag = involvedAccountFlag;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Byte getStrategicPlanType() {
        return strategicPlanType;
    }

    public void setStrategicPlanType(Byte strategicPlanType) {
        this.strategicPlanType = strategicPlanType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Boolean getHighVoltageFlag() {
        return highVoltageFlag;
    }

    public void setHighVoltageFlag(Boolean highVoltageFlag) {
        this.highVoltageFlag = highVoltageFlag;
    }

    public String getTouchRule() {
        return touchRule;
    }

    public void setTouchRule(String touchRule) {
        this.touchRule = touchRule;
    }

    public Date getPlanPrdTime() {
        return planPrdTime;
    }

    public void setPlanPrdTime(Date planPrdTime) {
        this.planPrdTime = planPrdTime;
    }

    public Date getChangePrdTime() {
        return changePrdTime;
    }

    public void setChangePrdTime(Date changePrdTime) {
        this.changePrdTime = changePrdTime;
    }

    public String getChangeContent() {
        return changeContent;
    }

    public void setChangeContent(String changeContent) {
        this.changeContent = changeContent;
    }

    public String getSpecialApprovalDescription() {
        return specialApprovalDescription;
    }

    public void setSpecialApprovalDescription(String specialApprovalDescription) {
        this.specialApprovalDescription = specialApprovalDescription;
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
        sb.append(", prdType=").append(prdType);
        sb.append(", projectCode=").append(projectCode);
        sb.append(", projectName=").append(projectName);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", reqOrder=").append(reqOrder);
        sb.append(", defectOrder=").append(defectOrder);
        sb.append(", task=").append(task);
        sb.append(", changeSystem=").append(changeSystem);
        sb.append(", replenishChangeFlag=").append(replenishChangeFlag);
        sb.append(", changeType=").append(changeType);
        sb.append(", replenishChangeType=").append(replenishChangeType);
        sb.append(", prdMode=").append(prdMode);
        sb.append(", involvedTradeRemold=").append(involvedTradeRemold);
        sb.append(", applicant=").append(applicant);
        sb.append(", applicantName=").append(applicantName);
        sb.append(", module=").append(module);
        sb.append(", dept=").append(dept);
        sb.append(", deptName=").append(deptName);
        sb.append(", windowDate=").append(windowDate);
        sb.append(", windowType=").append(windowType);
        sb.append(", urgentFlag=").append(urgentFlag);
        sb.append(", cause=").append(cause);
        sb.append(", developVersion=").append(developVersion);
        sb.append(", versionStatus=").append(versionStatus);
        sb.append(", testReport=").append(testReport);
        sb.append(", riskAssessReport=").append(riskAssessReport);
        sb.append(", onlineProcess=").append(onlineProcess);
        sb.append(", verifyReport=").append(verifyReport);
        sb.append(", receivingReport=").append(receivingReport);
        sb.append(", otherDoc=").append(otherDoc);
        sb.append(", deploySituation=").append(deploySituation);
        sb.append(", specialApplication=").append(specialApplication);
        sb.append(", involvedOrg=").append(involvedOrg);
        sb.append(", specialApprovalType=").append(specialApprovalType);
        sb.append(", projectType=").append(projectType);
        sb.append(", specialApprovalCause=").append(specialApprovalCause);
        sb.append(", involvedAccountFlag=").append(involvedAccountFlag);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", strategicPlanType=").append(strategicPlanType);
        sb.append(", status=").append(status);
        sb.append(", highVoltageFlag=").append(highVoltageFlag);
        sb.append(", touchRule=").append(touchRule);
        sb.append(", planPrdTime=").append(planPrdTime);
        sb.append(", changePrdTime=").append(changePrdTime);
        sb.append(", changeContent=").append(changeContent);
        sb.append(", specialApprovalDescription=").append(specialApprovalDescription);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}