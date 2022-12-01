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
        try {        //예외처리
            System.out.println("Hallyu에 관한 정보입니다.");
            System.out.println("----------------------");
            System.out.println("궁금하신 카테고리를 선택하세요.");

            for (int i = 0; i < hallyus.length; i++) {
                System.out.printf("(%d) %s ", i + 1, hallyus[i].getName());
            }
            System.out.println("(-1) 프로그램 종료");
            System.out.println();
            System.out.print("조회 할 카테고리 : ");

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
            System.out.println("조회 가능한 카테고리가 아닙니다.");
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
                System.out.println("선호 순서대로 나타낸 자료입니다.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "위, 가수 이름: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("궁금하신 그룹을 선택하세요(그룹이름 옆 괄호 안 숫자 입력)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
            case "kmovie":
                System.out.println("선호 순서대로 나타낸 자료입니다.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "위, 영화 제목: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("궁금하신 영화를 선택하세요(제목옆 괄호 안 숫자 입력)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
            case "kactor":
                System.out.println("선호 순서대로 나타낸 자료입니다.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "위, 배우 이름: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("궁금하신 배우를 선택하세요(이름옆 괄호 안 숫자 입력)");
                num = scanner.nextInt();
                return menu.getDatas()[num - 1];
            case "kdrama":
                System.out.println("선호 순서대로 나타낸 자료입니다.");
                for (int i = 0; i < menu.getDatas().length; i++) {
                    System.out.printf(menu.getDatas()[i].getRank() + "위, 드라마 제목: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                    System.out.println();
                }
                System.out.println("----------------------");
                System.out.println("궁금하신 드라마를 선택하세요(제목옆 괄호 안 숫자 입력)");
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
        System.out.println(infor.getName()+"에 관한 정보입니다.");
        System.out.println("----------------------");
        infor.print();
        System.out.println("----------------------");
        System.out.println("\n\n\n\n");

    }

}
