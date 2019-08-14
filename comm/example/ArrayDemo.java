package comm.example;

public class ArrayDemo {
	private char arr [];
	
	public char[] createArray(int length) {
		arr=new char[length];
		for (int i =0; i<arr.length;i++) 
		{
			arr[i]=(char)('A'+i);
		}
		return  arr;
	}

	
	
}
