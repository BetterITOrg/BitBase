package com.betterit.kaligia.dao.model.kaligia;

import java.util.ArrayList;
import java.util.List;

public class RunDevicesExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public RunDevicesExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
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

		public Criteria andRunIdIsNull() {
			addCriterion("run_id is null");
			return (Criteria) this;
		}

		public Criteria andRunIdIsNotNull() {
			addCriterion("run_id is not null");
			return (Criteria) this;
		}

		public Criteria andRunIdEqualTo(Integer value) {
			addCriterion("run_id =", value, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdNotEqualTo(Integer value) {
			addCriterion("run_id <>", value, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdGreaterThan(Integer value) {
			addCriterion("run_id >", value, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("run_id >=", value, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdLessThan(Integer value) {
			addCriterion("run_id <", value, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdLessThanOrEqualTo(Integer value) {
			addCriterion("run_id <=", value, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdIn(List<Integer> values) {
			addCriterion("run_id in", values, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdNotIn(List<Integer> values) {
			addCriterion("run_id not in", values, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdBetween(Integer value1, Integer value2) {
			addCriterion("run_id between", value1, value2, "runId");
			return (Criteria) this;
		}

		public Criteria andRunIdNotBetween(Integer value1, Integer value2) {
			addCriterion("run_id not between", value1, value2, "runId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdIsNull() {
			addCriterion("device_inst_id is null");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdIsNotNull() {
			addCriterion("device_inst_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdEqualTo(Integer value) {
			addCriterion("device_inst_id =", value, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdNotEqualTo(Integer value) {
			addCriterion("device_inst_id <>", value, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdGreaterThan(Integer value) {
			addCriterion("device_inst_id >", value, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("device_inst_id >=", value, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdLessThan(Integer value) {
			addCriterion("device_inst_id <", value, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdLessThanOrEqualTo(Integer value) {
			addCriterion("device_inst_id <=", value, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdIn(List<Integer> values) {
			addCriterion("device_inst_id in", values, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdNotIn(List<Integer> values) {
			addCriterion("device_inst_id not in", values, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdBetween(Integer value1, Integer value2) {
			addCriterion("device_inst_id between", value1, value2, "deviceInstId");
			return (Criteria) this;
		}

		public Criteria andDeviceInstIdNotBetween(Integer value1, Integer value2) {
			addCriterion("device_inst_id not between", value1, value2, "deviceInstId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table kaligia.rundevices
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table kaligia.rundevices
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 07 17:33:12 EST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}