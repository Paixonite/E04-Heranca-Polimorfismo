public class PessoaJuridica extends Cliente{
    String cnpj;
    int numFuncionarios;
    String setor;

    public PessoaJuridica(String nome, String cnpj, String endereco, int numFuncionarios, String setor){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    void imprimir(){
        System.out.println("PESSOA JURIDICA!");
        System.out.println("CNPJ: " + cnpj);
        System.out.println("N~umero de funcionãrios: " + numFuncionarios);
        System.out.println("Setor: " + setor);
    }
}
