package com.qsf.websit.bkmgr.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qsf.ssm.core.generic.GenericDao;
import com.qsf.ssm.core.generic.GenericServiceImpl;
import com.qsf.websit.bkmgr.dao.UserMapper;
import com.qsf.websit.bkmgr.entity.User;
import com.qsf.websit.bkmgr.entity.UserExample;
import com.qsf.websit.bkmgr.service.UserService;

/**
 * 用户Service实现�?
 *
 * @author StarZou
 * @since 2014�?7�?5�? 上午11:54:24
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }

}
