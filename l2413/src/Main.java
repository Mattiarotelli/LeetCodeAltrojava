public class Main {
    public static void main(String[] arg) {
        int n = 6;
        int r=0;
        for( int i = 2; i <= n*2; i++){
            if(i%2==0){
                if(i%n==0) {
                    r = i;
                    break;
                }
            }
        }
        System.out.println(r);
    }
}
