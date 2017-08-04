package com.qsf.websit.bkmgr.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qsf.websit.bkmgr.dao.CaseMapper;
import com.qsf.websit.bkmgr.entity.Case;
import com.qsf.websit.bkmgr.entity.User;
import com.qsf.websit.bkmgr.service.CaseService;
@Service
public class CaseServiceImpl implements CaseService {
	    @Resource
	    private CaseMapper caseMapper;
	    
	public int addCase(HashMap<String, Object> hashMap) {
		
		return caseMapper.insert(hashMap) ;
		
	}
	
	public int updateCase(HashMap<String, Object> hashMap) {
		
		return caseMapper.update(hashMap);
		
	}
	public int deleteCase(HashMap<String, Object> hashMap) {
		
		return caseMapper.deleteByPrimaryKey(hashMap) ;
		
	}

	public int insert(User model) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(User model) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Case findOneCase(HashMap<String, Object> hashMap) {
		// TODO Auto-generated method stub
		return null;
	}


	
	/*public Case findOneCase(HashMap<String, Object> hashMap) {

		
		return null;
	}*/
	
	

}
