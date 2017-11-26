package br.com.ecommerce.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.websocket.Session;

import org.jboss.logging.Logger;

import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.ProdutoDaoJpa;

public class AutoPopulate extends HttpServlet {
	
	//http://respostas.guj.com.br/24099-pre-popular-banco-com-hibernate

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(AutoPopulate.class);

	public void init() throws ServletException {
		try {

			ProdutoDao pdao = new ProdutoDaoJpa();

			Produto produto1 = new Produto();
			produto1.setCategoria("Telefones e Celulares");
			produto1.setDescricao(
					"Com um design Premium o Samsung Galaxy J5 Prime possui corpo em metal e suaves bordas arredondadas que lhe garantem um visual altamente sofisticado.\r\n"
							+ "Projetado para ampliar ainda mais seu mundo de entretenimento e alcançar a experiência multimídia definitiva. Sua incrível tela de 5 polegadas é do tamanho exato para desfrutar ao máximo de todo seu conteúdo.\r\n"
							+ "O Samsung Galaxy J5 Prime é um celular de alta resistência e segurança. Além de garantir que você seja o único a ter acesso ao seu smartphone, o sensor de digitais por toque permite o desbloqueio do aparelho com muito mais segurança e rapidez.\r\n"
							+ "Com câmera de 13MP traseira e mais a frontal de 5MP com flash a LED você tem em mãos um smartphone capaz de tirar belíssimas fotos mesmo em condições de baixa iluminação.");
			produto1.setDestaque(1);
			produto1.setEspecificacao(
					"Smartphone Samsung Galaxy J5 Prime Preto, 32GB, Tela 5\", Leitor Digital, Câmera Frontal com Flash a LED, 4G, Dual Chip");
			produto1.setFoto("celular.jpg");
			produto1.setPreco_unitario(699.99);

			pdao.cadastrarProduto(produto1);

			Produto produto2 = new Produto();
			produto2.setCategoria("Computadores e Notebooks");
			produto2.setDescricao(
					"Imagine as possibilidades. Com o Inspiron 15 5000, você terá uma nova perspectiva sobre como um notebook Dell poderá te ajudar, seja no trabalho, estudo ou entretenimento.\r\n"
							+ "\r\n"
							+ "Além de um design moderno e diferenciado, este modelo conta com uma tela de 15.6 polegadas de alta definição e um teclado confortável com alpha numérico, possui a 6ª geração do processador Intel® Core™ i3, placa de vídeo Intel® HD Graphics 520 para rodar softwares, jogos ou vídeos muito mais rápido e fluído.\r\n"
							+ "\r\n"
							+ "O Dell Inspiron 15 possui memória de 4GB, armazenamento de 1TB e sistema operacional Linux. Total conectividade com as principais funcionalidades como um Leitor de Cartão SD, HDMI e USB 3.0. Além disso, vem com bateria de longa duração para melhor conveniência e mobilidade.");
			produto2.setDestaque(1);
			produto2.setEspecificacao("Notebook Dell Core i3-6006U 4GB 1TB Tela 15.6” Linux Inspiron I15-5566-D10P");
			produto2.setFoto("notebook.jpg");
			produto2.setPreco_unitario(1499.99);

			pdao.cadastrarProduto(produto2);

			Produto produto3 = new Produto();
			produto3.setCategoria("Refrigeradores e Geladeiras");
			produto3.setDescricao(
					"O Refrigerador Brastemp Ative Frost Free BRM47GB, disponível na cor branca, possui capacidade para até 403 litros e dimensões de 175,4 cm de altura por 71,1 cm de largura. Além de moderno, ele apresenta um design elegante, capaz de deixar qualquer cozinha muito mais bonita.\r\n"
							+ "Com o seu controle eletrônico com funções pré-programadas, você ajusta a temperatura desejada com apenas um toque.\r\n"
							+ "E mais: com o sistema Frost Free, não precisa descongelar nunca!");
			produto3.setDestaque(1);
			produto3.setEspecificacao(
					"Refrigerador Brastemp BRM47GB Frost Free Ative com Controle Eletrônico Branco - 403 L");
			produto3.setFoto("geladeira.jpg");
			produto3.setPreco_unitario(2149.99);

			pdao.cadastrarProduto(produto3);
			
			Produto produto4 = new Produto();
			produto4.setCategoria("Computadores e Notebooks");
			produto4.setDescricao(
					"Projetado para mudar o jogo. PC Gamer PC Dell Inspiron completamente novo com potentes processadores AMD Ryzen™, placas de vídeo de última geração, iluminação com LED e um design precisamente projetado para proporcionar o melhor resfriamento. Com as últimas tecnologias dos processadores AMD, o Inspiron Gaming Desktop é a solução completa para jogar seus games.\r\n" + 
					"Utilize todos os núcleos dos novos processadores Ryzen™ e obtenha ainda mais performance para seus jogos. Com um design agressivo, o Inspiron Gaming Desktop trás tudo que você precisa! Memórias DDR4 2400MHz, placas de vídeo Gaming, HDs voltados para performance e muitas portas USBs para todos seus periféricos!");
			produto4.setDestaque(0);
			produto4.setEspecificacao(
					"Computador Gamer Dell Inspiron 5675-D50 com AMD Radeon™ RX 570, AMD Ryzen™ 7 1700X, 8GB, 1TB, Gravador de DVD, HDMI e Linux");
			produto4.setFoto("computador.jpg");
			produto4.setPreco_unitario(3599.99);

			pdao.cadastrarProduto(produto4);
			
			Produto produto5 = new Produto();
			produto5.setCategoria("Refrigeradores e Geladeiras");
			produto5.setDescricao(
					"Sua cozinha vai ganhar espaço e elegância com um novo conceito de geladeiras!\r\n" + 
					"A Brastemp lança o Refrigerador Brastemp French Door Side Inverse - Platinum com Central Inteligente que traz ainda mais praticidade para sua cozinha, deixando o que você mais usa ao alcance das mãos. E já que você usa menos o freezer, ele fica na parte de baixo, assim você não esquece mais nada no fundo da gaveta.\r\n" + 
					"Um refrigerador com interior amplo com capacidade de Side by Side sem ocupar muito espaço na cozinha e com gavetas especiais para armazenar legumes e frutas na temperatura certa. Seu Turbo Freezer gela suas bebidas rapidamente e conta com uma função especial para sobremesas. Conta com iluminação interna em LED, espaço para gelar taças e Ice Maker que produz até 12 bandejas de gelo automaticamente, sem precisar de um ponto de água.\r\n" + 
					"Clique e confira o manual disponível do produto e tire todas as dúvidas");
			produto5.setDestaque(0);
			produto5.setEspecificacao(
					"Refrigerador Brastemp Side Inverse BRO80AK Evox - 540L");
			produto5.setFoto("refrigerador.jpg");
			produto5.setPreco_unitario(4899.99);

			pdao.cadastrarProduto(produto5);
			
			Produto produto6 = new Produto();
			produto6.setCategoria("Telefones e Celulares");
			produto6.setDescricao(
					"O Lumia 532 Dual SIM possui um desempenho incrível com o Processador de 1.2ghz e sistema operacional Windows Phone 8.1 que roda facilmente os aplicativos mais exigentes, para que você possa usar a vontade tudo o que gosta. Você ainda pode criar, editar, e compartilhar com o office, onenote e onedrive. O Smartphone ainda conta com dois chips para você falar em duas operadoras pelo mesmo aparelho. Além disso, possui tela de 4 com 8gb de memória, câmera traseira de 5mp e frontal vga.");
			produto6.setDestaque(0);
			produto6.setEspecificacao(
					"Smartphone Microsoft Lumia 532 Dual SIM Branco");
			produto6.setFoto("phone.jpg");
			produto6.setPreco_unitario(349.99);

			pdao.cadastrarProduto(produto6);

		}

		catch (Exception e) {
			log.error("Falha ao inserir dados" + e.getMessage(), e);

		}

	}
}