package swing_db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class InsertDatabaseCSV {
	public ArrayList<RestaurantDTO> csvToArrayList(String fileName) {
		ArrayList<RestaurantCSVDTO> dtoList = new ArrayList<RestaurantCSVDTO>();
		ArrayList<RestaurantDTO> rDtoList = new ArrayList<RestaurantDTO>();
		LoadCSV csv = new LoadCSV();
		int count = 0;
		String[] line = null;
		try {
			csv.readCSV(fileName);
			while((line = csv.nextRead())!=null){
//	            for(String a : line){
//	                System.out.print(a +" ");
//	            }
				if(count >= 1) {					
					RestaurantCSVDTO restaurantDTO = new RestaurantCSVDTO(line[0], line[1], line[2], line[3], line[4]);
					dtoList.add(restaurantDTO);
				}
	            
	            count++;
//	            System.out.println();
	        }
			for(int i = 0; i < dtoList.size(); i++) {
				
				RestaurantDTO rDTO = new RestaurantDTO(
						dtoList.get(i).industryName, 
						dtoList.get(i).restaurantName, 
						dtoList.get(i).Phone
					);
				rDtoList.add(rDTO);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return rDtoList;
	}
	public static void main(String[] args) {
		ArrayList<RestaurantDTO> rDtoList = new ArrayList<RestaurantDTO>();
		rDtoList = new InsertDatabaseCSV().csvToArrayList("food.csv");
		String url = "jdbc:mysql://localhost:3306/restaurant?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
		
//		String sql = "select * from restaurant";
		String sql = "insert into restaurant(업종명,업소명,전화번호,위치) values";
		for(int i = 0; i< rDtoList.size(); i++) {
			if(i == rDtoList.size()-1) {
				sql += "(?, ?, ?, ?) ";
				break;
			}
			sql += "(?, ?, ?, ?), ";
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, "root", "1234");
			PreparedStatement stmt = connection.prepareStatement(sql);
			for(int i = 0; i< rDtoList.size(); i++) {
				stmt.setString((i*4)+1, rDtoList.get(i).industryName);
				stmt.setString((i*4)+2, rDtoList.get(i).restaurantName);
				stmt.setString((i*4)+3, rDtoList.get(i).Phone);
				stmt.setInt((i*4)+4, 1);
			}
//			Statement stmt = connection.createStatement();
			stmt.executeUpdate();
			stmt.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
