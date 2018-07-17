package com.company;
public class Main {
    public static void main(String[] args) {
        //VARIABLES DE VECTORES
        //MENU DE R3
        VectorR2 R2 = new VectorR2();
        MatrizR2 R2A= new MatrizR2();
        //MENU DE R3
        VectorR3 R3 = new VectorR3();
        MatrizR3 R3A= new MatrizR3();
        //MENU DE R4
        VectorR4 R4= new VectorR4();
        MatrizR4 R4A = new MatrizR4();
        //VARIABLES DE MENU
        Menu menuu = new Menu();
        int opcion = 0;
        //MENU R2
        int MenuR2;
        //MENU R3
        int MenuR3;
        //MENUR4
        int MenuR4;
        //ESTRUCTURAS DEL MENU
        while (opcion != 4) {
            opcion = menuu.menu();
            switch (opcion) {
                case 1:
                    MenuR2 = menuu.MenuR2();
                    while (MenuR2!=10)
                    switch (MenuR2){
                        case 1:
                            R2.VectorSumaEnR2();
                            break;
                        case 2:
                            R2.RestaDeVectorEnR2();
                            break;
                        case 3:
                            R2.VectorMultiplicasionEnR2();
                            break;
                        case 4:
                            R2.VectorPorEscalarEnR2();
                            break;
                        case 5:
                            R2.VectorPorMatriz();
                            break;
                        case 6:
                            R2A.SumaDeMatrizDeR2();
                            break;
                        case 7:
                            R2A.RestaDeMatrizDeR2();
                            break;
                        case 8:
                            R2A.MatrizDeMultiplicasionEnR2();
                            break;
                        case 9:
                            R2A.EscalarPorUnaMatrizEnR2();
                            break;
                        default:
                            System.out.println("Saliendo...");
                            break;
                    }

                case 2:
                    MenuR3 = menuu.MenuR3();
                    while (MenuR3!=10){
                        switch (MenuR3){
                            case 1:
                                R3.VectorSumaEnR3();
                                break;
                            case 2:
                                R3.VectorRestaEnR3();
                                break;
                            case 3:
                                R3.VectorMultiplicasionEnR3();
                                break;
                            case 4:
                                R3.VectorPorEscalarEnR3();
                                break;
                            case 5:
                                R3.VectorPorMatrizEnR3();
                                break;
                            case 6:
                                R3A.SumaDeMatrizDeR3();
                                break;
                            case 7:
                                R3A.RestaDeMatrizDeR3();
                                break;
                            case 8:
                                R3A.MatrizDeMultiplicasionEnR3();
                                break;
                            case 9:
                                R3A.EscalarPorUnaMatrizEnR3();
                                break;

                            default:
                                System.out.println("Saliendo...");
                                break;

                        }

                        }

                case 3:
                    MenuR4 = menuu.MenuR4();
                    while (MenuR4!=11){

                        switch (MenuR4) {
                            case 1:
                                R4.VectorDeSumaEnR4();
                                break;
                            case 2:
                               R4.VectorDeRestaEnR4();
                                break;
                            case 3:
                                R4.VectorMultiplicasionEnR4();
                                break;
                            case 4:
                                R4.VectorPorEscalarEnR4();
                                break;
                            case 5:
                                R4.VectorPorMatrizEnR4();
                                break;
                            case 6:
                                R4A.SumaDeMatirzDeR4();
                                break;
                            case 7:
                                R4A.RestaDeMatirzDeR4();
                                break;
                            case 8:
                                R4A.MatrizDeMultiplicasionEnR4();
                                break;
                            case 9:
                                R4A.EscalarPorUnaMatrizEnR4();
                                break;
                            case 10:
                            default:
                                System.out.println("Saliendo...");
                                break;
                        }}
                case 4:
                default:
                    System.out.println("Saliendo...");
                    break;


            }

        }


    }

    }
