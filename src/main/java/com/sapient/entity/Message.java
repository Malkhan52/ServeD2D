package com.sapient.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Message {
	private Integer messageId;
	private Integer senderId;
	private Integer receiverId;
	private String content;
	private Date timestamp;
	
	

}
