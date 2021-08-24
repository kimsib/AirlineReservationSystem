package Wilderness;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class customer {

	static void customercenter() throws IOException {
		int num = 0;
		System.out.println(" 1. 홈페이지에서 미리 좌석을 선택할 수 있나요?\n " + "2. 가족 등록 신청, 변경, 삭제는 어떻게 해야 하나요?\n "
				+ "3. 홈페이지에서 가족 마일리지를 합산하는 방법을 알고 싶어요\n " + "4. 홈페이지에서 좌석 선택은 어디에서 할 수 있나요?\n "
				+ "5. 스카이패스 마일리지를 사용하면 어떤 서비스나 상품을 이용할 수 있나요?\n " + "6. 1:1문의하기");

		Scanner sk = new Scanner(System.in);

		System.out.println();
		System.out.print("질문을 선택해주세요> ");
		num = sk.nextInt();
		switch (num) {

		case 1:

			System.out.println("1. 홈페이지에서 미리 좌석을 선택할 수 있나요?");
			System.out.println("네, 가능합니다.");
			break;
		case 2:
			System.out.println("2. 가족 등록 신청, 변경, 삭제는 어떻게 해야 하나요?");
			System.out.println("네, 가능합니다.");
			break;
		case 3:
			System.out.println("3. 홈페이지에서 가족 마일리지를 합산하는 방법을 알고 싶어요.");
			System.out.println("네, 가능합니다.");
			break;
		case 4:
			System.out.println("4. 홈페이지에서 좌석 선택은 어디에서 할 수 있나요?");
			System.out.println("네, 가능합니다.");
			break;
		case 5:
			System.out.println("5. 스카이패스 마일리지를 사용하면 어떤 서비스나 상품을 이용할 수 있나요?");
			System.out.println("네, 가능합니다.");
			break;
		case 6:

			System.out.println("내용을 입력하세요:");
		
			
			FileWriter fout = null;
			try {
				fout = new FileWriter("c:\\Temp\\test.txt");
				while (true) {
					String line = sk.nextLine();
					if (line.length() == 0)
						break;
					fout.write(line, 0, line.length());
					fout.write("\r\n", 0, 2);
				}
				fout.close();
			} catch (IOException e) {
				System.out.println("입출력오류");
			}

			sk.close();

		}

//			String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
//			
//			
//			
//			System.out.println("저장 ");
//			String file = null;
//			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//			bw.write("내용을 입력하세요 : " + s); bw.newLine();
//			bw.close();
//			} catch (IOException e) {}
//			break;
//			
//			default:
//				System.out.println("잘못 선택하셨습니다");

	}


	public static void main(String[] args) throws IOException {

		customercenter();

	}
}
