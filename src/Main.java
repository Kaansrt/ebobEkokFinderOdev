import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2;
        int i = 1;
        System.out.print("n1 giriniz : ");
        n1 = inp.nextInt();
        System.out.print("n2 giriniz : ");
        n2 = inp.nextInt();
        int ebob=1;
        int ekok = 1;
        int hak=1;
        while (hak > 0) {
            if (n2 > n1) {
                while (i <= n1) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }
                break;
            } else if (n1 > n2) {
                while (i <= n2) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }
                break;
            } else {
                System.out.println("Girilen sayılar eşittir.");
                hak--;
            }
        }
        System.out.println("Girilen sayıların ebob'u : "+ebob);
        while (i < (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Girilen sayıların ekok'u : "+ ekok);
    }
}