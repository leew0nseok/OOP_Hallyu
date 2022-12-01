package genre;

import Hallyu.Hallyu;
import Hallyu.KPop;
import Hallyu.KModel;
import datas.KDatas;

public class GenreCategory {
    public final static Hallyu[] hallyus = {
            new Hallyu("kpop", "K-POP", "K-POP에 관한 정보입니다.", KDatas.kpoplist),
            new Hallyu("kmovie", "K-MOVIE", "K-MOVIE에 관한 정보입니다.", KDatas.kmovielist),
            new Hallyu("kactor", "K-ACTOR", "K-ACTOR에 관한 정보입니다.", KDatas.kactorlist),
            new Hallyu("kdrama", "K-DRAMA", "K-DRAMA에 관한 정보입니다.", KDatas.kdramalist),
//            new Hallyu("kfood", "K-FOOD", "K-FOOD에 관한 정보입니다.", KDatas.kfoodlist)
    };
}
