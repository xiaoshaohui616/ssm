package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSidIsNull() {
            addCriterion("sId is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sId is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sId =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sId <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sId >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sId >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sId <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sId <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sId in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sId not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sId between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sId not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuName is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuName is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuName =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuName <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuName >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuName >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuName <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuName <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuName like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuName not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuName in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuName not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuName between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuName not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStuageIsNull() {
            addCriterion("stuAge is null");
            return (Criteria) this;
        }

        public Criteria andStuageIsNotNull() {
            addCriterion("stuAge is not null");
            return (Criteria) this;
        }

        public Criteria andStuageEqualTo(Integer value) {
            addCriterion("stuAge =", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotEqualTo(Integer value) {
            addCriterion("stuAge <>", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThan(Integer value) {
            addCriterion("stuAge >", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuAge >=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThan(Integer value) {
            addCriterion("stuAge <", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThanOrEqualTo(Integer value) {
            addCriterion("stuAge <=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageIn(List<Integer> values) {
            addCriterion("stuAge in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotIn(List<Integer> values) {
            addCriterion("stuAge not in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageBetween(Integer value1, Integer value2) {
            addCriterion("stuAge between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotBetween(Integer value1, Integer value2) {
            addCriterion("stuAge not between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andStusexIsNull() {
            addCriterion("stuSex is null");
            return (Criteria) this;
        }

        public Criteria andStusexIsNotNull() {
            addCriterion("stuSex is not null");
            return (Criteria) this;
        }

        public Criteria andStusexEqualTo(String value) {
            addCriterion("stuSex =", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotEqualTo(String value) {
            addCriterion("stuSex <>", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThan(String value) {
            addCriterion("stuSex >", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThanOrEqualTo(String value) {
            addCriterion("stuSex >=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThan(String value) {
            addCriterion("stuSex <", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThanOrEqualTo(String value) {
            addCriterion("stuSex <=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLike(String value) {
            addCriterion("stuSex like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotLike(String value) {
            addCriterion("stuSex not like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexIn(List<String> values) {
            addCriterion("stuSex in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotIn(List<String> values) {
            addCriterion("stuSex not in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexBetween(String value1, String value2) {
            addCriterion("stuSex between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotBetween(String value1, String value2) {
            addCriterion("stuSex not between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("birthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("birthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("birthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("birthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthDate not between", value1, value2, "birthdate");
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