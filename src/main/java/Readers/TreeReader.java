package Readers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TreeReader {
	public List<String> trees;
	// int currentBadge;

	public TreeReader(String dataFile) {
		trees = new ArrayList<String>();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)));

			String str;
			while ((str = br.readLine()) != null) {
				trees.add(str);
			}

			br.close();
		}catch (Exception e) {}
	}
}