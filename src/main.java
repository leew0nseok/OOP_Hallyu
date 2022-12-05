import Hallyu.Hallyu;
import Hallyu.KModel;
import command.ConsoleCommand;
import genre.GenreCategory;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        Map<String, String> khallyu = new HashMap<>(); //�÷��� �����ӿ�ũ ���
        khallyu.put("K-POP", "���ѹα��� ��������(������)�� ���ѹα����� ������ �α⸦ ��� ���� ������ ���Ѵ�.");
        khallyu.put("K-MOVIE", "���ѹα����� ���۵� ��ȭ�� ��Ī�ؼ� ���ϴ� ��.");
        khallyu.put("K-ACTOR", "���ѹα��� ��츦 ���Ѵ�.");
        khallyu.put("K-DRAMA", "���ѹα����� ���۵� ��󸶸� ��Ī�ؼ� ���ϴ� ��.");

        List<String> kinfor = new ArrayList<>(khallyu.keySet()); //Map�� ��� Key�� ��Ƽ� Set�ڷ������� ����

        String path = System.getProperty("user.dir") + "\\src\\"; // ���� working dir���� �������� src ��� �߰�
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path +"text.txt"),"utf-8"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // �� �̻� ���� ������ ���� ��� while ���� ����������.
            System.out.println(line);
        }
        br.close();
        /* �Ʒ� �ڵ� �� ���� ���� ��������� ���
        System.out.println("--------------------------------------------");
        System.out.println("�ѷ��� ������ �����ּż� �����մϴ�!!");
        */
        System.out.println("\n");


        final ConsoleCommand command = new ConsoleCommand(); //��ɾ� Ŭ����
        while(true){
            System.out.println("������ �ѷ��� ī�װ��� ���� �����Դϴ�.");
            System.out.println("\n");
            //K-POP, K-MOVIE, K-ACTOR, K-DRAMA�� ���� ����
            for (int i =0; i < kinfor.size(); i++){
                System.out.println(kinfor.get(i) + ": " + khallyu.get(kinfor.get(i)));
            }
            Hallyu menu = command.showMenu(GenreCategory.hallyus); //GenreCategoryŬ������ �ִ� �迭 hallyus�� �Ű������� ����
            KModel infor = command.showModel(menu);
            command.showInformation(infor);
       }


    }
}
