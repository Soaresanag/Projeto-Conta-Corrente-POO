/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class Paciente { //Inicio do escopo
     //atributos
    private String nome = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    //Metodos
    public Paciente(String nome, int peso, float altura, String sexo)throws Exception{
        if (peso<=0) throw new Exception("O peso nao pode ser menor ou igual a 0.");
        if (altura<=0) throw new Exception("A altura nao pode ser menor ou igual a 0.");
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) throws Exception {//metodo lançador de exceções
        if(peso<=0) throw new Exception("O peso nao pode ser <=0");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{//metodo lançador de exceções
    if(altura<=0)throw new Exception("A altura nao pode ser <=0");
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //metodos

    public float calcularIMC() {
        return (peso/(altura * altura));
    }
    public String calcularFaixaDeRisco(){
        float imc = calcularIMC();
        if(imc < 20)return ("Abaixo do peso ideal");
        if (imc <= 25)return("Peso normal");
        if (imc <=35)return("Excesso de peso");
        if(imc <= 35)return("Obesidade");
        return("Obesidade mórbida");
    }
    public float calcularPesoIdeal(){
        if (sexo.equalsIgnoreCase("masculino"))
            return (float)((72.7*altura)-58);
        else
            return (float)((62.1*altura)-44.7);
    }
    
} //fim do escopo
