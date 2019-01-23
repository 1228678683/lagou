package com.lagou.mapper;

import com.lagou.common.pojo.CompanyStage;
import com.lagou.common.pojo.CompanyStageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyStageMapper {
    int countByExample(CompanyStageExample example);

    int deleteByExample(CompanyStageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyStage record);

    int insertSelective(CompanyStage record);

    List<CompanyStage> selectByExample(CompanyStageExample example);

    CompanyStage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyStage record, @Param("example") CompanyStageExample example);

    int updateByExample(@Param("record") CompanyStage record, @Param("example") CompanyStageExample example);

    int updateByPrimaryKeySelective(CompanyStage record);

    int updateByPrimaryKey(CompanyStage record);
}