import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            //Create max and second max variables and assign them to the minimum value of an integer
            int max = Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++){

                //if curretn element is greater than max, then assign secMax to max and max to current element
                if(a[i] > max){
                    secMax = max;
                    max = a[i];
                }

                //if current element is greater than secMax and not equal to max, then assign secMax to current element
                else if(a[i] > secMax && a[i] != max){
                    secMax = a[i];
                }
                //if you want to print the second max element, you can print after the loop
            }

            //System.out.println("Max: " + max);
            //System.out.println("Second Max: " + secMax);

            //The below lines are for sum of max and second max elements
            int sum = max + secMax;
            System.out.println(sum);
            
        }
    }
}
