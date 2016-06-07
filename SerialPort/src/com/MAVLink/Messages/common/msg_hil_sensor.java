/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_SENSOR PACKING
package com.MAVLink.Messages.common;
import com.MAVLink.Messages.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* The IMU readings in SI units in NED body frame
*/
public class msg_hil_sensor extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_HIL_SENSOR = 107;
    public static final int MAVLINK_MSG_LENGTH = 64;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_SENSOR;


      
    /**
    * Timestamp (microseconds, synced to UNIX time or since system boot)
    */
    public long time_usec;
      
    /**
    * X acceleration (m/s^2)
    */
    public float xacc;
      
    /**
    * Y acceleration (m/s^2)
    */
    public float yacc;
      
    /**
    * Z acceleration (m/s^2)
    */
    public float zacc;
      
    /**
    * Angular speed around X axis in body frame (rad / sec)
    */
    public float xgyro;
      
    /**
    * Angular speed around Y axis in body frame (rad / sec)
    */
    public float ygyro;
      
    /**
    * Angular speed around Z axis in body frame (rad / sec)
    */
    public float zgyro;
      
    /**
    * X Magnetic field (Gauss)
    */
    public float xmag;
      
    /**
    * Y Magnetic field (Gauss)
    */
    public float ymag;
      
    /**
    * Z Magnetic field (Gauss)
    */
    public float zmag;
      
    /**
    * Absolute pressure in millibar
    */
    public float abs_pressure;
      
    /**
    * Differential pressure (airspeed) in millibar
    */
    public float diff_pressure;
      
    /**
    * Altitude calculated from pressure
    */
    public float pressure_alt;
      
    /**
    * Temperature in degrees celsius
    */
    public float temperature;
      
    /**
    * Bitmask for fields that have updated since last message, bit 0 = xacc, bit 12: temperature, bit 31: full reset of attitude/position/velocities/etc was performed in sim.
    */
    public long fields_updated;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HIL_SENSOR;
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putFloat(xacc);
              
        packet.payload.putFloat(yacc);
              
        packet.payload.putFloat(zacc);
              
        packet.payload.putFloat(xgyro);
              
        packet.payload.putFloat(ygyro);
              
        packet.payload.putFloat(zgyro);
              
        packet.payload.putFloat(xmag);
              
        packet.payload.putFloat(ymag);
              
        packet.payload.putFloat(zmag);
              
        packet.payload.putFloat(abs_pressure);
              
        packet.payload.putFloat(diff_pressure);
              
        packet.payload.putFloat(pressure_alt);
              
        packet.payload.putFloat(temperature);
              
        packet.payload.putUnsignedInt(fields_updated);
        
        return packet;
    }

    /**
    * Decode a hil_sensor message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.xacc = payload.getFloat();
              
        this.yacc = payload.getFloat();
              
        this.zacc = payload.getFloat();
              
        this.xgyro = payload.getFloat();
              
        this.ygyro = payload.getFloat();
              
        this.zgyro = payload.getFloat();
              
        this.xmag = payload.getFloat();
              
        this.ymag = payload.getFloat();
              
        this.zmag = payload.getFloat();
              
        this.abs_pressure = payload.getFloat();
              
        this.diff_pressure = payload.getFloat();
              
        this.pressure_alt = payload.getFloat();
              
        this.temperature = payload.getFloat();
              
        this.fields_updated = payload.getUnsignedInt();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_hil_sensor(){
        msgid = MAVLINK_MSG_ID_HIL_SENSOR;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_hil_sensor(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_HIL_SENSOR;
        unpack(mavLinkPacket.payload);        
    }

                                  
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_HIL_SENSOR -"+" time_usec:"+time_usec+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+" xmag:"+xmag+" ymag:"+ymag+" zmag:"+zmag+" abs_pressure:"+abs_pressure+" diff_pressure:"+diff_pressure+" pressure_alt:"+pressure_alt+" temperature:"+temperature+" fields_updated:"+fields_updated+"";
    }
}
        