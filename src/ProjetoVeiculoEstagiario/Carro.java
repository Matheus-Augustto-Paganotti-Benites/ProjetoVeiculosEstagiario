package ProjetoVeiculoEstagiario;

class Carro extends Veiculo {
    private int assentos;
    private int portas;
    private int rodas;
    private double potencia;

    public Carro(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF, int assentos, int portas, int rodas, double potencia) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF);
        this.assentos = assentos;
        this.portas = portas;
        this.rodas = rodas;
        this.potencia = potencia;
    }

    public void ligarFarol() {
        System.out.println("Faróis do carro ligados.");
    }

    public void trocarMarcha() {
        System.out.println("Troca de marcha realizada.");
    }
}
