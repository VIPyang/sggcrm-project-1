package com.sggcrm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerServicesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAllotDateIsNull() {
            addCriterion("ALLOT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAllotDateIsNotNull() {
            addCriterion("ALLOT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAllotDateEqualTo(Date value) {
            addCriterion("ALLOT_DATE =", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotEqualTo(Date value) {
            addCriterion("ALLOT_DATE <>", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateGreaterThan(Date value) {
            addCriterion("ALLOT_DATE >", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ALLOT_DATE >=", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateLessThan(Date value) {
            addCriterion("ALLOT_DATE <", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateLessThanOrEqualTo(Date value) {
            addCriterion("ALLOT_DATE <=", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateIn(List<Date> values) {
            addCriterion("ALLOT_DATE in", values, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotIn(List<Date> values) {
            addCriterion("ALLOT_DATE not in", values, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateBetween(Date value1, Date value2) {
            addCriterion("ALLOT_DATE between", value1, value2, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotBetween(Date value1, Date value2) {
            addCriterion("ALLOT_DATE not between", value1, value2, "allotDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("DEAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("DEAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(Date value) {
            addCriterion("DEAL_DATE =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(Date value) {
            addCriterion("DEAL_DATE <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(Date value) {
            addCriterion("DEAL_DATE >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DEAL_DATE >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(Date value) {
            addCriterion("DEAL_DATE <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(Date value) {
            addCriterion("DEAL_DATE <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<Date> values) {
            addCriterion("DEAL_DATE in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<Date> values) {
            addCriterion("DEAL_DATE not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(Date value1, Date value2) {
            addCriterion("DEAL_DATE between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(Date value1, Date value2) {
            addCriterion("DEAL_DATE not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNull() {
            addCriterion("DEAL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNotNull() {
            addCriterion("DEAL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andDealResultEqualTo(String value) {
            addCriterion("DEAL_RESULT =", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotEqualTo(String value) {
            addCriterion("DEAL_RESULT <>", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThan(String value) {
            addCriterion("DEAL_RESULT >", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_RESULT >=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThan(String value) {
            addCriterion("DEAL_RESULT <", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThanOrEqualTo(String value) {
            addCriterion("DEAL_RESULT <=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLike(String value) {
            addCriterion("DEAL_RESULT like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotLike(String value) {
            addCriterion("DEAL_RESULT not like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultIn(List<String> values) {
            addCriterion("DEAL_RESULT in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotIn(List<String> values) {
            addCriterion("DEAL_RESULT not in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultBetween(String value1, String value2) {
            addCriterion("DEAL_RESULT between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotBetween(String value1, String value2) {
            addCriterion("DEAL_RESULT not between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNull() {
            addCriterion("SATISFY is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNotNull() {
            addCriterion("SATISFY is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyEqualTo(String value) {
            addCriterion("SATISFY =", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotEqualTo(String value) {
            addCriterion("SATISFY <>", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThan(String value) {
            addCriterion("SATISFY >", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThanOrEqualTo(String value) {
            addCriterion("SATISFY >=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThan(String value) {
            addCriterion("SATISFY <", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThanOrEqualTo(String value) {
            addCriterion("SATISFY <=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLike(String value) {
            addCriterion("SATISFY like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotLike(String value) {
            addCriterion("SATISFY not like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyIn(List<String> values) {
            addCriterion("SATISFY in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotIn(List<String> values) {
            addCriterion("SATISFY not in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyBetween(String value1, String value2) {
            addCriterion("SATISFY between", value1, value2, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotBetween(String value1, String value2) {
            addCriterion("SATISFY not between", value1, value2, "satisfy");
            return (Criteria) this;
        }

        public Criteria andServiceDealIsNull() {
            addCriterion("SERVICE_DEAL is null");
            return (Criteria) this;
        }

        public Criteria andServiceDealIsNotNull() {
            addCriterion("SERVICE_DEAL is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDealEqualTo(String value) {
            addCriterion("SERVICE_DEAL =", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotEqualTo(String value) {
            addCriterion("SERVICE_DEAL <>", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealGreaterThan(String value) {
            addCriterion("SERVICE_DEAL >", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_DEAL >=", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLessThan(String value) {
            addCriterion("SERVICE_DEAL <", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_DEAL <=", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLike(String value) {
            addCriterion("SERVICE_DEAL like", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotLike(String value) {
            addCriterion("SERVICE_DEAL not like", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealIn(List<String> values) {
            addCriterion("SERVICE_DEAL in", values, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotIn(List<String> values) {
            addCriterion("SERVICE_DEAL not in", values, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealBetween(String value1, String value2) {
            addCriterion("SERVICE_DEAL between", value1, value2, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotBetween(String value1, String value2) {
            addCriterion("SERVICE_DEAL not between", value1, value2, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIsNull() {
            addCriterion("SERVICE_REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIsNotNull() {
            addCriterion("SERVICE_REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestEqualTo(String value) {
            addCriterion("SERVICE_REQUEST =", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotEqualTo(String value) {
            addCriterion("SERVICE_REQUEST <>", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestGreaterThan(String value) {
            addCriterion("SERVICE_REQUEST >", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_REQUEST >=", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLessThan(String value) {
            addCriterion("SERVICE_REQUEST <", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_REQUEST <=", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLike(String value) {
            addCriterion("SERVICE_REQUEST like", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotLike(String value) {
            addCriterion("SERVICE_REQUEST not like", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIn(List<String> values) {
            addCriterion("SERVICE_REQUEST in", values, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotIn(List<String> values) {
            addCriterion("SERVICE_REQUEST not in", values, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestBetween(String value1, String value2) {
            addCriterion("SERVICE_REQUEST between", value1, value2, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotBetween(String value1, String value2) {
            addCriterion("SERVICE_REQUEST not between", value1, value2, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNull() {
            addCriterion("SERVICE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNotNull() {
            addCriterion("SERVICE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStateEqualTo(String value) {
            addCriterion("SERVICE_STATE =", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotEqualTo(String value) {
            addCriterion("SERVICE_STATE <>", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThan(String value) {
            addCriterion("SERVICE_STATE >", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_STATE >=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThan(String value) {
            addCriterion("SERVICE_STATE <", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_STATE <=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLike(String value) {
            addCriterion("SERVICE_STATE like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotLike(String value) {
            addCriterion("SERVICE_STATE not like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateIn(List<String> values) {
            addCriterion("SERVICE_STATE in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotIn(List<String> values) {
            addCriterion("SERVICE_STATE not in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateBetween(String value1, String value2) {
            addCriterion("SERVICE_STATE between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotBetween(String value1, String value2) {
            addCriterion("SERVICE_STATE not between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIsNull() {
            addCriterion("SERVICE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIsNotNull() {
            addCriterion("SERVICE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTitleEqualTo(String value) {
            addCriterion("SERVICE_TITLE =", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotEqualTo(String value) {
            addCriterion("SERVICE_TITLE <>", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleGreaterThan(String value) {
            addCriterion("SERVICE_TITLE >", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TITLE >=", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLessThan(String value) {
            addCriterion("SERVICE_TITLE <", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TITLE <=", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLike(String value) {
            addCriterion("SERVICE_TITLE like", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotLike(String value) {
            addCriterion("SERVICE_TITLE not like", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIn(List<String> values) {
            addCriterion("SERVICE_TITLE in", values, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotIn(List<String> values) {
            addCriterion("SERVICE_TITLE not in", values, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleBetween(String value1, String value2) {
            addCriterion("SERVICE_TITLE between", value1, value2, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotBetween(String value1, String value2) {
            addCriterion("SERVICE_TITLE not between", value1, value2, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("SERVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("SERVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("SERVICE_TYPE =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("SERVICE_TYPE <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("SERVICE_TYPE >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("SERVICE_TYPE <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("SERVICE_TYPE like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("SERVICE_TYPE not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("SERVICE_TYPE in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("SERVICE_TYPE not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andAllotIdIsNull() {
            addCriterion("ALLOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAllotIdIsNotNull() {
            addCriterion("ALLOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAllotIdEqualTo(Integer value) {
            addCriterion("ALLOT_ID =", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotEqualTo(Integer value) {
            addCriterion("ALLOT_ID <>", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThan(Integer value) {
            addCriterion("ALLOT_ID >", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALLOT_ID >=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThan(Integer value) {
            addCriterion("ALLOT_ID <", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThanOrEqualTo(Integer value) {
            addCriterion("ALLOT_ID <=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdIn(List<Integer> values) {
            addCriterion("ALLOT_ID in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotIn(List<Integer> values) {
            addCriterion("ALLOT_ID not in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdBetween(Integer value1, Integer value2) {
            addCriterion("ALLOT_ID between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ALLOT_ID not between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNull() {
            addCriterion("CREATED_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNotNull() {
            addCriterion("CREATED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdEqualTo(Integer value) {
            addCriterion("CREATED_ID =", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotEqualTo(Integer value) {
            addCriterion("CREATED_ID <>", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThan(Integer value) {
            addCriterion("CREATED_ID >", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_ID >=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThan(Integer value) {
            addCriterion("CREATED_ID <", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_ID <=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIn(List<Integer> values) {
            addCriterion("CREATED_ID in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotIn(List<Integer> values) {
            addCriterion("CREATED_ID not in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_ID between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_ID not between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}