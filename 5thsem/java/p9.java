import java.util.*;
public class p9 {
    public static class checkAnagagram{
        public boolean check(String str1, String str2){
            if(str1.length() != str2.length()){
                return false;
            }

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 , str2;
        System.out.println("Enter first string");
        str1 = sc.next();
        System.out.println("Enter the second string");
        str2 = sc.next();
        checkAnagagram obj = new checkAnagagram();
        if(obj.check(str1,str2)){
            System.out.println("The strings are anagaram");
        }else{
            System.out.println("The strings are not anagaram");
        }

        sc.close();
    }
}
