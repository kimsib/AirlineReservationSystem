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
		System.out.println(" 1. Ȩ���������� �̸� �¼��� ������ �� �ֳ���?\n " + "2. ���� ��� ��û, ����, ������ ��� �ؾ� �ϳ���?\n "
				+ "3. Ȩ���������� ���� ���ϸ����� �ջ��ϴ� ����� �˰� �;��\n " + "4. Ȩ���������� �¼� ������ ��𿡼� �� �� �ֳ���?\n "
				+ "5. ��ī���н� ���ϸ����� ����ϸ� � ���񽺳� ��ǰ�� �̿��� �� �ֳ���?\n " + "6. 1:1�����ϱ�");

		Scanner sk = new Scanner(System.in);

		System.out.println();
		System.out.print("������ �������ּ���> ");
		num = sk.nextInt();
		switch (num) {

		case 1:

			System.out.println("1. Ȩ���������� �̸� �¼��� ������ �� �ֳ���?");
			System.out.println("��, �����մϴ�.");
			break;
		case 2:
			System.out.println("2. ���� ��� ��û, ����, ������ ��� �ؾ� �ϳ���?");
			System.out.println("��, �����մϴ�.");
			break;
		case 3:
			System.out.println("3. Ȩ���������� ���� ���ϸ����� �ջ��ϴ� ����� �˰� �;��.");
			System.out.println("��, �����մϴ�.");
			break;
		case 4:
			System.out.println("4. Ȩ���������� �¼� ������ ��𿡼� �� �� �ֳ���?");
			System.out.println("��, �����մϴ�.");
			break;
		case 5:
			System.out.println("5. ��ī���н� ���ϸ����� ����ϸ� � ���񽺳� ��ǰ�� �̿��� �� �ֳ���?");
			System.out.println("��, �����մϴ�.");
			break;
		case 6:

			System.out.println("������ �Է��ϼ���:");
		
			
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
				System.out.println("����¿���");
			}

			sk.close();

		}

//			String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
//			
//			
//			
//			System.out.println("���� ");
//			String file = null;
//			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//			bw.write("������ �Է��ϼ��� : " + s); bw.newLine();
//			bw.close();
//			} catch (IOException e) {}
//			break;
//			
//			default:
//				System.out.println("�߸� �����ϼ̽��ϴ�");

	}


	public static void main(String[] args) throws IOException {

		customercenter();

	}
}
