package sistema;

public class Sistema {
    public static void main(String[] args) {

        System.out.println("Rodando o sistema");
        Alunose[] alunos = new Aluno[50];

        int indice = 74;
        //tratamento de exceções
        try {
            //tenta executar esse comando
            System.out.println(alunos[indice]);
        }catch (ArrayIndexOutOfBoundsException){
            //se houver algum erro no bloco anterior
            //esse comando será executado
            System.out.println("Aluno inexistente");
        }catch (Exception erro){
            //pode-se usar um catch para cada tipo de erro
            //possivel no bloco try
            System.out.println("exceção inesperada");
        }finally {
            //esse comando será executado sempre
            System.out.println("executou o finally");
        }


    }
}
