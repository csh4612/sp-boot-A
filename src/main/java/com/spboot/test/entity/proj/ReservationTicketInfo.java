package com.spboot.test.entity.proj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@Table(name="reservation_ticket_info")
@DynamicInsert
@DynamicUpdate
public class ReservationTicketInfo {
	@Id
	
	@Column(name="rti_num")
	private Integer rtiNum;
	
	@Column(name="rti_name")
	private String rtiName;
	
	@Column(name="rti_email")
	private String rtiEmail;
	
	@Column(name="rti_phone_nubmer")
	private String rtiPhoneNubmer;
	
	@Column(name="rti_status")
	@ColumnDefault("STB")
	private String rtiStatus;
	
	@Column(name="rti_date")
	private Date rtiDate;
	
	@Column(name="rti_reivew_status")
	private String rtiReivewStatus;
	
	@Column(name="rti_amount")
	private Integer rtiAmount;
	
	@JoinColumn
	@Column(name="ui_num")
	private UserInfo uiNum;
	
	@JoinColumn
	@Column(name="eri_num")
	private ExhibitionReservationInfo eriNum;
	

}
