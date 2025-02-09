package com.viesonet.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DanhSachKetBan", uniqueConstraints = { @UniqueConstraint(columnNames = { "sdt", "sdtNguoiLa" }) })

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class DanhSachKetBan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoiMoi;
	
	@ManyToOne
	@JoinColumn(name = "sdt")
	NguoiDung nguoiDung;
	
	@ManyToOne
	@JoinColumn(name = "sdtNguoiLa")
	NguoiDung nguoiLa;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ngayGui")
	Date ngayGui = new Date();
}
