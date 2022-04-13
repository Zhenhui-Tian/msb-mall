package com.msb.dongbaoums.mapper;

import com.msb.dongbaoums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserMemberServiceTest {
    @Autowired
    UmsMemberMapper mapper;

    @Test
    void testInsert() {
        UmsMember insertObject = new UmsMember();
        insertObject.setUsername("username");
        insertObject.setPassword("password");
        insertObject.setEmail("email");
        insertObject.setCreateTime(new Date());
        insertObject.setNickName("nickName");

        mapper.insert(insertObject);
    }
}
