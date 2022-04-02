package cn.bugstack.springframework.core.io;

/**
 * 包装资源加载器
 * 按照资源加载的不同方式，资源加载器可以把这些方式集中到统一的类服务下进行处理，外部用户只需要传递资源地址即可，简化使用。s
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    /**
     * 封装三种不同类型的资源处理方式
     * 外部只需传入地址，无需关注具体实现
     * @param location
     * @return
     */
    Resource getResource(String location);

}
