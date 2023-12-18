import java.util.Scanner;

 class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Roll No: ");
		int rollNo = scanner.nextInt();

		System.out.println("Enter marks for 5 subjects:");
		int[] marks = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
			sum += marks[i];
		}

		// Calculate average
		double average = (double) sum / 5;

		// Output
		System.out.println("\nStudent Details:");
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Average: " + average);

		// Display grade
		scanner.close();
	}
}
