package cn.bugstack.springframework.context.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.bugstack.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 实现BeanFactory创建与BeanDefinition加载
 * 实现获取BeanFactory
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    /**
     * 获取了 DefaultListableBeanFactory 的实例化以及对资源配置的加载操作 loadBeanDefinitions(beanFactory)
     */
    @Override
    protected void refreshBeanFactory() throws BeansException {
        // 创建bean工厂
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        // 加载BeanDefinition
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    /**
     * 创建bean工厂
     */
    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    /**
     * 加载BeanDefinition
     */
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
