package baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Three_005 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int T = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < T; i++) {
				bw.write(String.valueOf(i + 1));
				bw.newLine();
			}
			
			bw.flush();
			
			br.close();
			bw.close();

		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
