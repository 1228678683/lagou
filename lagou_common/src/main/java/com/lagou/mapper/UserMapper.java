package com.lagou.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lagou.pojo.User;

public interface UserMapper extends BaseMapper<User> {
  @Select("select count(1) from tb_user where ${paramType}=#{param}")
	Integer selectCount1(
		@Param("param")	String param, 
		@Param("paramType")	String paramType);

}
