package mecanica.model.domain;

import java.io.Serializable;

public class Veiculo implements Serializable {

    private String placa;
    private String nome;
    private String marca;
    private ModeloVeiculo modelo;
    private Cliente cliente;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public ModeloVeiculo getModeloVeiculo(){
        return modelo;
    }
    
    public void setModeloVeiculo(ModeloVeiculo modelo){
        this.modelo = modelo;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("(Placa: %s, Nome: %s, Marca: %s, Cod_Modelo: %d, Cod_Cliente: %s)",
                placa, nome, marca, modelo.getcdModeloVeiculo(), cliente.getcdCliente());
    }
}