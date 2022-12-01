package Hallyu;

public class KDrama extends KMovie{ //KDrama -> KMovie -> KModel 상속

    public KDrama(String rank, String name, String detail, String genre, String time) {
        super(rank, name, detail, genre, time);
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void print() {
        System.out.println("선호순위 : " + this.getRank() + ", 영화 제목: " + this.getName());
        System.out.println("방영년도: "+ this.getDetail() + "장르: " + this.getGenre() + ", 회차: " + this.getTime());

    }

}
