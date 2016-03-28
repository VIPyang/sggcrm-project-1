package com.sggcrm.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomersExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankrollIsNull() {
            addCriterion("BANKROLL is null");
            return (Criteria) this;
        }

        public Criteria andBankrollIsNotNull() {
            addCriterion("BANKROLL is not null");
            return (Criteria) this;
        }

        public Criteria andBankrollEqualTo(Integer value) {
            addCriterion("BANKROLL =", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollNotEqualTo(Integer value) {
            addCriterion("BANKROLL <>", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollGreaterThan(Integer value) {
            addCriterion("BANKROLL >", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANKROLL >=", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollLessThan(Integer value) {
            addCriterion("BANKROLL <", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollLessThanOrEqualTo(Integer value) {
            addCriterion("BANKROLL <=", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollIn(List<Integer> values) {
            addCriterion("BANKROLL in", values, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollNotIn(List<Integer> values) {
            addCriterion("BANKROLL not in", values, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollBetween(Integer value1, Integer value2) {
            addCriterion("BANKROLL between", value1, value2, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollNotBetween(Integer value1, Integer value2) {
            addCriterion("BANKROLL not between", value1, value2, "bankroll");
            return (Criteria) this;
        }

        public Criteria andChiefIsNull() {
            addCriterion("CHIEF is null");
            return (Criteria) this;
        }

        public Criteria andChiefIsNotNull() {
            addCriterion("CHIEF is not null");
            return (Criteria) this;
        }

        public Criteria andChiefEqualTo(String value) {
            addCriterion("CHIEF =", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotEqualTo(String value) {
            addCriterion("CHIEF <>", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefGreaterThan(String value) {
            addCriterion("CHIEF >", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefGreaterThanOrEqualTo(String value) {
            addCriterion("CHIEF >=", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLessThan(String value) {
            addCriterion("CHIEF <", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLessThanOrEqualTo(String value) {
            addCriterion("CHIEF <=", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLike(String value) {
            addCriterion("CHIEF like", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotLike(String value) {
            addCriterion("CHIEF not like", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefIn(List<String> values) {
            addCriterion("CHIEF in", values, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotIn(List<String> values) {
            addCriterion("CHIEF not in", values, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefBetween(String value1, String value2) {
            addCriterion("CHIEF between", value1, value2, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotBetween(String value1, String value2) {
            addCriterion("CHIEF not between", value1, value2, "chief");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("CREDIT =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("CREDIT <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("CREDIT >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("CREDIT <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("CREDIT <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("CREDIT like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("CREDIT not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("CREDIT in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("CREDIT not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("CREDIT between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("CREDIT not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLicenceNoIsNull() {
            addCriterion("LICENCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andLicenceNoIsNotNull() {
            addCriterion("LICENCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceNoEqualTo(String value) {
            addCriterion("LICENCE_NO =", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotEqualTo(String value) {
            addCriterion("LICENCE_NO <>", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoGreaterThan(String value) {
            addCriterion("LICENCE_NO >", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("LICENCE_NO >=", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoLessThan(String value) {
            addCriterion("LICENCE_NO <", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoLessThanOrEqualTo(String value) {
            addCriterion("LICENCE_NO <=", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoLike(String value) {
            addCriterion("LICENCE_NO like", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotLike(String value) {
            addCriterion("LICENCE_NO not like", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoIn(List<String> values) {
            addCriterion("LICENCE_NO in", values, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotIn(List<String> values) {
            addCriterion("LICENCE_NO not in", values, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoBetween(String value1, String value2) {
            addCriterion("LICENCE_NO between", value1, value2, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotBetween(String value1, String value2) {
            addCriterion("LICENCE_NO not between", value1, value2, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIsNull() {
            addCriterion("LOCAL_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIsNotNull() {
            addCriterion("LOCAL_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoEqualTo(String value) {
            addCriterion("LOCAL_TAX_NO =", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotEqualTo(String value) {
            addCriterion("LOCAL_TAX_NO <>", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoGreaterThan(String value) {
            addCriterion("LOCAL_TAX_NO >", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_TAX_NO >=", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLessThan(String value) {
            addCriterion("LOCAL_TAX_NO <", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("LOCAL_TAX_NO <=", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLike(String value) {
            addCriterion("LOCAL_TAX_NO like", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotLike(String value) {
            addCriterion("LOCAL_TAX_NO not like", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIn(List<String> values) {
            addCriterion("LOCAL_TAX_NO in", values, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotIn(List<String> values) {
            addCriterion("LOCAL_TAX_NO not in", values, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoBetween(String value1, String value2) {
            addCriterion("LOCAL_TAX_NO between", value1, value2, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotBetween(String value1, String value2) {
            addCriterion("LOCAL_TAX_NO not between", value1, value2, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIsNull() {
            addCriterion("NATIONAL_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIsNotNull() {
            addCriterion("NATIONAL_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO =", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO <>", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoGreaterThan(String value) {
            addCriterion("NATIONAL_TAX_NO >", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO >=", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLessThan(String value) {
            addCriterion("NATIONAL_TAX_NO <", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO <=", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLike(String value) {
            addCriterion("NATIONAL_TAX_NO like", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotLike(String value) {
            addCriterion("NATIONAL_TAX_NO not like", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIn(List<String> values) {
            addCriterion("NATIONAL_TAX_NO in", values, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotIn(List<String> values) {
            addCriterion("NATIONAL_TAX_NO not in", values, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoBetween(String value1, String value2) {
            addCriterion("NATIONAL_TAX_NO between", value1, value2, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotBetween(String value1, String value2) {
            addCriterion("NATIONAL_TAX_NO not between", value1, value2, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("NO like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("NO not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andSatifyIsNull() {
            addCriterion("SATIFY is null");
            return (Criteria) this;
        }

        public Criteria andSatifyIsNotNull() {
            addCriterion("SATIFY is not null");
            return (Criteria) this;
        }

        public Criteria andSatifyEqualTo(String value) {
            addCriterion("SATIFY =", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotEqualTo(String value) {
            addCriterion("SATIFY <>", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyGreaterThan(String value) {
            addCriterion("SATIFY >", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyGreaterThanOrEqualTo(String value) {
            addCriterion("SATIFY >=", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyLessThan(String value) {
            addCriterion("SATIFY <", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyLessThanOrEqualTo(String value) {
            addCriterion("SATIFY <=", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyLike(String value) {
            addCriterion("SATIFY like", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotLike(String value) {
            addCriterion("SATIFY not like", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyIn(List<String> values) {
            addCriterion("SATIFY in", values, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotIn(List<String> values) {
            addCriterion("SATIFY not in", values, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyBetween(String value1, String value2) {
            addCriterion("SATIFY between", value1, value2, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotBetween(String value1, String value2) {
            addCriterion("SATIFY not between", value1, value2, "satify");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("TURNOVER is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("TURNOVER is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(Integer value) {
            addCriterion("TURNOVER =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(Integer value) {
            addCriterion("TURNOVER <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(Integer value) {
            addCriterion("TURNOVER >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(Integer value) {
            addCriterion("TURNOVER >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(Integer value) {
            addCriterion("TURNOVER <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(Integer value) {
            addCriterion("TURNOVER <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<Integer> values) {
            addCriterion("TURNOVER in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<Integer> values) {
            addCriterion("TURNOVER not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(Integer value1, Integer value2) {
            addCriterion("TURNOVER between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(Integer value1, Integer value2) {
            addCriterion("TURNOVER not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andWebsitIsNull() {
            addCriterion("WEBSIT is null");
            return (Criteria) this;
        }

        public Criteria andWebsitIsNotNull() {
            addCriterion("WEBSIT is not null");
            return (Criteria) this;
        }

        public Criteria andWebsitEqualTo(String value) {
            addCriterion("WEBSIT =", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotEqualTo(String value) {
            addCriterion("WEBSIT <>", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitGreaterThan(String value) {
            addCriterion("WEBSIT >", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSIT >=", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitLessThan(String value) {
            addCriterion("WEBSIT <", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitLessThanOrEqualTo(String value) {
            addCriterion("WEBSIT <=", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitLike(String value) {
            addCriterion("WEBSIT like", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotLike(String value) {
            addCriterion("WEBSIT not like", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitIn(List<String> values) {
            addCriterion("WEBSIT in", values, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotIn(List<String> values) {
            addCriterion("WEBSIT not in", values, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitBetween(String value1, String value2) {
            addCriterion("WEBSIT between", value1, value2, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotBetween(String value1, String value2) {
            addCriterion("WEBSIT not between", value1, value2, "websit");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("ZIP is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("ZIP =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("ZIP <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("ZIP >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("ZIP <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("ZIP <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("ZIP like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("ZIP not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("ZIP in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("ZIP not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("ZIP between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("ZIP not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("MANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("MANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("MANAGER_ID =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("MANAGER_ID <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("MANAGER_ID >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MANAGER_ID >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("MANAGER_ID <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("MANAGER_ID <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("MANAGER_ID in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("MANAGER_ID not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("MANAGER_ID between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MANAGER_ID not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("CUSTOMER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("CUSTOMER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(String value) {
            addCriterion("CUSTOMER_LEVEL >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(String value) {
            addCriterion("CUSTOMER_LEVEL <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLike(String value) {
            addCriterion("CUSTOMER_LEVEL like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotLike(String value) {
            addCriterion("CUSTOMER_LEVEL not like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<String> values) {
            addCriterion("CUSTOMER_LEVEL in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<String> values) {
            addCriterion("CUSTOMER_LEVEL not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LEVEL between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LEVEL not between", value1, value2, "customerLevel");
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