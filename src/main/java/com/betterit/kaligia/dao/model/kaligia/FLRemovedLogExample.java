package com.betterit.kaligia.dao.model.kaligia;

import java.util.ArrayList;
import java.util.List;

public class FLRemovedLogExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public FLRemovedLogExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.flremovedlog
	 * @mbggenerated  Mon Mar 28 12:28:14 EDT 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table kaligia.flremovedlog
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

		public Criteria andRunSegmentIdIsNull() {
			addCriterion("run_segment_id is null");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdIsNotNull() {
			addCriterion("run_segment_id is not null");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdEqualTo(Integer value) {
			addCriterion("run_segment_id =", value, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdNotEqualTo(Integer value) {
			addCriterion("run_segment_id <>", value, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdGreaterThan(Integer value) {
			addCriterion("run_segment_id >", value, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("run_segment_id >=", value, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdLessThan(Integer value) {
			addCriterion("run_segment_id <", value, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdLessThanOrEqualTo(Integer value) {
			addCriterion("run_segment_id <=", value, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdIn(List<Integer> values) {
			addCriterion("run_segment_id in", values, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdNotIn(List<Integer> values) {
			addCriterion("run_segment_id not in", values, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdBetween(Integer value1, Integer value2) {
			addCriterion("run_segment_id between", value1, value2, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRunSegmentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("run_segment_id not between", value1, value2, "runSegmentId");
			return (Criteria) this;
		}

		public Criteria andRIndexIsNull() {
			addCriterion("r_index is null");
			return (Criteria) this;
		}

		public Criteria andRIndexIsNotNull() {
			addCriterion("r_index is not null");
			return (Criteria) this;
		}

		public Criteria andRIndexEqualTo(Integer value) {
			addCriterion("r_index =", value, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexNotEqualTo(Integer value) {
			addCriterion("r_index <>", value, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexGreaterThan(Integer value) {
			addCriterion("r_index >", value, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexGreaterThanOrEqualTo(Integer value) {
			addCriterion("r_index >=", value, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexLessThan(Integer value) {
			addCriterion("r_index <", value, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexLessThanOrEqualTo(Integer value) {
			addCriterion("r_index <=", value, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexIn(List<Integer> values) {
			addCriterion("r_index in", values, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexNotIn(List<Integer> values) {
			addCriterion("r_index not in", values, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexBetween(Integer value1, Integer value2) {
			addCriterion("r_index between", value1, value2, "rIndex");
			return (Criteria) this;
		}

		public Criteria andRIndexNotBetween(Integer value1, Integer value2) {
			addCriterion("r_index not between", value1, value2, "rIndex");
			return (Criteria) this;
		}

		public Criteria andWavelengthIsNull() {
			addCriterion("wavelength is null");
			return (Criteria) this;
		}

		public Criteria andWavelengthIsNotNull() {
			addCriterion("wavelength is not null");
			return (Criteria) this;
		}

		public Criteria andWavelengthEqualTo(Double value) {
			addCriterion("wavelength =", value, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthNotEqualTo(Double value) {
			addCriterion("wavelength <>", value, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthGreaterThan(Double value) {
			addCriterion("wavelength >", value, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthGreaterThanOrEqualTo(Double value) {
			addCriterion("wavelength >=", value, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthLessThan(Double value) {
			addCriterion("wavelength <", value, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthLessThanOrEqualTo(Double value) {
			addCriterion("wavelength <=", value, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthIn(List<Double> values) {
			addCriterion("wavelength in", values, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthNotIn(List<Double> values) {
			addCriterion("wavelength not in", values, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthBetween(Double value1, Double value2) {
			addCriterion("wavelength between", value1, value2, "wavelength");
			return (Criteria) this;
		}

		public Criteria andWavelengthNotBetween(Double value1, Double value2) {
			addCriterion("wavelength not between", value1, value2, "wavelength");
			return (Criteria) this;
		}

		public Criteria andPhotonCountIsNull() {
			addCriterion("photon_count is null");
			return (Criteria) this;
		}

		public Criteria andPhotonCountIsNotNull() {
			addCriterion("photon_count is not null");
			return (Criteria) this;
		}

		public Criteria andPhotonCountEqualTo(Double value) {
			addCriterion("photon_count =", value, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountNotEqualTo(Double value) {
			addCriterion("photon_count <>", value, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountGreaterThan(Double value) {
			addCriterion("photon_count >", value, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountGreaterThanOrEqualTo(Double value) {
			addCriterion("photon_count >=", value, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountLessThan(Double value) {
			addCriterion("photon_count <", value, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountLessThanOrEqualTo(Double value) {
			addCriterion("photon_count <=", value, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountIn(List<Double> values) {
			addCriterion("photon_count in", values, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountNotIn(List<Double> values) {
			addCriterion("photon_count not in", values, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountBetween(Double value1, Double value2) {
			addCriterion("photon_count between", value1, value2, "photonCount");
			return (Criteria) this;
		}

		public Criteria andPhotonCountNotBetween(Double value1, Double value2) {
			addCriterion("photon_count not between", value1, value2, "photonCount");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table kaligia.flremovedlog
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
     * This class corresponds to the database table kaligia.flremovedlog
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 10 20:02:18 EST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}