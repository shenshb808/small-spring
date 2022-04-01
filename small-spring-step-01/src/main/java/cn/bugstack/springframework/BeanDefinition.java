package cn.bugstack.springframework;

/**
 * 用于定义 Bean 实例化信息
 */
public class BeanDefinition {

    /**
     * 现在的实现是以一个 Object 存放对象
     */
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
