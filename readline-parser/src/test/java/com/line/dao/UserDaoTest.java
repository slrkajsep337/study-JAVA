package com.line.dao;

import com.line.dao.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
//classes= : 특정 클래스만 지정해서 불러온다. 다불러오지 않고, Spring에 있는 기능들을 사용하기 위함
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    UserDao userDao;

    @BeforeEach
    void setUP() {
        this.userDao = context.getBean("awsUserDao", UserDao.class);
    }

    @Test
    void FindById() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            userDao.FindById("30");
        });
    }


    //autowired어노테이션을 사용하면 한번의 생성으로 계속 사용할 수 있다
    @Autowired
    ApplicationContext context;

    @Test
    void addAndSelect() throws Exception {

        //DBConnection을 interface로 선언하여 Test코드의 수정만으로도 다른 db로 언제든지 갈아끼울 수 있다
//        UserDao udao = new UserDao(new DBConnectionA());

        //Factory 패턴을 사용하면 이렇게 테스트코드에서만 필요한 객체를 선언해서 사용할 수 있다
//        UserDao udao = new UserDao(new LocalConnection());
//        UserDao userDao = new UserDaoFactory().awsUserDao();
//        String id = "3";
//        userDao.add(new User(id,"NaNu","18pw"));
//
//        User user = userDao.FindById(id);
//        Assertions.assertEquals("NuNu", user.getName());


        User user1 = new User("1", "kyeonghwan", "1515");

//        //spring에서 가져다 쓸 수 있는 getBean 함수
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();
        assertEquals(0,userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());
        User user = userDao.FindById(user1.getId());

        assertEquals(user1.getName(), user.getName());
        assertEquals(user1.getPassword(), user.getPassword());


        //delete, getCount test


    }

}