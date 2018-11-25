package com.example.demo.service;

import com.example.demo.dao.mapperdao.ITestMapperDao;
import com.example.demo.dao.servicedao.ITestServcieDao;
import com.example.demo.entity.Tb_test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:DxlinY
 * @Description：
 * @Date: 2018/11/16
 * @Time: 10:00
 */
@Service
@Component(value = "testService")
public class ITestService implements ITestServcieDao {

    @Resource
    private ITestMapperDao mapperDao;
    @Resource
    private Tb_test tb_test;

    @Override
    public Tb_test getOneTestById(int id) {
        if(id>=0){
            tb_test = mapperDao.getOneTestById(id);
        }
        if(tb_test!=null){
            return tb_test;
        }
        return null;
    }
}
