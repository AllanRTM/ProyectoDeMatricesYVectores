package com.company;

import java.util.Scanner;

public class Menu {
    public int menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("========================MENU==========================");
        System.out.println("1. OPERACIONES CON VECTORES Y MATRICES EN R2 ");
        System.out.println("2. OPERACIONES CON VECTORES Y MATRICES EN R3 ");
        System.out.println("3. OPERACIONES CON VECTORES Y MATRICES EN R4 ");
        System.out.println("4. Salir");
        int opcion = 0;
        while ((opcion < 1) || (opcion > 3)) {
            System.out.println("Favor Ingresar Una Opcion : ");
            Scanner Sc = new Scanner(System.in);
            opcion = Sc.nextInt();
            if ((opcion < 1) || (opcion > 3)) {
                System.out.println("Opcion No Invalida.");
            }
        }
        return opcion;

}
public int MenuR2() {
        System.out.println("");
        System.out.println("");
        System.out.println("========================MENU==========================");
        System.out.println("================VECTORES Y MATRICES EN R2==============");
        System.out.println("1. SUMA DE VECTORES EN R2  ");
        System.out.println("2. RESTA DE VECTORES EN R2  ");
        System.out.println("3. MULTIPLICASION  DE VECTORES EN R2 ");
        System.out.println("4. ESCALAR POR UN VECTOR EN R2 ");
        System.out.println("5. VECTOR POR MATRIZ EN R2  ");
        System.out.println("6. SUMA DE MATRICES EN R2  ");
        System.out.println("7. RESTA DE MATRICES EN R2  ");
        System.out.println("8. MULTIPLICASION MATRICES EN R2  ");
        System.out.println("9. ESCALAR POR UNA MATRIZ EN R2 ");
        System.out.println("1O. Salir");
        int MenuR2 = 0;
        while ((MenuR2  < 1) || (MenuR2  > 10)) {
            System.out.println("Favor Ingresar Una Opcion : ");
            Scanner Sc = new Scanner(System.in);
            MenuR2 = Sc.nextInt();
            if ((MenuR2  < 1) || (MenuR2  > 10)) {
                System.out.println("Opcion No Invalida.");
            }
        }
        return MenuR2;
}
public int MenuR3() {
        System.out.println("");
        System.out.println("");
        System.out.println("========================MENU==========================");
        System.out.println("================VECTORES Y MATRICES EN R3==============");
        System.out.println("1. SUMA DE VECTORES EN R3  ");
        System.out.println("2. RESTA DE VECTORES EN R3  ");
        System.out.println("3. MULTIPLICASION  DE VECTORES EN R3 ");
        System.out.println("4. ESCALAR POR UN VECTOR EN R3 ");
        System.out.println("5. VECTOR POR MATRIZ EN R3  ");
        System.out.println("6. SUMA DE MATRICES EN R3  ");
        System.out.println("7. RESTA DE MATRICES EN R3  ");
        System.out.println("8. MULTIPLICASION MATRICES EN R3  ");
        System.out.println("9. ESCALAR POR UNA MATRIZ EN R3 ");
        System.out.println("1O. Salir");
        int MenuR3=0;
        while ((MenuR3 < 1) || (MenuR3 > 10)) {
            System.out.println("Favor Ingresar Una Opcion : ");
            Scanner Sc = new Scanner(System.in);
            MenuR3= Sc.nextInt();
            if ((MenuR3 < 1) || (MenuR3 > 10)) {
                System.out.println("Opcion No Invalida.");
            }
        }
        return MenuR3;
    }

    public int MenuR4() {
        System.out.println("");
        System.out.println("");
        System.out.println("========================MENU==========================");
        System.out.println("================VECTORES Y MATRICES EN R4==============");
        System.out.println("1. SUMA DE VECTORES EN R4 ");
        System.out.println("2. RESTA DE VECTORES EN R4  ");
        System.out.println("3. MULTIPLICASION  DE VECTORES EN R4 ");
        System.out.println("4. ESCALAR POR UN VECTOR EN R4 ");
        System.out.println("5. VECTOR POR MATRIZ EN R4  ");
        System.out.println("6. SUMA DE MATRICES EN R4  ");
        System.out.println("7. RESTA DE MATRICES EN R4  ");
        System.out.println("8. MULTIPLICASION MATRICES EN R4  ");
        System.out.println("9. ESCALAR POR UNA MATRIZ EN R4 ");
        System.out.println("1O. Salir");
        int MenuR4=0;
        while ((MenuR4 < 1) || (MenuR4 > 10)) {
            System.out.println("Favor Ingresar Una Opcion : ");
            Scanner Sc = new Scanner(System.in);
            MenuR4= Sc.nextInt();
            if ((MenuR4 < 1) || (MenuR4 > 10)) {
                System.out.println("Opcion No Invalida.");
            }
        }
        return MenuR4;
    }

}
