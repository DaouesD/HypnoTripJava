package com.esprit.hypnotrip.persistence;
// Generated 19 nov. 2016 19:30:02 by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RatesId generated by hbm2java
 */
@Embeddable
public class RatesId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id_user;
	private int id_page;


	public RatesId() {
	}

	public RatesId(String id_user, int pageId ) {
		this.id_user = id_user;
		this.id_page = pageId;
		
	}

	@Column(name = "Id", nullable = false, length = 128)
	public String getId() {
		return this.id_user;
	}

	public void setId(String id_user) {
		this.id_user = id_user;
	}
	
	@Column(name = "pageId", nullable = false)
	public int getpageId() {
		return this.id_page;
	}

	public void setpageId(int pageId) {
		this.id_page = pageId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_page;
		result = prime * result + ((id_user == null) ? 0 : id_user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatesId other = (RatesId) obj;
		if (id_page != other.id_page)
			return false;
		if (id_user == null) {
			if (other.id_user != null)
				return false;
		} else if (!id_user.equals(other.id_user))
			return false;
		return true;
	}

	



}
