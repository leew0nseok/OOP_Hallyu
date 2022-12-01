package Hallyu;

public class KActor extends KModel{
    public String work;
    public String age;

    public KActor(String rank, String name, String detail, String age, String work) {
        super(rank, name, detail);
        this.work = work;
        this.age = age;
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

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("��ȣ���� : " + this.getRank() + ", ��� �̸�: " + this.getName());
        System.out.println("���� :" + this.getDetail() + ", ����: "+ this.getAge() + ", ��ǥ��ǰ: " + this.getWork());

    }
}
