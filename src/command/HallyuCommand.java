package command;

import Hallyu.Hallyu;
import Hallyu.KModel;

import java.io.IOException;

//인터페이스 사용
public interface HallyuCommand {
    public Hallyu showMenu(Hallyu[] hallyus);
    public KModel showModel(Hallyu menu);
    public void showInformation(KModel infor);
    }
