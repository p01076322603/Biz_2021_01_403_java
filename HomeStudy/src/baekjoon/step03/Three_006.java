package baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Three_006 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int T = Integer.parseInt(br.readLine());
			
			while (T > 0) {
				bw.write(String.valueOf(T) + "\n");
				--T;
			}
			
			bw.flush();
			
			br.close();
			bw.close();

		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
