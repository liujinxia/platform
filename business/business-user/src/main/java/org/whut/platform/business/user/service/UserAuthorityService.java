package org.whut.platform.business.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.whut.platform.business.user.entity.UserAuthority;
import org.whut.platform.business.user.mapper.UserAuthorityMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiaozhujun
 * Date: 14-3-16
 * Time: 下午8:17
 * To change this template use File | Settings | File Templates.
 */
public class UserAuthorityService {

    @Autowired
    private UserAuthorityMapper mapper;

    //查找用户对应的角色
    public List<UserAuthority> findByUserName(String username){
        if(username==null || username.trim().equals("")) return null;
        return mapper.findByUserName(username);
    }
}
