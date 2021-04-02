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

@Data
@Entity
@Table(name="payment_info")
public class PaymentInfo {
	
	@Id
	@Column(name="pi_num")
	private Integer piNum;
	
	@Column(name="pi_type")
	private String piType;
	
	@Column(name="pi_price")
	private Integer piPrice;
	
	@Column(name="pi_status")
	private String piStatus;
	
	@Column(name="credat", insertable = false, updatable = false)
	@ColumnDefault("now()")
	private Date credat;
		
	@ManyToOne
	@JoinColumn(name="rti_num")
	private ReservationTicketInfo reservationTicketInfo;
	

}
