package com.imooc.autority.service;

import com.imooc.autority.entity.authUser;

/**
 * Created by HW520 on 2017/9/5.
 */
public interface loginService {
    authUser login(String username, String password);
}
