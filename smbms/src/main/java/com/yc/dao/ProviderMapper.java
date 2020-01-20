package com.yc.dao;

import com.yc.po.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Provider record);

    int insertSelective(Provider record);

    Provider selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);
    
    /**
     * 供应商信息查询
     * @param
     * @param proname
     * @return
     */
    List<Provider> selectByPageAll(@Param("proname") String proname, @Param("procontact") String procontact);
}