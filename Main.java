import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduceti numarul de minute");
        int nrMinute = sc.nextInt();
        int pret = 40;
        int totalPlata = (nrMinute / 60) * pret + nrMinute % 60;
        System.out.println(
                "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n" +
                        "S Sammy’s makes it fun in the sun S\n" +
                        "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");
        System.out.println("Total de plata: " + totalPlata);
    }
}