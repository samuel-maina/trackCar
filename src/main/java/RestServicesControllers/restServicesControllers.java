package RestServicesControllers;
import service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class restServicesControllers {
	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping(value="postgpsdata")
	public void getLocation(@RequestParam("lat")Long latitude,@RequestParam("long")Long longitude,@RequestParam("time")long time,@RequestParam("id")String deviceId,@RequestParam("accuracy")long accuracy,@RequestParam("direction") long direction,@RequestParam("speed")long speed,@RequestParam("altitude")long altitude) {
	
	serviceImpl.insertDataPoints(latitude, longitude, time, deviceId, accuracy, direction, speed, altitude);
	}

}
