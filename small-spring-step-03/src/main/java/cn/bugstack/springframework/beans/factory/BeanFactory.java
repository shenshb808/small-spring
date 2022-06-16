package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    /**
     * 获取 Bean 时传递构造函数的入参信息
     */
    Object getBean(String name, Object... args) throws BeansException;

}
