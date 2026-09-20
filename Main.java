import java.util.ArrayList;
import java.util.List;

List<Veiculo> veiculos = new ArrayList<>();

void main(){
    boolean executando = true;
    
    while (executando) {
    String rMenu = IO.readln("""
            ===== CADASTRO DE VEÍCULOS =====
            1 - CADASTRAR VEÍCULO
            2 - LISTAR VEÍCULO
            3 - CONSULTAR VEÍCULO
            0 - SAIR
            """);
    
        switch(rMenu){
            case "1":
                cadastrarVeiculos();
                break;
            case "2":
                listarVeiculos();
                break;
            case "3":
                consultarVeiculos();
                break;
            case "0":
                executando = false;
                IO.println("Sistema encerrado.")
                break;
            default:
                IO.println("Opção Inválida");
        }

    }        
}

public void cadastrarVeiculos(){
    IO.println("""
            ===== CADASTRO DE VEÍCULO =====
            """);
    String marca = IO.readln("Qual é a marca do seu veículo? ");
    String modelo = IO.readln("Qual é o modelo do seu veículo? ");
    int ano = Integer.parseInt(IO.readln("Qual é o ano do seu veículo? "));
    String placa = IO.readln("Qual é a placa do seu veículo? ");

    for (Veiculo veiculo : veiculos) {
        if (veiculo.placa.equalsIgnoreCase(placa)) {
            IO.println("Já existe um veículo cadastrado com essa placa.")
            return;
        }
    }
    
    Veiculo novoVeiculo = new Veiculo(marca, modelo, ano, placa);
    
    if (novoVeiculo.ano < 1900 || novoVeiculo.calculaTempoUso() < -1) {
        IO.println("Ano inválido.");
        return;
    }

    veiculos.add(novoVeiculo);

    IO.println("Veículo cadastrado com sucesso!");

    }

}

public void listarVeiculos(){
    IO.println(" ===== VEÍCULOS CADASTRADOS ===== ");

    if (veiculos.isEmpty()) {
        IO.println("Nenhum veículo cadastrado.");
        return;
    }
    for (Veiculo veiculo : veiculos) {
        IO.println("Marca: " + veiculo.marca);
        IO.println("Modelo: " + veiculo.modelo);
        IO.println("Ano: " + veiculo.ano);
        IO.println("Placa: " + veiculo.placa);
        IO.println("---------------------------------");
    }

}

public void consultarVeiculos(){

    String placaConsulta = IO.readln("Digite a placa do veículo que deseja consultar: ");

    for (Veiculo veiculo: veiculos) {

        if (veiculo.placa.equalsIgnoreCase(placaConsulta)) {
            IO.println("===== VEÍCULO ENCONTRADO =====");
            IO.println("Marca: " + veiculo.marca);
            IO.println("Modelo: " + veiculo.modelo);
            IO.println("Ano: " + veiculo.ano);
            IO.println("Placa: " + veiculo.placa);
            return;
        }
    }
    
    IO.println("Nenhum veículo encontrado com essa placa.")

}