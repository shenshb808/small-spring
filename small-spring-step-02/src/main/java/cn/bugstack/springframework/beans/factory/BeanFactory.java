package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * Bean 工厂
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
