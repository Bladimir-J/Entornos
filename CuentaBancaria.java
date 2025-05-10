public class CuentaBancaria {
    private String numCuenta;
    private String nomTitular;
    private double saldo;
    private double tipoIntereses;

    public CuentaBancaria(String numCuenta, String nomTitular, double saldo) {
        this.numCuenta = numCuenta;
        this.nomTitular = nomTitular;
        ingreso(saldo);
    }

    public CuentaBancaria(String numCuenta, String nomTitular, double saldo, double tipoIntereses) {
        this.numCuenta = numCuenta;
        this.nomTitular = nomTitular;
        this.tipoIntereses = tipoIntereses;
        ingreso(saldo);
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public void setTipoIntereses(double tipoIntereses) {
        this.tipoIntereses = tipoIntereses;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoIntereses() {
        return tipoIntereses;
    }

    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        } else {
            System.out.println("ERROR. La Cantidad debe ser >= 0");
        }
    }

    public void reintegro(double cantidad) {
        if (cantidad > 0) {
            if (cantidad > saldo) {
                System.out.println("Saldo Insuficiente");
            } else {
                saldo = saldo - cantidad;
            }
        } else {
            System.out.println("ERROR. La Cantidad debe ser >= 0");
        }
    }
}
