package com.jun;

import com.jun.controller.Model;
import com.sdk.client.JunClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author 27164
 * @version 1.0
 * @description: TODO
 * @date 2024/5/5 20:56
 */
@SpringBootTest(classes =SpringbootApplicationTest.class )
class SpringbootApplicationTest {

    @Resource
    private JunClient junClient;

    @Autowired
    private Model model;
    @Test
    public void test1() {

        com.sdk.modal.User user = new com.sdk.modal.User();
        user.setUserName("哈哈哈哈");
        System.out.println(junClient.GetNameByPostAndBody(user));

//        model.print();
    }
}
