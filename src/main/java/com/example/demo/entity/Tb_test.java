package com.example.demo.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author:DxlinY
 * @Description：
 * @Date: 2018/11/16
 * @Time: 9:39
 */
@Component(value = "tb_test")
@Scope(value = "prototype")
public class Tb_test {
    private int test_id;
    private String answer;
    private boolean tb_type;

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isTb_type() {
        return tb_type;
    }

    public void setTb_type(boolean tb_type) {
        this.tb_type = tb_type;
    }

    public Tb_test(String answer, boolean tb_type) {
        this.answer = answer;
        this.tb_type = tb_type;
    }

    public Tb_test(){

    }

}
