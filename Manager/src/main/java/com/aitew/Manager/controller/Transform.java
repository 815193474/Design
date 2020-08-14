package com.aitew.Manager.controller;

import java.util.Calendar;
import java.util.Date;

public class Transform {
	
	public  String dataToUpper(Date date) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH) + 1;
		int day = ca.get(Calendar.DAY_OF_MONTH);
		String newdate=year+"年"+month+"月"+day+"日";
		return newdate;
		}
}
