package com.fiberhome.service;

import com.fiberhome.entity.WZDataIn;
import com.fiberhome.mapper.WZDataInDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class WZDataInService {

    @Resource
    private WZDataInDao wzDataInDao;

    @Transactional
    public boolean saveList(List<WZDataIn> list){
        try{

            List<WZDataIn> s = wzDataInDao.save(list);
            for(WZDataIn o : s){
                System.out.println(o.toString());
            }
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public List<WZDataIn> getListByTime(String time){
        return wzDataInDao.getAllByTime(time);
    }
}
