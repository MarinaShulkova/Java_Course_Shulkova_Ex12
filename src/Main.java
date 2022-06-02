import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
                    
        List<Payments> payment = setList();

        System.out.println("Filter  sum of buy > 10000");
        payment.stream().filter(e -> e.getSum() > 10000 && e.getType_payment().equals("buy")).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Filter Ivanov");
        payment.stream().filter(e -> e.getFIO().equals("Ivanov")).forEach(System.out::println);
        System.out.println();

        System.out.println("Sort FIO and sum");
        payment.stream().sorted(Comparator.comparing(Payments::getFIO).thenComparing(Payments::getSum)).
                forEach(System.out::println);
        System.out.println();

        System.out.println("Sort sum reversed");
        payment.stream().sorted(Comparator.comparing(Payments::getSum).reversed()).forEach(System.out::println);
        System.out.println();


        System.out.println("Group by payment");
        Map<String, List<Payments>> group_type_payment = payment.stream().sorted(Comparator.comparing(Payments::getSum))
                .collect(Collectors.groupingBy(Payments::getType_payment));
        System.out.println();
        
        group_type_payment.forEach((type_payment, payments) -> {
            System.out.println("Type of payment: " + type_payment);
            payments.forEach(e -> System.out.println(" " + e));
            System.out.println();
        });

        System.out.println("Maximum value sum");
        payment.stream().max(Comparator.comparing(Payments::getSum)).ifPresent(System.out::println);
        System.out.println();

        System.out.println("Are all people adults?");
         if (payment.stream().allMatch(payments -> payments.getAge() >= 18))
             System.out.println("Yes, all people are adults"); else System.out.println("No, somebody is child");
            System.out.println();

             System.out.println("Are there any children here?");
        if (payment.stream().noneMatch(payments -> payments.getAge() >= 18))
            System.out.println("Yes, somebody is child"); else System.out.println("No, all people are adults");

        System.out.println();
            System.out.println("Is there anyone here at the age of 18?");
        if (payment.stream().anyMatch(payments -> payments.getAge() == 18))
            System.out.println("Yes"); else System.out.println("No");


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






