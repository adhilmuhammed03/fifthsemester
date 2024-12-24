import java.util.Scanner;
class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first Array : ");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the elements of the first Array : ");
        for(int i=0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array : ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of the second array : ");
        for(int i=0;i<size2;i++){
            arr2[i] = sc.nextInt();
        }
        int mergedArray[] = new int[size1 + size2];
        for(int i = 0; i < size1; i++){
            mergedArray[i] = arr1[i];
        }
        for(int i = 0 ; i < size2; i++){
            mergedArray[size1 + i] = arr2[i];
        }

        System.out.println("The merged array is : ");
        for(int i = 0 ; i < size1 + size2; i++){
            System.out.print(mergedArray[i] + " ");
        }
        sc.close();
    }
}