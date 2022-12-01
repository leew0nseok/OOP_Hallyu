package command;

import Hallyu.Hallyu;
import Hallyu.KModel;

import java.io.IOException;

public interface HallyuCommand {
    public Hallyu showMenu(Hallyu[] hallyus);
    public KModel showModel(Hallyu menu) throws IOException;
    public void showInformation(KModel infor);
    }
