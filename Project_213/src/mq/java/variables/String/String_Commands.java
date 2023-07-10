package mq.java.variables.String;

public class String_Commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=>String store set of characters
		 * 			=> String is not only a datatype also called
		 * 				as class.Because String contains set of 
		 * 				methods to validate stored characters..
		 */
		
		
		String Act_res="Account Created";
		String Exp_res="Account created";
		
		/*
		 * Equals:-->
		 * 			Method verify equal ignorecase comparision
		 * 			between two string and return boolean value true/false.
		 * 			=> Comparision is case-sensitive
		 */
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is --> "+flag);

		/*
		 * EqualIgnoreCase:-->
		 * 			Method verify equal comparision between
		 * 			two strings by ignoring casesensitive
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("EqualIngorecase comparision--> "+flag1);
		
		
		/*
		 * contains:-->
		 * 			Method verify substring characters in sequence
		 * 			available at main String.
		 */
		String Status="Account 100 Created";
		System.out.println("Com1:--> "+Status.contains("Account"));
		System.out.println("Com2:--> "+Status.contains("Created"));
		System.out.println("Com3:--> "+Status.contains("Account Created"));
		
		
		/*
		 * length:-->
		 * 		Method count number of characters available with in string
		 */
		String Mobile="9030248855";
		int count=Mobile.length();
		if(count==10)
			System.out.println("Mobile number available in 10 digits");
		else
			System.out.println("Invalid mobile number");
		
		/*
		 * trim:--> 
		 * 		Method trim extra space characters with in string
		 * 		only String left and right characters
		 */
		String Pinnum="    500000    ";
		System.out.println("before Trim Length is --> "+Pinnum.length());
		String NewPin=Pinnum.trim();
		System.out.println("After Trim length is --> "+NewPin.length());
		
		
		/*
		 * substring:-->
		 * 		Method get subString sequence characters from main String
		 */
		String AccountNum="100012347878";
		String Account=AccountNum.substring(8);
		System.out.println("End Digits are --> "+Account);
		System.out.println("Middle Digitsa are --> "+AccountNum.substring(4, 8));
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return
		 * 		boolean value true/false
		 */
		String var1="";
		String var2="Hi";
		System.out.println("var1 empty status is ---> "+var1.isEmpty());
		System.out.println("Var2 empty status is ---> "+var2.isEmpty());
		if(!var2.isEmpty())
			System.out.println("Chars available");
		else
			System.out.println("Chars not available");
		

		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String AccountNumber="111122227777";
		boolean flag5=AccountNumber.startsWith("1111");
		System.out.println("Starts with Comparision is --> "+flag5);

		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("7777");
		System.out.println("ends with Comparision is --> "+flag6);
		

		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(0);
		System.out.println("charcters available at Zero index number ---> "+ch);

		/*
		 * ToLowerCase:-->
		 * 		method convert all Uppercase characters
		 * 		into lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 		method convert all lowercase characters 
		 * 		into uppercase
		 */
		System.out.println(toolname.toUpperCase());
		
		/*
		 * concat:-->
		 * 			Method club two string 
		 */
		String firstname="SunilReddy";
		String surname="gajjala";
		System.out.println(firstname.concat(surname));
		System.out.println(firstname+surname);
		

		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Price="$10,000";
		String NewPrice=Price.replace("$", "").replace(",", "");
		System.out.println(NewPrice);
		
		//Convertinto Integer value
		int val=Integer.parseInt(NewPrice);
		System.out.println(val+100);
		
		//Print only numeric characters with in String using Regular expression
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);

		//Example 
		String Info="Account 100 created";
		String ID= Info.replaceAll("[^0-9]", "");
		System.out.println(ID);

		
	}

}
