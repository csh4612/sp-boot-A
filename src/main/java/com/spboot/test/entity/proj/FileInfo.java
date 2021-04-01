package com.spboot.test.entity.proj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "file_info")
public class FileInfo {

	@Id
	@Column(name = "fi_num")
	private Integer fiNum;
	
	@Column(name = "fi_name")
	private String fiName;
	
	@Column(name = "fi_path")
	private String fiPath;

}
