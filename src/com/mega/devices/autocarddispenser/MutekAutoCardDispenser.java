package com.mega.devices.autocarddispenser;

public class MutekAutoCardDispenser implements autocarddispenser {
	
	public MutekAutoCardDispenser(){
		System.out.println("MutekAutoCardDispenser Constructor");
	}

	@Override
	public int ConnectDevice(int PortId, int ChanelClearanceMode, int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DisConnectDevice(int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte[] GetDeiceStatus(int ComponentId, int Timeout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int EnableCardAcceptance(int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DisableCardAcceptance(int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int AcceptCard(int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DispenseCard(int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ReturnCard(int DispenseMode, int Timeout) {
		// TODO Auto-generated method stub
		return 0;
	}

}//public class MutekAutoCardDispenser end
