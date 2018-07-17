package com.company;

import java.util.Scanner;

public class MatrizR2 {

    public void SumaDeMatrizDeR2(){

        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R2
        Double MatrizA[]=new Double[4];
        Double MatrizB[]=new Double[4];
        //VARIABLES
        Double A;
        Double B;
        Double C;
        Double D;
        //CLICLOS FOR PARA MATRICEZ
        System.out.println("-------------------SUMA DE MATRICEZ---------------");
        System.out.println(" ");
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ A------------- ");
        for (int i = 0; i <MatrizA.length ;i++) {
            System.out.println("Introduzca el valor de A: ");
            MatrizA[i]=Lt.nextDouble();
        }
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ B------------- ");
        for (int j = 0; j <MatrizB.length;j++ ){

            System.out.println("Introduzca el valor de B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A= (MatrizA[0]+MatrizB[0]);
        B= (MatrizA[1]+MatrizB[1]);
        C= (MatrizA[2]+MatrizB[2]);
        D= (MatrizA[3]+MatrizB[3]);
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R2 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+""+"|");
        System.out.println("|"+""+C+" "+" "+D+""+"|");


    }
    public void RestaDeMatrizDeR2(){

        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R2
        Double MatrizA[]=new Double[4];
        Double MatrizB[]=new Double[4];
        //VARIABLES
        Double A;
        Double B;
        Double C;
        Double D;
        //CLICLOS FOR PARA MATRICEZ
        System.out.println("-------------------RESTA DE MATRICEZ---------------");
        System.out.println(" ");
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ A------------- ");
        for (int i = 0; i <MatrizA.length ;i++) {
            System.out.println("Introduzca el valor de A: ");
            MatrizA[i]=Lt.nextDouble();
        }
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ B------------- ");
        for (int j = 0; j <MatrizB.length;j++ ){

            System.out.println("Introduzca el valor de B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A= (MatrizA[0]-MatrizB[0]);
        B= (MatrizA[1]-MatrizB[1]);
        C= (MatrizA[2]-MatrizB[2]);
        D= (MatrizA[3]-MatrizB[3]);
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R2 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+""+"|");
        System.out.println("|"+""+C+" "+" "+D+""+"|");


    }
    public void MatrizDeMultiplicasionEnR2(){
        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R2
        Double MatrizA[]=new Double[4];
        Double MatrizB[]=new Double[4];
        //VARIABLES
        Double A;
        Double B;
        Double C;
        Double D;
        //CLICLOS FOR PARA MATRICEZ
        System.out.println(" ");
        System.out.println("------------MULTIPLICASION DE MATRICEZ EN R2------------- ");
        System.out.println(" ");
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ A------------- ");
        for (int i = 0; i <MatrizA.length ;i++) {
            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ A: ");
            MatrizA[i]=Lt.nextDouble();
        }
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ B------------- ");
        for (int j = 0; j <MatrizB.length;j++ ){

            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A= ((MatrizA[0]*MatrizB[0])+(MatrizA[1]*MatrizB[2]));
        B= ((MatrizA[0]*MatrizB[1])+(MatrizA[1]*MatrizB[3]));
        C= ((MatrizA[2]*MatrizB[0])+(MatrizA[3]*MatrizB[2]));
        D= ((MatrizA[2]*MatrizB[1])+(MatrizA[3]*MatrizB[3]));
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R2 ES:     ");
        System.out.println(" ");
        System.out.println("|"+""+A+" "+" "+B+""+"|");
        System.out.println("|"+""+C+" "+" "+D+""+"|");



    }
    public void EscalarPorUnaMatrizEnR2(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[4];
        Double A;
        Double B;
        Double C;
        Double D;
        Double Escalar;
        System.out.println(" ");
        System.out.println("-------------ESCALAR POR UNA MATRIZ---------------");
        System.out.println("                                                                                             ");
        System.out.println("------------INTRODUZCA EL VALOR DEL ESCALAR------------- ");
        System.out.println("INTRODUZCA EL VALOR DEL ESCALAR: ");
        Escalar=Lt.nextDouble();
        System.out.println("                                                                                             ");
        System.out.println("------------INTRODUZCA LOS VALORES DE LA MATRIZ------------- ");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ EN R2: ");
            VectorA[i]=Lt.nextDouble();

        }

        // FORMULAS PARA ESCALAR POR UN VECTOR
        A=Escalar*VectorA[0];
        B=Escalar*VectorA[1];
        C=Escalar*VectorA[2];
        D=Escalar*VectorA[3];
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE UN ESCALAR POR UNA MATRIZ EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+A+"  "+","+" "+B+"  "+" |");
        System.out.println( " "+" "+" "+" "+ "| "+C+"  "+","+" "+D+"  "+" |");

    }}
