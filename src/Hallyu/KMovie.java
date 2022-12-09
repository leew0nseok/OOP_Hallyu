package Hallyu;

public class KMovie extends KModel{ //KModel 상속(KModel의 자식클래스)
    public String genre;
    public String time;

    public KMovie(String rank, String name, String detail, String genre, String time) {
        super(rank, name, detail);
        this.genre = genre;
        this.time = time;
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

    //메소드 오버라이딩
    @Override
    public void print() {
        System.out.println("선호순위 : " + this.getRank() + "위, 영화 제목: " + this.getName());
        System.out.println("개봉년도: "+ this.getDetail() + "장르: " + this.getGenre() + ", 러닝타임: " + this.getTime());

    }
}
