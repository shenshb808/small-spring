package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.core.io.Resource;
import cn.bugstack.springframework.core.io.ResourceLoader;

/**
 * Bean定义读取接口
 */
public interface BeanDefinitionReader {

    /**
     * 给loadBeanDefinitions使用
     * 实现会包装到抽象类中，以免污染具体的接口实现方法。
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 给loadBeanDefinitions使用
     * 实现会包装到抽象类中，以免污染具体的接口实现方法。
     */
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
