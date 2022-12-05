package command;

import Hallyu.Hallyu;
import Hallyu.KPop;
import Hallyu.KModel;
import datas.KDatas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ConsoleCommand implements HallyuCommand{
    public Hallyu showMenu(Hallyu[] hallyus) {
        try {//예외처리 사용

//            System.out.println("Hallyu에 관한 정보입니다.");
            System.out.println("--------------------------------------------");
            System.out.println("설명을 보고 궁금하신 카테고리를 선택하세요.");

            for (int i = 0; i < hallyus.length; i++) {
                System.out.printf("(%d) %s ", i + 1, hallyus[i].getName());
            }
            System.out.println("(-1) 프로그램 종료");
            System.out.println();
            System.out.print("조회 할 카테고리 : ");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(in.readLine());

            System.out.println("\n\n\n");
            if (input >= 1 && input <= hallyus.length) {
                return hallyus[input - 1];
            }
            else if(input == -1){
                String path = System.getProperty("user.dir") + "\\src\\"; // 현재 working dir까지 가져오고 src 경로 추가
                Writer writer = new FileWriter(path + "complain.txt"); //complain.txt 파일에 건의사항 출력
                Scanner scanner = new Scanner(System.in);
                System.out.println("프로그램을 종료하셨습니다.");
                System.out.println("프로그램에 대한 좋은 건의사항 있으시면 적어주시면 감사하겠습니다. (없을 시 아무 문자 입력)");

                String str = scanner.nextLine(); //건의사항 내용
                writer.write(str);

                writer.flush();
                writer.close();


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

    public KModel showModel(Hallyu menu) {
        try{
            Scanner scanner = new Scanner(System.in);
            int num = 0;
            System.out.printf("%s%n", menu.getDetail());
            System.out.println("--------------------------------------------");

            String id = menu.getId();
            switch (id) {
                case "kpop":
                    System.out.println("선호 순서대로 나타낸 자료입니다.");
                    for (int i = 0; i < menu.getDatas().length; i++) {
                        System.out.printf(menu.getDatas()[i].getRank() + "(위) 가수 이름: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("궁금하신 그룹을 선택하세요(그룹이름 옆 괄호 안 숫자 입력)");
                    num = scanner.nextInt();
                    return menu.getDatas()[num - 1];
                case "kmovie":
                    System.out.println("선호 순서대로 나타낸 자료입니다.");
                    for (int i = 0; i < menu.getDatas().length; i++) {
                        System.out.printf(menu.getDatas()[i].getRank() + "(위) 영화 제목: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("궁금하신 영화를 선택하세요(제목 옆 괄호 안 숫자 입력)");
                    num = scanner.nextInt();
                    return menu.getDatas()[num - 1];
                case "kactor":
                    System.out.println("선호 순서대로 나타낸 자료입니다.");
                    for (int i = 0; i < menu.getDatas().length; i++) {
                        System.out.printf(menu.getDatas()[i].getRank() + "(위) 배우 이름: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("궁금하신 배우를 선택하세요(이름 옆 괄호 안 숫자 입력)");
                    num = scanner.nextInt();
                    return menu.getDatas()[num - 1];
                case "kdrama":
                    System.out.println("선호 순서대로 나타낸 자료입니다.");
                    for (int i = 0; i < menu.getDatas().length; i++) {
                        System.out.printf(menu.getDatas()[i].getRank() + "(위) 드라마 제목: " + menu.getDatas()[i].getName() + "(" + Integer.toString(i + 1) + ")");
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("궁금하신 드라마를 선택하세요(제목 옆 괄호 안 숫자 입력)");
                    num = scanner.nextInt();
                    if(num >= 1 && num <= menu.getDatas().length) {
                        return menu.getDatas()[num - 1];
                    } else{
                        throw new IndexOutOfBoundsException();
                    }
    //            case "kfood":
    //                return 5;
            }
        } catch (Exception e){
            System.out.println("조회 가능한 항목이 아닙니다.");
            return showModel(menu);
        }
            return menu.getDatas()[0];

    }

    public void showInformation(KModel infor){
        System.out.println("\n\n");
        System.out.println(infor.getName()+"에 관한 정보입니다.");
        System.out.println("--------------------------------------------");
        infor.print();
        System.out.println("--------------------------------------------");
        System.out.println("\n\n");

    }

}
