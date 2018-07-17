package com.company;

import java.util.Scanner;

public class VectorR4 {
    //SCANNER PARA INGRESO DE TECLADO
    public void VectorDeSumaEnR4(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[4];
        Double VectorB[]=new Double[4];
        Double primervector;
        Double segundovector;
        Double tercervector;
        Double cuartovector;
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
        cuartovector=(VectorA[3]+VectorB[3]);
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE SUMA DE VETORES EN R4: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" , " +tercervector+" k "+" "
                +" , "+ cuartovector+" "+" t "+" |");



    }
    public void VectorDeRestaEnR4(){
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[4];
        Double VectorB[]=new Double[4];
        Double primervector;
        Double segundovector;
        Double tercervector;
        Double cuartovector;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" "+" " + "  " + " "+" "+" INTRODUZCA VALORES DE VECTOR EN R4:  " );
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
        cuartovector=(VectorA[3]+VectorB[3]);
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE RESTA DE VETORES EN R4: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+primervector+" i "+","+" "+segundovector+" j "+" , " +tercervector+" k "+" "
                +" , "+ cuartovector+" "+" t "+" |");



    }
    public void VectorMultiplicasionEnR4() {
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[4];
        Double VectorB[]=new Double[4];
        Double primervector;
        Double segundovector;
        Double tercervector;
        Double cuartovector;
        Double Total;
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR A: ");
            VectorA[i]=Lt.nextDouble();

        }
        for (int j = 0; j <VectorB.length; j++){

            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR B: ");
            VectorB[j] = Lt.nextDouble();

        }
        // IMPRIMIR RESULTADOS
        //primervector = (VectorA[0]*VectorB[0]);
        //segundovector= (VectorA[1]*VectorB[1]);
        //tercervector=  (VectorA[2]*VectorB[2]);
        primervector=(VectorA[1]*VectorB[2]-VectorA[2]*VectorB[1]);
        segundovector=-(VectorA[0]*VectorB[2]-VectorA[2]*VectorB[0]);
        tercervector=( (VectorA[0]*VectorB[1] )-(VectorA[1]*VectorB[0]));
        cuartovector=( (VectorA[0]*VectorB[1] )-(VectorA[1]*VectorB[0]));
        Total = primervector+segundovector+tercervector+cuartovector;
        //IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE LA MULTIPLICASION DE VECTORES EN R4: ");
        System.out.println("                                                                                             ");
        System.out.println("PRODUCTO VECTORIAL: "+primervector+" i "+ " , "+" "+segundovector+" j "+" , "+" "+tercervector+" k"+" "+" , "+
                " "+cuartovector+ " z "+ " " + " |" );
        System.out.println("PRODUCTO PUNTO: "+ Total);
    }
    public void VectorPorEscalarEnR4() {
        Scanner Lt = new Scanner(System.in);
        Double VectorA[]=new Double[4];
        Double primervector;
        Double segundovector;
        Double tercervector;
        Double cuartovector;
        Double Escalar;
        System.out.println("INTRODUZCA EL VALOR DEL ESCALAR: ");
        Escalar=Lt.nextDouble();
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR EN R4: ");
            VectorA[i]=Lt.nextDouble();

        }

        // FORMULAS PARA ESCALAR POR UN VECTOR
        primervector=Escalar*VectorA[0];
        segundovector=Escalar*VectorA[1];
        tercervector=Escalar*VectorA[2];
        cuartovector=Escalar*VectorA[3];
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DEL ESCALAR POR VECTOR EN R4: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+"| "+primervector+" i "+","+" "+segundovector+" j "+" , "+" "+tercervector+" k " +" "+
                " , "+" "+cuartovector+" z "+ " |");
    }
    public void VectorPorMatrizEnR4(){
        Scanner Lt = new Scanner(System.in);
        //ARREGLO DE VECTOR
        Double VectorA[]=new Double[4];
        //ARREGLOS DE MATRIZ
        Double MatrizA[]=new Double[4];
        Double MatrizB[]=new Double[4];
        Double MatrizC[]=new Double[4];
        Double MatrizD[]=new Double[4];
        //VARIABLES
        Double ResultadoA;
        Double ResultadoB;
        Double ResultadoC;
        Double ResultadoD;
        //TITULO DE PRESENTACION
        System.out.println("  "+"  "+"   "+" INTRODUZCA LOS VALORES DEL VECTOR EN R4: "+"  "+ "  ");
        //CICLOS FOR PARA VECTOR:
        for (int i = 0; i <VectorA.length ;i++ ) {
            System.out.println("INTRODUZCA LOS VALORES DEL VECTOR ");
            VectorA[i]=Lt.nextDouble();

        }
        //TITULO DE PRESENTACION
        System.out.println(" "+" "+" "+" INTRODUZCA LOS VALORES DE LA MATRIZ EN ORDEN DE FILA------------");
        System.out.println(" ");
        System.out.println(" ");
        //CICLOS FOR LA MATRIZ
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
        for (int z = 0; z <MatrizD.length;z++ ) {
            System.out.println("INTRODUZCA LOS VALORES DE LA MATRIZ EN FILA D: ");
            MatrizD[z]=Lt.nextDouble();

        }
        // FORMULAS PARA ESCALAR POR UN VECTOR
        ResultadoA=((VectorA[0]*MatrizA[0])+(VectorA[1]*MatrizB[0])+(VectorA[2]*MatrizC[0])+(VectorA[3]*MatrizD[0]));
        ResultadoB=((VectorA[0]*MatrizA[1])+(VectorA[1]*MatrizB[1])+(VectorA[2]*MatrizC[1])+(VectorA[3]*MatrizD[1]));
        ResultadoC=((VectorA[0]*MatrizA[2])+(VectorA[1]*MatrizB[2])+(VectorA[2]*MatrizC[2])+(VectorA[3]*MatrizD[2]));
        ResultadoD=((VectorA[0]*MatrizA[3])+(VectorA[1]*MatrizB[3])+(VectorA[2]*MatrizC[3])+(VectorA[3]*MatrizD[3]));
        // IMPRIMIR RESULTADOS
        System.out.println("    EL RESULTADO DE EL VECTOR POR LA MATRIZ EN R4 ES: ");
        System.out.println("                                                                                             ");
        System.out.println( " "+" "+" "+" "+ "| "+ResultadoA+" "+" "+" "+" "+ResultadoB+" "+"  " +ResultadoC+" "+" "+ResultadoD+" |");

    }



}
