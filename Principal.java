import  java.util.ArrayList;

public class Principal{
	public static void main(String[] args){
		Aluno aux;
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		for(int i = 0; i < 5; i++){
			aux = new Aluno();
			aux.setIdade(i);
			aux.setNome("José");
			alunos.add(aux);
		}
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j < 5; j++){
                        if(alunos.get(j).getIdade() > alunos.get(i).getIdade()){
                            aux = new Aluno();
                            aux.setNome(alunos.get(i).getNome());
                            aux.setIdade(alunos.get(i).getIdade());
                            alunos.get(i).setNome(alunos.get(j).getNome());
                            alunos.get(i).setIdade(alunos.get(j).getIdade());
                            alunos.get(j).setNome(aux.getNome());
                            alunos.get(j).setIdade(aux.getIdade());
                        }
                    }
                }
                for(int i = 0; i < 5; i++){
                    System.out.println("Nome: " + alunos.get(i).getNome() + " Idade: " + alunos.get(i).getIdade());
                }
	}
}
