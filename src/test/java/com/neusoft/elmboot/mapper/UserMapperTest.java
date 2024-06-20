package com.neusoft.elmboot.mapper;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neusoft.elmboot.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    //1、注入UserMapper接口对应的对象
    @Autowired
    private UserMapper userMapper;

    @Test
    public  void addTest(){
        //1、封装对象
        User user=new User();
        user.setUserId("12345672221");
        user.setUserName("张三");
        user.setUserSex(0);
        user.setUserImg("+0zWPUl8tYMA1qOwi82bxzAAvybikSfZhme0srdHm89Zq1XLF2lxd5uTMOzsZ2eQyrbvWfWKM0vl/N/2ETSZqf1oa9pWPXCsT/sPn9AOeIade/c5vZ0VizrU09GiKO/Zu/8oKCbNrqGa4XrVrD/LOmN4fISuaD1Ei4l47UCtCL9Qy9pA1sJx4wQAIIiijBZ1VtJ5gOShl20c7Six1gZrXTiAlzaQz5yQB/z/ASYreCvt25D1AAAAAElFTkSuQmCC");
        user.setPassword("1234567");
        user.setDelTag(1);
        //2、调用方法
        int rs= userMapper.insert(user);
        //3、判断结果
        if(rs==1){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }


}