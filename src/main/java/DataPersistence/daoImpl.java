/**
 * 
 */
package DataPersistence;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

import LocationObject.dataPoint;

/**
 * @author samuel
 *
 */
public class daoImpl implements dao{

	public void insertData(long latitude, long longitude, long time, String deviceId, long accuracy, long direction,
			long speed, long altitude) {
		final org.apache.log4j.Logger logger=LogManager.getLogger(daoImpl.class);
		BasicConfigurator.configure();
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			Properties props=new Properties();
			//reading an external file on relative to root {/} location
			FileReader fReader =new FileReader("/home/samuel/propfiles/jdbcSettings.properties");
			props.load(fReader);
			String dbDriverClass=props.getProperty("db.driver.class");
			String dbUrl=props.getProperty("db.conn.url");
			String dbUserName=props.getProperty("db.username");
			String dbPassword=props.getProperty("db.password");
			Class.forName(dbDriverClass);
			conn=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
			ps=conn.prepareStatement("insert into data values(?,?,?,?,?,?,?,?) ");
			ps.setFloat(1,latitude);
			ps.setFloat(2,longitude);
			ps.setFloat(3,time);
			ps.setString(4,deviceId);
			ps.setFloat(5,accuracy);
			ps.setFloat(6,direction);
			ps.setFloat(7,speed);
			ps.setFloat(8,altitude);
			ps.execute();
		}catch(SQLException | IOException | ClassNotFoundException ex) {
			logger.error(ex);
		}finally {
			try {
			if(conn!=null) {conn.close();}
			if(ps!=null) {ps.close();}
			}catch(SQLException ex) {
				logger.error(ex);
			}
		}
		
	}

	public List<dataPoint> getAllDataPoints() {
		// TODO Auto-generated method stub
		
		return null;
	}

	public List<dataPoint> getDataPointById(String deviceId) {
		// TODO Auto-generated method stub
		final org.apache.log4j.Logger logger=LogManager.getLogger(daoImpl.class);
		BasicConfigurator.configure();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs= null;
		List<dataPoint>DeviceDataPoints =new ArrayList<>();
		try {
			Properties props=new Properties();
			//reading an external file on relative to root {/} location
			FileReader fReader =new FileReader("/home/samuel/propfiles/jdbcSettings.properties");
			props.load(fReader);
			String dbDriverClass=props.getProperty("db.driver.class");
			String dbUrl=props.getProperty("db.conn.url");
			String dbUserName=props.getProperty("db.username");
			String dbPassword=props.getProperty("db.password");
			Class.forName(dbDriverClass);
			conn=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
			ps=conn.prepareStatement("select * from data where id=?");
			ps.setString(1,deviceId);
			rs=ps.executeQuery();
			while(rs.next()) {
				dataPoint DataPoint= new dataPoint();
				DataPoint.setLatitude(rs.getLong("lat"));
				DataPoint.setLongitude(rs.getLong("longitude"));
				DataPoint.setAltitude(rs.getLong("altitude"));
				DataPoint.setDeviceId(rs.getString("id"));
				DataPoint.setSpeed(rs.getLong("speed"));
				DataPoint.setDirection(rs.getLong("direction"));
				DataPoint.setTime(rs.getLong("time"));
				DataPoint.setAccuracy(rs.getLong("accuracy"));
				DeviceDataPoints.add(DataPoint);
			}
			
		}catch(SQLException |ClassNotFoundException | IOException ex) {
			logger.error(daoImpl.class.getName(),ex);
		}
		return DeviceDataPoints;
	}

}
