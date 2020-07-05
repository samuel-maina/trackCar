package Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DataPersistence.daoImpl;
import LocationObject.dataPoint;

@Controller
//@RequestMapping(value="/")
public class DefaultController {
	@GetMapping(value="/")
public String homePage() {
	return "index";
}
	@GetMapping(value="/getdevicedata")
	public String getDeviceData(@RequestParam("deviceid")String deviceId,Model model) {
		daoImpl daoimpl= new daoImpl();
		List<dataPoint>DeviceData=daoimpl.getDataPointById(deviceId);
		model.addAttribute("DeviceDataPoints", DeviceData);
		return "devicedata";
		
	}
}
