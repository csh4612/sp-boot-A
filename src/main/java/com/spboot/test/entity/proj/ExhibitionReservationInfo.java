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
@Table(name="exhibition_reservation_info")
public class ExhibitionReservationInfo {
	
	@Id
	@Column(name="eri_num")
	private int eriNum;
	
	@Column(name="eri_start_date")
	private Date eriStartDate;
	
	@Column(name="eri_end_date")
	private Date eriEndDate;
	
	@Column(name="eri_start_time")
	private Date eriStartTime;
	
	@Column(name="eri_end_time")
	private Date eriEndTime;
	
	@Column(name="eri_charge")
	private int eriCharge;
	
	@Column(name="eri_min_ticket")
	private int eriMinTicket;
	
	@Column(name="eri_max_ticket")
	private int eriMaxTicket;
	
	@ManyToOne
	@JoinColumn(name= "ei_num")
	private ExhibitonInfo exhibitonInfo;
	
	
}
