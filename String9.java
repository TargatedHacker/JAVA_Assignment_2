package Stringpackage;
//D.vishnu vardhan
//210303126100
//19 division
public class String9 {
    //StringGetBytesExample
    public static void main(String args[]){
        String s1="ABCDEFG";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
    }
}
