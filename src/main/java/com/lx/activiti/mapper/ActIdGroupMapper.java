package com.lx.activiti.mapper;

import com.lx.activiti.dto.ActIdGroup;

public interface ActIdGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbggenerated
     */
    int insert(ActIdGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbggenerated
     */
    int insertSelective(ActIdGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbggenerated
     */
    ActIdGroup selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActIdGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table act_id_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActIdGroup record);
}