package com.web.commonLibrary;

public class Login_UniqueKeyGenerator {
	
	public String uniqueKeyGeneratorFunction(String dob,String ph)
	{
		String dob_arr[] = dob.split("-");
		String uniqueKey = dob_arr[2]+ph+dob_arr[0]+dob_arr[1];
		//return Integer.parseInt(uniqueKey);
		return uniqueKey;
		
	}

}
