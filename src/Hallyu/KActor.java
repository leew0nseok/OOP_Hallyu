package Hallyu;

public class KActor extends KModel{ //KModel ���(KModel�� �ڽ�Ŭ����)
    public String work;
    public String age;
    public Gender gender;

    public KActor(String rank, String name, Gender gender, String age, String work) {
        super(rank, name);
        this.gender = gender;
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
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    //�޼ҵ� �������̵�
    @Override
    public void print() {
        Gender actorgender = this.getGender();
        System.out.println("��ȣ���� : " + this.getRank() + "��, ��� �̸�: " + this.getName());
        System.out.println("���� :" + actorgender.sex + ", ����: "+ this.getAge() + ", ��ǥ��ǰ: " + this.getWork());

    }
}
