package BlocodeInicializacaoEstaticoDominio;

public class Aula {
	
		private String nome;
		private static int[] episodios;
		
		// 0 bloco de iniciliza��o � executado quando JVM carregar classe
		// 1� Alocado espa�o em memoria pra objeto
		//2� cada atributo de classe e criado e inicializado com valores default ou o quer for passado.
		//3� bloco de inicializa��o e executado
		//4� construtor e executado
		
		static{
			System.out.println("Dentro do bloco de inicializa��o static 1");
			episodios= new int[100];
			for (int i = 0; i < episodios.length; i++) {
				episodios[i]=i+1;
			}
		}
			static {
				System.out.println("Dentro do bloco de inicializa��o static 2");
			}
			
			static{
				System.out.println("Dentro do bloco de inicializa��o static 3");
			}	
			{
				System.out.println("Dentro do bloco de inicializa��o N�o static");
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

