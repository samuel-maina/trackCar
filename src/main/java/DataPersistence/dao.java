package DataPersistence;

import java.util.List;

import LocationObject.dataPoint;

public interface dao {
public void insertData(long latitude,long longitude,long time,String deviceId,long accuracy,long direction,long speed,long altitude);
public List<dataPoint> getAllDataPoints();
public List<dataPoint> getDataPointById(String deviceId);
}
