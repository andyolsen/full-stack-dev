package demo.fullstackapp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity @Table(name="REVIEWS")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id = -1;

	private int rating;
	private String comment;
	private String by;

	public Review() {
		// Empty no-arg constructor.
	}

	// Define getters and setters, to enable Jackson to serialize/deserialize fields.
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Review) {
			return id == ((Review)other).id;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return (int)id;
	}
}
