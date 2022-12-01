package datas;

import Hallyu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class KDatas{
    //참조타입(배열사용)
    public final static KPop[] kpoplist = {
            new KPop("1", "방탄소년단", "남성그룹", "피 땀 눈물"),
            new KPop("2", "블랙핑크", "여성그룹", "Lovesick Girls"),
            new KPop("3", "아이유", "여성솔로", "좋은날"),
            new KPop("4", "리사", "여성솔로", "MONEY"),
            new KPop("5", "싸이", "남성솔로", "강남스타일"),
            new KPop("5", "트와이스", "여성그룹", "TT")
    };
    public final static KMovie[] kmovielist = {
            new KMovie("1", "기생충", "2019년", "범죄, 스릴러", "2시간 11분 39초"),
            new KMovie("2", "부산행", "2016년", "공포, 스릴러", "1시간 58분 9초"),
            new KMovie("3", "서복", "2019년", "SF, 액션", "1시간 54분"),
            new KMovie("4", "미드나이트", "2021년", "스릴러", "1시간 43분"),
            new KMovie("4", "승리호", "2021년", "SF, 사이버펑크", "2시간 16분"),
            new KMovie("5", "콜", "2020년", "미스터리, 공포", "1시간 52분"),
            new KMovie("5", "싱크홀", "2021년", "코미디, 재난", "1시간 53분")
    };
    public final static KActor[] kactorlist = {
            new KActor("1", "이민호", Gender.MAN, "35세", "꽃보다 남자"),
            new KActor("2", "현빈", Gender.MAN, "40세", "시크릿 가든"),
            new KActor("3", "공유", Gender.MAN, "43세", "도깨비"),
            new KActor("4", "송혜교", Gender.WOMAN, "41세", "태양의 후예"),
            new KActor("5", "송중기", Gender.MAN, "37세", "늑대소년")
    };
    public final static KDrama[] kdramalist = {
            new KDrama("1", "오징어 게임", "2021년", "데스 게임, 서바이벌", "9부작"),
            new KDrama("2", "사랑의 불시착", "2019년", "로맨스, 드라마", "16부작"),
            new KDrama("3", "빈센조", "2021년", "블랙 코미디, 범죄", "20부작"),
            new KDrama("4", "펜트하우스", "2020년", "범죄, 막장 드라마", "21부작"),
            new KDrama("5", "갯마을 차차차", "2021년", "로맨틱 코미디", "16부작"),
            new KDrama("5", "태양의 후예", "2016년", "드라마, 로맨스", "16부작")
    };

}
