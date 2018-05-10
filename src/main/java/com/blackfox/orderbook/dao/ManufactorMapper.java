package com.blackfox.orderbook.dao;

import com.blackfox.orderbook.entity.Manufactor;
import com.blackfox.orderbook.entity.ManufactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufactorMapper {
    /**
     *
     * @mbggenerated 2018-03-25
     */
    int countByExample(ManufactorExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByExample(ManufactorExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insert(Manufactor record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insertSelective(Manufactor record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    List<Manufactor> selectByExample(ManufactorExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    Manufactor selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExampleSelective(@Param("record") Manufactor record, @Param("example") ManufactorExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExample(@Param("record") Manufactor record, @Param("example") ManufactorExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKeySelective(Manufactor record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKey(Manufactor record);
}