package com.sggcrm.pojo;

import java.util.Date;

public class CustomerServices {
    private Integer id;

    private Date allotDate;

    private Date createDate;

    private Date dealDate;

    private String dealResult;

    private String satisfy;

    private String serviceDeal;

    private String serviceRequest;

    private String serviceState;

    private String serviceTitle;

    private String serviceType;

    private Integer allotId;

    private Integer createdId;

    private Integer customerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAllotDate() {
        return allotDate;
    }

    public void setAllotDate(Date allotDate) {
        this.allotDate = allotDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult == null ? null : dealResult.trim();
    }

    public String getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy == null ? null : satisfy.trim();
    }

    public String getServiceDeal() {
        return serviceDeal;
    }

    public void setServiceDeal(String serviceDeal) {
        this.serviceDeal = serviceDeal == null ? null : serviceDeal.trim();
    }

    public String getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(String serviceRequest) {
        this.serviceRequest = serviceRequest == null ? null : serviceRequest.trim();
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle == null ? null : serviceTitle.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public Integer getAllotId() {
        return allotId;
    }

    public void setAllotId(Integer allotId) {
        this.allotId = allotId;
    }

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}