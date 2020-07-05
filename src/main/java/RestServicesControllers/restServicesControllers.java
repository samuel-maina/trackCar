package RestServicesControllers;
import DataPersistence .daoImpl;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="postgpsdata")
public class restServicesControllers {
	//@PostMapping(value="postgpsdata")
	@GetMapping(value="postgpsdata")
	public void getLocation(@RequestParam("lat")Long latitude,@RequestParam("long")Long longitude,@RequestParam("time")long time,@RequestParam("id")String deviceId,@RequestParam("accuracy")long accuracy,@RequestParam("direction") long direction,@RequestParam("speed")long speed,@RequestParam("altitude")long altitude) {
	final org.apache.log4j.Logger logger=LogManager.getLogger(restServicesControllers.class);
	BasicConfigurator.configure();
	Date date= new Date();
	daoImpl DaoImpl=new daoImpl();
	logger.info(date +" latitude= " +latitude);
	logger.info(date +" longitude= " +longitude);
	logger.info(date+" time= "+ time);
	logger.info(date +" id= " +deviceId);
	logger.info(date +" accuracy= "+accuracy );
	logger.info(date +" direction= " +direction);
	logger.info(date +" speed= " +speed);
	logger.info(date +" altitude= " +altitude);
	
	DaoImpl.insertData(latitude,longitude,time,deviceId,accuracy,direction,speed,altitude);
	
	
	}

}
