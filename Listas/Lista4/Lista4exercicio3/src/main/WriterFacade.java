package main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterFacade {

	private String fileName;

	private String encoding;

	private Writer fw;

	public WriterFacade(String fileName, String encoding) {
		this.fileName = fileName;
		this.encoding = encoding;
	}

	public void write(String text) {
		try {
			// Decorator
			fw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(fileName), encoding));
			fw.append(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
