
package UserDao;

import User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import service.JDBCConnection;

public class UserDao {
    public List<User> getAllUser() throws SQLException{
        List<User> users = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql= "SELECT * FROM nguoidung";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("hoten"));
                user.setUsername(rs.getString("taikhoan"));
                user.setPassword(rs.getString("matkhau"));
                user.setRole(rs.getString("quyen"));

                
                users.add(user);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    public User getUserByUserName(String userName) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql= "SELECT * FROM nguoidung where taikhoan= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("hoten"));
                user.setUsername(rs.getString("taikhoan"));
                user.setPassword(rs.getString("matkhau"));
                user.setRole(rs.getString("quyen"));
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public User getUserById(int Id) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql= "SELECT * FROM nguoidung where id= ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, Id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                
               user.setId(rs.getInt("ID"));
                user.setName(rs.getString("hoten"));
                user.setUsername(rs.getString("taikhoan"));
                user.setPassword(rs.getString("matkhau"));
                user.setRole(rs.getString("quyen"));
                
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}