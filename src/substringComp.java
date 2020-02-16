import java.util.*;

public class substringComp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        String smallest = "";
        String largest = "";
        int a = k-1;
        int b = s.length();
        String[] arr = new String[b-a];
        for(int i = 0; i <=s.length()-k; i++ ){
            String str = "";
            for(int j = i; j < i+k; j++){
                char ch = s.charAt(j);
                String q = Character.toString(ch);
                str = str + q;
            }
            arr[i] = str;
        }
        java.util.Arrays.sort(arr);
        smallest = arr[0];
        largest = arr[b-a-1];
        System.out.println(smallest);
        System.out.println(largest);

    }

}
