package org.whut.platform.business.user.mapper;

import org.whut.platform.business.user.entity.UserAuthority;
import org.whut.platform.fundamental.orm.mapper.AbstractMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xiaozhujun
 * Date: 14-3-16
 * Time: 下午8:14
 * To change this template use File | Settings | File Templates.
 */
public interface UserAuthorityMapper extends AbstractMapper<UserAuthority> {
    public List<UserAuthority> findByUserName(String username);
}
