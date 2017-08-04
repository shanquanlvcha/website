/**  
* @Title: ContactController.java
* @Package com.qsf.websit.bkmgr.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author zhaojl
* @date 2017年8月2日 下午10:34:36
* @version V1.0  
*/ 
package com.qsf.websit.bkmgr.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qsf.websit.bkmgr.entity.Contact;
import com.qsf.websit.bkmgr.service.ContactService;


/**
* @ClassName: ContactController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zhaojl
* @date 2017年8月2日 下午10:34:36
*
*/
@Controller
@RequestMapping("/contacts")
public class ContactController {
	@SuppressWarnings("restriction")
	@Resource
	private ContactService contactservice;
	
	/*
	 * 查询时表单提交"contacts/list"controller根据/list找到@RequestMapping("/list")，找到findAllcontacts方法。
	 */
	@RequestMapping("/list")
	public ModelAndView findAllContacts(){
		
		//建立ModelAndView对象，返回路径为bkmgr/contacts.jsp,前缀后缀在spring-mvc中配置好了，直接写jsp文件名称就可以。
		ModelAndView mv = new ModelAndView("bkmgr/contacts");
		//查询联系人
		List<Contact> contacts = contactservice.findAllContacts();
		//打桩
		for(Contact c:contacts){
			System.out.println(c);
		}
		//将联系人的集合模型加入到ModelAndView中
		mv.addObject("contacts",contacts);
		
		return mv;//mv携带联系人返回到页面bkmgr/contacts.jsp
	}
	
	
	/*
	 *此方法主要是利用request来接收，与返回数据。
	 */
	@RequestMapping("/add")
	public void AddContact(HttpServletRequest req,
			HttpServletResponse res) throws IOException, ServletException{
		req.setCharacterEncoding("utf-8");
		
		//接收页面表单提交的数据
		String contactid=req.getParameter("contactid");
		String rolename =req.getParameter("rolename");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String phonenum  = req.getParameter("phonenum");
		String qqnumber = req.getParameter("qqnumber");
		
		//利用Contact模型保存数据
		Contact c = new Contact();
		c.setContactid(contactid);
		if(rolename != null && !rolename.equals("")){
			c.setRolename(rolename);
		}
		if(gender != null && !rolename.equals("")){
			c.setGender(gender);
		}
		if(address != null && !address.equals("")){
			c.setAddress(address);
		}
		if(phonenum != null && !phonenum.equals("")){
			c.setPhonenum(phonenum);
		}
		if(qqnumber !=null && !qqnumber.equals("")){
			c.setQqnumber(qqnumber);
		}
		
		//调用业务层逻辑，保存数据
		contactservice.addContact(c);
		System.out.println("保存成功");
		
		//转发到查询页面
		req.getRequestDispatcher("/JSP/bkmgr/contacts.jsp").forward(req, res);
	}
	
	/**
	 * @param req
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/toupdate")
	public void toUpdateContact(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		//request接收请求数据 contactid
		String contactid = req.getParameter("contactid");
		
		//根据contactid查询出要修改的对象
		Contact contact=new Contact();
		contact = contactservice.findContactByContactid(contactid);
		req.setAttribute("contact",contact);
		req.getRequestDispatcher("/JSP/bkmgr/updatecontact.jsp").forward(req, res);
	}
	
	@RequestMapping("/update")
	public void updateContact(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		req.setCharacterEncoding("utf-8");
		//接收页面表单提交的数据
		String contactid=req.getParameter("contactid");
		String rolename =req.getParameter("rolename");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String phonenum  = req.getParameter("phonenum");
		String qqnumber = req.getParameter("qqnumber");
		
		//利用Contact模型保存数据
		Contact c = new Contact();
		c.setContactid(contactid);
		if(rolename != null && !rolename.equals("")){
			c.setRolename(rolename);
		}
		if(gender != null && !rolename.equals("")){
			c.setGender(gender);
		}
		if(address != null && !address.equals("")){
			c.setAddress(address);
		}
		if(phonenum != null && !phonenum.equals("")){
			c.setPhonenum(phonenum);
		}
		if(qqnumber !=null && !qqnumber.equals("")){
			c.setQqnumber(qqnumber);
		}
		System.out.println(c);
		contactservice.updateContact(c);
		System.out.println("修改成功");
		
		//转发到查询页面
		req.getRequestDispatcher("/JSP/bkmgr/contacts.jsp").forward(req, res);
	}
	
	@RequestMapping("/delete")
	public void deleteContact(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		System.out.println("+++++++++++++comein++++++++++++");
		req.setCharacterEncoding("utf-8");
		String contactid = req.getParameter("contactid");
		System.out.println(contactid);
		int i=contactservice.deleteContactByContactid(contactid);
		System.out.println("删除成功"+i+"条数据");
		//转发到查询页面
		req.getRequestDispatcher("/JSP/bkmgr/contacts.jsp").forward(req, res);
	}
}
