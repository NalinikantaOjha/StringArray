public class PrintSum {
    public static void main(String[] args) {
        int []A={1,2,3,4,5};
        int sum =0;
        for (int i =0;i<A.length;i+=2){
             sum = sum+A[i];
        }
        System.out.println(sum);
    }
}
