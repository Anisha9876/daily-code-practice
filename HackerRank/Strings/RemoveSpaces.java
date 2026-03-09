package HackerRank.Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str="I am very good girl";
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                newStr=newStr+str.charAt(i);
            }

        }
        System.out.println("New String : "+newStr);
    }
}
