package Hallyu;

public class KDrama extends KMovie{ //KDrama -> KMovie -> KModel ���


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


    //�޼ҵ� �������̵�
    @Override
    public void print() {
        System.out.println("��ȣ���� : " + this.getRank() + "��, ��ȭ ����: " + this.getName());
        System.out.println("�濵�⵵: "+ this.getDetail() + "�帣: " + this.getGenre() + ", ȸ��: " + this.getTime());

    }

}
