import models.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaDivisa consultaDivisa = new ConsultaDivisa();
        Scanner scanner = new Scanner(System.in);
        Integer opcion = 0;

        while (true) {
            System.out.println("""
                    ********************************************************
                    Bienvenido al conversor de divisas
                    
                    1) Dolar =>> Peso Chileno
                    2) Peso Chileno =>> Dolar
                    3) Dolar =>> Euro
                    4) Euro =>> Dolar
                    5) Doar =>> Real Brasileño
                    6) Real Brasileño =>> Dolar
                    7) Dolar =>> Yen Japones
                    8) Yen Japones =>> Dolar
                    9) Salir
                    
                    Elija una opcion:
                    ********************************************************
                    """);

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        Moneda conversion = consultaDivisa.buscarDivisa("USD", "CLP");
                        System.out.println(conversion.conversion_rate());
                        break;
                    case 2:
                        Moneda conversion2 = consultaDivisa.buscarDivisa("CLP", "USD");
                        System.out.println(conversion2.conversion_rate());
                        break;
                    case 3:
                        Moneda conversion3 = consultaDivisa.buscarDivisa("USD", "EUR");
                        System.out.println(conversion3.conversion_rate());
                        break;
                    case 4:
                        Moneda conversion4 = consultaDivisa.buscarDivisa("EUR", "USD");
                        System.out.println(conversion4.conversion_rate());
                        break;
                    case 5:
                        Moneda conversion5 = consultaDivisa.buscarDivisa("USD", "BRL");
                        System.out.println(conversion5.conversion_rate());
                        break;
                    case 6:
                        Moneda conversion6 = consultaDivisa.buscarDivisa("BRL", "USD");
                        System.out.println(conversion6.conversion_rate());
                        break;
                    case 7:
                        Moneda conversion7 = consultaDivisa.buscarDivisa("USD", "JPY");
                        System.out.println(conversion7.conversion_rate());
                        break;
                    case 8:
                        Moneda conversion8 = consultaDivisa.buscarDivisa("JPY", "USD");
                        System.out.println(conversion8.conversion_rate());
                        break;
                    case 9:
                        System.out.println("Gracias por usar el conversor de divisas");
                        System.exit(0);
                        break;
                }
        }
    }}
