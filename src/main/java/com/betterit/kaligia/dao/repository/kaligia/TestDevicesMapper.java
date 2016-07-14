package com.betterit.kaligia.dao.repository.kaligia;

import com.betterit.kaligia.dao.model.kaligia.TestDevices;
import com.betterit.kaligia.dao.model.kaligia.TestDevicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDevicesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testdevices
	 * @mbggenerated  Mon Mar 28 12:28:13 EDT 2016
	 */
	int deleteByExample(TestDevicesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testdevices
	 * @mbggenerated  Mon Mar 28 12:28:13 EDT 2016
	 */
	int insert(TestDevices record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testdevices
	 * @mbggenerated  Mon Mar 28 12:28:13 EDT 2016
	 */
	int insertSelective(TestDevices record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testdevices
	 * @mbggenerated  Mon Mar 28 12:28:13 EDT 2016
	 */
	List<TestDevices> selectByExample(TestDevicesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testdevices
	 * @mbggenerated  Mon Mar 28 12:28:13 EDT 2016
	 */
	int updateByExampleSelective(@Param("record") TestDevices record, @Param("example") TestDevicesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table kaligia.testdevices
	 * @mbggenerated  Mon Mar 28 12:28:13 EDT 2016
	 */
	int updateByExample(@Param("record") TestDevices record, @Param("example") TestDevicesExample example);
}