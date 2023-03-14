package swing_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoadCSV {
	File filePath;
	BufferedReader bufferedReader;
	List<String[]> readCSV;
	int index;
	public void readCSV(String fileName) throws IOException {
		this.filePath = new File(fileName);
		bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
		readCSV = new ArrayList<>();
		makeList(bufferedReader);
		this.index = 0;
	}

	public void makeList(BufferedReader bufferedReader) throws IOException {
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] lineContents = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

			readCSV.add(lineContents);
		}
	}
	public String[] nextRead() {
		if(readCSV.size() == index) {
			return null;
		}
		return readCSV.get(index++);
	}
}
