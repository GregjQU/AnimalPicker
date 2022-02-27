import java.util.Scanner;
public class AnimalPicker {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);	
		
		
		
System.out.println("which animal do you want to see: a dog or a cat");
String userInput = scanner.nextLine();

if(userInput.toLowerCase() == "dog") {
	System.out.println("placeholder text");
	System.out.println(userInput);
}



	}

}
