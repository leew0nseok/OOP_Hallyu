package genre;

import Hallyu.Hallyu;
import Hallyu.KPop;
import Hallyu.KModel;
import datas.KDatas;

public class GenreCategory {
    public final static Hallyu[] hallyus = {
            new Hallyu("kpop", "K-POP", "K-POP�� ���� �����Դϴ�.", KDatas.kpoplist),
            new Hallyu("kmovie", "K-MOVIE", "K-MOVIE�� ���� �����Դϴ�.", KDatas.kmovielist),
            new Hallyu("kactor", "K-ACTOR", "K-ACTOR�� ���� �����Դϴ�.", KDatas.kactorlist),
            new Hallyu("kdrama", "K-DRAMA", "K-DRAMA�� ���� �����Դϴ�.", KDatas.kdramalist),
//            new Hallyu("kfood", "K-FOOD", "K-FOOD�� ���� �����Դϴ�.", KDatas.kfoodlist)
    };
}
