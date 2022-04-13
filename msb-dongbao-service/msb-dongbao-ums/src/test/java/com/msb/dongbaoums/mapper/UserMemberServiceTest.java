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
        insertObject.setUsername("username4");
        insertObject.setPassword("password");
        insertObject.setEmail("email");
        insertObject.setNickName("nickName");
        mapper.insert(insertObject);
    }

    @Test
    void testUpdate() {
        UmsMember insertObject = new UmsMember();
        insertObject.setId(63L);
        mapper.updateById(insertObject);
    }
}
