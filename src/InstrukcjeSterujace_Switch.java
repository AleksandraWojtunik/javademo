public class InstrukcjeSterujace_Switch {

    public static void main(String[] args) {

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "nowaStrona";

        switch (page){
            case "Home":
                System.out.println("Przełączam się do strony Home");
                break;
            case "Login":
                System.out.println("Przełączam się do strony Login");
                break;
            case "Contact":
                System.out.println("Przełączam się do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }


    }
}
