package com.zshnamexy.namexyzsh.server;

import com.zshnamexy.namexyzsh.dao.NameUserDao;
import com.zshnamexy.namexyzsh.po.NameUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NameUserServerIpml implements NameUserServer{

    @Autowired
    private NameUserDao nameUserDao;

    @Override
    public List<NameUser> selectIddssa() {
        return nameUserDao.selectIddssa();
    }
}
