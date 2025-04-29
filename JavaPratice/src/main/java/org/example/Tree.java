package org.example;

public class Tree {
    public static void main(String[] a){
        new Tree();
    }
    public Tree(){
        int[] star = {1,3,5,7,9,11,13},space = {6,5,4,3,2,1};
        for (int x=0; x<6; x++){
            System.out.println(" ".repeat(space[x])+"*".repeat(star[x]));

        }
        for (int x =0;x<2;x++){
            System.out.println(" ".repeat(5)+"|".repeat(3));
        }
    }
}
