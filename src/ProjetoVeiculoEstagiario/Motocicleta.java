package ProjetoVeiculoEstagiario;

class Motocicleta extends Veiculo {
    private int assentos;
    private double potencia;

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF, int assentos, double potencia) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF);
        this.assentos = assentos;
        this.potencia = potencia;
    }

    public void empinar() {
        System.out.println("Motocicleta empinando.");
    }

    public void frear() {
        System.out.println("Motocicleta freando.");
    }
}
