package Hallyu;

public class KModel implements PrintDatas{
    public String name; //�̸�(����, ���, ��ȭ, ���, ����)
    public String detail; //����(����, ����, ������, �����, ����)
    public String rank; //��ȣ ����

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
