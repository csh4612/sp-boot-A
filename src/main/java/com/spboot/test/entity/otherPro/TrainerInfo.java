package com.spboot.test.entity.otherPro;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Table(name="Trainer_info")
@Data
public class TrainerInfo {
	
	@Id
	@Column(name="ti_num")
	private Long tiNum;
	
	@Column(name="ti_name")
	private String tiName;
	
	@Column(name="ti_gender")
	private String tiGender;
	
	@Column(name="ti_id")
	private String tiId;
	
	@Column(name="ti_password")
	private String tiPassword;
	
	@Column(name="ti_email")
	private String tiEmail;
	
	@Column(name="ti_img")
	private String tiImg;
	
	@Transient
	private MultipartFile tiFile;
	
	@Column(name="ti_phone")
	private String tiPhone;
	
	@Column(name="ti_credat")
	private Date tiCredat;
	
	
}
