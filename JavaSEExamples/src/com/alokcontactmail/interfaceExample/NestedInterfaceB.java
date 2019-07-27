package com.alokcontactmail.interfaceExample;

import com.alokcontactmail.interfaceExample.NestedInterfaceA.NestedIF;

public class NestedInterfaceB implements NestedInterfaceA.NestedIF {

	@Override
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}

}
