package quiz06;

public class ArrayPrint {

	//Arrays.toString기능을 따라해보기 (int배열, String배열, Char배열)을 각각 받아서
	//배열 내부에 요소를 문자열의 형태로 가로로 더해서 반환 해주는 메서드를 오버로딩
	
	String toStr(int[] arr) {
		String str = "[";
		
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(arr.length-1 == i) break;			
			str += ", "; //콤마공백
		}
		
		str += "]";
		return str;
	}
	
	String toStr(String[] arr) {
		String str = "[";
		
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(arr.length-1 == i) break;			
			str += ", "; //콤마공백
		}
		str += "]";
		return str;
	}
	
	String toStr(char[] arr) {
		String str = "[";
		
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(arr.length-1 == i) break;			
			str += ", "; //콤마공백
		}
		str += "]";
		return str;
	}
	
	
	
	
	
}
