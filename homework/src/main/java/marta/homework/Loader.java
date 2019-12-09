package marta.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Loader {

	public static void main(String[] args) {

		try (InputStream input = new FileInputStream("project.properties")) {

			Properties prop = new Properties();

			prop.load(input);

			System.out.println("topic: " + prop.getProperty("topic"));
			System.out.println("purpose: " + prop.getProperty("purpose"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		try (InputStream input = new FileInputStream("newProps.properties")) {

			Properties prop = new Properties();

			prop.load(input);

			System.out.println("created on: " + prop.getProperty("date"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
