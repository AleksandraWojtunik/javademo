public class OperatoryLogiczne {

    public static void main(String[] args) {

        int numOne = 1;
        int numTwo = 2;

        // || - lub
        System.out.println(numOne > numTwo || numOne == 1); // falsz || prawda -> prawda
        System.out.println(numOne > numTwo || numOne != 1); // falsz || falsz -> falsz
        System.out.println(numOne < numTwo || numOne != 1); // prawda || nie jest sprawdzana -> prawda
        System.out.println(numOne < numTwo || numOne == 1); // prawda || prawda -> prawda

        // && - i
        System.out.println(numOne < numTwo && numOne == 1); // prawda i prawda -> prawda
        System.out.println(numOne > numTwo && numOne == 1); // falsz i prawda -> falsz
        System.out.println(numOne > numTwo && numOne != 1); // falsz i falsz -> falsz
        System.out.println(numOne < numTwo && numOne != 1); // prawda i falsz -> falsz


    }
}
