package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {

	public static void main(String[] args) {

		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";

		// 파일을 읽을 때 사용하는 클래스 FileReader 
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {

			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

/*			// fileReader를 사용한 low level 출력 코드			
				while (true) {
					int ascii = fileReader.read();
					if (ascii == -1) {
						break;
					}
					System.out.printf("%c", ascii);
				}
*/

			/* BufferedReader를 이용해 파일로부터 한줄씩 입력받아
			 * strLines 리스트에 한줄씩 넣기 */
			while (true) {

				String str = buffer.readLine();
				if (str == null) {
					break;
				}
				// System.out.println(str);
				strLines.add(str);
			}
			buffer.close();
			fileReader.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String str : strLines) {
			
			String[] nums = str.split(":");
			
			System.out.printf("첫번째 숫자 : %s\n", nums[0]);
			System.out.printf("두번째 숫자 : %s\n", nums[1]);
			System.out.printf("세번째 숫자 : %s\n", nums[2]);
			System.out.printf("네번째 숫자 : %s\n", nums[3]);
			System.out.printf("다섯번째 숫자 : %s\n", nums[4]);
			
			System.out.println(Values.sLine);
			
			int sum  = Integer.valueOf(nums[0]);
				sum += Integer.valueOf(nums[1]);
				sum += Integer.valueOf(nums[2]);
				sum += Integer.valueOf(nums[3]);
				sum += Integer.valueOf(nums[4]);
				System.out.println("합계 : " + sum);
				
				System.out.println(Values.dLine);
		}
	}
}