package com.demo.yun.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserPathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPathExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOnePathIsNull() {
            addCriterion("one_path is null");
            return (Criteria) this;
        }

        public Criteria andOnePathIsNotNull() {
            addCriterion("one_path is not null");
            return (Criteria) this;
        }

        public Criteria andOnePathEqualTo(String value) {
            addCriterion("one_path =", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathNotEqualTo(String value) {
            addCriterion("one_path <>", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathGreaterThan(String value) {
            addCriterion("one_path >", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathGreaterThanOrEqualTo(String value) {
            addCriterion("one_path >=", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathLessThan(String value) {
            addCriterion("one_path <", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathLessThanOrEqualTo(String value) {
            addCriterion("one_path <=", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathLike(String value) {
            addCriterion("one_path like", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathNotLike(String value) {
            addCriterion("one_path not like", value, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathIn(List<String> values) {
            addCriterion("one_path in", values, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathNotIn(List<String> values) {
            addCriterion("one_path not in", values, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathBetween(String value1, String value2) {
            addCriterion("one_path between", value1, value2, "onePath");
            return (Criteria) this;
        }

        public Criteria andOnePathNotBetween(String value1, String value2) {
            addCriterion("one_path not between", value1, value2, "onePath");
            return (Criteria) this;
        }

        public Criteria andTwoPathIsNull() {
            addCriterion("two_path is null");
            return (Criteria) this;
        }

        public Criteria andTwoPathIsNotNull() {
            addCriterion("two_path is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPathEqualTo(String value) {
            addCriterion("two_path =", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathNotEqualTo(String value) {
            addCriterion("two_path <>", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathGreaterThan(String value) {
            addCriterion("two_path >", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathGreaterThanOrEqualTo(String value) {
            addCriterion("two_path >=", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathLessThan(String value) {
            addCriterion("two_path <", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathLessThanOrEqualTo(String value) {
            addCriterion("two_path <=", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathLike(String value) {
            addCriterion("two_path like", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathNotLike(String value) {
            addCriterion("two_path not like", value, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathIn(List<String> values) {
            addCriterion("two_path in", values, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathNotIn(List<String> values) {
            addCriterion("two_path not in", values, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathBetween(String value1, String value2) {
            addCriterion("two_path between", value1, value2, "twoPath");
            return (Criteria) this;
        }

        public Criteria andTwoPathNotBetween(String value1, String value2) {
            addCriterion("two_path not between", value1, value2, "twoPath");
            return (Criteria) this;
        }

        public Criteria andThreePathIsNull() {
            addCriterion("three_path is null");
            return (Criteria) this;
        }

        public Criteria andThreePathIsNotNull() {
            addCriterion("three_path is not null");
            return (Criteria) this;
        }

        public Criteria andThreePathEqualTo(String value) {
            addCriterion("three_path =", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathNotEqualTo(String value) {
            addCriterion("three_path <>", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathGreaterThan(String value) {
            addCriterion("three_path >", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathGreaterThanOrEqualTo(String value) {
            addCriterion("three_path >=", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathLessThan(String value) {
            addCriterion("three_path <", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathLessThanOrEqualTo(String value) {
            addCriterion("three_path <=", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathLike(String value) {
            addCriterion("three_path like", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathNotLike(String value) {
            addCriterion("three_path not like", value, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathIn(List<String> values) {
            addCriterion("three_path in", values, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathNotIn(List<String> values) {
            addCriterion("three_path not in", values, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathBetween(String value1, String value2) {
            addCriterion("three_path between", value1, value2, "threePath");
            return (Criteria) this;
        }

        public Criteria andThreePathNotBetween(String value1, String value2) {
            addCriterion("three_path not between", value1, value2, "threePath");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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