package Hallyu;
//���� Ÿ��
public enum Gender {

    MAN(0, "����"),
    WOMAN(1, "����"),
    //�ƿ���쳪 ���� � ������ ���� ��� ���
    BOY(2, "�ҳ�"),
    GIRL(3, "�ҳ�");

    private int id;
    public String sex;

    Gender(int id, String sex) {
        this.id = id;
        this.sex = sex;
    }
}
