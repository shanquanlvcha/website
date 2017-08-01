package com.qsf.websit.bkmgr.dao;

import java.util.HashMap;
import java.util.List;

import com.qsf.ssm.core.generic.GenericDao;
import com.qsf.websit.bkmgr.entity.User;

public interface CaseMapper extends GenericDao<User, Long> {
	
    int deleteByPrimaryKey(HashMap<String,Object> hashMap);

    int insert(HashMap<String,Object> hashMap);

    int insertSelective(HashMap<String,Object> hashMap);
    
    
    int update(HashMap<String,Object> hashMap);
    
    
    List list(HashMap<String,Object> hashMap);
    

}
