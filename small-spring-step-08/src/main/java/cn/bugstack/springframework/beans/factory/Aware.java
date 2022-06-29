package cn.bugstack.springframework.beans.factory;

/**
 * 标记类接口，实现该接口可以被Spring容器感知
 *
 * 有了标记的存在更方便类的操作和具体判断实现
 * 可以方便统一摘取出属于此类接口的实现类，通常会有 instanceof 一起判断使用
 *
 */
public interface Aware {

    // 实现相应的Aware接口后，bean创建时就会塞入部分环境参数，比如BeanFactory、ApplicationContext等等

}
                             