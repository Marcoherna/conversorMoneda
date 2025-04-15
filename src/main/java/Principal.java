import models.Moneda;

public class Principal {
    public static void main(String[] args) {

        ConsultaDivisa consultaDivisa = new ConsultaDivisa();
        Moneda divisa = consultaDivisa.buscarDivisa("USD", "EUR");
        System.out.println(divisa.conversion_rate());
    }
}
