package com.example.demo.controller;

import com.example.demo.dao.servicedao.ITestServcieDao;
import com.example.demo.entity.Tb_test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:DxlinY
 * @Description：
 * @Date: 2018/11/16
 * @Time: 9:25
 */
@RestController
@RequestMapping(value = "test")
public class testController {

    @RequestMapping(value = "hello")
    @ResponseBody
    public String test(){
        return "success";
    }

    @Resource
    private ITestServcieDao testService;

    @RequestMapping(value = "getOneTestById",method = {RequestMethod.GET})
    public void getOneTestByID(HttpServletRequest request, HttpServletResponse response,int test_id,String answer,String preAnswer) throws ServletException, IOException {
        Tb_test tb_test = testService.getOneTestById(test_id);
        System.out.println(answer+"  "+preAnswer);
        request.setAttribute("oneTest",tb_test);
        request.getRequestDispatcher("/jsp/testList.jsp").forward(request,response);
    }

}
