package com.imooc.autority.reposiotry;

import com.imooc.autority.entity.authUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by HW520 on 2017/9/5.
 */
@Repository
public interface loginReposiotry extends JpaRepository<authUser,Long>{
    @Query("select a from authUser a where a.name=:username and a.pwd=:password")
    authUser login(@Param("username") String username,@Param("password") String password);
}
