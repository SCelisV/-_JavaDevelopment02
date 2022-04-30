package SkillAssessments;

public class test_31 {
    
    private static String reverseString(String palabra){

        String reverse = "";
        for (char c: palabra.toCharArray()){
            reverse = c + reverse;
        }
        return reverse;
    }

    /* implemente un test */
    /* npi
    @Test
    public void reverseStringTest(){

        String palabra = "Sonia Celis";
        String reverse = reverseString(palabra);
        System.out.println("reverse: " + reverse);
     
    }
    */

    /* implemente un test haciendo uso de Asserts */
    /* npi
    @Test
    public void reverseStringTestAssert(){

        String palabra = "Sonia Celis";
        String reverse = reverseString(palabra);
        assertEquals(reverse, "sileC ainoS");
     
    }
    */

    public static void main(String[] args) {
        String palabra = "Sonia Celis";
        String reverse = reverseString(palabra);
        System.out.println("reverse:" + reverse);   //  reverse:sileC ainoS
    }

}
