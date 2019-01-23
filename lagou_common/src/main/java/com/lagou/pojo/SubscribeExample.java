package com.lagou.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SubscribeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubscribeExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSendmailperIsNull() {
            addCriterion("sendMailPer is null");
            return (Criteria) this;
        }

        public Criteria andSendmailperIsNotNull() {
            addCriterion("sendMailPer is not null");
            return (Criteria) this;
        }

        public Criteria andSendmailperEqualTo(String value) {
            addCriterion("sendMailPer =", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperNotEqualTo(String value) {
            addCriterion("sendMailPer <>", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperGreaterThan(String value) {
            addCriterion("sendMailPer >", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperGreaterThanOrEqualTo(String value) {
            addCriterion("sendMailPer >=", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperLessThan(String value) {
            addCriterion("sendMailPer <", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperLessThanOrEqualTo(String value) {
            addCriterion("sendMailPer <=", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperLike(String value) {
            addCriterion("sendMailPer like", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperNotLike(String value) {
            addCriterion("sendMailPer not like", value, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperIn(List<String> values) {
            addCriterion("sendMailPer in", values, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperNotIn(List<String> values) {
            addCriterion("sendMailPer not in", values, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperBetween(String value1, String value2) {
            addCriterion("sendMailPer between", value1, value2, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andSendmailperNotBetween(String value1, String value2) {
            addCriterion("sendMailPer not between", value1, value2, "sendmailper");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andFinancestageIsNull() {
            addCriterion("financeStage is null");
            return (Criteria) this;
        }

        public Criteria andFinancestageIsNotNull() {
            addCriterion("financeStage is not null");
            return (Criteria) this;
        }

        public Criteria andFinancestageEqualTo(String value) {
            addCriterion("financeStage =", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotEqualTo(String value) {
            addCriterion("financeStage <>", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageGreaterThan(String value) {
            addCriterion("financeStage >", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageGreaterThanOrEqualTo(String value) {
            addCriterion("financeStage >=", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLessThan(String value) {
            addCriterion("financeStage <", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLessThanOrEqualTo(String value) {
            addCriterion("financeStage <=", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLike(String value) {
            addCriterion("financeStage like", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotLike(String value) {
            addCriterion("financeStage not like", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageIn(List<String> values) {
            addCriterion("financeStage in", values, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotIn(List<String> values) {
            addCriterion("financeStage not in", values, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageBetween(String value1, String value2) {
            addCriterion("financeStage between", value1, value2, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotBetween(String value1, String value2) {
            addCriterion("financeStage not between", value1, value2, "financestage");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIsNull() {
            addCriterion("industryField is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIsNotNull() {
            addCriterion("industryField is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldEqualTo(String value) {
            addCriterion("industryField =", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotEqualTo(String value) {
            addCriterion("industryField <>", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldGreaterThan(String value) {
            addCriterion("industryField >", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldGreaterThanOrEqualTo(String value) {
            addCriterion("industryField >=", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLessThan(String value) {
            addCriterion("industryField <", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLessThanOrEqualTo(String value) {
            addCriterion("industryField <=", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldLike(String value) {
            addCriterion("industryField like", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotLike(String value) {
            addCriterion("industryField not like", value, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldIn(List<String> values) {
            addCriterion("industryField in", values, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotIn(List<String> values) {
            addCriterion("industryField not in", values, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldBetween(String value1, String value2) {
            addCriterion("industryField between", value1, value2, "industryfield");
            return (Criteria) this;
        }

        public Criteria andIndustryfieldNotBetween(String value1, String value2) {
            addCriterion("industryField not between", value1, value2, "industryfield");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("positionName is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("positionName is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("positionName =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("positionName <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("positionName >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("positionName >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("positionName <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("positionName <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("positionName like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("positionName not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("positionName in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("positionName not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("positionName between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("positionName not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
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