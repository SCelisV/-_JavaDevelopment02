package SkillAssessments;

public class test_29 {
    
    public static void main(String[] args) {
        int b = 3;
        int c = 7;

        int a = b++ + ++c;

        System.out.println("A= " + a); // A= 11
        System.out.println("B= " + b); // B= 4
        System.out.println("C= " + c); // C= 8
        
    }

}