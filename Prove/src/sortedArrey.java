import java.util.Arrays;

public class sortedArrey {
    public static void main(String[] args) {

        String[] s = new String[]{"as","z", "j", "c", "b"};
        Arrays.sort(s);
        for(int i = 0; i < s.length; i++ ) {
            System.out.println(s[i]);
        }

    }
}