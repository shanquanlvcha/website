package com.qsf.websit.bkmgr.entity;

/**
* @ClassName: Contact
* @Description: TODO(联系人模型)
* @author zhaojl
* @date 2017年8月2日 下午3:40:19
*
 */
public class Contact {
	
	private String contactid;
	private String rolename;
	private String gender;
	private String address;
	private String phonenum;
	private String qqnumber;
	
	public Contact() {
	
	}

	public Contact(String contactid, String rolename, String gender, String address, String phonenum, String qqnumber) {
		super();
		this.contactid = contactid;
		this.rolename = rolename;
		this.gender = gender;
		this.address = address;
		this.phonenum = phonenum;
		this.qqnumber = qqnumber;
	}

	/**
	* @return contactid
	*/
	public String getContactid() {
		return contactid;
	}

	/**
	* @param contactid 要设置的 contactid
	*/
	public void setContactid(String contactid) {
		this.contactid = contactid;
	}

	/**
	* @return rolename
	*/
	public String getRolename() {
		return rolename;
	}

	/**
	* @param rolename 要设置的 rolename
	*/
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	/**
	* @return gender
	*/
	public String getGender() {
		return gender;
	}

	/**
	* @param gender 要设置的 gender
	*/
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	* @return address
	*/
	public String getAddress() {
		return address;
	}

	/**
	* @param address 要设置的 address
	*/
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	* @return phonenum
	*/
	public String getPhonenum() {
		return phonenum;
	}

	/**
	* @param phonenum 要设置的 phonenum
	*/
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	/**
	* @return qqnumber
	*/
	public String getQqnumber() {
		return qqnumber;
	}

	/**
	* @param qqnumber 要设置的 qqnumber
	*/
	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}

	/* (非 Javadoc)
	* <p>Title: hashCode</p>
	* <p>Description: </p>
	* @return
	* @see java.lang.Object#hashCode()
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactid == null) ? 0 : contactid.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((phonenum == null) ? 0 : phonenum.hashCode());
		result = prime * result + ((qqnumber == null) ? 0 : qqnumber.hashCode());
		result = prime * result + ((rolename == null) ? 0 : rolename.hashCode());
		return result;
	}

	/* (非 Javadoc)
	* <p>Title: equals</p>
	* <p>Description: </p>
	* @param obj
	* @return
	* @see java.lang.Object#equals(java.lang.Object)
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (contactid == null) {
			if (other.contactid != null)
				return false;
		} else if (!contactid.equals(other.contactid))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (phonenum == null) {
			if (other.phonenum != null)
				return false;
		} else if (!phonenum.equals(other.phonenum))
			return false;
		if (qqnumber == null) {
			if (other.qqnumber != null)
				return false;
		} else if (!qqnumber.equals(other.qqnumber))
			return false;
		if (rolename == null) {
			if (other.rolename != null)
				return false;
		} else if (!rolename.equals(other.rolename))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", rolename=" + rolename + ", gender=" + gender + ", address="
				+ address + ", phonenum=" + phonenum + ", qqnumber=" + qqnumber + "]";
	}
	



}
