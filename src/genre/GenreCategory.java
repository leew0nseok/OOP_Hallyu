package genre;

import Hallyu.Hallyu;
import Hallyu.KPop;
import Hallyu.KModel;
import datas.KDatas;

public class GenreCategory {
    //한류종목을 모아놓은 배열(참조타입)
    public final static Hallyu[] hallyus = {
            new Hallyu("kpop", "K-POP", "K-POP에 관한 정보입니다.", KDatas.kpoplist),
            new Hallyu("kmovie", "K-MOVIE", "K-MOVIE에 관한 정보입니다.", KDatas.kmovielist),
            new Hallyu("kactor", "K-ACTOR", "K-ACTOR에 관한 정보입니다.", KDatas.kactorlist),
            new Hallyu("kdrama", "K-DRAMA", "K-DRAMA에 관한 정보입니다.", KDatas.kdramalist),
    };
}
