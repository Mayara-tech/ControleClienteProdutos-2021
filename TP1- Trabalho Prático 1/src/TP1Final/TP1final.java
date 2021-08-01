		// TP1 - 30.07.2021
		// Mayara Alves de Oliveira - 200025058

//		                                  CONTROLE DE CLIENTES E PRODUTOS

package TP1Final;
import java.util.Scanner; //Bibliotecas
import java.util.Arrays;


public class TP1final {

	public static void main(String[] args) {


				//                                            Menu de Opções

		System.out.println(" ------------------ MENU DE OPÇÕES ---------------------- \n ");

		
				int  MenudeOpções;
				Scanner input = new Scanner(System.in);
				System.out.println("Escolha a opção desejada: \n\n1. Realizar cadastro de novo Cliente \n2. Consultar Cliente ja cadastrado \n3. Realizar cadastro de novo produto \n4. Consultar produto ja cadastrado \n5. Cadastro de venda \n6. Consultar produtos em estoque \n0. Sair");    
				MenudeOpções = input.nextInt();

				//                                    Criando as variaveis de opções

				int NovoCliente = 0;
				int NovoEndereço = 0;
				int ConsultarCliente = 0;
				int NovoProduto = 0;
				int ConsultarProduto = 0;
				int CadastroVenda = 0;
				int ProdutosEstoque = 0;
				int Sair = 0;
				int Opções = 0;

				//                                   lista de Clientes/Produtos pré-cadastrados

				String [] NomeClientes = new String[100];
				NomeClientes[0] = "Mayara Alves de Oliveira";
				NomeClientes[1] = "Matheus Alves de Oliveira";
				NomeClientes[2] = "Maria José Alves de Oliveira";
				NomeClientes[3] = "Francisco Chaves de Oliveira";
				NomeClientes[4] = "Igor Luna Almeida";
				NomeClientes[5] = "Vitória Luna Almeida";
				NomeClientes[6] = "Tatiane Luna ALmeida";
				NomeClientes[7] = "Natália Gomes Veras";
				NomeClientes[8] = "João Antonio Nobrega";
				NomeClientes[9] = "Janaina Ferreira Silva";

				String [] EndereçoClientes = new String[100];
				EndereçoClientes[0] = "Quadra 16 Chácaras 16 lote 01 - Valparaiso";
				EndereçoClientes[1] = "Quadra 32 Chácaras 01 lote 02 - Novo Gama";
				EndereçoClientes[2] = "Quadra 04 Chácaras 92 lote 03 - Pedregal";
				EndereçoClientes[3] = "Quadra 19 Chácaras 02 lote 04 - Luziânia";
				EndereçoClientes[4] = "Quadra 01 Chácaras 23 lote 05 - Planaltina";
				EndereçoClientes[5] = "Quadra 22 Chácaras 12 lote 06 - Asa Sul";
				EndereçoClientes[6] = "Quadra 18 Chácaras 25 lote 07 - Sobradinho";
				EndereçoClientes[7] = "Quadra 28 Chácaras 11 lote 08 - Taguatinga";
				EndereçoClientes[8] = "Quadra 37 Chácaras 10 lote 09 - Guará";
				EndereçoClientes[9] = "Quadra 517 Chácaras 05 lote 10 - Ceilândia";

				String [] TelefoneClientes = new String [100];
				TelefoneClientes [0] = "(61)992342334";
				TelefoneClientes [1] = "(61)993242343";
				TelefoneClientes [2] = "(61)995687233";
				TelefoneClientes [3] = "(61)996823748";
				TelefoneClientes [4] = "(61)983472384";
				TelefoneClientes [5] = "(61)36475993";
				TelefoneClientes [6] = "(88)36475940";
				TelefoneClientes [7] = "(88)932849233";
				TelefoneClientes [8] = "(21)948489234";
				TelefoneClientes [9] = "(61)834792304";

				String [] CPFClientes = new String[100];
				CPFClientes [0] = "7329340230";
				CPFClientes [1] = "3252352334";
				CPFClientes [2] = "3423423423";
				CPFClientes [3] = "6575675677";
				CPFClientes [4] = "4234234234";
				CPFClientes [5] = "2342354234";
				CPFClientes [6] = "7967223445";
				CPFClientes [7] = "9678574563";
				CPFClientes [8] = "3425435345";
				CPFClientes [9] = "4363464574";
				
				
				String [] NomeProdutos = new String[100];
				NomeProdutos [0] = "Coxinha";
				NomeProdutos [1] = "Risole";
				NomeProdutos [2] = "Bolinho de Carne";
				NomeProdutos [3] = "Quibe";
				NomeProdutos [4] = "Esfirra de Frango";
				NomeProdutos [5] = "Esfirra de Carne";
				NomeProdutos [6] = "Esfirra Queijo e presunto";
				NomeProdutos [7] = "Empada";
				NomeProdutos [8] = "Esfirra de hamburguer";
				NomeProdutos [9] = "Croissant";
				
				String [] DescriçãoProdutos = new String [100];
				
				DescriçãoProdutos [0] ="Salgado de Frango (frito)";
				DescriçãoProdutos [1] ="Salgado de queijo de presunto (frito)";
				DescriçãoProdutos [2] ="Salgado de carne (frito)";
				DescriçãoProdutos [3] ="Salgado de carne com massa especial (frito)";
				DescriçãoProdutos [4] ="Salgado de frango (assado)";
				DescriçãoProdutos [5] ="Salgado de carne (assado)";
				DescriçãoProdutos [6] ="Salgado de queijo com Presunto (assado)";
				DescriçãoProdutos [7] ="Salgado massa especial de frango (assado)";
				DescriçãoProdutos [8] ="Salgado de carne de hamburguer e cheelder (assado)";
				DescriçãoProdutos [9] = "Salgado massa especial sabores (assado)";
				
				String [] ValorProdutos = new String [100];
				
				ValorProdutos [0] = "2,99";
				ValorProdutos [1] = "2,99";
				ValorProdutos [2] = "2,99";
				ValorProdutos [3] = "2,99";
				ValorProdutos [4] = "2,99";
				ValorProdutos [5] = "2,99";
				ValorProdutos [6] = "2,99";
				ValorProdutos [7] = "2,99";
				ValorProdutos [8] = "2,99";
				ValorProdutos [9] = "2,99";
				
				
				String [] LucroProdutos = new String [100];

				LucroProdutos [0] = "35%";
				LucroProdutos [1] = "60%";
				LucroProdutos [2] = "35%";
				LucroProdutos [3] = "60%";
				LucroProdutos [4] = "35%";
				LucroProdutos [5] = "35%";
				LucroProdutos [6] = "60%";
				LucroProdutos [7] = "60%";
				LucroProdutos [8] = "60%";
				LucroProdutos [9] = "60%";
				
				String [] EstoqueProdutos = new String [100];
				EstoqueProdutos [0] = "350";
				EstoqueProdutos [1] = "500";
				EstoqueProdutos [2] = "350";
				EstoqueProdutos [3] = "500";
				EstoqueProdutos [4] = "350";
				EstoqueProdutos [5] = "350";
				EstoqueProdutos [6] = "500";
				EstoqueProdutos [7] = "500";
				EstoqueProdutos [8] = "500";
				EstoqueProdutos [9] = "500";


					do {
						
						//                                Criando estrutura de decisão

						switch (MenudeOpções) {
						case 1: Opções = NovoCliente;

						//                            Opção Realizar Cadastro de Novo Cliente

						System.out.println(" ------------------ REALIZAR CADASTRO DE NOVO CLIENTE ---------------------- \n ");

						Scanner ler = new Scanner(System.in);
						System.out.println("Digite a quantidade de clientes novos que você deseja cadastrar: ");
						NovoCliente = ler.nextInt();

						if(NovoCliente > 0 ) {
							Scanner ler1 = new Scanner(System.in);


							//  Preencimento do Vetor Novo Cliente-
							int i = 0;

							for(i=0;i<NovoCliente;i++) {
								System.out.println("Digite o nome completo do novo cliente a ser cadastrado: ");
								NomeClientes[i] = ler1.nextLine();
								System.out.println("Digite o endereço completo do novo cliente a ser cadastrado: ");
								EndereçoClientes[i] = ler1.nextLine();
								System.out.println("Digite o telefone com DDD do novo cliente a ser cadastrado: ");
								TelefoneClientes[i] = ler1.nextLine();
								System.out.println("Digite o CPF do novo cliente a ser cadastrado: ");
								CPFClientes[i] = ler1.nextLine();

							}
							for(i=0;i<NovoCliente;i++) {
								System.out.println("Clientes cadastrados com sucesso! \n ");
								System.out.println("NOME DO CLIENTE: " + NomeClientes[i]);
								System.out.println("ENDEREÇO DO CLIENTE: " + EndereçoClientes[i]);
								System.out.println("TELEFONE DO CLIENTE: " + TelefoneClientes[i]);
								System.out.println("CPF DO CLIENTE: " + CPFClientes[i] + "\n");

							}

						} else {
							System.out.println("Por favor escolha um número Válido! " ); 
							System.out.println("Programa Encerrado");

						} 


						continue;

						case 2: Opções = ConsultarCliente;

						//                               Opção Consultar Cliente ja Cadastrado

						System.out.println(" ------------------ CONSULTAR CLIENTE CADASTRADO ---------------------- \n ");
						String ConsultarCliente1;
						Scanner ler41 = new Scanner(System.in);
						System.out.println("Digite o nome completo do cliente cadastrado: ");
						ConsultarCliente1 = ler41.nextLine();
						

						// Busca Linear

						boolean ClienteCadastrado = false;
						int i = 0;
						for(i=0;i<NovoCliente;i++) {
							if (ConsultarCliente1.equals(NomeClientes[i])) {
								ClienteCadastrado = true;
								continue;
							}
							if (ClienteCadastrado == true) {
								System.out.println ("Cliente Cadastrado \n");
							}
						}
						continue;
						case 3: Opções = NovoProduto;

						//                                Opção Realizar Cadastro de Novo Produto

						System.out.println(" ------------------ REALIZAR CADASTRO DE NOVO PRODUTO ---------------------- \n ");


						Scanner ler3 = new Scanner(System.in);
						System.out.println("Digite a quantidade de novos produtos que você deseja cadastrar: ");
						NovoProduto = ler3.nextInt();

						if(NovoProduto > 0 ) {
							Scanner ler1 = new Scanner(System.in);    			

							//Preencimento do Vetor Novo Produto -

							for(i=0;i<NovoProduto;i++) {
								System.out.println("Digite o nome do produto a ser cadastrado: ");
								NomeProdutos[i] = ler1.nextLine();
								System.out.println("Digite a descrição do produto a ser cadastrado: ");
								DescriçãoProdutos [i] = ler1.nextLine();
								System.out.println("Digite o valor de compra do produto a ser cadastrado: ");
								ValorProdutos[i] = ler1.nextLine();
								System.out.println("Digite a porcentagem de lucro correspondente ao produto a ser cadastrado: ");
								LucroProdutos[i] = ler1.nextLine();
								System.out.println("Digite a quantidade de produto presente no estoque: ");
								EstoqueProdutos[i] = ler1.nextLine();
							}

							System.out.println("Produtos cadastrados com sucesso! ");
							for(i=0;i<NovoProduto;i++) {
								System.out.println("NOME DO PRODUTO: " + NomeProdutos[i]);
								System.out.println("DESCRIÇÃO DO PRODUTO: " + DescriçãoProdutos [i]);
								System.out.println("VALOR DO PRODUTO: " + ValorProdutos[i]);
								System.out.println("LUCRO DO PRODUTO (PORCENTAGEM) " + LucroProdutos[i]);
								System.out.println("QUANTIDADE EM ESTOQUE DO PRODUTO: " + EstoqueProdutos[i] + "\n");
							}


						} else {
							System.out.println("Por favor escolha um número Válido! " ); 
							System.out.println("Programa Encerrado");

						} 


						continue;
						case 4: Opções = ConsultarProduto;
						
						//                               Opção Consultar Produto ja Cadastrado
						

						System.out.println(" ------------------ CONSULTAR PRODUTO CADASTRADO ---------------------- \n ");
						String ConsultarProduto1;
						Scanner ler411 = new Scanner(System.in);
						System.out.println("Digite o nome do produto cadastrado: ");
						ConsultarProduto1 = ler411.nextLine();
						

						// Busca Linear

						boolean ProdutoCadastrado = false;
						for(i=0;i<NomeProdutos.length;i++) {
							if (NomeProdutos[i].equals(ConsultarProduto1)) {
								ProdutoCadastrado = true;
								continue;
							}
							if (ProdutoCadastrado == true) {
								System.out.println ("Cliente Cadastrado \n");
							}
						}

						case 5: Opções = CadastroVenda;
//		              Opção Cadastro de venda
						
						System.out.println(" ------------------ CADASTRO DE VENDA ---------------------- \n ");
			
						System.out.println ("Selecione o cliente que deseja cadastrar venda: \n");

						for(i=0; i<10; i++) {
				
							System.out.println( NomeClientes[i]);
						}
						continue;
						
						case 6: Opções = ProdutosEstoque;
						
						//                             Opção Consultar Produtos em Estoque
						
						System.out.println(" ------------------ CONSULTAR PRODUTOS EM ESTOQUE ---------------------- \n ");
						
						System.out.println ("NOME --------- DESCRIÇÃO --------- VALOR --------- LUCRO (%) ------- DISPONÍVEL EM ESTOQUE \n\n");

						for(i=0; i<10; i++) {
							
							System.out.println( NomeProdutos[i] + " ----- " + DescriçãoProdutos [i] + " ----- " + ValorProdutos [i] + " ----- " + LucroProdutos [i] + " ----- " + EstoqueProdutos [i] + "\n");

						}
						continue;
						default: Opções = Sair;

						//                                          Opção Sair

						System.out.println(" ------------------ SAIR ---------------------- \n ");

						Scanner ler1 = new Scanner(System.in);
						System.out.println("Tem certeza que deseja sair? \n1. Sim \n2. Não");    
						Sair = ler1.nextInt();
						if(Sair==1) {
							System.out.println("Programa encerrado");
							Opções = Sair;
						} else {
							System.out.println("Escolha a opção desejada: \n1. Realizar cadastro de novo Cliente \n2. Consultar Cliente ja cadastrado \n3. Realizar cadastro de novo produto \n4. Consultar produto ja cadastrado \n5. Cadastro de venda \n6. Consultar produtos em estoque \n0. Sair");    
							MenudeOpções = input.nextInt();

						} 



						}

					} while (Opções!=Sair);

		}

	}
