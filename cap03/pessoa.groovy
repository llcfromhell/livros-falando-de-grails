class Pessoa {
    String nome
    String sobrenome
    boolean ativa
    
    String getNome() {
       "meu nome é $nome"
    }
}

//Pessoa pessoa = new Pessoa()
//Pessoa pessoa = new Pessoa(nome:"Henrique", sobrenome:"Lobo")
Pessoa pessoa = new Pessoa(nome:"Henrique", sobrenome:"Lobo", ativa: true)
pessoa.setNome("Henrique")
println "${pessoa.nome} ${pessoa.sobrenome} ${pessoa.ativa}"
println pessoa.@nome