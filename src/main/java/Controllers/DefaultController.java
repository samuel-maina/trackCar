package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.ServiceImpl;

@Controller

public class DefaultController {
	@Autowired
	private ServiceImpl serviceImpl;
	@GetMapping(value="/")
public String homePage() {
		
	return "index";
}
	
	@GetMapping(value="/getdevicedata")
	
	public String getDeviceData(@RequestParam("deviceid")String deviceId,Model model) {
		model.addAttribute("DeviceDataPoints", serviceImpl.getDevicedata(deviceId));
		return "devicedata";
		
	}
}
