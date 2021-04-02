package com.spboot.test.entity.otherPro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="user_info")
public class UserInfo {
	
	@Id
	@Column(name = "user_id",unique = true)
	private String userId;
	@Column(name = "user_pwd")
	private String userPwd;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_gender")
	private String gender;
	@Column(name = "user_date_of_birth")
	private String userDateOfBirth;
	@Column(name = "user_addr1")
	private String userAddr1;
	@Column(name = "user_addr2")
	private String userAddr2;
	@Column(name = "user_phone1")
	private Integer userPhone1;
	@Column(name = "user_phone2")
	private Integer userPhone2;
	@Column(name = "user_email")
	private String userEmail;
	@Column(name = "user_mileage")
	private Integer userMileage;
	@Column(name = "reg_date", insertable = false,updatable = false)
	private String regDate;
	@Column(name = "favorite_game")
	private String favoriteGame;
	@Column(name = "rest_of_time")
	private String restOfTime;
	@Column(name = "user_profile")
	private String photo_path;
	@Column(name = "user_id")
	private String photoPath;
	@Column(name = "action")
	private String action;
	
}
