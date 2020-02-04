package array;

public class ArrayTest {

	public static void main(String[] args) {
/*
		char[] arr = new char [26];
		char CAP;
		for(CAP=65;CAP<91;CAP++,arr[0]++) {
			arr[0]=CAP;
			System.out.println(arr[0]);
		}
		*/
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length;i++) {
			alphabets[i] = ch++;
		}
		for(int i =0; i<alphabets.length;i++) {
			System.out.println(alphabets[i] + ","+(int)alphabets[i]);
		}
	}

}
