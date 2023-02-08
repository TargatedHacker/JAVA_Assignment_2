package Stringpackage;
//D.vishnu vardhan
//210303126100
//19 division
public class String11 {

    //IndexOfExample
    public static void main(String args[]){
        //IndexOfExample
        String s1="this is index of example";
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("index");
        System.out.println(index1+"  "+index2);


        int index3=s1.indexOf("is",4);
        System.out.println(index3);


        int index4=s1.indexOf('s');
        System.out.println(index4);
    }
}