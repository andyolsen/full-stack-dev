package demo.restservices;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/simple")
@CrossOrigin
public class SimpleController {

	private Map<Long, Product> catalog = new HashMap<>();

	{
		catalog.put(1L, new Product(1L, "Swansea City shirt", 45));
		catalog.put(2L, new Product(2L, "Cardiff City shirt", 55));
		catalog.put(3L, new Product(3L, "Carving skis", 350));
		catalog.put(4L, new Product(4L, "Bugatti Divo", 4_000_000));
	}

	@GetMapping(value="/productsV1", produces={"application/json","application/xml"})
	public Collection<Product> getProductsV1() {
		return catalog.values();
	}

	@GetMapping(value="/productsV2", produces={"application/json","application/xml"})
	public ResponseEntity<Collection<Product>> getProductsV2() {
		return ResponseEntity.ok().body(catalog.values());
	}
	
	@GetMapping(value="/products/{id}", produces={"application/json","application/xml"})
	public ResponseEntity<Product> getProductById(@PathVariable long id) {
		Product p = catalog.get(id);
		if (p == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok().body(p);
	}
	
	@GetMapping(value="/products", produces={"application/json","application/xml"})
	public ResponseEntity<Collection<Product>> getProductsMoreThan(@RequestParam(value="min", required=false, defaultValue="0.0") double min) {
		Collection<Product> products = catalog.values()
											  .stream()
											  .filter(p -> p.getPrice() > min)
											  .collect(Collectors.toList());
		return ResponseEntity.ok().body(products);
	}
}
