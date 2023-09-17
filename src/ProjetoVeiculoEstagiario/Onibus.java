package ProjetoVeiculoEstagiario;

class Onibus extends Veiculo {
    private int assentos;
    private int rodas;

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo, int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario, String estadoUF, String cidadeUF, int assentos, int rodas) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel, codigoRenavam, nomeProprietario, estadoUF, cidadeUF);
        this.assentos = assentos;
        this.rodas = rodas;
    }

    public void abrirPortas() {
        System.out.println("Portas do ônibus abertas.");
    }

    public void fecharPortas() {
        System.out.println("Portas do ônibus fechadas.");
    }
}
