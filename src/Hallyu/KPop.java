package Hallyu;

public class KPop extends KModel{ //KModel ���(KModel�� �ڽ�Ŭ����)
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

    //�޼ҵ� �������̵�
    @Override
    public void print() {
        System.out.println("��ȣ���� : " + this.getRank() + "��, �׷� �̸�: " + this.getName());
        System.out.println("�׷� ����: " + this.getDetail() + ", ��ǥ��: " + this.getSong());

    }
}
