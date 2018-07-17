package com.company;

import java.util.Scanner;

public class MatrizR4 {
    public void SumaDeMatirzDeR4(){
        Scanner Lt=new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R4
        Double MatrizA[] = new Double[16];
        Double MatrizB[] = new Double[16];
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
        Double J;
        Double K;
        Double L;
        Double M;
        Double N;
        Double Q;
        Double O;

        //CLICLOS FOR PARA MATRICEZ EN R4
        for (int i = 0; i<MatrizA.length;i++){
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ A: ");
            MatrizA[i] = Lt.nextDouble();
        }
        for (int j = 0; j < MatrizB.length; j++) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ EN R4
        A =(MatrizA[0]+MatrizB[0]);
        B =(MatrizA[1]+MatrizB[1]);
        C=(MatrizA[2]+MatrizB[2]);
        D=(MatrizA[3]+MatrizB[3]);
        E=(MatrizA[4]+MatrizB[4]);
        F=(MatrizA[5]+MatrizB[5]);
        G=(MatrizA[6]+MatrizB[6]);
        H=(MatrizA[7]+MatrizB[7]);
        I=(MatrizA[8]+MatrizB[8]);
        J=(MatrizA[9]+MatrizB[9]);
        K=(MatrizA[10]+MatrizB[10]);
        L=(MatrizA[11]+MatrizB[11]);
        M=(MatrizA[12]+MatrizB[12]);
        N=(MatrizA[13]+MatrizB[13]);
        Q=(MatrizA[14]+MatrizB[14]);
        O=(MatrizA[15]+MatrizB[15]);
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R4 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +" "+" "+ D +"|");
        System.out.println("|"+""+E+" "+" "+F+" "+" "+ G +" "+" "+ H +"|");
        System.out.println("|"+""+I+" "+" "+J+" "+" "+ K +" "+" "+ L +"|");
        System.out.println("|"+""+M+" "+" "+N+" "+" "+ Q +" "+" "+ O +"|");

    }
    public void RestaDeMatirzDeR4(){
        Scanner Lt=new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R4
        Double MatrizA[] = new Double[16];
        Double MatrizB[] = new Double[16];
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
        Double J;
        Double K;
        Double L;
        Double M;
        Double N;
        Double Q;
        Double O;

        //CLICLOS FOR PARA MATRICEZ EN R4
        for (int i = 0; i<MatrizA.length;i++){
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ A: ");
            MatrizA[i] = Lt.nextDouble();
        }
        for (int j = 0; j < MatrizB.length; j++) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ EN R4
        A =(MatrizA[0]+MatrizB[0]);
        B =(MatrizA[1]+MatrizB[1]);
        C=(MatrizA[2]+MatrizB[2]);
        D=(MatrizA[3]+MatrizB[3]);
        E=(MatrizA[4]+MatrizB[4]);
        F=(MatrizA[5]+MatrizB[5]);
        G=(MatrizA[6]+MatrizB[6]);
        H=(MatrizA[7]+MatrizB[7]);
        I=(MatrizA[8]+MatrizB[8]);
        J=(MatrizA[9]+MatrizB[9]);
        K=(MatrizA[10]+MatrizB[10]);
        L=(MatrizA[11]+MatrizB[11]);
        M=(MatrizA[12]+MatrizB[12]);
        N=(MatrizA[13]+MatrizB[13]);
        Q=(MatrizA[14]+MatrizB[14]);
        O=(MatrizA[15]+MatrizB[15]);
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R4 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +" "+" "+ D +"|");
        System.out.println("|"+""+E+" "+" "+F+" "+" "+ G +" "+" "+ H +"|");
        System.out.println("|"+""+I+" "+" "+J+" "+" "+ K +" "+" "+ L +"|");
        System.out.println("|"+""+M+" "+" "+N+" "+" "+ Q +" "+" "+ O +"|");

    }

    public void MatrizDeMultiplicasionEnR4() {
        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE MATRIZ EN R4
        Double MatrizA[] = new Double[16];
        Double MatrizB[] = new Double[16];
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
        Double J;
        Double K;
        Double L;
        Double M;
        Double N;
        Double Q;
        Double O;

        //CLICLOS FOR PARA MATRICEZ EN R4
        for (int i = 0; i<MatrizA.length;i++){
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ A: ");
            MatrizA[i] = Lt.nextDouble();
        }
        for (int j = 0; j < MatrizB.length; j++) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ B: ");
            MatrizB[j] = Lt.nextDouble();
        }
        //FORMULA PARA LA SUMA DE MATRIZ
        A = ((MatrizA[0] * MatrizB[0]) + (MatrizA[1] * MatrizB[4]) + (MatrizA[2]*MatrizB[8])+(MatrizA[3]*MatrizB[12]));
        B = ((MatrizA[0] * MatrizB[1]) + (MatrizA[1] * MatrizB[5]) + (MatrizA[2]*MatrizB[9])+(MatrizA[3]*MatrizB[13]));
        C = ((MatrizA[0] * MatrizB[2]) + (MatrizA[1] * MatrizB[6]) + (MatrizA[2]*MatrizB[10])+(MatrizA[3]*MatrizB[14]));
        D = ((MatrizA[0] * MatrizB[3]) + (MatrizA[1] * MatrizB[7]) + (MatrizA[2]*MatrizB[11])+(MatrizA[3]*MatrizB[15]));

        E=  ((MatrizA[4] * MatrizB[0]) + (MatrizA[5] * MatrizB[4]) + (MatrizA[6]*MatrizB[8])+(MatrizA[7]*MatrizB[12]));
        F=  ((MatrizA[4] * MatrizB[1]) + (MatrizA[5] * MatrizB[5]) + (MatrizA[6]*MatrizB[9])+(MatrizA[7]*MatrizB[13]));
        G=  ((MatrizA[4] * MatrizB[2]) + (MatrizA[5] * MatrizB[6]) + (MatrizA[6]*MatrizB[10])+(MatrizA[7]*MatrizB[14]));
        H=  ((MatrizA[4] * MatrizB[3]) + (MatrizA[5] * MatrizB[7]) + (MatrizA[6]*MatrizB[11])+(MatrizA[7]*MatrizB[15]));

        I=((MatrizA[8] * MatrizB[0]) + (MatrizA[9] * MatrizB[4]) + (MatrizA[10]*MatrizB[8])+(MatrizA[11]*MatrizB[12]));
        J=((MatrizA[8] * MatrizB[1]) + (MatrizA[9] * MatrizB[5]) + (MatrizA[10]*MatrizB[9])+(MatrizA[11]*MatrizB[13]));
        K=((MatrizA[8] * MatrizB[2]) + (MatrizA[9] * MatrizB[6]) + (MatrizA[10]*MatrizB[10])+(MatrizA[11]*MatrizB[14]));
        L=((MatrizA[8] * MatrizB[3]) + (MatrizA[9] * MatrizB[7]) + (MatrizA[10]*MatrizB[11])+(MatrizA[11]*MatrizB[15]));

        M=((MatrizA[12] * MatrizB[0]) + (MatrizA[13] * MatrizB[4]) + (MatrizA[14]*MatrizB[8])+(MatrizA[15]*MatrizB[12]));
        N=((MatrizA[12] * MatrizB[1]) + (MatrizA[13] * MatrizB[5]) + (MatrizA[14]*MatrizB[9])+(MatrizA[15]*MatrizB[13]));
        Q=((MatrizA[12] * MatrizB[2]) + (MatrizA[13] * MatrizB[6]) + (MatrizA[14]*MatrizB[10])+(MatrizA[15]*MatrizB[14]));
        O=((MatrizA[12] * MatrizB[3]) + (MatrizA[13] * MatrizB[7]) + (MatrizA[14]*MatrizB[11])+(MatrizA[15]*MatrizB[15]));
        // IMPRIMIR RESULTADOS

        System.out.println("           EL RESULTADO DE LA MATRIZ R4 ES:     ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +" "+ D +"|");
        System.out.println("|"+""+E+" "+" "+F+" "+" "+ G +" "+ H +"|");
        System.out.println("|"+""+I+" "+" "+J+" "+" "+ K +" "+ L +"|");
        System.out.println("|"+""+M+" "+" "+N+" "+" "+ Q +" "+ O +"|");
    }
    public void EscalarPorUnaMatrizEnR4(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[16];
        Double A;
        Double B;
        Double C;
        Double D;
        Double E;
        Double F;
        Double G;
        Double H;
        Double I;
        Double J;
        Double K;
        Double L;
        Double M;
        Double N;
        Double Q;
        Double O;
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
        J=Escalar*VectorA[9];
        K=Escalar*VectorA[10];
        L=Escalar*VectorA[11];
        M=Escalar*VectorA[12];
        N=Escalar*VectorA[13];
        Q=Escalar*VectorA[14];
        O=Escalar*VectorA[15];
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DEL ESCALAR POR LA MATRIZ EN R4 ES: ");
        System.out.println("                                                                                             ");
        System.out.println("|"+""+A+" "+" "+B+" "+" "+ C +" "+ D +"|");
        System.out.println("|"+""+E+" "+" "+F+" "+" "+ G +" "+ H +"|");
        System.out.println("|"+""+I+" "+" "+J+" "+" "+ K +" "+ L +"|");
        System.out.println("|"+""+M+" "+" "+N+" "+" "+ Q +" "+ O +"|");

    }

}
