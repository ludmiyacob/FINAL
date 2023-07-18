public class Ejercicio3 {
    public String numeroCuenta;
    private double saldo;

    public void CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo(){
        return saldo;


    }


    public static void main(String[] args) {
        CuentaBancaria[] cuentas = new CuentaBancaria[3];

        cuentas[0] = new CuentaBancaria("123456789", 1500.0);
        cuentas[1] = new CuentaBancaria("987654321", 2500.0);
        cuentas[2] = new CuentaBancaria("456789123", 1000.0);

        CuentaBancaria cuentaSaldoMasAlto = obtenerCuentaSaldoMasAlto(cuentas);

        System.out.println("Información de la cuenta con el saldo más alto:");
        System.out.println("Número de cuenta: " + cuentaSaldoMasAlto.getNumeroCuenta());
        System.out.println("Saldo: " + cuentaSaldoMasAlto.getSaldo());
    }

    public static CuentaBancaria obtenerCuentaSaldoMasAlto(CuentaBancaria[] cuentas) {
        CuentaBancaria cuentaSaldoMasAlto = cuentas[0];

        for (int i = 1; i < cuentas.length; i++) {
            if (cuentas[i].getSaldo() > cuentaSaldoMasAlto.getSaldo()) {
                cuentaSaldoMasAlto = cuentas[i];
            }
        }

        return cuentaSaldoMasAlto;
    }
}
