import java.time.LocalDate;

public class Veiculo {
    
    public String marca;
    public String modelo;
    public int ano;
    public String placa;

    public Veiculo(String marca, String modelo, int Ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;

    }

    int calculaTempoUso(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.ano;
    }

}
