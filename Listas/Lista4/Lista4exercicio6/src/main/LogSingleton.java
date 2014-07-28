package main;

import java.io.FileWriter;
import java.io.IOException;

public class LogSingleton {
	private static LogSingleton instance;

	private LogSingleton() {
	}

	public static synchronized LogSingleton getInstance() {
		if (instance == null)
			instance = new LogSingleton();
		return instance;
	}

	public void logLine(String tag, String text) {
		String logLine = "LogLine-> " + tag + ": " + text + "\n";
		
		try {
			FileWriter fw = new FileWriter("log.txt");
			fw.append(logLine);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(logLine);
	}
}
