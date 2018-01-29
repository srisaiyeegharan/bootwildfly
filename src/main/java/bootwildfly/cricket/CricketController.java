package bootwildfly.cricket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketController {
	
	@RequestMapping("/clubs")
	public String listClubs()
	{
		return "This will list all the clubs soon";
	}
	
}
