package info.fitnesse.fixturegallery;

import java.sql.SQLException;
import java.util.Arrays;

import dbfit.OracleTest;
import fit.Fixture;
import fitlibrary.DoFixture;

public class CustomOracleFit extends DoFixture {
	OracleTest oracleTest;

	public CustomOracleFit() {
		oracleTest = new OracleTest();
		try {
			oracleTest.connect("jdbc:oracle:thin:fitnesse_user/fitnesse@localhost:1521:XE");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Fixture query(String query) {
			return oracleTest.query(query);
	}
	
	public Fixture insert(String tableName) {
			return oracleTest.insert(tableName);
	}
	
	public Fixture execute(String executeString ){
			return oracleTest.execute(executeString);
	}
	
	public void commit(){
		try {
			oracleTest.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static String letters;
	
	public void fillTimesWith(int count,char c){
		char[] arr=new char[count];
		Arrays.fill(arr,c);
		letters=new String(arr);
	}
	public boolean charAtIs(int position, char c){
		return letters.charAt(position)==c;
	}
	public void setList(char[] array){
		letters=new String(array);
	}
	public char charAt(int position){
		return letters.charAt(position);
	}
	

}
