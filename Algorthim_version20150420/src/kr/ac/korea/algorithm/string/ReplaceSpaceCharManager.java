package kr.ac.korea.algorithm.string;

public class ReplaceSpaceCharManager {

	public String replace(String s) {
		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i < c.length; i++){
			if(c[i] == 32){
				sb.append("%20");
			}else{
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}

}
