package service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import DataPersistence.daoImpl;
import LocationObject.dataPoint;
import RestServicesControllers.restServicesControllers;
@Component
public class ServiceImpl {

@Autowired
private daoImpl daoimpl;

public List<dataPoint>getDevicedata(String deviceId){
	return  daoimpl.getDataPointById(deviceId);
}

public void insertDataPoints(long latitude,long longitude,long time,String deviceId,long accuracy,long direction,long speed,long altitude) {
	final org.apache.log4j.Logger logger=LogManager.getLogger(restServicesControllers.class);
	BasicConfigurator.configure();
	Date date= new Date();
	
	logger.info(date +" latitude= " +latitude);
	logger.info(date +" longitude= " +longitude);
	logger.info(date+" time= "+ time);
	logger.info(date +" id= " +deviceId);
	logger.info(date +" accuracy= "+accuracy );
	logger.info(date +" direction= " +direction);
	logger.info(date +" speed= " +speed);
	logger.info(date +" altitude= " +altitude);
	daoimpl.insertData(latitude, longitude, time, deviceId, accuracy, direction, speed, altitude);	

}
}
