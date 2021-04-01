package com.spboot.test.entity.proj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name="board_info")
@DynamicUpdate
public class BoardInfo {

	@Id
	@Column(name="bi_num")
	private Integer biNum;
	
	@Column(name="bi_title")
	private String biTitle;
	
	@Column(name="bi_content")
	private String biContent;
	
	@Column(name="bi_hit")
	private Integer biHit;
	
	@Column(name="bi_type")
	private String biType;
	
	@Column(name="credat" , insertable = false, updatable = false)
	@ColumnDefault("now()")
	private Date credat;

	@Column(name="moddat" , insertable = false)
	@ColumnDefault("now()")
	private Date moddat;

	@ManyToOne
	@JoinColumn(name = "ui_num")
	private UserInfo userInfo;
	
	@ManyToOne
	@JoinColumn(name = "fi_num")
	private FileInfo fileInfo;
	
}
