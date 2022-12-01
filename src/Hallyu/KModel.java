package Hallyu;

public class KModel implements PrintDatas{
    public String name; //이름(가수, 배우, 영화, 드라마, 음식)
    public String detail; //정보(성별, 성별, 개봉일, 몇부작, 종류)
    public String rank; //선호 순위

    public KModel(String rank, String name, String detail) {
        this.rank = rank;
        this.name = name;
        this.detail = detail;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void print() {
        System.out.println(this.getName() + this.getRank() + this.getDetail());
    }
}
