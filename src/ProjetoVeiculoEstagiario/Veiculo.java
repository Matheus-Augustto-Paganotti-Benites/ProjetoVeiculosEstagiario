package ProjetoVeiculoEstagiario;

public abstract class Veiculo {
    private int codigo;
    private String nome;
    private String modelo;
    private String cor;
    private String chassi;
    private String placa;
    private int anoModelo;
    private int anoFabricacao;
    private String fabricante;
    private String tipoCombustivel;
    private String codigoRenavam;
    private String nomeProprietario;
    private String estadoUF;
    private String cidadeUF;

    public Veiculo(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.fabricante = fabricante;
        this.tipoCombustivel = tipoCombustivel;
        this.codigoRenavam = codigoRenavam;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }

    public void ligar() {
        System.out.println("Veículo ligado.");
    }

    public void desligar() {
        System.out.println("Veículo desligado.");
    }
}

