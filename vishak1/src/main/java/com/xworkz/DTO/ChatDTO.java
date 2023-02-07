package com.xworkz.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;

	@Data
	@AllArgsConstructor
	public class ChatDTO {
	private int NumberOfMessagingApp;
	private String mostUsedMessagingApp;
	private int NumberOfChatPerDay;
	private int numberofgroupChat;
	private int totalNumberOfChat;
	}