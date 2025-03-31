// Admin.java

package models;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    public void displayUserInfo() {
        System.out.println("Admin: " + name + " (" + email + ")");
    }

    public void manageProducts() {
        System.out.println(name + " is managing products.");
    }
}
