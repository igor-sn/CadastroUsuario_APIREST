package primeira_api_rest.api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping(path = "/api/status")
	public String check() {
		return "online";
	}
}
