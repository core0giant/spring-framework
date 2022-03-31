package org.springframework.mytest.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description TODO
 * @Author 刘强#81013684
 * @Date 2022/3/15
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan("org.springframework.mytest.beans")
public class TestConfig {
}
