package BlocodeInicializacaoEstaticoDominio;

public class Aula {
	
		private String nome;
		private static int[] episodios;
		
		// 0 bloco de inicilização é executado quando JVM carregar classe
		// 1º Alocado espaço em memoria pra objeto
		//2º cada atributo de classe e criado e inicializado com valores default ou o quer for passado.
		//3º bloco de inicialização e executado
		//4º construtor e executado
		
		static{
			System.out.println("Dentro do bloco de inicialização static 1");
			episodios= new int[100];
			for (int i = 0; i < episodios.length; i++) {
				episodios[i]=i+1;
			}
		}
			static {
				System.out.println("Dentro do bloco de inicialização static 2");
			}
			
			static{
				System.out.println("Dentro do bloco de inicialização static 3");
			}	
			{
				System.out.println("Dentro do bloco de inicialização Não static");
			}	
		
		
		public Aula() {
				
			for(int episodios: Aula.episodios) {
			System.out.println(episodios + " ");
			}
			System.out.println();
		}
		public Aula(String nome) {
			this.nome = nome;
		}
		
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}

	}

