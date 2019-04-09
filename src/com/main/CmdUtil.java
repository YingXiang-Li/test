package com.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdUtil {

	public String exec(String command) {
		StringBuilder sb = new StringBuilder();
		Runtime runtime = Runtime.getRuntime();
		String line = null;
		try {
			Process process = runtime.exec(command);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String command = "gpio -g write 26 1";
		CmdUtil util = new CmdUtil();
		System.out.println(util.exec(command));
	}
}
