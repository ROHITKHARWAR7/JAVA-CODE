import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        int[] arr ={5,8,-54,86,47,10};
        Scanner sc = new Scanner(System.in);
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]); //majduri hai ye use loop
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);



        //dusra method output lene ka
//         int n = arr.length;
//         for(int i=0;i<=n;i++){
//             System.out.println(arr[i]+" ");//useful method
//         }
//     }
    
// } 
     // input
     int[] rohit = new int[7];
     for(int i=0;i<7;i++){
       rohit[i] = sc.nextInt();
     }
     // print
     for(int i=0;i<7;i++){
        System.out.print(2*rohit[i]+" ");
     }}}