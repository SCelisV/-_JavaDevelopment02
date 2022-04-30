package SkillAssessments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Busca el mayor de los datos dados

public class test_30 {

    private static int applyToList(List<Integer> enteros, int pos){

        // System.out.println("enteros: " + enteros);
        // System.out.println("pos: " + pos);

        if(pos != enteros.size()-1){

            // System.out.println("enteros.size()-1: " + enteros.size());
            int value = enteros.get(pos);
            // System.out.println("value: " + value);

            int prev = applyToList(enteros, pos+1);
            // System.out.println("prev: " + prev);

            if(prev > value)
                return prev;
            else
                return value;
        }
        // System.out.println("enteros.get(pos): " + enteros.get(pos));
        return enteros.get(pos);
    }

    /* Implementación del Test
    /* npi 
    @Test
    public void test_30_02(){

        List<Integer> enteros = new ArrayList(Arrays.asList(1, 4, 6, 8, 10, 2, 7, 5, 3, 9));
        int value = applyToList(enteros, 0);
        System.out.print("El valor es: " + value);

    }
    */


    public static void main(String[] args) {

        List<Integer> enteros = new ArrayList(Arrays.asList(1, 4, 6, 8, 10, 2, 7, 5, 3, 9));
        int value = applyToList(enteros, 0);
        System.out.print("El valor es: " + value);
    }

}
