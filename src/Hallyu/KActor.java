package Hallyu;

public class KActor extends KModel{ //KModel 상속(KModel의 자식클래스)
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


    //메소드 오버라이딩
    @Override
    public void print() {
        Gender actorgender = this.getGender();
        System.out.println("선호순위 : " + this.getRank() + "위, 배우 이름: " + this.getName());
        System.out.println("성별 :" + actorgender.sex + ", 나이: "+ this.getAge() + ", 대표작품: " + this.getWork());

    }
}
