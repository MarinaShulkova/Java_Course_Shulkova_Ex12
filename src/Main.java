import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
                    
        List<Payments> payment = setList();
        System.out.println("Filter");
        payment.stream().filter(e -> e.getSumm() > 10000 && e.getType_payment().equals("buy")).
                forEach(System.out::println);
        System.out.println("Filter Ivanov");
        payment.stream().filter(e -> e.getFIO().equals("Ivanov")).forEach(System.out::println);
        System.out.println("Sort");
        payment.stream().sorted(Comparator.comparing(Payments::getFIO).thenComparing(Payments::getSumm)).
                forEach(System.out::println);
        System.out.println("Sort reversed");
        payment.stream().sorted(Comparator.comparing(Payments::getSumm).reversed()).forEach(System.out::println);
        System.out.println();

        Map<String, List<Payments>> group_type_payment = payment.stream().sorted(Comparator.comparing(Payments::getSumm)).collect(Collectors.groupingBy(Payments::getType_payment));
        
        group_type_payment.forEach((type_payment, payments) -> {
            System.out.println("Type of payment: " + type_payment);
            payments.forEach(e -> System.out.println(" " + e));
            System.out.println();
        });

    }

    private static List<Payments> setList() {
        return Arrays.asList(new Payments("Ivanov","buy", 30000, 30),
                new Payments("Ivanov", "credit", 10000, 30),
                new Payments("Petrov", "buy", 5000, 35),
                new Payments("Sidorov", "buy", 60000, 18),
                new Payments("Shulkov", "buy", 15000, 25),
                new Payments("Kazakov", "buy", 10000, 45),
                new Payments("Kazakov", "credit", 20000, 45));
    }
}






