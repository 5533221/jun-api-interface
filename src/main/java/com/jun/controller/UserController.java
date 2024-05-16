package com.jun.controller;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.sdk.modal.User;
import com.sdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;

/**
 * @author 27164
 * @version 1.0
 * @description: TODO
 * @date 2024/5/5 10:10
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/")
    public String   GetNameByGET(@RequestParam String name){
        return "Get 我的名字"+name;
    }

    @GetMapping("/hh")
    public String   getInfo(){
        return "Get 我的名字";
    }


    @PostMapping("/")
    public String   GetNameByPost(@RequestParam String name){

        return "Post 我的名字"+name;
    }
    @PostMapping("/name")
    public String   GetNameByPostAndBody(@RequestBody User user, HttpServletRequest request){


//        //获取请求头中的信息
//        String accessKey = request.getHeader("accessKey");
//        String body = null ;
//        //解决乱码   服务端这边进行对body的 解码   decode
//        try {
//            body= URLDecoder.decode(request.getHeader("body"),"utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        String sign = request.getHeader("sign");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");


//        //todo 实际情况根据数据库查询是否已经分配给用户
//        if(!accessKey.equals("junjun") ){
//
//            throw new RuntimeException("暂无权限");
//        }
//        if((long) nonce.length() >10000){
//
//            throw new RuntimeException("暂无权限");
//        }

        //防止重放问题 比如今天的访问 明天还能访问  使用时间戳的方式
//        String oldTime="1714902695179";

        //前端传来的时间戳
//        Date date = new Date(Long.parseLong(timestamp));
//        //当前时间
//        Date date1 = new Date(System.currentTimeMillis()/1000);
//        //相差多少分钟  如果超过了 则无权限
//        long offsetTime = DateUtil.between(date, date1, DateUnit.MINUTE);
//        System.out.println("相差的时间为："+offsetTime);
//        //超过十分钟  表示重发  设置为无权限
//        if(offsetTime > 10L){
//
//            throw new RuntimeException("超出时间,暂无权限");
//        }

//
//        //todo 实际情况需要查询数据库 secretKey
//        String key = SignUtils.getSign(body, "abcdefgh");
//
//        if(!sign.equals(key)){
//
//            throw new RuntimeException("暂无权限");
//
//        }


        return "PostBody： 我的名字"+user.getUserName();
    }
}
