package SkillAssessments;

public class test_33test {

    public static void main(String[] args) {
       
       test_33 c1 = new test_33(); 
       test_33 c2 = new test_33(); 
       test_33 c3 = new test_33(); 

       c1.valor = 150;
       c2.valor = 150;
       c3 = c2;

       if(c1.equals(c2)) System.out.println(" A");
       if(c1.equals(c3)) System.out.println(" B");
       if(c2.equals(c3)) System.out.println(" C"); // C


    }
    
}
