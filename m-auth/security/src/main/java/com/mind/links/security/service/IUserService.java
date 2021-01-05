package com.mind.links.security.service;

import com.mind.links.security.domain.MyUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author qiDing
 * @since 2020-12-09
 */
public interface IUserService extends IService<MyUser> {
    List<MyUser> listUsers(Long id);
}
