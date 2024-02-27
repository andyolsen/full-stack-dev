package demo.fullstackapp;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name="DESTINATIONS")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id = -1;
	
	private String place;
	private String country;
	private double latitude;
	private double longitude;
	private String info;
	private String image;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="DESTINATION_ID")
	private List<Review> reviews;

	public Destination() {
		// Empty no-arg constructor.
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Destination) {
			return id == ((Destination)other).id;
		}
		else {
			return false;
		}
	}
	@Override 
	public int hashCode() {
		return (int)id;
	}

	// Define getters and setters, to enable Jackson to serialize/deserialize fields.
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
