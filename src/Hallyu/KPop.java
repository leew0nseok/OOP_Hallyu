package Hallyu;

public class KPop extends KModel{
    public String song;
    public final static KPop[] kpoplist = {
            new KPop("1", "방탄소년단", "남성그룹", "피 땀 눈물"),
            new KPop("2", "블랙핑크", "여성그룹", "Lovesick Girls"),
            new KPop("3", "아이유", "여성솔로", "좋은날"),
            new KPop("4", "리사", "여성솔로", "MONEY"),
            new KPop("5", "싸이", "남성솔로", "강남스타일"),
            new KPop("5", "트와이스", "여성그룹", "TT")
    };

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
    @Override
    public void print() {
        System.out.println("선호순위 : " + this.getRank() + ", 그룹 이름: " + this.getName());
        System.out.println("그룹 구성: " + this.getDetail() + ", 대표곡: " + this.getSong());

    }
}
