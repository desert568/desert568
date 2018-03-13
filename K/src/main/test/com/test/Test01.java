package com.test;

import com.dao.IUserDao;
import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

public class Test01 {

    @Test
    public void test001() throws IOException {
//
//         SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config"));
//
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//
//        IUserDao iUserDao=sqlSession.getMapper(IUserDao.class);
//        for (User user : iUserDao.getAllUser()) {
//            System.out.println(user.getUname()+","+user.getUpwd());
//        }

    }


}
