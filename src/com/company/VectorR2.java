package com.company;

import java.util.Scanner;

public class VectorR2 {

    public void VectorSumaEnR2(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[2];
        Double VectorB[]=new Double[2];
        Double primervector;
        Double segundovector;
        System.out.println("----------INTRODUZCA LOS VECTORES A SUMAR EN R2------------ ");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR B: ");
            VectorB[j] = Lt.nextDouble();

        }
        // IMPRIMIR RESULTADOS
        primervector = (VectorA[0]+VectorB[0]);
        segundovector= (VectorA[1]+VectorB[1]);
        System.out.println("    EL RESULTADO DE SUMA DE VETORES EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" |");

    }






    /**
     *
     */

    public void RestaDeVectorEnR2(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[2];
        Double VectorB[]=new Double[2];
        Double primervector;
        Double segundovector;
        System.out.println("--------------INTRODUZCA LOS VECTORES A RESTAR EN R2-----------");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR B: ");
            VectorB[j] = Lt.nextDouble();

        }
        // IMPRIMIR RESULTADOS
        primervector = (VectorA[0]-VectorB[0]);
        segundovector= (VectorA[1]-VectorB[1]);
        System.out.println("    EL RESULTADO DE RESTA DE VETORES EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" |");

    }

    public void VectorMultiplicasionEnR2(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[2];
        Double VectorB[]=new Double[2];
        Double primervector;
        Double segundovector;
        Double Total;
        System.out.println("-----------INTRODUZCA LOS VECTORES A MULTIPLIICAR EN R2-------------");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DE VECTOR A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("INTRODUZCA LOS VALORES DE VECTOR B:  ");
            VectorB[j] = Lt.nextDouble();

        }
        // IMPRIMIR RESULTADOS
        primervector = (VectorA[0]*VectorB[0]);
        segundovector= (VectorA[1]*VectorB[1]);
        Total = primervector+segundovector;
        System.out.println("    EL RESULTADO LA MULTIPLICASION EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println("PRODUCTO PUNTO: "+Total);
        System.out.println("  ");
        System.out.println(" EL VECTOR RESULTANTE ES: ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" |");


    }
    public void VectorPorEscalarEnR2(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[2];
        Double primervector;
        Double segundovector;
        Double Escalar;
        System.out.println("-----------INTRODUZCA EL ESCALAR Y EL VECTOR EN R2--------------");
        System.out.println(" ");
        System.out.println("INTRODUZCA EL VALOR DEL ESCALAR: ");
        Escalar=Lt.nextDouble();
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("Introduzca el valor de A: ");
            VectorA[i]=Lt.nextDouble();

        }

        // FORMULAS PARA ESCALAR POR UN VECTOR
        primervector=Escalar*VectorA[0];
        segundovector=Escalar*VectorA[1];
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE SUMA DE VETORES EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" |");



    }
    public void VectorPorMatriz(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[2];
        Double MatrizA[]=new Double[2];
        Double MatrizB[]=new Double[2];
        Double ResultadoA;
        Double ResultadoB;
        System.out.println(" ");
        System.out.println("  "+"  "+"   "+" INTRODUZCA LOS VALORES DEL VECTOR EN R2: "+"  "+ "  ");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR ");
            VectorA[i]=Lt.nextDouble();

        }
        System.out.println(" "+" "+" "+" INTRODUZCA LOS VALORES DE LA MATRIZ EN ORDEN DE FILA------------");
        System.out.println(" ");
        System.out.println(" ");
        for (int j = 0; j <MatrizA.length;j++ ) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ EN FILA A: ");
            MatrizA[j]=Lt.nextDouble();

        }
        for (int k = 0; k <MatrizB.length;k++ ) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ EN FILA B: ");
            MatrizB[k]=Lt.nextDouble();

        }


        // FORMULAS PARA ESCALAR POR UN VECTOR
        ResultadoA=((VectorA[0]*MatrizA[0])+(VectorA[1]*MatrizB[0]));
        ResultadoB=((VectorA[0]*MatrizA[1])+ (VectorA[1]*MatrizA[1]));
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE EL VECTOR POR LA MATRIZ EN R2 ES: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+ResultadoA+" "+" "+" "+" "+ResultadoB+"  "+" |");



    }

}
