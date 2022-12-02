import Hallyu.Hallyu;
import Hallyu.KModel;
import command.ConsoleCommand;
import genre.GenreCategory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        List<String> khallyu = new ArrayList<>(); //�÷��� �����ӿ�ũ ���
        khallyu.add("K-POP");
        khallyu.add("K-MOVIE");
        khallyu.add("K-ACTOR");
        khallyu.add("K-DRAMA");

        List<String> kinfor = new ArrayList<>();
        kinfor.add("���ѹα��� ��������(������)�� ���ѹα����� ������ �α⸦ ��� ���� ������ ���Ѵ�.");
        kinfor.add("���ѹα����� ���۵� ��ȭ�� ��Ī�ؼ� ���ϴ� ��.");
        kinfor.add("���ѹα��� ��츦 ���Ѵ�.");
        kinfor.add("���ѹα����� ���۵� ��󸶸� ��Ī�ؼ� ���ϴ� ��.");

        System.out.println("--------------------------------------------");
        System.out.println("�ѷ��� ������ �����ּż� �����մϴ�!!");
        System.out.println("\n");


        final ConsoleCommand command = new ConsoleCommand();
        while(true){
            System.out.println("������ �ѷ��� ī�װ��� ���� �����Դϴ�.");
            System.out.println("\n");
            for (int i =0; i < kinfor.size(); i++){
                System.out.println(khallyu.get(i) + ": " + kinfor.get(i));
            }
            Hallyu menu = command.showMenu(GenreCategory.hallyus);
            KModel infor = command.showModel(menu);
            command.showInformation(infor);
       }
    }
}
