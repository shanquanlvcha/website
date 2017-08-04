package com.qsf.websit.bkmgr.service;

import java.util.HashMap;
import java.util.List;

import com.qsf.ssm.core.generic.GenericService;
import com.qsf.websit.bkmgr.entity.Case;
import com.qsf.websit.bkmgr.entity.User;

public interface CaseService  extends GenericService<User, Long> {
	
	
	 int addCase(HashMap<String,Object> hashMap);
	
	 int updateCase(HashMap<String,Object> hashMap);
	 
	 
	 int deleteCase(HashMap<String,Object> hashMap);
	 
	 Case findOneCase(HashMap<String,Object> hashMap);
	 
	
	

}
