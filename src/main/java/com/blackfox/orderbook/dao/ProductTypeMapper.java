package com.blackfox.orderbook.dao;

import com.blackfox.orderbook.entity.ProductType;
import com.blackfox.orderbook.entity.ProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeMapper {
    /**
     *
     * @mbggenerated 2018-03-25
     */
    int countByExample(ProductTypeExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByExample(ProductTypeExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insert(ProductType record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int insertSelective(ProductType record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    List<ProductType> selectByExample(ProductTypeExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    ProductType selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKeySelective(ProductType record);

    /**
     *
     * @mbggenerated 2018-03-25
     */
    int updateByPrimaryKey(ProductType record);
}