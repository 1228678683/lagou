package com.lagou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyPositionExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNull() {
            addCriterion("position_type is null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNotNull() {
            addCriterion("position_type is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeEqualTo(String value) {
            addCriterion("position_type =", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotEqualTo(String value) {
            addCriterion("position_type <>", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThan(String value) {
            addCriterion("position_type >", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("position_type >=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThan(String value) {
            addCriterion("position_type <", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThanOrEqualTo(String value) {
            addCriterion("position_type <=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLike(String value) {
            addCriterion("position_type like", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotLike(String value) {
            addCriterion("position_type not like", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIn(List<String> values) {
            addCriterion("position_type in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotIn(List<String> values) {
            addCriterion("position_type not in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeBetween(String value1, String value2) {
            addCriterion("position_type between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotBetween(String value1, String value2) {
            addCriterion("position_type not between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andJobJatureIsNull() {
            addCriterion("job_jature is null");
            return (Criteria) this;
        }

        public Criteria andJobJatureIsNotNull() {
            addCriterion("job_jature is not null");
            return (Criteria) this;
        }

        public Criteria andJobJatureEqualTo(String value) {
            addCriterion("job_jature =", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureNotEqualTo(String value) {
            addCriterion("job_jature <>", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureGreaterThan(String value) {
            addCriterion("job_jature >", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureGreaterThanOrEqualTo(String value) {
            addCriterion("job_jature >=", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureLessThan(String value) {
            addCriterion("job_jature <", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureLessThanOrEqualTo(String value) {
            addCriterion("job_jature <=", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureLike(String value) {
            addCriterion("job_jature like", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureNotLike(String value) {
            addCriterion("job_jature not like", value, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureIn(List<String> values) {
            addCriterion("job_jature in", values, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureNotIn(List<String> values) {
            addCriterion("job_jature not in", values, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureBetween(String value1, String value2) {
            addCriterion("job_jature between", value1, value2, "jobJature");
            return (Criteria) this;
        }

        public Criteria andJobJatureNotBetween(String value1, String value2) {
            addCriterion("job_jature not between", value1, value2, "jobJature");
            return (Criteria) this;
        }

        public Criteria andSalaryMinIsNull() {
            addCriterion("salary_min is null");
            return (Criteria) this;
        }

        public Criteria andSalaryMinIsNotNull() {
            addCriterion("salary_min is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryMinEqualTo(String value) {
            addCriterion("salary_min =", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotEqualTo(String value) {
            addCriterion("salary_min <>", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinGreaterThan(String value) {
            addCriterion("salary_min >", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinGreaterThanOrEqualTo(String value) {
            addCriterion("salary_min >=", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinLessThan(String value) {
            addCriterion("salary_min <", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinLessThanOrEqualTo(String value) {
            addCriterion("salary_min <=", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinLike(String value) {
            addCriterion("salary_min like", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotLike(String value) {
            addCriterion("salary_min not like", value, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinIn(List<String> values) {
            addCriterion("salary_min in", values, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotIn(List<String> values) {
            addCriterion("salary_min not in", values, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinBetween(String value1, String value2) {
            addCriterion("salary_min between", value1, value2, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMinNotBetween(String value1, String value2) {
            addCriterion("salary_min not between", value1, value2, "salaryMin");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxIsNull() {
            addCriterion("salary_max is null");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxIsNotNull() {
            addCriterion("salary_max is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxEqualTo(String value) {
            addCriterion("salary_max =", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotEqualTo(String value) {
            addCriterion("salary_max <>", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxGreaterThan(String value) {
            addCriterion("salary_max >", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxGreaterThanOrEqualTo(String value) {
            addCriterion("salary_max >=", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxLessThan(String value) {
            addCriterion("salary_max <", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxLessThanOrEqualTo(String value) {
            addCriterion("salary_max <=", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxLike(String value) {
            addCriterion("salary_max like", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotLike(String value) {
            addCriterion("salary_max not like", value, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxIn(List<String> values) {
            addCriterion("salary_max in", values, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotIn(List<String> values) {
            addCriterion("salary_max not in", values, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxBetween(String value1, String value2) {
            addCriterion("salary_max between", value1, value2, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andSalaryMaxNotBetween(String value1, String value2) {
            addCriterion("salary_max not between", value1, value2, "salaryMax");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNull() {
            addCriterion("work_address is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNotNull() {
            addCriterion("work_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressEqualTo(String value) {
            addCriterion("work_address =", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotEqualTo(String value) {
            addCriterion("work_address <>", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThan(String value) {
            addCriterion("work_address >", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("work_address >=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThan(String value) {
            addCriterion("work_address <", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("work_address <=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLike(String value) {
            addCriterion("work_address like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotLike(String value) {
            addCriterion("work_address not like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIn(List<String> values) {
            addCriterion("work_address in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotIn(List<String> values) {
            addCriterion("work_address not in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2) {
            addCriterion("work_address between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2) {
            addCriterion("work_address not between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNull() {
            addCriterion("work_year is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNotNull() {
            addCriterion("work_year is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearEqualTo(String value) {
            addCriterion("work_year =", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotEqualTo(String value) {
            addCriterion("work_year <>", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThan(String value) {
            addCriterion("work_year >", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThanOrEqualTo(String value) {
            addCriterion("work_year >=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThan(String value) {
            addCriterion("work_year <", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThanOrEqualTo(String value) {
            addCriterion("work_year <=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLike(String value) {
            addCriterion("work_year like", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotLike(String value) {
            addCriterion("work_year not like", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearIn(List<String> values) {
            addCriterion("work_year in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotIn(List<String> values) {
            addCriterion("work_year not in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearBetween(String value1, String value2) {
            addCriterion("work_year between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotBetween(String value1, String value2) {
            addCriterion("work_year not between", value1, value2, "workYear");
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

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageIsNull() {
            addCriterion("position_advantage is null");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageIsNotNull() {
            addCriterion("position_advantage is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageEqualTo(String value) {
            addCriterion("position_advantage =", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotEqualTo(String value) {
            addCriterion("position_advantage <>", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageGreaterThan(String value) {
            addCriterion("position_advantage >", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("position_advantage >=", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageLessThan(String value) {
            addCriterion("position_advantage <", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageLessThanOrEqualTo(String value) {
            addCriterion("position_advantage <=", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageLike(String value) {
            addCriterion("position_advantage like", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotLike(String value) {
            addCriterion("position_advantage not like", value, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageIn(List<String> values) {
            addCriterion("position_advantage in", values, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotIn(List<String> values) {
            addCriterion("position_advantage not in", values, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageBetween(String value1, String value2) {
            addCriterion("position_advantage between", value1, value2, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionAdvantageNotBetween(String value1, String value2) {
            addCriterion("position_advantage not between", value1, value2, "positionAdvantage");
            return (Criteria) this;
        }

        public Criteria andPositionDetailIsNull() {
            addCriterion("position_detail is null");
            return (Criteria) this;
        }

        public Criteria andPositionDetailIsNotNull() {
            addCriterion("position_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPositionDetailEqualTo(String value) {
            addCriterion("position_detail =", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotEqualTo(String value) {
            addCriterion("position_detail <>", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailGreaterThan(String value) {
            addCriterion("position_detail >", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("position_detail >=", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailLessThan(String value) {
            addCriterion("position_detail <", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailLessThanOrEqualTo(String value) {
            addCriterion("position_detail <=", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailLike(String value) {
            addCriterion("position_detail like", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotLike(String value) {
            addCriterion("position_detail not like", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailIn(List<String> values) {
            addCriterion("position_detail in", values, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotIn(List<String> values) {
            addCriterion("position_detail not in", values, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailBetween(String value1, String value2) {
            addCriterion("position_detail between", value1, value2, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotBetween(String value1, String value2) {
            addCriterion("position_detail not between", value1, value2, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNull() {
            addCriterion("position_address is null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIsNotNull() {
            addCriterion("position_address is not null");
            return (Criteria) this;
        }

        public Criteria andPositionAddressEqualTo(String value) {
            addCriterion("position_address =", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotEqualTo(String value) {
            addCriterion("position_address <>", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThan(String value) {
            addCriterion("position_address >", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("position_address >=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThan(String value) {
            addCriterion("position_address <", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLessThanOrEqualTo(String value) {
            addCriterion("position_address <=", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressLike(String value) {
            addCriterion("position_address like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotLike(String value) {
            addCriterion("position_address not like", value, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressIn(List<String> values) {
            addCriterion("position_address in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotIn(List<String> values) {
            addCriterion("position_address not in", values, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressBetween(String value1, String value2) {
            addCriterion("position_address between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionAddressNotBetween(String value1, String value2) {
            addCriterion("position_address not between", value1, value2, "positionAddress");
            return (Criteria) this;
        }

        public Criteria andPositionLngIsNull() {
            addCriterion("position_lng is null");
            return (Criteria) this;
        }

        public Criteria andPositionLngIsNotNull() {
            addCriterion("position_lng is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLngEqualTo(String value) {
            addCriterion("position_lng =", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotEqualTo(String value) {
            addCriterion("position_lng <>", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngGreaterThan(String value) {
            addCriterion("position_lng >", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngGreaterThanOrEqualTo(String value) {
            addCriterion("position_lng >=", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngLessThan(String value) {
            addCriterion("position_lng <", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngLessThanOrEqualTo(String value) {
            addCriterion("position_lng <=", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngLike(String value) {
            addCriterion("position_lng like", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotLike(String value) {
            addCriterion("position_lng not like", value, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngIn(List<String> values) {
            addCriterion("position_lng in", values, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotIn(List<String> values) {
            addCriterion("position_lng not in", values, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngBetween(String value1, String value2) {
            addCriterion("position_lng between", value1, value2, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLngNotBetween(String value1, String value2) {
            addCriterion("position_lng not between", value1, value2, "positionLng");
            return (Criteria) this;
        }

        public Criteria andPositionLatIsNull() {
            addCriterion("position_lat is null");
            return (Criteria) this;
        }

        public Criteria andPositionLatIsNotNull() {
            addCriterion("position_lat is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLatEqualTo(String value) {
            addCriterion("position_lat =", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotEqualTo(String value) {
            addCriterion("position_lat <>", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatGreaterThan(String value) {
            addCriterion("position_lat >", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatGreaterThanOrEqualTo(String value) {
            addCriterion("position_lat >=", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatLessThan(String value) {
            addCriterion("position_lat <", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatLessThanOrEqualTo(String value) {
            addCriterion("position_lat <=", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatLike(String value) {
            addCriterion("position_lat like", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotLike(String value) {
            addCriterion("position_lat not like", value, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatIn(List<String> values) {
            addCriterion("position_lat in", values, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotIn(List<String> values) {
            addCriterion("position_lat not in", values, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatBetween(String value1, String value2) {
            addCriterion("position_lat between", value1, value2, "positionLat");
            return (Criteria) this;
        }

        public Criteria andPositionLatNotBetween(String value1, String value2) {
            addCriterion("position_lat not between", value1, value2, "positionLat");
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

        public Criteria andForwardEmailIsNull() {
            addCriterion("forward_email is null");
            return (Criteria) this;
        }

        public Criteria andForwardEmailIsNotNull() {
            addCriterion("forward_email is not null");
            return (Criteria) this;
        }

        public Criteria andForwardEmailEqualTo(String value) {
            addCriterion("forward_email =", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailNotEqualTo(String value) {
            addCriterion("forward_email <>", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailGreaterThan(String value) {
            addCriterion("forward_email >", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailGreaterThanOrEqualTo(String value) {
            addCriterion("forward_email >=", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailLessThan(String value) {
            addCriterion("forward_email <", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailLessThanOrEqualTo(String value) {
            addCriterion("forward_email <=", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailLike(String value) {
            addCriterion("forward_email like", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailNotLike(String value) {
            addCriterion("forward_email not like", value, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailIn(List<String> values) {
            addCriterion("forward_email in", values, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailNotIn(List<String> values) {
            addCriterion("forward_email not in", values, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailBetween(String value1, String value2) {
            addCriterion("forward_email between", value1, value2, "forwardEmail");
            return (Criteria) this;
        }

        public Criteria andForwardEmailNotBetween(String value1, String value2) {
            addCriterion("forward_email not between", value1, value2, "forwardEmail");
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

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulIsNull() {
            addCriterion("succeed_successful is null");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulIsNotNull() {
            addCriterion("succeed_successful is not null");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulEqualTo(Integer value) {
            addCriterion("succeed_successful =", value, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulNotEqualTo(Integer value) {
            addCriterion("succeed_successful <>", value, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulGreaterThan(Integer value) {
            addCriterion("succeed_successful >", value, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulGreaterThanOrEqualTo(Integer value) {
            addCriterion("succeed_successful >=", value, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulLessThan(Integer value) {
            addCriterion("succeed_successful <", value, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulLessThanOrEqualTo(Integer value) {
            addCriterion("succeed_successful <=", value, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulIn(List<Integer> values) {
            addCriterion("succeed_successful in", values, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulNotIn(List<Integer> values) {
            addCriterion("succeed_successful not in", values, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulBetween(Integer value1, Integer value2) {
            addCriterion("succeed_successful between", value1, value2, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andSucceedSuccessfulNotBetween(Integer value1, Integer value2) {
            addCriterion("succeed_successful not between", value1, value2, "succeedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulIsNull() {
            addCriterion("defeated_successful is null");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulIsNotNull() {
            addCriterion("defeated_successful is not null");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulEqualTo(Integer value) {
            addCriterion("defeated_successful =", value, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulNotEqualTo(Integer value) {
            addCriterion("defeated_successful <>", value, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulGreaterThan(Integer value) {
            addCriterion("defeated_successful >", value, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulGreaterThanOrEqualTo(Integer value) {
            addCriterion("defeated_successful >=", value, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulLessThan(Integer value) {
            addCriterion("defeated_successful <", value, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulLessThanOrEqualTo(Integer value) {
            addCriterion("defeated_successful <=", value, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulIn(List<Integer> values) {
            addCriterion("defeated_successful in", values, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulNotIn(List<Integer> values) {
            addCriterion("defeated_successful not in", values, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulBetween(Integer value1, Integer value2) {
            addCriterion("defeated_successful between", value1, value2, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andDefeatedSuccessfulNotBetween(Integer value1, Integer value2) {
            addCriterion("defeated_successful not between", value1, value2, "defeatedSuccessful");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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