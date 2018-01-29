package bootwildfly.cricket;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketController {
	
	private CricketService cricketService;
	
	@RequestMapping("/clubs")
	public String listClubs()
	{
		return cricketService.getAllClubs();
	}
	
	@RequestMapping("/clubs/{id}")
	public String getClub(@PathVariable String id)
	{
		return cricketService.getSingleClub(id);
	}
}
