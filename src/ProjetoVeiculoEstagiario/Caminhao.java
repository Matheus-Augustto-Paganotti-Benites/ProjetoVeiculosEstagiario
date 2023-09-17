package ProjetoVeiculoEstagiario;

class Caminhao extends Veiculo {
    private int eixos;
    private double pesoLiquido;
    private double pesoTotal;

    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF, int eixos, double pesoLiquido, double pesoTotal) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF);
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
    }

    public void carregarCarga() {
        System.out.println("Caminhão carregando carga.");
    }

    public void descarregarCarga() {
        System.out.println("Caminhão descarregando carga.");
    }
}