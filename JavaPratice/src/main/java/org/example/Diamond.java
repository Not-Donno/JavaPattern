package org.example;

public class Diamond {
    public static void main(String[] args){
        int[] star = {0,1,3,5,7,9,11,13},space = {6,5,4,3,2,1};
        for (int x=0; x<6; x++){
            System.out.println(" ".repeat(space[x])+"*".repeat(star[x]));
        }
        for (int x=4; x>0; x--){
            System.out.println(" ".repeat(space[x])+"*".repeat(star[x]));
        }
    }
}
