package com.luox2014.util;

public class Dictionary {

	
	/*public static final String CODE_1 = "心情日记";
	public static final String CODE_2 = "工作学习";
	public static final String CODE_3 = "编程趣事";
	public static final String CODE_4 = "软件下载";
	public static final String CODE_5 = "源码分享";
	public static final String CODE_6 = "学习资料";
	
	
	public static String getCodeName(String code){
		
		String strReturn = "未知";
		switch (code) {
		case "CODE_1":
			strReturn=CODE_1;
			break;
		case "CODE_2":
			strReturn=CODE_2;
			break;
		case "CODE_3":
			strReturn=CODE_3;
			break;
		case "CODE_4":
			strReturn=CODE_4;
			break;
		case "CODE_5":
			strReturn=CODE_5;
			break;
		case "CODE_6":
			strReturn=CODE_6;
			break;

		}
		return strReturn;
	}
	*/
	
	public static final int CODE_1 = 1;
	public static final String CODE_1_KEY = "心情日记";
	
	public static final int CODE_2 = 2;
	public static final String CODE_2_KEY = "工作学习";
	
	public static final int CODE_3 = 3;
	public static final String CODE_3_KEY = "编程趣事";
	
	public static final int CODE_4 = 4;
	public static final String CODE_4_KEY = "软件下载";
	
	public static final int CODE_5 = 5;
	public static final String CODE_5_KEY = "源码分享";
	
	public static final int CODE_6 = 6;
	public static final String CODE_6_KEY = "学习资料";
	
	
	public static String getCodeName(int code){
		
		//初始化返回值
		String strReturn = "未知";
		
		switch (code) {
		case CODE_1:
			strReturn = CODE_1_KEY;
			break;
		case CODE_2:
			strReturn = CODE_2_KEY;
			break;
		case CODE_3:
			strReturn = CODE_3_KEY;
			break;
		case CODE_4:
			strReturn = CODE_4_KEY;
			break;
		case CODE_5:
			strReturn = CODE_5_KEY;
			break;
		case CODE_6:
			strReturn = CODE_6_KEY;
			break;
		}
		return strReturn;
	}
	
	
}
