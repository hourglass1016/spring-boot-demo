package com.dieyuyun.function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoFunctionApplicationTests {

    @Test
    public void isFalse() {
        VUtils.isTure(false).throwMessage("参数为false，不抛异常");
    }

    @Test
    public void isTrue() {
        VUtils.isTure(true).throwMessage("参数为true，抛异常");
    }

    @Test
    public void isTrueOrFalse() {
        VUtils.isTureOrFalse(true).trueOrFalseHandle(() -> {
            System.out.println("参数为true");
        }, () -> {
            System.out.println("参数为false");
        });
    }

    @Test
    public void isBlankOrNoBlank() {
        VUtils.isBlankOrNoBlank("").presentOrElseHandle(System.out::println, () -> {
            System.out.println("参数为空");
        });
    }
}
