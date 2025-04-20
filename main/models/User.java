package models;
import java.sql.*;
import database.*;
public abstract class User {
    protected String name;
    protected String email;
    protected String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public abstract void displayUserInfo();
    public String getEmail() { return email; }

    public void saveToDatabase() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO users (name, email, role) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, role);
            stmt.executeUpdate();
            System.out.println(role + " saved to database.");
        } catch (SQLException e) {
            System.out.println("Failed to save " + role.toLowerCase() + ": " + e.getMessage());
        }
    }
}
