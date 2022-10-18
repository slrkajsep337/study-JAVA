package com.line.dao;

import com.line.dao.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws Exception {

        //DBConnection을 interface로 선언하여 Test코드의 수정만으로도 다른 db로 언제든지 갈아끼울 수 있다
//        UserDao udao = new UserDao(new DBConnectionA());

        UserDao udao = new UserDao();
        User user = new User("8","ddd", "1131");
        udao.add(user);

        User selectedUser = udao.FindById("8");
//        결과 값이 예상과 같은지 틀린지 확인하기
        Assertions.assertEquals("ddd", selectedUser.getName());
    }

}