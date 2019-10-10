package com.demo.yun.service.impl;

import com.demo.yun.mapper.UserFileMapper;
import com.demo.yun.pojo.UserFile;
import com.demo.yun.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lyre on 2018/12/26
 **/
@Service
public class FileServiceImpl implements FileService {


    @Resource
  private     UserFileMapper userFileMapper ;

    public int insertFileDemo(UserFile userFile) {

        userFileMapper.insertSelective(userFile);

        return 0;
    }
}
