package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "laiproject2-instance.cslhgrijnknw.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "JobMySQL";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "12345678";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

}
