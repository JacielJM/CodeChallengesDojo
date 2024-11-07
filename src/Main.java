import com.jacieljm.collections.Person;
import com.jacieljm.solid.lego.Minifigure;
import com.jacieljm.solid.lego.body.Legs;
import com.jacieljm.solid.lego.body.Torso;
import com.jacieljm.solid.lego.extras.AccessoryImpl;
import com.jacieljm.solid.lego.head.Hair;
import com.jacieljm.solid.lego.head.Hat;
import com.jacieljm.solid.lego.head.Head;
import com.jacieljm.solid.notifications.NotificationMedium;
import com.jacieljm.solid.notifications.NotificationService;
import com.jacieljm.solid.savings.BankService;
import com.jacieljm.solid.loan.LoanService;
import com.jacieljm.solid.loan.LoanTypes;
import com.jacieljm.solid.PassbookService;
import com.jacieljm.solid.shoppingmall.GreenDebitCard;
import com.jacieljm.solid.shoppingmall.PaymentMethod;
import com.jacieljm.solid.shoppingmall.ShoppingMall;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.jacieljm.collections.ParenthesesValidator.isValidChain;
import static com.jacieljm.collections.Person.groupByAge;
import static com.jacieljm.collections.Person.removeDuplicates;
import static com.jacieljm.lambdas.PrimeValidator.isPrime;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(2.5);
        System.out.println(circle.getArea());

        Diamond diamond = new Diamond(2.5, 3);
        System.out.println(diamond.getArea());

        Triangle triangle = new Triangle(3, 10);
        System.out.println(triangle.getArea());

        Rectangle rectangle = new Rectangle(4.5, 2.7);
        System.out.println(rectangle.getArea());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setBaseLength(2.3);
        rectangle1.setHeightLength(2);
        rectangle1.getArea();

        BankService bankService = new BankService();
        System.out.println("\n--> Bank Service -> Deposit");
        System.out.println(bankService.deposit(200,"123456789L"));
        System.out.println("\n--> Bank Service -> Withdrawal");
        System.out.println(bankService.withdraw(100,"123456789L"));

        LoanService loanService = new LoanService();
        System.out.println("\n--> Bank Service -> Auto Loan interest info");
        System.out.println(loanService.getInterestInfo("123456789L", LoanTypes.autoLoan));
        System.out.println("\n--> Bank Service -> Home Loan interest info");
        System.out.println(loanService.getInterestInfo("abcdefghL", LoanTypes.homeLoan));
        System.out.println("\n--> Bank Service -> Personal Loan interest info");
        System.out.println(loanService.getInterestInfo("zxcvbnmL", LoanTypes.personalLoan));

        PassbookService passbookService = new PassbookService();
        passbookService.printPassbook();

        NotificationService notificationService = new NotificationService();
        System.out.println(notificationService.sendOTP(NotificationMedium.email));
        System.out.println(notificationService.sendOTP(NotificationMedium.sms));
        System.out.println(notificationService.sendOTP(NotificationMedium.push));

        PaymentMethod debitCard = new GreenDebitCard();

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);

        shoppingMall.doPayment("something", 300);

        // Lego
        System.out.println("\nLego");
        Head head = new Head("Angry");
        Torso torso = new Torso("Red");
        Legs legs = new Legs("Black");

        Minifigure basicLego = new Minifigure
                .MinifigureBuilder(head,torso,legs)
                .withHair(new Hair("Yellow"))
                .build();

        System.out.println(basicLego.printDescription());
        basicLego.addAccesories(new AccessoryImpl("Laptop"));
        System.out.println(basicLego.printDescription());

        Minifigure expensiveLego = new Minifigure
                .MinifigureBuilder(new Head("Happy"), new Torso("Black"), new Legs("White"))
                .withHat(new Hat("Brown", "Cowboy Hat"))
                .withAccessories(List.of(new AccessoryImpl("Whiplash")))
                .build();

        System.out.println(expensiveLego.printDescription());

        // Collections 1
        System.out.println("\nCollections 1");
        List<Person> persons = List.of(
                new Person("Uziel", "15/11/1987"),
                new Person("Uziel", "15/11/1987"),
                new Person("Cesar", "28/09/1985"),
                new Person("Julio", "03/04/1979")
        );

        Set<Person> uniquePersons = removeDuplicates(persons);
        System.out.println(uniquePersons);

        // Collections 2
        System.out.println("\nCollections 2\n");
        System.out.println(isValidChain("()")); // true
        System.out.println(isValidChain("()[]{}")); // true
        System.out.println(isValidChain("(]")); // false
        System.out.println(isValidChain("([)]")); // false
        System.out.println(isValidChain("{[]}")); // true

        // Collections 3
        System.out.println("\nCollections 3\n");
        List<Person> personsWithAge = List.of(
                new Person("Juan", 30),
                new Person("Alicia", 22),
                new Person("John", 25),
                new Person("Tom", 30)
        );

        Map<Integer, Set<String>> result = groupByAge(personsWithAge);
        System.out.println(result);

        // Lambdas 1
        System.out.println("\nLambdas 1\n");
        System.out.println(isPrime.test(5));  // true
        System.out.println(isPrime.test(10)); // false
        System.out.println(isPrime.test(13)); // true
        System.out.println(isPrime.test(1));  // false

        // Lambdas 2
        System.out.println("\nLambdas 2\n");
    }
}