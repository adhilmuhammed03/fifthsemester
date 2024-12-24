import java.util.*;



public class p10 {
    
    public static void main(String[] args) {
        String vowels = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        String str1;
        System.out.println("Enter a string : ");
        str1 = sc.nextLine();
        for(int i = 0 ; i < vowels.length();i++){
            str1 = str1.replace(String.valueOf(vowels.charAt(i)),"");
            
        }
       

        System.out.println("The string without vowels is : ");
        System.out.println(str1);

        sc.close();

    }
}
