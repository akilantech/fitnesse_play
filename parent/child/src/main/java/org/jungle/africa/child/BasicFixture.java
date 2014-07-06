package org.jungle.africa.child;

import fitlibrary.DoFixture;

public class BasicFixture extends DoFixture {

	long timeOut;

	public boolean done() {
		return true;
	}

	public void execute() {
		System.out.println("Execute..................:" + timeOut);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public long getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(long timeOut) {
		this.timeOut = timeOut;
	}

}
