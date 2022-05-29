public class Payments {
    String FIO;
    String type_payment;
    int summ;
    int age;

    public Payments(String FIO, String type_payment, int summ, int age) {
        this.FIO = FIO;
        this.type_payment = type_payment;
        this.summ = summ;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getType_payment() {
        return type_payment;
    }

    public void setType_payment(String type_payment) {
        this.type_payment = type_payment;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "FIO='" + FIO + '\'' +
                ", type_payment='" + type_payment + '\'' +
                ", summ=" + summ +
                ", age=" + age +
                '}';
    }
}

