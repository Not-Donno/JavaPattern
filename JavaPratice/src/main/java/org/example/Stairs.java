package org.example;

public class Stairs {
    public static void main(String[] a){
        new Stairs();
    }
    public Stairs(){
        int[] star = {1,3,5,7,9,11,13};
        for (int x=0; x<6; x++){
            System.out.println("*".repeat(star[x]));
        }
    }
}
