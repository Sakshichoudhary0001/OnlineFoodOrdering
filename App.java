package sak.com;
import java.util.Scanner;
import sak.com.model.User;
import sak.com.service.UserService;
import sak.com.serviceImp.UserServiceImp;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create User");
            System.out.println("2. Read User");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    createUser();
                    break;												
                case 2:
                    readUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void createUser() {
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user phone number: ");
        String phone = scanner.nextLine();
        
        User customer = new User(id, name, phone);
        UserService.createCustomer(customer);
        System.out.println("User created successfully!");
        System.out.println("Inserted user details: " + customer);
    }

    private static void readUser() {
    	System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user phone number: ");
        String phone = scanner.nextLine();
        
        User customer = new User(id, name, phone);
        UserService.createCustomer(customer);
        System.out.println("User Read successfully!");
        System.out.println("Inserted user details: " + customer);
        // Implement read user functionality
    }

    private static void updateUser() {
    	System.out.print("Enter user ID to update details: ");
		int userId = scanner.nextInt();
		scanner.nextLine(); // Consume newline character

		User existingUser = UserServiceImp.getUser(userId);
		if (existingUser != null) {
			System.out.println("Enter new details:");
			System.out.print("Name: ");
			String newName = scanner.nextLine();
			System.out.print("Phone: ");
			String newPhone = scanner.nextLine();

			existingUser.setName(newName);
			existingUser.setPhone(newPhone);

			UserServiceImp.updateUser(userId, existingUser);
			System.out.println("User details updated successfully!");
		} else {
			System.out.println("User with ID " + userId + " not found.");
		}
    }

    private static void deleteUser() {
    	System.out.print("Enter user ID to delete: ");
		int userId = scanner.nextInt();
		scanner.nextLine(); // Consume newline character

		String result = UserService.deleteUser(userId);
		System.out.println(result);
    }
}
