package com.bgsix.bookmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;

	private String title;

	private String language;

	private String author;

	private Float rating;

	private String isbn;

	@Column(name = "BOOK_FORMAT")
	private String bookFormat;

	private Integer pages;

	@Column(name = "NUM_RATINGS")
	private Integer numRatings;

	@Column(name = "LIKED_PERCENT")
	private Short likedPercent;

	private Double price;

	@Column(name = "COVER_IMG")
	private String coverImg;

	@Column(name = "PUBLICATION_YEAR")
	private Integer publicationYear;
}
