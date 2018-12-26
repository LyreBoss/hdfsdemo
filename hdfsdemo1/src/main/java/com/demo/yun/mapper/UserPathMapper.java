package com.demo.yun.mapper;

import com.demo.yun.pojo.UserPath;
import com.demo.yun.pojo.UserPathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPathMapper {
    int countByExample(UserPathExample example);

    int deleteByExample(UserPathExample example);

    int insert(UserPath record);

    int insertSelective(UserPath record);

    List<UserPath> selectByExample(UserPathExample example);

    int updateByExampleSelective(@Param("record") UserPath record, @Param("example") UserPathExample example);

    int updateByExample(@Param("record") UserPath record, @Param("example") UserPathExample example);
}