package Stringpackage;
//D.vishnu vardhan
//210303126100
//19 division
public class String20 {
    // StartsWithExample

    public static void main(String args[])
    {
        String s1="java string split method by javatpoint";
        System.out.println(s1.startsWith("ja"));  // true
        System.out.println(s1.startsWith("java string"));   // true
        System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different
    }
}
