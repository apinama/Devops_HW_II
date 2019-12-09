package marta.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropertFile {

	public static void main(String[] args) {

		try (OutputStream output = new FileOutputStream("project.properties")) {

			Properties prop = new Properties();

			prop.setProperty("purpose", "get it done");
			prop.setProperty("topic", "homework");

			prop.store(output, null);

			System.out.println(prop);

		} catch (IOException io) {
			io.printStackTrace();
		}

	}
}
