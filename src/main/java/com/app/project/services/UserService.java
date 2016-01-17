package com.app.project.services;

import com.app.core.generic.GenericService;
import com.app.project.beans.User;
import com.app.project.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wuhao on 2016/1/17.
 */
@Service
public class UserService implements GenericService<User,Integer>{


    @Resource
    UserMapper userMapper;

    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User model) {
        return userMapper.insert(model);
    }

    public int insertSelective(User model) {
        return userMapper.insertSelective(model);
    }

    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    public int updateByPrimaryKey(User model) {
        return userMapper.updateByPrimaryKey(model);
    }

    public List<User> selectByUser(User model){
        return userMapper.selectByUser(model);
    }
}
