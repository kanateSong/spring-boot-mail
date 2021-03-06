package com.ljj.mail.common.dynamicquery;

/**
 * <p>
 * DynamicQuery 扩展SpringDataJpa, 支持动态jpql/nativesql查询并支持分页查询
 * </p>
 *
 * @author LeeJack
 * @date Created in 2020/4/29 0:33
 */
public interface DynamicQuery {
    void save(Object entity);

    void update(Object entity);

    <T> void delete(Class<T> entityClass, Object entityid);

    <T> void delete(Class<T> entityClass, Object[] entityids);

    /**
     * 执行nativeSql统计查询
     *
     * @param nativeSql
     * @param params    占位符参数(例如?1)绑定的参数值
     * @return 统计条数
     */
    Long nativeQueryCount(String nativeSql, Object... params);

}
