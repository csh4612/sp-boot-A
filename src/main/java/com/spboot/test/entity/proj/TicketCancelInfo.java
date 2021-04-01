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
@Table(name = "ticket_cancel_info")
public class TicketCancelInfo {
	@Id
	@Column(name="tci_num")
	private Integer tciNum;
	
	@Column(name="tci_reason")
	private String tciReason;
	
	@Column(name="credat", insertable = false, updatable = false)
	@ColumnDefault("now()")
	private Date credat;
	
	@JoinColumn
	@Column(name="rti_num")
	private ReservationTicketInfo reservationTicketInfo;
}