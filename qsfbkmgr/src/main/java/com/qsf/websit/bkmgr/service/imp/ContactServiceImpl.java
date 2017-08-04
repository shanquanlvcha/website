/**  
* @Title: ContactServiceImpl.java
* @Package com.qsf.websit.bkmgr.service.imp
* @Description: TODO(用一句话描述该文件做什么)
* @author zhaojl
* @date 2017年8月2日 下午4:45:22
* @version V1.0  
*/ 
package com.qsf.websit.bkmgr.service.imp;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qsf.websit.bkmgr.dao.ContactMapper;
import com.qsf.websit.bkmgr.entity.Contact;
import com.qsf.websit.bkmgr.service.ContactService;

/**
* @ClassName: ContactServiceImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zhaojl
* @date 2017年8月2日 下午4:45:22
*
*/
@Service
public class ContactServiceImpl implements ContactService{
  @Resource
  private ContactMapper contactMapper;

public List<Contact> findAllContacts() {
	return contactMapper.findAllContacts();
}


public Contact findContactByContactid(String contactid) {
	return contactMapper.findContactByContactid(contactid);
}


public int addContact(Contact contact) {
	return contactMapper.addContact(contact);
}


public int updateContact(Contact contact) {
	// TODO Auto-generated method stub
	return contactMapper.updateContact(contact);
}

 
public int deleteContact(HashMap<String, Object> hashMap) {
	return contactMapper.deleteContact(hashMap);
}

 
public int deleteContactByContactid(String contactid) {
	return contactMapper.deleteContactByContactid(contactid);
}



public int insertSelective(Contact model) {
	// TODO Auto-generated method stub
	return 0;
}



public int updateByPrimaryKeySelective(Contact model) {
	// TODO Auto-generated method stub
	return 0;
}



public int deleteByPrimaryKey(String id) {
	// TODO Auto-generated method stub
	return 0;
}


public Contact selectByPrimaryKey(String id) {
	// TODO Auto-generated method stub
	return null;
}
   


}
