package com.alokcontactmail.javaUtil;

import java.util.Observable;
import java.util.Observer;

public class Watcher2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("update() in Watcher2 called, count is "+((Integer)arg).intValue());
	}

}
