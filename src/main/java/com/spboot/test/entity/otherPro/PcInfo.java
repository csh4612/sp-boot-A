package com.spboot.test.entity.otherPro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Data;

@Entity
@Data
@Table(name="pc_info")
@DynamicInsert
public class PcInfo {
	
	@Id
	@Column(name="cp_seat_num",unique = true)
	private Integer pcSeatNum;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="pc_start_time",insertable = false,updatable = false)
	private String pcStartTime;
	
	@Column(name="pc_seat_result")
	private String pcSeatResult;
	
	@Column(name="pc_spec")
	private String pcSpec;
	
}