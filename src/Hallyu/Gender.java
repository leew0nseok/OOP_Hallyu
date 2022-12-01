package Hallyu;
//열거 타입
public enum Gender {

    MAN(0, "남성"),
    WOMAN(1, "여성"),
    BOY(2, "소년"),
    GIRL(3, "소녀");

    private int id;
    public String sex;

    Gender(int id, String sex) {
        this.id = id;
        this.sex = sex;
    }
}
