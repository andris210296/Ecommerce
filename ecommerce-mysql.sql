DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `login` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` char(10) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`login`)
);
DROP TABLE IF EXISTS `produto`;
CREATE TABLE `produto` (
  `codigo` INT NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  `especificacao` varchar(1000) DEFAULT NULL,
  `preco_unitario` double(6,2) DEFAULT NULL,
  `destaque` smallint DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);
