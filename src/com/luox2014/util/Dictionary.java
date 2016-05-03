package com.luox2014.util;

public class Dictionary {

	
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
	
	public static final int CODE_7 = 7;
	public static final String CODE_7_KEY = "文章更新";
	
	public static final int CODE_8 = 8;
	public static final String CODE_8_KEY = "推荐文章";
	
	public static final int CODE_9 = 9;
	public static final String CODE_9_KEY = "下载排行";
	
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
		case CODE_7:
			strReturn = CODE_7_KEY;
			break;
		case CODE_8:
			strReturn = CODE_8_KEY;
			break;
		case CODE_9:
			strReturn = CODE_9_KEY;
			break;
		}
		return strReturn;
	}
	
	
}
