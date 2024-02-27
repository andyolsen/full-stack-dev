package demo.fullstackapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SeedDb {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PostConstruct
    public void init() {
		jdbcTemplate.update(
		        "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Ålesund", "Norway", 62.5, 2.3,
                        "Ålesund is a sea port on the west coast of Norway, noted for its beautiful Art Nouveau architecture and spectacular mountain scenery.",
                        "alesund.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Åndalsnes", "Norway", 62.5, 7.5,
                        "Åndalsnes is a pretty town located on the banks of Isfjorden in Norway, famed for its Trollstigen Road with 11-hairpin corners.",
                        "andalsnes.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Belfast", "Northern Ireland", 54.5, -6.0,
                        "Belfast is the capital city of Northern Ireland, and is home of the famous Harland and Wolff shipyard where the Titanic was built.",
                        "belfast.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Brønnøysund", "Norway", 65.8, 12.3,
                        "Brønnøysund is a small town on the west coast of Norway with a population of approx 5000, and home of the legendary Torghatten mountain.",
                        "bronnoysund.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Budapest", "Hungary", 47.5, 19.0,
                        "Budapest is the capital city of Hungary, with the Duna (Danube) flowing majestically between Buda on the west and Pest on the east.",
                        "budapest.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Cape Town", "South Africa", -33.9, 18.5,
                        "Voted several times the best place in the world to visit, Cape Town is the second largest city in South Africa and is home of Table Mountain.",
                        "capetown.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Copenhagen", "Denmark", 55.7, 12.5,
                        "Copenhagen is the capital city of Denmark, home of the famous Little Mermaid statue and beautiful Nyhavn.",
                        "copenhagen.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Cork", "Ireland", 51.9, -8.5,
                        "Cork is the second biggest city in Ireland and was originally a monastic settlement.",
                        "cork.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Grimstad", "Norway", 58.3, 8.5,
                        "Located on the south coast of Norway, Grimstad is a pretty town with a lovely harbour.",
                        "grimstad.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Johannesburg", "South Africa", -26.2, 28.0,
                        "Joburg is the capital city of South Africa, located in Guateng province and more than 1 mile above sea level. There are a lot of hadedas in Joburg!",
                        "johannesburg.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Oslo", "Norway", 59.9, 10.8,
                        "Oslo is the capital city of Norway, in a beautiful setting nestling between Oslo fjord and Marka forest.",
                        "oslo.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Rome", "Italy", 41.8, 12.5,
                        "Rome is the capital city of Italy, steeped in history and one of the most visted cities on the planet.",
                        "rome.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Singapore", "Singapore", 1.2, 103.9,
                        "Singapore is a city-state with a strong history as a trading route and a thriving centre for commerce.",
                        "singapore.jpg"});

        jdbcTemplate.update(
                "insert into DESTINATIONS (place, country, latitude, longitude, info, image) values (?, ?, ?, ?, ?, ?)",
                new Object[]{
                        "Swansea", "Wales!!!", 51.6, -3.9,
                        "Swansea is the 2nd largest city in Wales, with an important history in copper and a pleasant seaside location.",
                        "swansea.jpg"});

        jdbcTemplate.update(
                "insert into REVIEWS (destination_id, rating, comment, by) values (?, ?, ?, ?)",
                new Object[]{1, 5, "What an incredibly beautiful place", "J. Smith"});

        jdbcTemplate.update(
                "insert into REVIEWS (destination_id, rating, comment, by) values (?, ?, ?, ?)",
                new Object[]{1, 4, "Spectacular natural beauty, with snow-peaked mountains and crystal sea", "O. Nordmann"});

        jdbcTemplate.update(
                "insert into REVIEWS (destination_id, rating, comment, by) values (?, ?, ?, ?)",
                new Object[]{1, 5, "I wanna go back!", "A. Olsen"});

        jdbcTemplate.update(
                "insert into REVIEWS (destination_id, rating, comment, by) values (?, ?, ?, ?)",
                new Object[]{6, 5, "What an incredible place - I loved the V&A Waterfront", "P. Lafayette"});
    }
}
