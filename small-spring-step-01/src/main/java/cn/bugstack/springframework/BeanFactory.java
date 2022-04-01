package cn.bugstack.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 目前的 BeanFactory 仍然是非常简化的实现，
 * 但这种简化的实现内容也是整个 Spring 容器中关于 Bean 使用的最终体现结果，只不过实现过程只展示出基本的核心原理。
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 这里注册的是 Bean 的定义信息
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
