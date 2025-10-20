package OperationsTroisNombres;

import java.util.Scanner;

public class OperationsTroisNombres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int a = input.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int b = input.nextInt();

        System.out.print("Entrez le troisième nombre : ");
        int c = input.nextInt();

        int somme = a + b + c;
        int produit = a * b * c;
        double moyenne = (a + b + c) / 3.0; // division en double pour résultat décimal

        System.out.println("La somme est : " + somme);
        System.out.println("Le produit est : " + produit);
        System.out.println("La moyenne est : " + moyenne);
    }
}

