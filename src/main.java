import Hallyu.Hallyu;
import Hallyu.KModel;
import command.ConsoleCommand;
import genre.GenreCategory;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("�ѷ��� ������ �����ּż� �����մϴ�!!");
        final ConsoleCommand command = new ConsoleCommand();
        while(true){
            Hallyu menu = command.showMenu(GenreCategory.hallyus);
            KModel infor = command.showModel(menu);
            command.showInformation(infor);
       }
    }
}
