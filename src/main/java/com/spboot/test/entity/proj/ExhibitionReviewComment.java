package com.spboot.test.entity.proj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;


@Entity
@Table(name="exhibition_review_comment")
@Data
public class ExhibitionReviewComment {
	
	@Id
	@Column(name="erc_num")
	private int ercNum;
	
	@Column(name="erc_content")
	private String ercContent;
	
	@Column(name="credat", insertable = false, updatable = false)
	@ColumnDefault("now()")
	private Date credat;
		
	@ManyToOne
	@JoinColumn(name = "ui_num")
	private UserInfo userInfo;
	
	@ManyToOne
	@JoinColumn(name = "er_num")
	private ExhibitionReview exhibitionReview;
}
