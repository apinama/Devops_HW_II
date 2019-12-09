package marta.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateNewPropFile {

	public static void main(String[] args) {

		try (OutputStream output = new FileOutputStream("newProps.properties")) {

			Properties prop = new Properties();

			prop.setProperty("date", "December 9");

			prop.store(output, null);

			System.out.println(prop);

		} catch (IOException io) {
			io.printStackTrace();
		}

	}
}
