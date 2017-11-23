package com.shubham.shubhcore;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

//	public Tyre(String str) {
//		super();
//		this.str = str;
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "Tyre [brand=" +str +"]"; //for normal
		return "Tyre is working..." ;  // for autowired annotation
	}
}
