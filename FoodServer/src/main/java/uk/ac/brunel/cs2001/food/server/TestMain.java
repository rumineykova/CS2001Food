package uk.ac.brunel.cs2001.food.server;

public class TestMain {
	public static void main(String[] args) {
		HelloJDBC hb = new HelloJDBC(); 
		hb.pullDataFromDatabase();
	}
}
