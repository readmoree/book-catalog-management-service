package com.readmoree.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ReviewResponseDto extends BaseEntity {
	
	private Integer customerId;

	private Long bookid;
	
	private String bookTitle;
	
	private String image;
	
	private String comment;
	
	private int rating;
	
	private String authorName;
	
}
