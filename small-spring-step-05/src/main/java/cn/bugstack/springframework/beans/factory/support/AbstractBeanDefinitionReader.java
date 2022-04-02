package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.core.io.DefaultResourceLoader;
import cn.bugstack.springframework.core.io.ResourceLoader;

/**
 * 实现getRegistry()和getResourceLoader()，以免污染具体的接口实现方法。
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    /**
     * 通过构造方法注入 Bean定义注册
     */
    private final BeanDefinitionRegistry registry;

    /**
     * 通过构造方法注入资源加载器
     */
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
