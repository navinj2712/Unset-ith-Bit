import java.util.Scanner;

public class UnsetIthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A bit : ");
        int aBit = scanner.nextInt();
        System.out.println("Enter B bit : ");
        int bBit = scanner.nextInt();
        int output = findUnsetIthBit(aBit, bBit);
        System.out.println("Output : " + output);
    }

    private static int findUnsetIthBit(int aBit, int bBit) {
        int unset = (1 << bBit);
//        System.out.println(unset);
        if ((aBit & unset) != 0){
//            System.out.println(aBit & unset);
            aBit = aBit & ~unset;
        }
        return aBit;
    }
}
