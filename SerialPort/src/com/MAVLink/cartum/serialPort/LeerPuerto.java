package com.MAVLink.cartum.serialPort;

import java.util.*;
import gnu.io.*;
import com.MAVLink.*;
import java.io.IOException;
import java.io.InputStream;

public class LeerPuerto {
		
	public static void main(String[] args){
		System.out.println("Started");
		
		CommPortIdentifier serialPortId;
		Enumeration<?> enumComm;
		
		enumComm = CommPortIdentifier.getPortIdentifiers();
		while (enumComm.hasMoreElements()){
			serialPortId = (CommPortIdentifier) enumComm.nextElement();
			
			if(serialPortId.getPortType() == CommPortIdentifier.PORT_SERIAL){
				System.out.println(serialPortId.getName());
			}
			if(serialPortId.getName().equals("/dev/cu.usbmodem1")){
				leerPuerto(serialPortId);
			}
		}
		System.out.println("Finished");
	}
		
	public static void leerPuerto(CommPortIdentifier port) {
		
	}
}
