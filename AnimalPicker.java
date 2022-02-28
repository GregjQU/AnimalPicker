import java.util.Scanner;
public class AnimalPicker {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);	
	String userInput = "";	
			
System.out.println("which animal do you want to see: a dog or a cat");
String userInput1 = scanner.nextLine();
//userInput.toLowerCase();


if(userInput1.equalsIgnoreCase("dog") ) {
	System.out.println("placeholder text");
	//System.out.println(userInput);
	//System.out.println("Text 1 ");
	
}
else if(userInput1.equalsIgnoreCase("cat")) {
	
	System.out.println(" kitty");
	
}



	}

}
