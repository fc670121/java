package fc.demo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2 {
	public static String readFile(String name) throws FileNotFoundException {
		StringBuilder builder = new StringBuilder();
		try (Scanner scanner = new Scanner(new FileInputStream(name))) {
			while (scanner.hasNext()) {
				builder.append(scanner.nextLine());
				builder.append('\n');
			}
		}
		return builder.toString();
	}
}
