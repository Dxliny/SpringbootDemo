package com.example.demo.dao.mapperdao;

import com.example.demo.entity.Tb_test;
import org.springframework.stereotype.Component;

/**
 * @Author:DxlinY
 * @Description：
 * @Date: 2018/11/16
 * @Time: 9:43
 */
@Component(value = "mapperDao")
public interface ITestMapperDao {
    public Tb_test getOneTestById(int test_id);
}
