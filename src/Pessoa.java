
class Pessoa {
    private int numero;   
    private String nome;
    private int idade;

    public void adicionarNumero(int numero){
        if (numero > 0 ){
            this.numero = numero;
        }
        else{
           System.err.println("Numero incorreto.");
        }
    }
    public void adicionarNome(String nome){
        this.nome = nome;
    }
    public void adicionarIdade(int idade){
    if (idade<=0){
            System.err.println("Idade inválida");
    }
    else{
            this.idade = idade;
    }
    }
    public void apresentardados(){
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println( "Numero de celular: " + numero);
    }
    }  