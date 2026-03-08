package HackerRank.Strings;


import java.util.LinkedHashSet;


public class RemoveDuplicatesCharacters {
    public static void main(String[] args) {
        String str="programming";
        String res=""+str.charAt(0);
        char ch;
        for(int i=0;i<str.length();i++){
//            count=0;
//            c=str.charAt(i);
//            for(int j=0;j<res.length();j++){
                ch=str.charAt(i);
                if(!res.contains(String.valueOf(ch))){
                    res=res+ch;
                }
//                if(c==res.charAt(j)){
//                   count++;
//                }
//            }
//            if(count==0){
//                res=res+c;
//            }
        }
        RemoveUsingSet(str);
        System.out.println("Using Brut force Method--> "+res);
    }

    public static void RemoveUsingSet(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String str="";
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
       for(char c:set){
            str=str+c;
       }
        System.out.println("SO the resultant string using LinkedHashSet ---> "+str);
    }
}
