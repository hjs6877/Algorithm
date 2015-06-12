package kr.ac.korea.algorithm.string;

public class StringCompressor {

	/**
	 * 문자열 압축 수행.
	 * 
	 * @param s
	 * @return
	 */
	public String compress(String s) {
		StringBuffer sb = new StringBuffer();
		char c = s.charAt(0);
		int count = 1;
		
		for(int i=1; i < s.length(); i++){
			char cur = s.charAt(i);
			
			if(c != cur){
				sb.append(c).append(count);
				c = cur;
				count = 1;
			}else{
				count++;
			}
		}
		
		sb.append(c).append(count);
		String compressedStr = sb.toString();
		
		String finalStr = this.getFitableStr(compressedStr, s);
		
		return finalStr;
	}

	/**
	 * 압축한 문자열이 최적인지 확인. 최적이 아니면 기존 문자열 사용.
	 * @param cStr
	 * @param str
	 * @return
	 */
	private String getFitableStr(String cStr, String str){
		return cStr.length() >= str.length() ? str : cStr;
	}
}
