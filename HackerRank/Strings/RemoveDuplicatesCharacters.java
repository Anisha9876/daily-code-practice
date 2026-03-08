package HackerRank.Strings;



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
        System.out.println(res);
    }
}
