package com.lagou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyBasicExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andCompanyshortnameIsNull() {
            addCriterion("companyShortName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIsNotNull() {
            addCriterion("companyShortName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameEqualTo(String value) {
            addCriterion("companyShortName =", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotEqualTo(String value) {
            addCriterion("companyShortName <>", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameGreaterThan(String value) {
            addCriterion("companyShortName >", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("companyShortName >=", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLessThan(String value) {
            addCriterion("companyShortName <", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLessThanOrEqualTo(String value) {
            addCriterion("companyShortName <=", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameLike(String value) {
            addCriterion("companyShortName like", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotLike(String value) {
            addCriterion("companyShortName not like", value, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameIn(List<String> values) {
            addCriterion("companyShortName in", values, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotIn(List<String> values) {
            addCriterion("companyShortName not in", values, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameBetween(String value1, String value2) {
            addCriterion("companyShortName between", value1, value2, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyshortnameNotBetween(String value1, String value2) {
            addCriterion("companyShortName not between", value1, value2, "companyshortname");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesIsNull() {
            addCriterion("companyFeatures is null");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesIsNotNull() {
            addCriterion("companyFeatures is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesEqualTo(String value) {
            addCriterion("companyFeatures =", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesNotEqualTo(String value) {
            addCriterion("companyFeatures <>", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesGreaterThan(String value) {
            addCriterion("companyFeatures >", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("companyFeatures >=", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesLessThan(String value) {
            addCriterion("companyFeatures <", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesLessThanOrEqualTo(String value) {
            addCriterion("companyFeatures <=", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesLike(String value) {
            addCriterion("companyFeatures like", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesNotLike(String value) {
            addCriterion("companyFeatures not like", value, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesIn(List<String> values) {
            addCriterion("companyFeatures in", values, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesNotIn(List<String> values) {
            addCriterion("companyFeatures not in", values, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesBetween(String value1, String value2) {
            addCriterion("companyFeatures between", value1, value2, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andCompanyfeaturesNotBetween(String value1, String value2) {
            addCriterion("companyFeatures not between", value1, value2, "companyfeatures");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberIsNull() {
            addCriterion("successful_number is null");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberIsNotNull() {
            addCriterion("successful_number is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberEqualTo(Integer value) {
            addCriterion("successful_number =", value, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberNotEqualTo(Integer value) {
            addCriterion("successful_number <>", value, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberGreaterThan(Integer value) {
            addCriterion("successful_number >", value, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("successful_number >=", value, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberLessThan(Integer value) {
            addCriterion("successful_number <", value, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberLessThanOrEqualTo(Integer value) {
            addCriterion("successful_number <=", value, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberIn(List<Integer> values) {
            addCriterion("successful_number in", values, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberNotIn(List<Integer> values) {
            addCriterion("successful_number not in", values, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberBetween(Integer value1, Integer value2) {
            addCriterion("successful_number between", value1, value2, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andSuccessfulNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("successful_number not between", value1, value2, "successfulNumber");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNull() {
            addCriterion("datatime is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("datatime is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(Date value) {
            addCriterion("datatime =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(Date value) {
            addCriterion("datatime <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(Date value) {
            addCriterion("datatime >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datatime >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(Date value) {
            addCriterion("datatime <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("datatime <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<Date> values) {
            addCriterion("datatime in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<Date> values) {
            addCriterion("datatime not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(Date value1, Date value2) {
            addCriterion("datatime between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("datatime not between", value1, value2, "datatime");
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