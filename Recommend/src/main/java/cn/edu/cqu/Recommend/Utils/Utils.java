package cn.edu.cqu.Recommend.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

	// 调用命令行
	public static String cmdCall(String[] argv) throws InterruptedException {
		Process process;
		try {
			process = Runtime.getRuntime().exec(argv);
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			StringBuilder sb = new StringBuilder();
			while (br.readLine() != null) {
				line = br.readLine();
				sb.append(line + "\n");
			}
			if (process.waitFor() == 0) {
				return "Call function success";
			}
			return "Call function failed";
		} catch (IOException e) {
			System.err.println(e);
		}
		return "Call function failed";
	}

}
