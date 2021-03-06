package com.esprit.hypnotrip.persistence;
// Generated 19 nov. 2016 19:30:02 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Messages generated by hbm2java
 */
@Entity
@Table(name = "messages", catalog = "hypnodb")
public class Messages implements java.io.Serializable {

	private MessagesId id;
	private String description;

	public Messages() {
	}

	public Messages(MessagesId id) {
		this.id = id;
	}

	public Messages(MessagesId id, String description) {
		this.id = id;
		this.description = description;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dateOfSending", column = @Column(name = "DateOfSending", nullable = false, length = 0) ),
			@AttributeOverride(name = "receiverUserId", column = @Column(name = "ReceiverUserId", nullable = false, length = 128) ),
			@AttributeOverride(name = "senderUserId", column = @Column(name = "SenderUserId", nullable = false, length = 128) ) })
	public MessagesId getId() {
		return this.id;
	}

	public void setId(MessagesId id) {
		this.id = id;
	}

	@Column(name = "Description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
