package com.sggcrm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesPlanExample() {
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

        public Criteria andPlanDateIsNull() {
            addCriterion("PLAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("PLAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterion("PLAN_DATE =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterion("PLAN_DATE <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterion("PLAN_DATE >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_DATE >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterion("PLAN_DATE <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_DATE <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterion("PLAN_DATE in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterion("PLAN_DATE not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_DATE between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_DATE not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanResultIsNull() {
            addCriterion("PLAN_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPlanResultIsNotNull() {
            addCriterion("PLAN_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanResultEqualTo(String value) {
            addCriterion("PLAN_RESULT =", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultNotEqualTo(String value) {
            addCriterion("PLAN_RESULT <>", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultGreaterThan(String value) {
            addCriterion("PLAN_RESULT >", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_RESULT >=", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultLessThan(String value) {
            addCriterion("PLAN_RESULT <", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultLessThanOrEqualTo(String value) {
            addCriterion("PLAN_RESULT <=", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultLike(String value) {
            addCriterion("PLAN_RESULT like", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultNotLike(String value) {
            addCriterion("PLAN_RESULT not like", value, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultIn(List<String> values) {
            addCriterion("PLAN_RESULT in", values, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultNotIn(List<String> values) {
            addCriterion("PLAN_RESULT not in", values, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultBetween(String value1, String value2) {
            addCriterion("PLAN_RESULT between", value1, value2, "planResult");
            return (Criteria) this;
        }

        public Criteria andPlanResultNotBetween(String value1, String value2) {
            addCriterion("PLAN_RESULT not between", value1, value2, "planResult");
            return (Criteria) this;
        }

        public Criteria andTodoIsNull() {
            addCriterion("TODO is null");
            return (Criteria) this;
        }

        public Criteria andTodoIsNotNull() {
            addCriterion("TODO is not null");
            return (Criteria) this;
        }

        public Criteria andTodoEqualTo(String value) {
            addCriterion("TODO =", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoNotEqualTo(String value) {
            addCriterion("TODO <>", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoGreaterThan(String value) {
            addCriterion("TODO >", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoGreaterThanOrEqualTo(String value) {
            addCriterion("TODO >=", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoLessThan(String value) {
            addCriterion("TODO <", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoLessThanOrEqualTo(String value) {
            addCriterion("TODO <=", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoLike(String value) {
            addCriterion("TODO like", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoNotLike(String value) {
            addCriterion("TODO not like", value, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoIn(List<String> values) {
            addCriterion("TODO in", values, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoNotIn(List<String> values) {
            addCriterion("TODO not in", values, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoBetween(String value1, String value2) {
            addCriterion("TODO between", value1, value2, "todo");
            return (Criteria) this;
        }

        public Criteria andTodoNotBetween(String value1, String value2) {
            addCriterion("TODO not between", value1, value2, "todo");
            return (Criteria) this;
        }

        public Criteria andChanceIdIsNull() {
            addCriterion("CHANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChanceIdIsNotNull() {
            addCriterion("CHANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChanceIdEqualTo(Integer value) {
            addCriterion("CHANCE_ID =", value, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdNotEqualTo(Integer value) {
            addCriterion("CHANCE_ID <>", value, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdGreaterThan(Integer value) {
            addCriterion("CHANCE_ID >", value, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANCE_ID >=", value, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdLessThan(Integer value) {
            addCriterion("CHANCE_ID <", value, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHANCE_ID <=", value, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdIn(List<Integer> values) {
            addCriterion("CHANCE_ID in", values, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdNotIn(List<Integer> values) {
            addCriterion("CHANCE_ID not in", values, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdBetween(Integer value1, Integer value2) {
            addCriterion("CHANCE_ID between", value1, value2, "chanceId");
            return (Criteria) this;
        }

        public Criteria andChanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANCE_ID not between", value1, value2, "chanceId");
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