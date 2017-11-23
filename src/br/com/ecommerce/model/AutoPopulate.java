package br.com.ecommerce.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.websocket.Session;

import org.jboss.logging.Logger;

import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.ProdutoDaoJpa;

public class AutoPopulate extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(AutoPopulate.class);

	public void init() throws ServletException {
		try {

			ProdutoDao pdao = new ProdutoDaoJpa();

			Produto produto1 = new Produto();
			produto1.setCategoria("Telefones e Celulares");
			produto1.setDescricao(
					"Com um design Premium o Samsung Galaxy J5 Prime possui corpo em metal e suaves bordas arredondadas que lhe garantem um visual altamente sofisticado.\r\n"
							+ "Projetado para ampliar ainda mais seu mundo de entretenimento e alcan�ar a experi�ncia multim�dia definitiva. Sua incr�vel tela de 5 polegadas � do tamanho exato para desfrutar ao m�ximo de todo seu conte�do.\r\n"
							+ "O Samsung Galaxy J5 Prime � um celular de alta resist�ncia e seguran�a. Al�m de garantir que voc� seja o �nico a ter acesso ao seu smartphone, o sensor de digitais por toque permite o desbloqueio do aparelho com muito mais seguran�a e rapidez.\r\n"
							+ "Com c�mera de 13MP traseira e mais a frontal de 5MP com flash a LED voc� tem em m�os um smartphone capaz de tirar bel�ssimas fotos mesmo em condi��es de baixa ilumina��o.");
			produto1.setDestaque(1);
			produto1.setEspecificacao(
					"Smartphone Samsung Galaxy J5 Prime Preto, 32GB, Tela 5\", Leitor Digital, C�mera Frontal com Flash a LED, 4G, Dual Chip");
			produto1.setFoto("celular.jpg");
			produto1.setPreco_unitario(699.99);

			pdao.cadastrarProduto(produto1);

			Produto produto2 = new Produto();
			produto2.setCategoria("Computadores e Notebooks");
			produto2.setDescricao(
					"Imagine as possibilidades. Com o Inspiron 15 5000, voc� ter� uma nova perspectiva sobre como um notebook Dell poder� te ajudar, seja no trabalho, estudo ou entretenimento.\r\n"
							+ "\r\n"
							+ "Al�m de um design moderno e diferenciado, este modelo conta com uma tela de 15.6 polegadas de alta defini��o e um teclado confort�vel com alpha num�rico, possui a 6� gera��o do processador Intel� Core� i3, placa de v�deo Intel� HD Graphics 520 para rodar softwares, jogos ou v�deos muito mais r�pido e flu�do.\r\n"
							+ "\r\n"
							+ "O Dell Inspiron 15 possui mem�ria de 4GB, armazenamento de 1TB e sistema operacional Linux. Total conectividade com as principais funcionalidades como um Leitor de Cart�o SD, HDMI e USB 3.0. Al�m disso, vem com bateria de longa dura��o para melhor conveni�ncia e mobilidade.");
			produto2.setDestaque(2);
			produto2.setEspecificacao("Notebook Dell Core i3-6006U 4GB 1TB Tela 15.6� Linux Inspiron I15-5566-D10P");
			produto2.setFoto("notebook.jpg");
			produto2.setPreco_unitario(1499.99);

			pdao.cadastrarProduto(produto2);

			Produto produto3 = new Produto();
			produto3.setCategoria("Refrigeradores e Geladeiras");
			produto3.setDescricao(
					"O Refrigerador Brastemp Ative Frost Free BRM47GB, dispon�vel na cor branca, possui capacidade para at� 403 litros e dimens�es de 175,4 cm de altura por 71,1 cm de largura. Al�m de moderno, ele apresenta um design elegante, capaz de deixar qualquer cozinha muito mais bonita.\r\n"
							+ "Com o seu controle eletr�nico com fun��es pr�-programadas, voc� ajusta a temperatura desejada com apenas um toque.\r\n"
							+ "E mais: com o sistema Frost Free, n�o precisa descongelar nunca!");
			produto3.setDestaque(3);
			produto3.setEspecificacao(
					"Refrigerador Brastemp BRM47GB Frost Free Ative com Controle Eletr�nico Branco - 403 L");
			produto3.setFoto("geladeira.jpg");
			produto3.setPreco_unitario(2149.99);

			pdao.cadastrarProduto(produto3);

		}

		catch (Exception e) {
			log.error("Falha ao inserir dados" + e.getMessage(), e);

		}

	}
}