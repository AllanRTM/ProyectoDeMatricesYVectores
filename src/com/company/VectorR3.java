package com.company;

import java.util.Scanner;

public class VectorR3 {

    public void VectorSumaEnR3() {
        //SCANNER PARA INGRESO DE TECLADO
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[3];
        Double VectorB[]=new Double[3];
        Double tercervector;
        Double primervector;
        Double segundovector;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" "+" " + "  " + " "+" "+" INTRODUZCA VALORES DE VECTOR:  " );
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES EN FILA DEL VECTOR A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("INTRODUZCA LOS VALORES EN FILA DE VECTOR B:   ");
            VectorB[j] = Lt.nextDouble();

        }

        //FORMULAS DE RESULTADOS
        primervector=(VectorA[0]+VectorB[0]);
        segundovector=(VectorA[1]+VectorB[1]);
        tercervector= (VectorA[2]+VectorB[2]);
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE SUMA DE VETORES EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" , " +tercervector+" k "+" |");
    }
    public void VectorRestaEnR3() {
        //SCANNER PARA INGRESO DE TECLADO
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[3];
        Double VectorB[]=new Double[3];
        Double tercervector;
        Double primervector;
        Double segundovector;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" "+" " + "  " + " "+" "+" INTRODUZCA VALORES DE VECTOR:  " );
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES EN FILA DEL VECTOR A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("INTRODUZCA LOS VALORES EN FILA DE VECTOR B:   ");
            VectorB[j] = Lt.nextDouble();

        }

        //FORMULAS DE RESULTADOS
        primervector=(VectorA[0]-VectorB[0]);
        segundovector=(VectorA[1]-VectorB[1]);
        tercervector= (VectorA[2]-VectorB[2]);
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE SUMA DE VETORES EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" , " +tercervector+" k "+" |");
    }

    public void VectorMultiplicasionEnR3() {
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[3];
        Double VectorB[]=new Double[3];
        Double primervector;
        Double segundovector;
        Double tercervector;
        Double Total;
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("Introduzca el valor de A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("Introduzca el valor de B: ");
            VectorB[j] = Lt.nextDouble();

        }
        // IMPRIMIR RESULTADOS
        //primervector = (VectorA[0]*VectorB[0]);
        //segundovector= (VectorA[1]*VectorB[1]);
        //tercervector=  (VectorA[2]*VectorB[2]);
        primervector=(VectorA[1]*VectorB[2]-VectorA[2]*VectorB[1]);
        segundovector=-(VectorA[0]*VectorB[2]-VectorA[2]*VectorB[0]);
        tercervector=( (VectorA[0]*VectorB[1] )-(VectorA[1]*VectorB[0]));
        Total = primervector+segundovector+tercervector;
        //IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE SUMA DE VETORES EN R2: ");
        System.out.println("                                                                                             ");
        System.out.println("PRODUCTO VECTORIAL: "+primervector+" i "+ " , "+" "+segundovector+" j "+" , "+" "+tercervector+" k");
        System.out.println("PRODUCTO PUNTO: "+Total);



    }
    public void VectorPorEscalarEnR3() {
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[3];
        Double primervector;
        Double segundovector;
        Double tercervector;
        Double Escalar;
        System.out.println("INTRODUZCA EL VALOR DEL ESCALAR: ");
        Escalar=Lt.nextDouble();
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR: ");
            VectorA[i]=Lt.nextDouble();

        }

        // FORMULAS PARA ESCALAR POR UN VECTOR
        primervector=Escalar*VectorA[0];
        segundovector=Escalar*VectorA[1];
        tercervector=Escalar*VectorA[2];
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DEL ESCALAR POR EL VECTOR EN R3 ES: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" , "+" "+tercervector+" k " +" |");

    }
    public void VectorPorMatrizEnR3(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[3];
        Double MatrizA[]=new Double[3];
        Double MatrizB[]=new Double[3];
        Double MatrizC[]=new Double[3];
        Double ResultadoA;
        Double ResultadoB;
        Double ResultadoC;

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
        for (int r = 0; r <MatrizC.length;r++ ) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ EN FILA C: ");
            MatrizC[r]=Lt.nextDouble();

        }


        // FORMULAS PARA ESCALAR POR UN VECTOR
        ResultadoA=((VectorA[0]*MatrizA[0])+(VectorA[1]*MatrizB[0])+(VectorA[2]*MatrizC[0]));
        ResultadoB=((VectorA[0]*MatrizA[1])+(VectorA[1]*MatrizB[1])+(VectorA[2]*MatrizC[1]));
        ResultadoC=((VectorA[0]*MatrizA[2])+(VectorA[1]*MatrizB[2])+(VectorA[2]*MatrizC[2]));
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE EL VECTOR POR LA MATRIZ EN R3 ES: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+ResultadoA+" "+" "+" "+" "+ResultadoB+" "+"  " +ResultadoC+" |");
    }


}