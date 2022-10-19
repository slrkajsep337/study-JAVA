package com.line.dao;

import com.line.dao.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
//classes= : 특정 클래스만 지정해서 불러온다. 다불러오지 않고
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    void addAndSelect() throws Exception {

        //DBConnection을 interface로 선언하여 Test코드의 수정만으로도 다른 db로 언제든지 갈아끼울 수 있다
//        UserDao udao = new UserDao(new DBConnectionA());

//        UserDao udao = new UserDao();
//        User user = new User("5","ddd", "1131");
//        udao.add(user);

//        User selectedUser = udao.FindById("8");
//        결과 값이 예상과 같은지 틀린지 확인하기
//        Assertions.assertEquals("ddd", selectedUser.getName());


//        UserDao udao = new UserDao(new LocalConnection());
//        UserDao userDao = new UserDaoFactory().awsUserDao();
//        String id = "22";
//        userDao.add(new User(id,"NuNu","1818pw"));
//
//        User user = userDao.FindById(id);
//        Assertions.assertEquals("NuNu", user.getName());


        //spring에서 가져다 쓸 수 있는 getBean 함수
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
//        UserDao userDao2 = context.getBean("awsUserDao", UserDao.class);
//        String id = "23";
//        userDao.add(new User(id, "Nana", "pnana"));
//
//        User user = userDao.FindById(id);
//        Assertions.assertEquals("Nana", user.getName());

        System.out.println(userDao);

    }

}