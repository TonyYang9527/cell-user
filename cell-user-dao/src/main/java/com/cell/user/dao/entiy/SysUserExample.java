package com.cell.user.dao.entiy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	protected Integer limitStart;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	protected Integer limitEnd;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public SysUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public Integer getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
	public Integer getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
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

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andSaltIsNull() {
			addCriterion("salt is null");
			return (Criteria) this;
		}

		public Criteria andSaltIsNotNull() {
			addCriterion("salt is not null");
			return (Criteria) this;
		}

		public Criteria andSaltEqualTo(String value) {
			addCriterion("salt =", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotEqualTo(String value) {
			addCriterion("salt <>", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThan(String value) {
			addCriterion("salt >", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThanOrEqualTo(String value) {
			addCriterion("salt >=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThan(String value) {
			addCriterion("salt <", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThanOrEqualTo(String value) {
			addCriterion("salt <=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLike(String value) {
			addCriterion("salt like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotLike(String value) {
			addCriterion("salt not like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltIn(List<String> values) {
			addCriterion("salt in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotIn(List<String> values) {
			addCriterion("salt not in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltBetween(String value1, String value2) {
			addCriterion("salt between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotBetween(String value1, String value2) {
			addCriterion("salt not between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andDeviceIsNull() {
			addCriterion("device is null");
			return (Criteria) this;
		}

		public Criteria andDeviceIsNotNull() {
			addCriterion("device is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceEqualTo(String value) {
			addCriterion("device =", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceNotEqualTo(String value) {
			addCriterion("device <>", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceGreaterThan(String value) {
			addCriterion("device >", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceGreaterThanOrEqualTo(String value) {
			addCriterion("device >=", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceLessThan(String value) {
			addCriterion("device <", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceLessThanOrEqualTo(String value) {
			addCriterion("device <=", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceLike(String value) {
			addCriterion("device like", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceNotLike(String value) {
			addCriterion("device not like", value, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceIn(List<String> values) {
			addCriterion("device in", values, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceNotIn(List<String> values) {
			addCriterion("device not in", values, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceBetween(String value1, String value2) {
			addCriterion("device between", value1, value2, "device");
			return (Criteria) this;
		}

		public Criteria andDeviceNotBetween(String value1, String value2) {
			addCriterion("device not between", value1, value2, "device");
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

		public Criteria andStatusEqualTo(Boolean value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Boolean value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Boolean value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Boolean value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Boolean value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Boolean> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Boolean> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Boolean value1, Boolean value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andDeletedIsNull() {
			addCriterion("deleted is null");
			return (Criteria) this;
		}

		public Criteria andDeletedIsNotNull() {
			addCriterion("deleted is not null");
			return (Criteria) this;
		}

		public Criteria andDeletedEqualTo(Boolean value) {
			addCriterion("deleted =", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotEqualTo(Boolean value) {
			addCriterion("deleted <>", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedGreaterThan(Boolean value) {
			addCriterion("deleted >", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("deleted >=", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedLessThan(Boolean value) {
			addCriterion("deleted <", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
			addCriterion("deleted <=", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedIn(List<Boolean> values) {
			addCriterion("deleted in", values, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotIn(List<Boolean> values) {
			addCriterion("deleted not in", values, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
			addCriterion("deleted between", value1, value2, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("deleted not between", value1, value2, "deleted");
			return (Criteria) this;
		}

		public Criteria andAdminIsNull() {
			addCriterion("admin is null");
			return (Criteria) this;
		}

		public Criteria andAdminIsNotNull() {
			addCriterion("admin is not null");
			return (Criteria) this;
		}

		public Criteria andAdminEqualTo(Boolean value) {
			addCriterion("admin =", value, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminNotEqualTo(Boolean value) {
			addCriterion("admin <>", value, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminGreaterThan(Boolean value) {
			addCriterion("admin >", value, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminGreaterThanOrEqualTo(Boolean value) {
			addCriterion("admin >=", value, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminLessThan(Boolean value) {
			addCriterion("admin <", value, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminLessThanOrEqualTo(Boolean value) {
			addCriterion("admin <=", value, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminIn(List<Boolean> values) {
			addCriterion("admin in", values, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminNotIn(List<Boolean> values) {
			addCriterion("admin not in", values, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminBetween(Boolean value1, Boolean value2) {
			addCriterion("admin between", value1, value2, "admin");
			return (Criteria) this;
		}

		public Criteria andAdminNotBetween(Boolean value1, Boolean value2) {
			addCriterion("admin not between", value1, value2, "admin");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeIsNull() {
			addCriterion("created_time is null");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeIsNotNull() {
			addCriterion("created_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeEqualTo(Date value) {
			addCriterion("created_time =", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeNotEqualTo(Date value) {
			addCriterion("created_time <>", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeGreaterThan(Date value) {
			addCriterion("created_time >", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("created_time >=", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeLessThan(Date value) {
			addCriterion("created_time <", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
			addCriterion("created_time <=", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeIn(List<Date> values) {
			addCriterion("created_time in", values, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeNotIn(List<Date> values) {
			addCriterion("created_time not in", values, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeBetween(Date value1, Date value2) {
			addCriterion("created_time between", value1, value2, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
			addCriterion("created_time not between", value1, value2,
					"createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedByIsNull() {
			addCriterion("created_by is null");
			return (Criteria) this;
		}

		public Criteria andCreatedByIsNotNull() {
			addCriterion("created_by is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedByEqualTo(String value) {
			addCriterion("created_by =", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByNotEqualTo(String value) {
			addCriterion("created_by <>", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByGreaterThan(String value) {
			addCriterion("created_by >", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
			addCriterion("created_by >=", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByLessThan(String value) {
			addCriterion("created_by <", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByLessThanOrEqualTo(String value) {
			addCriterion("created_by <=", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByLike(String value) {
			addCriterion("created_by like", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByNotLike(String value) {
			addCriterion("created_by not like", value, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByIn(List<String> values) {
			addCriterion("created_by in", values, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByNotIn(List<String> values) {
			addCriterion("created_by not in", values, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByBetween(String value1, String value2) {
			addCriterion("created_by between", value1, value2, "createdBy");
			return (Criteria) this;
		}

		public Criteria andCreatedByNotBetween(String value1, String value2) {
			addCriterion("created_by not between", value1, value2, "createdBy");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_user
	 * @mbggenerated  Fri Mar 24 17:07:32 CST 2017
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_user
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 24 15:48:33 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}