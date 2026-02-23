package model;

		public class Pet extends Animal implements Comportamento {
		    private String nome;
		    private int idade;
		    private String dono;

		    public Pet(String nome, int idade, String dono, String especie) {
		        this.nome = nome;
		        this.idade = idade;
		        this.dono = dono;
		        this.setEspecie(especie);
		    }

		    // Encapsulamento: Getters e Setters
		    public String getNome() { return nome; }
		    
		    public void setNome(String nome) { this.nome = nome; }
		    

		    public int getIdade() {
				return idade;
			}

			public void setIdade(int idade) {
				this.idade = idade;
			}

			public String getDono() {
				return dono;
			}

			public void setDono(String dono) {
				this.dono = dono;
			}

			public void emitirSom(){
				System.out.println("au au");
			}
			
			public void abanarRabo() {
				System.out.println("abanando o rabo!");
			}
			
		    @Override
		    public String toString() {
		        return "nome: " + this.nome + ", idade: " + this.idade + ", dono: " + this.dono + ", especie: " + this.getEspecie();
		        }
		}




