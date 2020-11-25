package com.exception.charcheck;

public class CharacterProcess {
	public CharacterProcess() {
		
	}
	public int countAlpha(String s) throws CharCheckException{
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ')
				throw new CharCheckException();
		}
		return s.length();
	}
}
