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


@Entity
@Table(name="exhibition_review")
@Data
@DynamicUpdate
public class ExhibitionReview {

	@Id
	@Column(name="er_num")
	private int erNum;
	
	@Column(name="er_title")
	private String erTitle;
	
	@Column(name="er_content")
	private String erContent;
	
	@Column(name="er_hit")
	private int erHit;
	
	@Column(name="credat", insertable = false, updatable = false)
	@ColumnDefault("now()")
	private Date credat;
	
	@Column(name="moddat", insertable = false)
	@ColumnDefault("now()")
	private Date moddat;
		
	@ManyToOne
	@JoinColumn(name = "rti_num")
	private ReservationTicketInfo reservationTicketInfo;
	
	@ManyToOne
	@JoinColumn(name = "fi_num")
	private FileInfo fileInfo;

}
