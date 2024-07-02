package Sample.SeleniumTet;

public class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MADAM";
		String revStr = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			revStr =revStr +str.charAt(i);
		}
		
		System.out.println("The Reversed String is: "+revStr);
	}

}
