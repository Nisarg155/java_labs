import java.util.Scanner;

class Greeter {
void greeting (String name)
{
	System.out.println("Hello  " + name);
}
}

class Greet {
public static void main(String [] args)
{
	Scanner obj = new Scanner(System.in);
	Greeter Obj = new Greeter();
	String name = obj.nextLine();
	Obj.greeting(name);
}
}
