package Hallyu;

public class KPop extends KModel{ //KModel 상속(KModel의 자식클래스)
    public String song;

    public KPop(String rank, String name, String detail, String song) {
        super(rank, name, detail);
        this.song = song;
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

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    //메소드 오버라이딩
    @Override
    public void print() {
        System.out.println("선호순위 : " + this.getRank() + "위, 그룹 이름: " + this.getName());
        System.out.println("그룹 구성: " + this.getDetail() + ", 대표곡: " + this.getSong());

    }
}
