package com.company;

import java.util.Scanner;

public class MatrizR3 {
    public void SumaDeMatrizDeR3(){
        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R2
        Double MatrizA[]=new Double[9];
        Double MatrizB[]=new Double[9];
        //VARIABLES
        Double A;
        Double B;
        Double C;
        Double D;
        Double E;
        Double F;
        Double G;
        Double H;
        Double I;
        //CLICLOS FOR PARA MATRICEZ
        for (int i = 0; i <MatrizA.length ;i++) {
            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ A: ");
            MatrizA[i]=Lt.nextDouble();
        }
        for (int j = 0; j <MatrizB.length;j++ ){

            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A= (MatrizA[0]+MatrizB[0]);
        B= (MatrizA[1]+MatrizB[1]);
        C= (MatrizA[2]+MatrizB[2]);
        D= (MatrizA[3]+MatrizB[3]);
        E= (MatrizA[4]+MatrizB[4]);
        F= (MatrizA[5]+MatrizB[5]);
        G= (MatrizA[6]+MatrizB[6]);
        H= (MatrizA[7]+MatrizB[7]);
        I= (MatrizA[8]+MatrizB[8]);
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R3 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +"|");
        System.out.println("|"+""+D+" "+" "+E+" "+" "+ F +"|");
        System.out.println("|"+""+G+" "+" "+H+" "+" "+ I +"|");


    }
    public void RestaDeMatrizDeR3(){
        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R2
        Double MatrizA[]=new Double[9];
        Double MatrizB[]=new Double[9];
        //VARIABLES
        Double A;
        Double B;
        Double C;
        Double D;
        Double E;
        Double F;
        Double G;
        Double H;
        Double I;
        //CLICLOS FOR PARA MATRICEZ
        for (int i = 0; i <MatrizA.length ;i++) {
            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ A: ");
            MatrizA[i]=Lt.nextDouble();
        }
        for (int j = 0; j <MatrizB.length;j++ ){

            System.out.println("INTRODUZCA EL VALOR DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A= (MatrizA[0]-MatrizB[0]);
        B= (MatrizA[1]-MatrizB[1]);
        C= (MatrizA[2]-MatrizB[2]);
        D= (MatrizA[3]-MatrizB[3]);
        E= (MatrizA[4]-MatrizB[4]);
        F= (MatrizA[5]-MatrizB[5]);
        G= (MatrizA[6]-MatrizB[6]);
        H= (MatrizA[7]-MatrizB[7]);
        I= (MatrizA[8]-MatrizB[8]);
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R3 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +"|");
        System.out.println("|"+""+D+" "+" "+E+" "+" "+ F +"|");
        System.out.println("|"+""+G+" "+" "+H+" "+" "+ I +"|");


    }
    public void MatrizDeMultiplicasionEnR3() {
        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R3
        Double MatrizA[] = new Double[9];
        Double MatrizB[] = new Double[9];
        //VARIABLES
        Double A;
        Double B;
        Double C;
        Double D;
        Double E;
        Double F;
        Double G;
        Double H;
        Double I;
        //CLICLOS FOR PARA MATRICEZ
        for (int i = 0; i<MatrizA.length;i++){
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ A: ");
            MatrizA[i] = Lt.nextDouble();
        }
        for (int j = 0; j < MatrizB.length; j++) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A = ((MatrizA[0] * MatrizB[0]) + (MatrizA[1] * MatrizB[3]) + (MatrizA[2]*MatrizB[6]));
        B = ((MatrizA[0] * MatrizB[1]) + (MatrizA[1] * MatrizB[4]) + (MatrizA[2]*MatrizB[7]));
        C = ((MatrizA[0]* MatrizB[2])  + (MatrizA[1] * MatrizB[5]) + (MatrizA[2] * MatrizB[8]));

        D = ((MatrizA[3] * MatrizB[0]) + (MatrizA[4] * MatrizB[3]) + (MatrizA[5]*MatrizB[6]));
        E=  ((MatrizA[3] * MatrizB[1]) + (MatrizA[4] * MatrizB[4]) + (MatrizA[5]*MatrizB[7]));
        F=  ((MatrizA[3] * MatrizB[2]) + (MatrizA[4] * MatrizB[5]) + (MatrizA[5]*MatrizB[8]));

        G=  ((MatrizA[6] * MatrizB[0]) + (MatrizA[7] * MatrizB[3]) + (MatrizA[8]*MatrizB[6]));
        H=  ((MatrizA[6] * MatrizB[1]) + (MatrizA[7] * MatrizB[4]) + (MatrizA[8]*MatrizB[7]));
        I=  ((MatrizA[6] * MatrizB[2]) + (MatrizA[7] * MatrizB[5]) + (MatrizA[8]*MatrizB[8]));
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R3 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +"|");
        System.out.println("|"+""+D+" "+" "+E+" "+" "+ F +"|");
        System.out.println("|"+""+G+" "+" "+H+" "+" "+ I +"|");


    }
    public void EscalarPorUnaMatrizEnR3(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[9];
        Double A;
        Double B;
        Double C;
        Double D;
        Double E;
        Double F;
        Double G;
        Double H;
        Double I;
        Double Escalar;
        System.out.println(" ");
        System.out.println("------------ESCALAR POR MATRIZ---------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("INTRODUZCA EL VALOR DEL ESCALAR: ");
        Escalar=Lt.nextDouble();
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LA MATRIZ EN R3: ");
            VectorA[i]=Lt.nextDouble();

        }
        // FORMULAS PARA ESCALAR POR UN VECTOR
        A=Escalar*VectorA[0];
        B=Escalar*VectorA[1];
        C=Escalar*VectorA[2];
        D=Escalar*VectorA[3];
        E=Escalar*VectorA[4];
        F=Escalar*VectorA[5];
        G=Escalar*VectorA[6];
        H=Escalar*VectorA[7];
        I=Escalar*VectorA[8];
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DEL ESCALAR POR LA MATRIZ EN R3 ES: ");
        System.out.println("                                                                                             ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +"|");
        System.out.println("|"+""+D+" "+" "+E+" "+" "+ F +"|");
        System.out.println("|"+""+G+" "+" "+H+" "+" "+ I +"|");


    }



}
