package com.spboot.test.entity.otherPro;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
@Table(name="Member_info")
public class MemberInfo {
	
	@Id
	@Column(name="mi_num")
	private Long miNum;
	@Column(name="mi_name")
	private String miName;
	@Column(name="mi_gender")
	private String miGender;
	@Column(name="mi_id")
	private String miId;
	@Column(name="mi_password")
	private String miPassword;
	@Column(name="mi_email")
	private String miEmail;
	@Column(name="mi_img")
	private String miImg;
	@Column(name="mi_phone")
	private String miPhone;
	@Column(name="mi_credat")
	private Date miCredat;
	@Transient
	private MultipartFile miFile;
	
	@ManyToOne
	@JoinColumn(name="ti_num")
	private TrainerInfo trainerInfo;
}
