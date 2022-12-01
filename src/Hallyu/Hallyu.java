package Hallyu;

import datas.KDatas;

import java.util.List;

public class Hallyu {
    private String name;
    private String detail;
    private String id;
    private KModel[] datas;

    public Hallyu(String id, String name, String detail, KModel[] datas) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.datas = datas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KModel[] getDatas() {
        return datas;
    }
}
