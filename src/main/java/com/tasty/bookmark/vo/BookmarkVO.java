package com.tasty.bookmark.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BookmarkVO {

	private Long BMNo;
	private Long  status;
	private Long  cnt;
	private String id;
	private Date writeDate;
	private String  shopNo;
	
}