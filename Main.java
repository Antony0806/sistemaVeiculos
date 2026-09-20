import java.util.ArrayList;
import java.util.List;

List<Veiculo> veiculos = new ArrayList<>();
void main(){
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
            case "2":
                listarVeiculos();
            case "3":
                consultarVeiculos();
            case "0":
                break;
            default -> IO.println("Opção Inválida");

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
    
    Veiculo novoVeiculo = new Veiculo(marca, modelo, ano, placa);
    veiculos.add(novoVeiculo);

    IO.println("Veículo cadastrado com sucesso!");
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

}