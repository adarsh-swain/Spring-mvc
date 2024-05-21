package com.crud.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.crud.dao.UserDAO;
import com.crud.model.User;

public class UserDAOImpl implements UserDAO{
	
	 private DataSource dataSource;

	    public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }

	    @Override
	    public void save(User user) {
	        String query = "INSERT INTO users (name, email) VALUES (?, ?)";
	        try (Connection connection = dataSource.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, user.getName());
	            preparedStatement.setString(2, user.getEmail());
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }


}
