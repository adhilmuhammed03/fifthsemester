import java.util.*;
class p3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        if(n < 10){
            System.out.println("Enter a number greater than 10 ");
            sc.close();
            return;
        }
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List <Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        int max = Collections.max(list);
        list.remove(max);
        int smax = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("The largest number is " + max + " The second largest number is " + smax + "The smallest number is " + min);

        
        sc.close();
    }
}