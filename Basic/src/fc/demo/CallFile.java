package fc.demo;

import java.io.FileNotFoundException;
import fc.demo.util.FileUtil;
import fc.demo.util.FileUtil2;

public class CallFile {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(FileUtil.readFile("C:\\java\\test.txt"));

		System.out.println(FileUtil2.readFile("C:\\java\\test.txt"));
	}
}
