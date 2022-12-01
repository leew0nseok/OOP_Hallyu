import Hallyu.Hallyu;
import Hallyu.KModel;
import command.ConsoleCommand;
import genre.GenreCategory;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("한류에 관심을 가져주셔서 감사합니다!!");
        final ConsoleCommand command = new ConsoleCommand();
        while(true){
            Hallyu menu = command.showMenu(GenreCategory.hallyus);
            KModel infor = command.showModel(menu);
            command.showInformation(infor);
       }
    }
}
