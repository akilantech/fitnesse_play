package info.fitnesse.fixturegallery;

import java.sql.SQLException;

import dbfit.OracleTest;

public class OracleTestExtend extends OracleTest{

	public void commit(){
		try {
			environment.getConnection().setAutoCommit(true);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
