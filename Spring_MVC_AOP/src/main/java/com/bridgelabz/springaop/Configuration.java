package com.bridgelabz.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.bridgelabz.springaop")
@EnableAspectJAutoProxy
public class Configuration {

}
