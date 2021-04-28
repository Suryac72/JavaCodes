import java.util.HashSet;
import java.util.Set;

public class permutationsString {
    static Set<String> Set = new HashSet<>();
    public static void main(String args[]) {
       
        permutations("abcc", 0, 2);
    }
    static void permutations(String s,int l,int r){
        if(l==r){
            if(Set.contains(s)) return;
            Set.add(s);
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++){
            s = interChange(s, l, i);
            permutations(s, l+1, r);
            s = interChange(s, l, i);
        }
    }
    static String interChange(String s,int a,int b){
        char arr[] = s.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);

    } 
}
