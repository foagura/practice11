public class Practice11 {
    public static void main(String[] args){
        /* if文のネスト */
        int a = -20;

        if (a > 0) {
            System.out.println("aは正の値です");
            if (a % 2 == 0) {
                System.out.println("aは偶数です");
            }
        } else {
            if (a == 0) {
                System.out.println("aは0です");
            } else {
                System.out.println("aは負の値です");
            }
        }
    }
}
