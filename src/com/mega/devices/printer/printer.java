package com.mega.devices.printer;

public interface printer {
	public int 	  ConnectDevice(int portName, int Timeout);
	public int 	  DisConnectDevice(int Timeout);
	public int    GetPrinterStatus(int timeout);
	public int 	  PrintLogo(byte[] Logo, int Alignment, int Timeout);
	public int    PrintTextLine(String Text, int Alignment, int Timeout);
	public int    PrintBlankLine(int Timeout);
	public int    EndPrint(int PaperCuttingMethod, int Timeout);
	public int    XChangeCommande(String Command, int Timeout);
	
}
