package com.bottle.study_springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component

public class CommonCodeDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    
    public Object getList(){
        String statement = "CommonCode.selectFromCIP_COMMON_CODE";
        Object list = sqlSessionTemplate.selectList(statement);
        return list;
    }
}
