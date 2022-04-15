package cn.bugstack.springframework.beans.factory;

/**
 * Interface to be implemented by objects used within a {@link BeanFactory}
 * which are themselves factories. If a bean implements this interface,
 * it is used as a factory for an object to expose, not directly as a bean
 * instance that will be exposed itself.
 * @param <T>
 *
 */
public interface FactoryBean<T> {

    /**
     * 获取对象
     */
    T getObject() throws Exception;

    /**
     * 对象类型
     */
    Class<?> getObjectType();

    /**
     * 是否是单例对象
     */
    boolean isSingleton();

}
