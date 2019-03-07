package Start_Java;

public class Prime20 {
    public boolean kiemtra(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println("The first twenty prime numbers :");
        Prime20 p =new Prime20();
        int n, count=0;

        for (n=0;n<=1000;n++){
            if(p.kiemtra(n)){
                System.out.printf(n+" ");
                count++;
                if (count==20){
                    break;
                }
            }

        }

    }
}
