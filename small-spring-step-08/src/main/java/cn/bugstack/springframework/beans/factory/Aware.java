package cn.bugstack.springframework.beans.factory;

/**
 * Marker superinterface indicating that a bean is eligible to be
 * notified by the Spring container of a particular framework object
 * through a callback-style method.  Actual method signature is
 * determined by individual subinterfaces, but should typically
 * consist of just one void-returning method that accepts a single
 * argument.
 *
 * 标记类接口，实现该接口可以被Spring容器感知
 * 有了标记的存在更方便类的操作和具体判断实现
 * 可以方便统一摘取出属于此类接口的实现类，通常会有 instanceof 一起判断使用
 *
 */
public interface Aware {
}
                             