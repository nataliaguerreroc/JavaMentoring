// Enunciado 1

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Solution {

    ArrayList alturasList = new ArrayList<>();
    ArrayList cantidadAlturasList = new ArrayList<>();



    public void addAlturas(Integer item) {
        alturasList.add(item);
    }


    public void printAlturasList() {
        System.out.println("Tiene en total " + alturasList.size() + " alturas en su lista");
        for(int i=0; i< alturasList.size(); i++) {
            System.out.println((i+1) + ". " + alturasList.get(i));
        }
    }


    public void contarDobles() {
        Collections.sort(alturasList);
        int contador = 0;
        int aux = (int) alturasList.get(0);
        for (int i = 0; i < alturasList.size(); i++) {
            if(aux == (int) alturasList.get(i)){
                contador++;
            } else {
                cantidadAlturasList.add(contador);
                //System.out.print(contador + ",");
                contador = 1;
                aux = (int) alturasList.get(i);
            }
        }
        //System.out.print(contador);
        cantidadAlturasList.add(contador);
    }

    public void printContadorList() {
        Set<Integer> sinDobles = new HashSet<Integer>(alturasList);
        alturasList.clear();
        alturasList.addAll(sinDobles);
        Collections.sort(alturasList);
        for(int i=0; i< cantidadAlturasList.size(); i++) {
            System.out.println(alturasList.get(i) + " "+ cantidadAlturasList.get(i));
        }
    }

}
