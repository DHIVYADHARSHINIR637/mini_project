package dhivya;
import java.util.*; 
class StudentRecord{
    int id;
    String name;
    int age;
    String department;
    int marks;

    // Constructor
    public StudentRecord(int id, String name, int age, String department, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    // Display Method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age +
                           ", Dept: " + department + ", Marks: " + marks);
    }
}

public class Prog82{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<StudentRecord> studentList = new ArrayList<>();

	        while (true) {
	            System.out.println("\n--- Student Record System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Students");
	            System.out.println("3. Search by ID");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Show Passed Students (Marks >= 50)");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    // Add student
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine(); // consume \n
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Department: ");
	                    String dept = sc.nextLine();
	                    System.out.print("Enter Marks: ");
	                    int marks = sc.nextInt();

	                    studentList.add(new StudentRecord(id, name, age, dept, marks));
	                    System.out.println("Student added successfully!");
	                    break;

	                case 2:
	                    // View all
	                    System.out.println("All Students:");
	                    studentList.forEach(s -> s.display());
	                    break;

	                case 3:
	                    // Search
	                    System.out.print("Enter Student ID to search: ");
	                    int searchId = sc.nextInt();
	                    boolean found = false;
	                    for (StudentRecord s : studentList) {
	                        if (s.id == searchId) {
	                            s.display();
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student not found.");
	                    break;

	                case 4:
	                    // Delete
	                    System.out.print("Enter Student ID to delete: ");
	                    int deleteId = sc.nextInt();
	                    boolean removed = studentList.removeIf(s -> s.id == deleteId);
	                    if (removed)
	                        System.out.println("Student deleted successfully.");
	                    else
	                        System.out.println("Student ID not found.");
	                    break;

	                case 5:
	                    // Show passed
	                    System.out.println("Passed Students:");
	                    studentList.stream()
	                               .filter(s -> s.marks >= 50)
	                               .forEach(s -> s.display());
	                    break;

	                case 6:
	                    System.out.println("Exiting program... bye da!");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    
	}


}
