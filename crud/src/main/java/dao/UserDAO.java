package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import model.User;
import util.DBConnection;

public class UserDAO {

    public boolean registerUser(User user) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO users(name,email,password) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}