/**  
* @Title: ContactMapper.java
* @Package com.qsf.websit.bkmgr.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author zhaojl
* @date 2017年8月2日 下午4:26:11
* @version V1.0  
*/ 
package com.qsf.websit.bkmgr.dao;

import java.util.HashMap;
import java.util.List;

import com.qsf.ssm.core.generic.GenericDao;
import com.qsf.websit.bkmgr.entity.Contact;

/**
* @ClassName: ContactMapper
* @Description: TODO(这里用一句话描述这个类的作用)
* @author XiongBiao
* @date 2017年8月2日 下午4:26:11
*
*/
public interface ContactMapper extends GenericDao<Contact,String>{
	//查询全部的联系人信息
	List<Contact> findAllContacts();
	//根据主键查询联系人
	Contact findContactByContactid (String contactid);
	//新增联系人
    int addContact(Contact contact);
    //修改联系人 
    int updateContact(Contact contact);
	//删除联系人
	int deleteContact(HashMap<String,Object> hashMap);
    //根据主键删除联系人
    int deleteContactByContactid(String contactid);       
		
	

}
