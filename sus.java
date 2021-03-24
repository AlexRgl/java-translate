import java.util.Scanner;

public class sus {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia da semana:");
        String dia = sc.nextLine();
        switch (dia.toLowerCase()) {
        case "segunda":
            System.out.println("Monday");
            break;
        case "terca":
            System.out.println("Tuesday");
            break;
        case "quarta":
            System.out.println("Wednesday");
            break;
        case "quinta":
            System.out.println("Thursday");
            break;
        case "sexta":
            System.out.println("Friday");
            break;
        case "sabado":
            System.out.println("Saturday");
            break;
        case "domingo":
            System.out.println("Sunday");
            break;
        case "monday":
            System.out.println("segunda");
            break;
        case "tuesday":
            System.out.println("terca");
            break;
        case "wednesday":
            System.out.println("quarta");
            break;
        case "thursday":
            System.out.println("quinta");
            break;
        case "friday":
            System.out.println("sexta");
            break;
        case "saturday":
            System.out.println("sabado");
            break;
        case "sunday":
            System.out.println("domingo");
            break;
        default:
            System.out.println("Não tem nada disso");
            break;
        }
    }
}
