package com.demo.yun;

import com.demo.yun.mapper.UserFileMapper;
import com.demo.yun.pojo.UserFile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by lyre on 2018/12/26
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {



    @Resource
    private UserFileMapper mapper ;


    @Test
    public void testFile(){


        UserFile record = new UserFile();
        record.setCreateTime(new Date());
        record.setFileName("file_test");
        record.setFileType("test_type");
        record.setUploadUser("lyre");
        record.setFileSize(100.0);
        mapper.insert(record);
    }

}
