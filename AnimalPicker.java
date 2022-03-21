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
	System.out.println("      _                 \n   __| | ___   __ _ ___ \n  / _` |/ _ \\ / _` / __|\n | (_| | (_) | (_| \\__ \\\n  \\__,_|\\___/ \\__, |___/\n              |___/   ");
	//System.out.println(userInput);
	//System.out.println("Text 1 ");
	//return;
}
else if(userInput1.equalsIgnoreCase("cat")) {
	
	System.out.println("            _       \n   ___ __ _| |_ ___ \n  / __/ _` | __/ __|\n | (_| (_| | |_\\__ \\\n  \\___\\__,_|\\__|___/");
	
}else if(userInput1.equalsIgnoreCase("fish")) {
	System.out.println("   __ _     _     \n  / _(_)___| |__  \n | |_| / __| \'_ \\ \n |  _| \\__ \\ | | |\n |_| |_|___/_| |_|");
}
else {
	
	System.out.println("Sorry please enter one of the  options");
	
	//System.out.println("which animal do you want to see: a dog or a cat");
	
	main(null); ;
}



	}

}
