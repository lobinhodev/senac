package br.senac.rj.teste;

public class ContaCorrenteEspecial extends Conta {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;

    }

    public ContaCorrenteEspecial(int agencia, int numero, double saldo, double limite) {
        super(agencia, numero, saldo);
        this.limite = limite;
    }

    public ContaCorrenteEspecial(int numAgencia, int numConta) {
        super(numAgencia, numConta);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
        this.limite = this.limite - valor;
    }

    // sobrescrita, estamos criando um metodo que ja existe na classe pai,
    // sobreescrevendo o metodo saca
    @Override
    public boolean saca(double valor) {
        double novoSaldo = this.saldo - valor;

        // 0 - 1000 = -1000
        // 1000 - 0 = 1000
        // limite não pode ser negativo, logo precisamos comprar com o negativo
        if (novoSaldo < (this.limite * -1)) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            this.saldo = novoSaldo;
            return true;
        }
    }

    @Overwrite // especialização
    public boolean saca(double valor, double imposto) {
        double novoValorSaque = valor + (valor * imposto / 100);

        System.out.println("Imposto: " + imposto + "%");
        System.out.println("Valor do imposto: " + novoValorSaque + " reais");

        if (!this.saca(novoValorSaque)) {
            return false;
        } else {
            return true;
        }
    }

}
