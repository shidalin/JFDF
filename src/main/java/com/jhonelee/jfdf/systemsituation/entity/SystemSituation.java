package com.jhonelee.jfdf.systemsituation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 系统状态
 * @author jhonelee
 */
@Entity
@Table(name = "sys_system_situation")
public class SystemSituation implements Serializable {

	private static final long serialVersionUID = -1294412337767134777L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date initializationDate;
	
	@Column(name = "initialization_status", length = 20)
	@Enumerated(EnumType.STRING)
	private InitializationStatus initializationStatus;
	
	public Date getInitializationDate() {
		return initializationDate;
	}

	public void setInitializationDate(Date initializationDate) {
		this.initializationDate = initializationDate;
	}

	public InitializationStatus getInitializationStatus() {
		return initializationStatus;
	}

	public void setInitializationStatus(InitializationStatus initializationStatus) {
		this.initializationStatus = initializationStatus;
	}

	public static enum InitializationStatus {
		/**
		 * 未初始化
		 */
		UNINITIALIZED,
		
		/**
		 * 初始化中
		 */
		INITIALIZING,
		
		/**
		 * 初始化成功
		 */
		INITIALIZED;
	}
	
	
}