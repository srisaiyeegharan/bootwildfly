package bootwildfly.cricket;

import org.springframework.stereotype.Service;

@Service
public class CricketService {
	
	public String getAllClubs()
	{
		return "This will list all the clubs soon";
	}
	
	public String getSingleClub(String id)
	{
		return "This will list your chosen club soon: " + id;
	}
}
