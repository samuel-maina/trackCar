/**
 * 
 */
package LocationObject;

/**
 * @author samuel
 *
 */
public class dataPoint {
long latitude;
long longitude;
long time;
String deviceId;
long accuracy;
long direction;
long speed;
long altitude;

/**
 * @return the latitude
 */
public long getLatitude() {
	return latitude;
}

/**
 * @param latitude the latitude to set
 */
public void setLatitude(long latitude) {
	this.latitude = latitude;
}

/**
 * @return the longitude
 */
public long getLongitude() {
	return longitude;
}

/**
 * @param longitude the longitude to set
 */
public void setLongitude(long longitude) {
	this.longitude = longitude;
}

/**
 * @return the time
 */
public long getTime() {
	return time;
}

/**
 * @param time the time to set
 */
public void setTime(long time) {
	this.time = time;
}

/**
 * @return the deviceId
 */
public String getDeviceId() {
	return deviceId;
}

/**
 * @param deviceId the deviceId to set
 */
public void setDeviceId(String deviceId) {
	this.deviceId = deviceId;
}

/**
 * @return the accuracy
 */
public long getAccuracy() {
	return accuracy;
}

/**
 * @param accuracy the accuracy to set
 */
public void setAccuracy(long accuracy) {
	this.accuracy = accuracy;
}

/**
 * @return the direction
 */
public long getDirection() {
	return direction;
}

/**
 * @param direction the direction to set
 */
public void setDirection(long direction) {
	this.direction = direction;
}

/**
 * @return the speed
 */
public long getSpeed() {
	return speed;
}

/**
 * @param speed the speed to set
 */
public void setSpeed(long speed) {
	this.speed = speed;
}

/**
 * @return the altitude
 */
public long getAltitude() {
	return altitude;
}

/**
 * @param altitude the altitude to set
 */
public void setAltitude(long altitude) {
	this.altitude = altitude;
}

@Override
public String toString() {
	return "dataPoint [latitude=" + latitude + ", longitude=" + longitude + ", time=" + time + ", deviceId=" + deviceId
			+ ", accuracy=" + accuracy + ", direction=" + direction + ", speed=" + speed + ", altitude=" + altitude
			+ "]";
}

}
