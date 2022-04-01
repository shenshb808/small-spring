package cn.bugstack.springframework.beans.factory.config;

/**
 * 把 Bean 的创建交给容器,而不是我们在调用时候传递一个实例化好的 Bean 对象。
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    /**
     * 在 Bean 注册的时候只注册一个类信息
     */
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
