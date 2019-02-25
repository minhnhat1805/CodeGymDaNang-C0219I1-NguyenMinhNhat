public class prime100 {
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
        public static void main (String[] args){
            System.out.println("The  prime numbers lesser 100:");
            prime100 p=new prime100();
            for (int j = 2; j < 100; j++) {
                  if(p.kiemtra(j)){
                      System.out.print(j+ " ");
                }

            }
        }
}