package com.spboot.test.entity.proj;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "exhibiton_info")
public class ExhibitonInfo {

	@Id
	@Column(name = "ei_num")
	private Integer eiNum;
	
	@Column(name = "ei_name")
	private String eiName;
	
	@Column(name = "ei_charge")
	private Integer eiCharge;
	
	@Column(name = "ei_artist")
	private String eiArtist;
	
	@Column(name = "ei_content")
	private String eiContent;
	
	@Column(name = "ei_start_date")
	private Date eiStartDate;
	
	@Column(name = "ei_end_date")
	private Date eiEndDate;
	
	@Column(name = "ei_start_time")
	private Date eiStartTime;
	
	@Column(name = "ei_end_time")
	private Date eiEndTime;
	
	@Column(name = "ei_status")
	private String eiStatus;
	
	@ManyToOne
	@JoinColumn(name = "gi_num")
	private GalleryInfo galleryInfo;
	
	@ManyToOne
	@JoinColumn(name = "ui_num")
	private UserInfo userInfo;
	
	@ManyToOne
	@JoinColumn(name = "fi_num")
	private FileInfo fileInfo;

}
