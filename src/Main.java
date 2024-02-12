import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imie");
        String imie = scanner.nextLine();
        System.out.println("Wpisz nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Wpisz wiek");
        int wiek = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wpisz kolorWlosow");
        HairColor kolorWlosow = switch (scanner.nextLine()) {
            case "black" -> HairColor.black;
            case "brown" -> HairColor.brown;
            case "blonde" -> HairColor.blonde;
            case "ginger" -> HairColor.ginger;
            default -> null;
        };
        System.out.println("Wpisz kolorOczu");
        EyeColor kolorOczu = switch (scanner.nextLine()){
            case "black" -> EyeColor.black;
            case "brown" -> EyeColor.brown;
            case "blue" -> EyeColor.blue;
            case "green" -> EyeColor.green;
            default -> null;
        };


        Human czlowiek = new Human(imie,nazwisko,wiek,kolorOczu,kolorWlosow);
        System.out.println(czlowiek);
    }
}