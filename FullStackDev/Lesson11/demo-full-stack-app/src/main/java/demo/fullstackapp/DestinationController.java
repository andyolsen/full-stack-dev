package demo.fullstackapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/destinations")
@CrossOrigin
public class DestinationController {

	@Autowired
	private DestinationRepository repository;

	@GetMapping(produces={"application/json","application/xml"})
	public ResponseEntity<Iterable<Destination>> getAll() {
		return ResponseEntity.ok().body(repository.findAll());
	}

	@GetMapping(
			value="/{id}",
			produces={"application/json","application/xml"})
	public ResponseEntity<Destination> getById(@PathVariable long id) {
		Optional<Destination> d = repository.findById(id);
		if (d.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok().body(d.get());
		}
	}

	@PutMapping(
			value="/addReviewForDestination/{destinationId}",
			consumes={"application/json","application/xml"},
			produces={"application/json","application/xml"}
	)
	public ResponseEntity<Void> addReviewFor(
			@PathVariable long destinationId, 
			@RequestBody Review review) {
		
		Optional<Destination> d = repository.findById(destinationId);
		if (d.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		else {
			Destination destination = d.get();
			destination.getReviews().add(review);
			repository.save(destination);
			return ResponseEntity.ok().build();
		}
	}
}
