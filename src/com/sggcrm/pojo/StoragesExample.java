package com.sggcrm.pojo;

import java.util.ArrayList;
import java.util.List;

public class StoragesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoragesExample() {
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

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNull() {
            addCriterion("STOCK_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNotNull() {
            addCriterion("STOCK_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStockCountEqualTo(Integer value) {
            addCriterion("STOCK_COUNT =", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotEqualTo(Integer value) {
            addCriterion("STOCK_COUNT <>", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThan(Integer value) {
            addCriterion("STOCK_COUNT >", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCK_COUNT >=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThan(Integer value) {
            addCriterion("STOCK_COUNT <", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThanOrEqualTo(Integer value) {
            addCriterion("STOCK_COUNT <=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountIn(List<Integer> values) {
            addCriterion("STOCK_COUNT in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotIn(List<Integer> values) {
            addCriterion("STOCK_COUNT not in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_COUNT between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCK_COUNT not between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockWareIsNull() {
            addCriterion("STOCK_WARE is null");
            return (Criteria) this;
        }

        public Criteria andStockWareIsNotNull() {
            addCriterion("STOCK_WARE is not null");
            return (Criteria) this;
        }

        public Criteria andStockWareEqualTo(String value) {
            addCriterion("STOCK_WARE =", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotEqualTo(String value) {
            addCriterion("STOCK_WARE <>", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareGreaterThan(String value) {
            addCriterion("STOCK_WARE >", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_WARE >=", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareLessThan(String value) {
            addCriterion("STOCK_WARE <", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareLessThanOrEqualTo(String value) {
            addCriterion("STOCK_WARE <=", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareLike(String value) {
            addCriterion("STOCK_WARE like", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotLike(String value) {
            addCriterion("STOCK_WARE not like", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareIn(List<String> values) {
            addCriterion("STOCK_WARE in", values, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotIn(List<String> values) {
            addCriterion("STOCK_WARE not in", values, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareBetween(String value1, String value2) {
            addCriterion("STOCK_WARE between", value1, value2, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotBetween(String value1, String value2) {
            addCriterion("STOCK_WARE not between", value1, value2, "stockWare");
            return (Criteria) this;
        }

        public Criteria andWareHouseIsNull() {
            addCriterion("WARE_HOUSE is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIsNotNull() {
            addCriterion("WARE_HOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseEqualTo(String value) {
            addCriterion("WARE_HOUSE =", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotEqualTo(String value) {
            addCriterion("WARE_HOUSE <>", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseGreaterThan(String value) {
            addCriterion("WARE_HOUSE >", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseGreaterThanOrEqualTo(String value) {
            addCriterion("WARE_HOUSE >=", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLessThan(String value) {
            addCriterion("WARE_HOUSE <", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLessThanOrEqualTo(String value) {
            addCriterion("WARE_HOUSE <=", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLike(String value) {
            addCriterion("WARE_HOUSE like", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotLike(String value) {
            addCriterion("WARE_HOUSE not like", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseIn(List<String> values) {
            addCriterion("WARE_HOUSE in", values, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotIn(List<String> values) {
            addCriterion("WARE_HOUSE not in", values, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseBetween(String value1, String value2) {
            addCriterion("WARE_HOUSE between", value1, value2, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotBetween(String value1, String value2) {
            addCriterion("WARE_HOUSE not between", value1, value2, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
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