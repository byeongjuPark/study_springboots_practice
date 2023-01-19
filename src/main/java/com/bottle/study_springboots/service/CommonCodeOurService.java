package com.bottle.study_springboots.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bottle.study_springboots.dao.CommonCodeOurDao;

@Service
public class CommonCodeOurService {
    @Autowired
    CommonCodeOurDao commonCodeOurDao;

    public Object deleteAndGetList(Object dataMap){
        Object result = this.delete(dataMap);
        result = this.getList(dataMap);
        return result;
    }

    public Object updateAndGetList(Object dataMap){
        Object result =  this.updateOne(dataMap);
            result = this.getList(dataMap);
            return result;
        }
    
    public Object getList(Object dataMap){
        String sqlMapId = "CommonCodeOur.selectListByUID";
        Object result = commonCodeOurDao.getList(sqlMapId, dataMap);
        return result;
    }

    public Object getOne(Object dataMap){
        String sqlMapId = "CommonCodeOur.selectByUID";

        Object result = commonCodeOurDao.getOne(sqlMapId, dataMap);
        return result;
    }

    public Object updateOne(Object dataMap){
        String sqlMapId = "CommonCodeOur.updateByUID";

        Object result = commonCodeOurDao.update(sqlMapId, dataMap);
        return result;    
    }

    public Object insertOne(Object dataMap){
        String sqlMapId = "CommonCodeOur.insertWithUID";

        Object result = commonCodeOurDao.insert(sqlMapId, dataMap);
        return result;    
    }

    public Object delete(Object dataMap){
        String sqlMapId = "CommonCodeOur.deleteByUID";

        Object result = commonCodeOurDao.delete(sqlMapId, dataMap);
        return result;    
    }
}
