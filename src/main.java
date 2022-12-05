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
        Map<String, String> khallyu = new HashMap<>(); //컬렉션 프레임워크 사용
        khallyu.put("K-POP", "대한민국의 대중음악(케이팝)은 대한민국에서 대중적 인기를 얻는 유행 음악을 말한다.");
        khallyu.put("K-MOVIE", "대한민국에서 제작된 영화를 총칭해서 말하는 말.");
        khallyu.put("K-ACTOR", "대한민국의 배우를 말한다.");
        khallyu.put("K-DRAMA", "대한민국에서 제작된 드라마를 총칭해서 말하는 말.");

        List<String> kinfor = new ArrayList<>(khallyu.keySet()); //Map의 모든 Key를 모아서 Set자료형으로 리턴

        String path = System.getProperty("user.dir") + "\\src\\"; // 현재 working dir까지 가져오고 src 경로 추가
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path +"text.txt"),"utf-8"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
        /* 아래 코드 두 줄은 파일 입출력으로 출력
        System.out.println("--------------------------------------------");
        System.out.println("한류에 관심을 가져주셔서 감사합니다!!");
        */
        System.out.println("\n");


        final ConsoleCommand command = new ConsoleCommand(); //명령어 클래스
        while(true){
            System.out.println("다음은 한류의 카테고리에 관한 설명입니다.");
            System.out.println("\n");
            //K-POP, K-MOVIE, K-ACTOR, K-DRAMA에 대한 설명
            for (int i =0; i < kinfor.size(); i++){
                System.out.println(kinfor.get(i) + ": " + khallyu.get(kinfor.get(i)));
            }
            Hallyu menu = command.showMenu(GenreCategory.hallyus); //GenreCategory클래스에 있는 배열 hallyus를 매개변수로 전달
            KModel infor = command.showModel(menu);
            command.showInformation(infor);
       }


    }
}
