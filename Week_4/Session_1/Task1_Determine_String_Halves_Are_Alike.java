import java.util.*;
public class Task1_Determine_String_Halves_Are_Alike {
    static boolean vowel(char c){ return "aeiouAEIOU".indexOf(c)>=0; }
    static boolean solve(String s){
        int h=s.length()/2, count=0;
        for(int i=0;i<h;i++) if(vowel(s.charAt(i))) count++;
        for(int i=h;i<s.length();i++) if(vowel(s.charAt(i))) count--;
        return count==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(solve(sc.nextLine().trim()));
        sc.close();
    }
}
