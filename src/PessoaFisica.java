public class PessoaFisica extends Cliente{
    String cpf;
    int idade;
    char sexo;

    public PessoaFisica(String nome, String cpf, String endereco, int idade, char sexo){
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    void imprimir(){
        System.out.println("PESSOA FISICA!");
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
