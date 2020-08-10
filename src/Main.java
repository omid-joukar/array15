/**
 * Created by KPS on 8/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints1 = {1,2,3,4};
        int[] ints2 = {3,4,5,6};
        for (int i = 0 ; i < ints1.length ;i++){
            for (int j = 0 ; j < ints2.length ; j++){
                if (ints1[i] == ints2[j]){
                    System.out.println("same contains : " +ints1[i] );
                }
            }
        }
    }
}
