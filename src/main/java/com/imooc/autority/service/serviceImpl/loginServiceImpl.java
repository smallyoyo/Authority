package com.imooc.autority.service.serviceImpl;

import com.imooc.autority.entity.authUser;
import com.imooc.autority.reposiotry.loginReposiotry;
import com.imooc.autority.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HW520 on 2017/9/5.
 */
@Service
public class loginServiceImpl implements loginService {
    @Autowired
    private loginReposiotry loginReposiotry;
    @Override
    public authUser login(String username, String password) {
        return  loginReposiotry.login(username,password);
    }
}
