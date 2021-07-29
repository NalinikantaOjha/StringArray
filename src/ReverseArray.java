public class ReverseArray {
    public static void main(String[] args) {
        int Array [][]={{11,22,33},{10,20,30},{40,50,60}};
        for (int i=Array.length-1;i>=0;i--){
            for (int j=Array.length-1;j>=0;j--){
                System.out.println(Array[i][j]);
            }
        }
    }
}
