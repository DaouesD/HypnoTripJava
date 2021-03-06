package com.esprit.hypnotrip.persistence;
// Generated 19 nov. 2016 19:30:02 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Userconnections generated by hbm2java
 */
@Entity
@Table(name = "userconnections", catalog = "hypnodb")
public class Userconnections implements java.io.Serializable {

	private Integer id;
	private Date dateConnection;
	private String userId;

	public Userconnections() {
	}

	public Userconnections(Date dateConnection) {
		this.dateConnection = dateConnection;
	}

	public Userconnections(Date dateConnection, String userId) {
		this.dateConnection = dateConnection;
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateConnection", nullable = false, length = 0)
	public Date getDateConnection() {
		return this.dateConnection;
	}

	public void setDateConnection(Date dateConnection) {
		this.dateConnection = dateConnection;
	}

	@Column(name = "UserId", length = 128)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
