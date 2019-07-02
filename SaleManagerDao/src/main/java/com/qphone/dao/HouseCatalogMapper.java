package com.qphone.dao;

import com.qphone.pojo.HouseCatalog;
import java.math.BigDecimal;

public interface HouseCatalogMapper {
    int deleteByPrimaryKey(BigDecimal houseCatalogId);

    int insert(HouseCatalog record);

    int insertSelective(HouseCatalog record);

    HouseCatalog selectByPrimaryKey(BigDecimal houseCatalogId);

    int updateByPrimaryKeySelective(HouseCatalog record);

    int updateByPrimaryKey(HouseCatalog record);
}