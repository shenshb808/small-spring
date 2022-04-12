package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.core.io.Resource;
import cn.bugstack.springframework.core.io.ResourceLoader;

/**
 * Bean定义读取接口
 */
public interface BeanDefinitionReader {

    /**
     * 获取 注册Bean定义类
     * 由抽象类实现，以免污染具体的接口实现方法。
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 获取资源加载器
     * 由抽象类实现，以免污染具体的接口实现方法。
     */
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
