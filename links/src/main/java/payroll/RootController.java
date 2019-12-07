package payroll;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RootController {

	@GetMapping
	RepresentationModel index() {
		RepresentationModel rootResource = new RepresentationModel();
		rootResource.add(linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
		rootResource.add(linkTo(methodOn(OrderController.class).all()).withRel("orders"));
		return rootResource;
	}

}
