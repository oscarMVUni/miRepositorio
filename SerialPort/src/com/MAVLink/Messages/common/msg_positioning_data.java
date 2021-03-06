/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE POSITIONING_DATA PACKING
package com.MAVLink.Messages.common;
import com.MAVLink.Messages.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* This message is for identify the data and from where they come.
*/
public class msg_positioning_data extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_POSITIONING_DATA = 227;
    public static final int MAVLINK_MSG_LENGTH = 35;
    private static final long serialVersionUID = MAVLINK_MSG_ID_POSITIONING_DATA;


      
    /**
    * A bitfield for use for autopilot-specific flags.
    */
    public long custom_mode;
      
    /**
    * Un numero entero que identifique el mensaje que se esta mandando y llegue con el mismo a todos los ordenaodres con los que se comunique.
    */
    public long pulse_ID;
      
    /**
    * Type of the MAV (quadrotor, helicopter, etc., up to 15 types, defined in MAV_TYPE ENUM)
    */
    public short type;
      
    /**
    * Autopilot type / class. defined in MAV_AUTOPILOT ENUM
    */
    public short autopilot;
      
    /**
    * System mode bitfield, see MAV_MODE_FLAG ENUM in mavlink/include/mavlink_types.h
    */
    public short base_mode;
      
    /**
    * Identificador del dron, en nuestro caso se tratara del identificador de la controladora
    */
    public byte drone_ID[] = new byte[24];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_POSITIONING_DATA;
              
        packet.payload.putUnsignedInt(custom_mode);
              
        packet.payload.putUnsignedInt(pulse_ID);
              
        packet.payload.putUnsignedByte(type);
              
        packet.payload.putUnsignedByte(autopilot);
              
        packet.payload.putUnsignedByte(base_mode);
              
        
        for (int i = 0; i < drone_ID.length; i++) {
            packet.payload.putByte(drone_ID[i]);
        }
                    
        
        return packet;
    }

    /**
    * Decode a positioning_data message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.custom_mode = payload.getUnsignedInt();
              
        this.pulse_ID = payload.getUnsignedInt();
              
        this.type = payload.getUnsignedByte();
              
        this.autopilot = payload.getUnsignedByte();
              
        this.base_mode = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.drone_ID.length; i++) {
            this.drone_ID[i] = payload.getByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_positioning_data(){
        msgid = MAVLINK_MSG_ID_POSITIONING_DATA;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_positioning_data(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_POSITIONING_DATA;
        unpack(mavLinkPacket.payload);        
    }

               
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setDrone_Id(String str) {
        int len = Math.min(str.length(), 24);
        for (int i=0; i<len; i++) {
            drone_ID[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<24; i++) {            // padding for the rest of the buffer
            drone_ID[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getDrone_Id() {
        String result = "";
        for (int i = 0; i < 24; i++) {
            if (drone_ID[i] != 0)
                result = result + (char) drone_ID[i];
            else
                break;
        }
        return result;

    }
                         
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_POSITIONING_DATA -"+" custom_mode:"+custom_mode+" pulse_ID:"+pulse_ID+" type:"+type+" autopilot:"+autopilot+" base_mode:"+base_mode+" drone_ID:"+drone_ID+"";
    }
}
        