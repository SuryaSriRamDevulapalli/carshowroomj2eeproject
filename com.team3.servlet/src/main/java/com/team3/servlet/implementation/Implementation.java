package com.team3.servlet.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.servlet.jdbc.JDBC;
import com.servlet.encapsulated.Servletentity;

public class Implementation {
	
	Connection connect;
	PreparedStatement prep;
	ResultSet resultset;
	
	public Implementation() {
		connect = JDBC.getinstance();
	}
	//create
	public int Insertmethod(Servletentity entity) throws SQLException {
		int result = 0;
		System.out.println("Implementation Class");
		String query = "insert into xuv700 values(?,?,?,?)";
		
		prep = connect.prepareStatement(query);
		prep.setString(1,entity.getCarname() );
		prep.setString(2,entity.getVariant() );
		prep.setInt(3,entity.getPrice() );
		prep.setString(4,entity.getTransmission() );
		
		result = prep.executeUpdate();
		return result;
	}
	//create
	public int InsertmethodScorpioN(Servletentity entity) throws SQLException {
		int result = 0;
		System.out.println("Implementation Class");
		String query = "insert into scorpioN values(?,?,?,?)";
		
		prep = connect.prepareStatement(query);
		prep.setString(1,entity.getCarname() );
		prep.setString(2,entity.getVariant() );
		prep.setInt(3,entity.getPrice() );
		prep.setString(4,entity.getTransmission() );
		
		result = prep.executeUpdate();
		return result;
	}
	//create
	public int InsertmethodThar(Servletentity entity) throws SQLException {
		int result = 0;
		System.out.println("Implementation Class");
		String query = "insert into thar values(?,?,?,?)";
		
		prep = connect.prepareStatement(query);
		prep.setString(1,entity.getCarname() );
		prep.setString(2,entity.getVariant() );
		prep.setInt(3,entity.getPrice() );
		prep.setString(4,entity.getTransmission() );
		
		result = prep.executeUpdate();
		return result;
	}
	//read
	public Servletentity SearchThar(String en) throws SQLException {
		Servletentity entity = null;
		System.out.println("Implementation class Triggered");
		
		String query = "Select * from thar where variant = ?";
		prep = connect.prepareStatement(query);
		prep.setString(1, en);
		resultset = prep.executeQuery();
		
		while(resultset.next()){
			entity = new Servletentity();///initializing the object to avoid null pointer exception
			entity.setCarname(resultset.getString(1));
			entity.setVariant(resultset.getString(2));
			entity.setPrice(resultset.getInt(3));
			entity.setTransmission(resultset.getString(4));
		}
		return entity;	
	}
	//read
	public Servletentity SearchScorpio(String en) throws SQLException {
		Servletentity entity = null;
		System.out.println("Implementation class Triggered");
		
		String query = "Select * from scorpioN where variant = ?";
		prep = connect.prepareStatement(query);
		prep.setString(1, en);
		resultset = prep.executeQuery();
		
		while(resultset.next()){
			entity = new Servletentity();///initializing the object to avoid null pointer exception
			entity.setCarname(resultset.getString(1));
			entity.setVariant(resultset.getString(2));
			entity.setPrice(resultset.getInt(3));
			entity.setTransmission(resultset.getString(4));
		}
		return entity;	
	}
	//read
	public Servletentity SearchXUV700(String en) throws SQLException {
		Servletentity entity = null;
		System.out.println("Implementation class Triggered");
		
		String query = "Select * from xuv700 where variant = ?";
		prep = connect.prepareStatement(query);
		prep.setString(1, en);
		resultset = prep.executeQuery();
		
		while(resultset.next()){
			entity = new Servletentity();///initializing the object to avoid null pointer exception
			entity.setCarname(resultset.getString(1));
			entity.setVariant(resultset.getString(2));
			entity.setPrice(resultset.getInt(3));
			entity.setTransmission(resultset.getString(4));
		}
		return entity;	
	}
	

}
