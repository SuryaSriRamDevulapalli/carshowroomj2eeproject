package com.team3.servlet.implementation;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.servlet.jdbc.JDBC;
import com.servlet.encapsulated.Servletentity;

public class Implementation {
	
	Connection connect;
	PreparedStatement prep;
	ResultSet resultset;
	Statement state;
	
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
	//Fetch XUV700
	public List<Servletentity> FetchXUV700() throws SQLException {
		List<Servletentity> listproduct = new ArrayList<Servletentity>();
		System.out.println("Fetch data is triggered");
		String query = "select * from xuv700";
		
		state = connect.createStatement();
		resultset = state.executeQuery(query);
		
		Servletentity entity = null;
		while(resultset.next()) {
			entity = new Servletentity();
			entity.setCarname(resultset.getString(1));
			entity.setVariant(resultset.getString(2));
			entity.setPrice(resultset.getInt(3));
			entity.setTransmission(resultset.getString(4));
			listproduct.add(entity);
		}		
		return listproduct;
	}
	//Fetch XUV700
	public List<Servletentity> FetchScorpio() throws SQLException {
		List<Servletentity> listproduct = new ArrayList<Servletentity>();
		System.out.println("Fetch data is triggered");
		String query = "select * from scorpioN";
		
		state = connect.createStatement();
		resultset = state.executeQuery(query);
		
		Servletentity entity = null;
		while(resultset.next()) {
			entity = new Servletentity();
			entity.setCarname(resultset.getString(1));
			entity.setVariant(resultset.getString(2));
			entity.setPrice(resultset.getInt(3));
			entity.setTransmission(resultset.getString(4));
			listproduct.add(entity);
		}		
		return listproduct;
	}
	//Fetch XUV700
	public List<Servletentity> FetchThar() throws SQLException {
		List<Servletentity> listproduct = new ArrayList<Servletentity>();
		System.out.println("Fetch data is triggered");
		String query = "select * from thar";
		
		state = connect.createStatement();
		resultset = state.executeQuery(query);
		
		Servletentity entity = null;
		while(resultset.next()) {
			entity = new Servletentity();
			entity.setCarname(resultset.getString(1));
			entity.setVariant(resultset.getString(2));
			entity.setPrice(resultset.getInt(3));
			entity.setTransmission(resultset.getString(4));
			listproduct.add(entity);
		}		
		return listproduct;
	}
	//delete xuv7000
	public int deleteXUV700(Servletentity mahindra) throws SQLException {
		int result = 0;
		String query = "delete from xuv700 where variant = ? and transmission = ?;";
		prep = connect.prepareStatement(query);
		
		prep.setString(1,mahindra.getVariant());
		prep.setString(2,mahindra.getTransmission());
		
		result = prep.executeUpdate();
		return result;	
	}
	
	//delete scorpioN
	public int deleteScorpio(Servletentity mahindra) throws SQLException {
		int result = 0;
		String query = "delete from scorpioN where variant = ? and transmission = ?;";
		prep = connect.prepareStatement(query);
		
		prep.setString(1,mahindra.getVariant());
		prep.setString(2,mahindra.getTransmission());
		
		result = prep.executeUpdate();
		return result;	
	}
	//delete thar
	public int deleteThar(Servletentity mahindra) throws SQLException {
		int result = 0;
		String query = "delete from thar where variant = ? and transmission = ?;";
		prep = connect.prepareStatement(query);
		
		prep.setString(1,mahindra.getVariant());
		prep.setString(2,mahindra.getTransmission());
		
		result = prep.executeUpdate();
		return result;	
	}
	///update xuv700
	public int updateXUV700(Servletentity entity) throws SQLException {
		int result  = 0;
		String query = "update xuv700 set transmission = ? , price = ? where variant = ?";
		
		prep = connect.prepareStatement(query);
		prep.setString(1, entity.getTransmission());
		prep.setInt(2, entity.getPrice());
		prep.setString(3, entity.getVariant());
		
		result = prep.executeUpdate();
		
		
		return result;
	}
	///update scorpio
	public int updateScorpio(Servletentity entity) throws SQLException {
		int result  = 0;
		String query = "update scorpioN set transmission = ? , price = ? where variant = ?";
		
		prep = connect.prepareStatement(query);
		prep.setString(1, entity.getTransmission());
		prep.setInt(2, entity.getPrice());
		prep.setString(3, entity.getVariant());
		
		result = prep.executeUpdate();
		
		
		return result;
	}
	///update thar
	public int updateThar(Servletentity entity) throws SQLException {
		int result  = 0;
		String query = "update thar set transmission = ? , price = ? where variant = ?";
		
		prep = connect.prepareStatement(query);
		prep.setString(1, entity.getTransmission());
		prep.setInt(2, entity.getPrice());
		prep.setString(3, entity.getVariant());
		
		result = prep.executeUpdate();
		
		
		return result;
	}

}
