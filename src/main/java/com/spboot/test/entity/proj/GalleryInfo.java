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
@Table(name = "gallery_info")
public class GalleryInfo {

	@Id
	@Column(name = "gi_num")
	private Integer giNum;
	
	@Column(name = "gi_name")
	private String giName;
	
	@Column(name = "gi_phone_nubmer")
	private String giPhoneNubmer;
	
	@Column(name = "gi_charge")
	private Integer giCharge;
	
	@Column(name = "gi_open")
	private Date giOpen;
	
	@Column(name = "gi_close")
	private Date giClose;
	
	@Column(name = "gi_hompage")
	private String giHompage;
	
	@Column(name = "gi_address")
	private String giAddress;
	
	@ManyToOne
	@JoinColumn(name = "fi_num")
	private FileInfo fileInfo;
}
