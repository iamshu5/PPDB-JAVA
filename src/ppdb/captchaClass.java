package ppdb;

import java.util.Scanner;
/**
 *
 * @author ILHAM
 */

public class captchaClass {
    private static int bil1;
    private static int bil2;
    private static char Ex;
    
        public static void  buatAngka() {
            buatEx();
            
            final int MIN = 1;
            final int MAX = 10;

            bil1 = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            bil2 = (int) (Math.random() * (MAX - MIN + 1) + MIN);

            if(Ex == '-' && bil1 < bil2) {
                while(true) {
                    bil1 = (int) (Math.random() * (MAX - MIN + 1) + MIN);
                    if(bil1 > bil2) {
                        break;
                    }
                }
            }
        }
    
        private static void buatEx() {
            char[] rand = {'+', '-', '*'};
            int i = (int) (Math.random() * (3 - 1 + 1) + 1);
            
            Ex = rand[i - 1];
        }
    
        private static int hitung() {
            switch(Ex) {
                case '+':
                    return bil1 + bil2;

                case '-':
                    return bil1 - bil2;

                case '*':
                    return bil1 * bil2;

                case '/':
                    return bil1 * bil2;

                default:
                    return 0;
            }
        }
    
        public static String buatSoal() {
            return String.valueOf(bil1) + " " + Ex + " " + String.valueOf(bil2);
        }

        public static boolean validasi(int hasil) {
            int hasilValid = hitung();
            return hasilValid == hasil;
        }
}
