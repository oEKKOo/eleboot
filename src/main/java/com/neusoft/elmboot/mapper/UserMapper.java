package com.neusoft.elmboot.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.neusoft.elmboot.po.User;

@Mapper
public interface UserMapper  extends BaseMapper<User> {

}