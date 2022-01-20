package io.work.homework.week2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProperty {
	public static void main(String[] args) {
		try {
			File file = new File("property.html");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

			writer.write("<head>");
			writer.write("<h1>자바 환경정보</h1>");
			writer.write("<meta charset=\"UTF-8\"/>");
			writer.write("<style>");
			writer.write("table {border-collapse:collapse; width:100%;}");
			writer.write(" th,td{border:solid 1px #000;}");
			writer.write("</style></head>");

			writer.write(" <body><table style=\"text-align: left;\">");
			writer.write("<tr>");
			writer.write("<th>키</th><th>값</tr></tr>");

			for (Object k : System.getProperties().keySet()) {
				String key = k.toString();
				String value = System.getProperty(key);
				writer.write("<th>" + key + "</th><th>" + value + "</tr></tr>");
			}

			writer.write("</table></body>");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
