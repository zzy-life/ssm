package com.xtkj.pojo;

import java.io.Serializable;

/**
 * @author
 * 
 */
public class User implements Serializable {
	private Integer user_id;

	private String user_name;

	private String user_pwd;

	private Integer class_id;

	private TClass userClass;

	private static final long serialVersionUID = 1L;

	/**
	 * @return user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id 要设置的 user_id
	 */
	public void setUser_id(Integer user_id) {

		this.user_id = user_id;
	}

	/**
	 * @return user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name 要设置的 user_name
	 */
	public void setUser_name(String user_name) {

		this.user_name = user_name;
	}

	/**
	 * @return user_pwd
	 */
	public String getUser_pwd() {
		return user_pwd;
	}

	/**
	 * @param user_pwd 要设置的 user_pwd
	 */
	public void setUser_pwd(String user_pwd) {

		this.user_pwd = user_pwd;
	}

	/**
	 * @return class_id
	 */
	public Integer getClass_id() {
		return class_id;
	}

	/**
	 * @param class_id 要设置的 class_id
	 */
	public void setClass_id(Integer class_id) {

		this.class_id = class_id;
	}

	/**
	 * @return userClass
	 */
	public TClass getUserClass() {
		return userClass;
	}

	/**
	 * @param userClass 要设置的 userClass
	 */
	public void setUserClass(TClass userClass) {

		this.userClass = userClass;
	}

}