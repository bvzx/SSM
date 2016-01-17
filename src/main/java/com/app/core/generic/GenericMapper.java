package com.app.core.generic;

/**
 * Created by wuhao on 2016/1/17.
 */
public interface GenericMapper <T,E> {

    int deleteByPrimaryKey(E id);

    int insert(T model);

    int insertSelective(T model);

    T selectByPrimaryKey(E id);

    int updateByPrimaryKeySelective(T model);

    int updateByPrimaryKey(T model);

}
