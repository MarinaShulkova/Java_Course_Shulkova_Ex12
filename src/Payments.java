public class Payments {
    String FIO;
    String type_payment;
    int sum;
    int age;

    public Payments(String FIO, String type_payment, int sum, int age) {
        this.FIO = FIO;
        this.type_payment = type_payment;
        this.sum = sum;
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

    public int getSum() {
        return sum;
    }

    public void setSumm(int sum) {
        this.sum = sum;
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
                ", sum=" + sum +
                ", age=" + age +
                '}';
    }
}

