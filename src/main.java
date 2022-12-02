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
        List<String> khallyu = new ArrayList<>(); //컬렉션 프레임워크 사용
        khallyu.add("K-POP");
        khallyu.add("K-MOVIE");
        khallyu.add("K-ACTOR");
        khallyu.add("K-DRAMA");

        List<String> kinfor = new ArrayList<>();
        kinfor.add("대한민국의 대중음악(케이팝)은 대한민국에서 대중적 인기를 얻는 유행 음악을 말한다.");
        kinfor.add("대한민국에서 제작된 영화를 총칭해서 말하는 말.");
        kinfor.add("대한민국의 배우를 말한다.");
        kinfor.add("대한민국에서 제작된 드라마를 총칭해서 말하는 말.");

        System.out.println("--------------------------------------------");
        System.out.println("한류에 관심을 가져주셔서 감사합니다!!");
        System.out.println("\n");


        final ConsoleCommand command = new ConsoleCommand();
        while(true){
            System.out.println("다음은 한류의 카테고리에 관한 설명입니다.");
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
