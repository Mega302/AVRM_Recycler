package com.mega.devices.autocarddispenser;

public interface autocarddispenser {
	public int 	  ConnectDevice(int PortId,int ChanelClearanceMode,int Timeout);
	public int 	  DisConnectDevice(int Timeout);
	public byte[] GetDeiceStatus(int ComponentId,int Timeout);
	public int    EnableCardAcceptance(int Timeout);
	public int    DisableCardAcceptance(int Timeout);
	public int    AcceptCard(int Timeout);
	public int    DispenseCard(int Timeout);
	public int    ReturnCard(int DispenseMode,int Timeout);
}
