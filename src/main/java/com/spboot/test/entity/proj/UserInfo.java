package com.spboot.test.entity.proj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
@DynamicUpdate
public class UserInfo {
	@Id
	@Column(name = "ui_num")
	private Integer uiNum;	
	
	@Column(name = "ui_id")
	private String uiId;
	
	@Column(name ="ui_pwd")
	private String uiPwd;
	
	@Column(name = "ui_region")
	private String uiRegion;	
	
	@Column(name = "ui_age")
	private String uiAge;	
	
	@Column(name = "ui_gender")
	private String uiGender;
	
	@Column(name="ui_email")
	private String uiEmail;
	
	@Column(name="ui_status")
	private String uiStatus;
	
	@Column(name="ui_role")
	private String uiRole;
	
	@Column(name="ui_genre")
	private String uiGenre;
	
	@Column(name="credat", insertable = false, updatable = false)
	@ColumnDefault("now()")
	private Date credat;
	
	@Column(name="credat", insertable = false)
	@ColumnDefault("now()")
	private Date moddat;
	
}
