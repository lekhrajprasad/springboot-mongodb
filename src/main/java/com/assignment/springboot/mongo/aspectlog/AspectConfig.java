package com.assignment.springboot.mongo.aspectlog;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.assignment.springboot.mongo.aspectlog")
public class AspectConfig {
}
