package command;

import Hallyu.Hallyu;
import Hallyu.KPop;
import Hallyu.KModel;
import datas.KDatas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ConsoleCommand implements HallyuCommand{
    public Hallyu showMenu(Hallyu[] hallyus) {
        try {        //����ó��
            System.out.println("Hallyu�� ���� �����Դϴ�.");
            System.out.println("----------------------");
            System.out.println("�ñ��Ͻ� ī�װ��� �����ϼ���.");

            for (int i = 0; i < hallyus.length; i++) {
                System.out.printf("(%d) %s ", i + 1, hallyus[i].getName());
            }
            System.out.println("(-1) ���α׷� ����");
            System.out.println();
            System.out.print("��ȸ �� ī�װ� : ");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(in.readLine());

            System.out.println("\n\n\n\n\n");
            if (input >= 1 && input <= hallyus.length) {
                return hallyus[input - 1];
            }
            else if(input == -1){
                System.exit(0);
                return hallyus[0];
            }
            else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("��ȸ ������ ī�װ��� �ƴմϴ�.");
            return showMenu(hallyus);
        }
    }

    public KModel showModel(Hallyu menu) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.printf("%s%n", menu.getDetail());
        System.out.println("----------------------");

        String id = menu.getId();
        switch (id) {
            case "kpop":
                System.out.println("��ȣ ������� ��Ÿ�� �ڷ��Դϴ�.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "��, ���� �̸�: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("�ñ��Ͻ� �׷��� �����ϼ���(�׷��̸� �� ��ȣ �� ���� �Է�)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
            case "kmovie":
                System.out.println("��ȣ ������� ��Ÿ�� �ڷ��Դϴ�.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "��, ��ȭ ����: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("�ñ��Ͻ� ��ȭ�� �����ϼ���(���� ��ȣ �� ���� �Է�)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
            case "kactor":
                System.out.println("��ȣ ������� ��Ÿ�� �ڷ��Դϴ�.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "��, ��� �̸�: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("�ñ��Ͻ� ��츦 �����ϼ���(�̸��� ��ȣ �� ���� �Է�)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
            case "kdrama":
                System.out.println("��ȣ ������� ��Ÿ�� �ڷ��Դϴ�.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "��, ��� ����: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("�ñ��Ͻ� ��󸶸� �����ϼ���(���� ��ȣ �� ���� �Է�)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
//            case "kfood":
//                return 5;
//        }
        }
            return menu.getDatas()[0];

    }

    public void showInformation(KModel infor){
        System.out.println("\n\n\n\n");
        System.out.println(infor.getName()+"�� ���� �����Դϴ�.");
        System.out.println("----------------------");
        infor.print();
        System.out.println("----------------------");
        System.out.println("\n\n\n\n");

    }

}
