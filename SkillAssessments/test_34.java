package SkillAssessments;
public class test_34 {
    
    public static void main (String[] args){
        String A = "El amigo de los osos";
        String B = "El amigo de los osos";
        String C = "El AMIGO de los osos";
        int compare;

        if (A.equals(B)) System.out.println("equals A: " + A + " B: " + B);                            
        if (A.equalsIgnoreCase(C)) System.out.println("equalsIgnoreCase: A: " + A + " C: " + C);
        if ( (compare=A.compareTo(C)) != 0) System.out.println("compareTo: A: " + A + " C: " + C + " compare: " + compare);
    }
}