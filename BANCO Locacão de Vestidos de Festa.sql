-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: projetolocacaodevestidos
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `projetolocacaodevestidos`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `projetolocacaodevestidos` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;

USE `projetolocacaodevestidos`;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`id_cliente`, `nome`, `cpf`, `telefone`, `email`, `endereco`) VALUES (1,'Ana Souza','147.258.369-01','99811-1001','ana.souza@email.com','QNM 12, Ceilândia Norte, Brasília - DF'),(2,'Carla Mendes','258.369.147-12','99811-1003','carla.mendes@email.com','QS 07, Taguatinga Sul, Brasília - DF'),(3,'Eduarda Lima','369.147.258-23','99811-1005','eduarda.lima@email.com','CLN 110, Asa Norte, Brasília - DF'),(4,'Gabriela Alves','471.582.693-34','99811-1007','gabriela.alves@email.com','CLS 205, Asa Sul, Brasília - DF'),(5,'Isabela Ferreira','582.693.471-45','99811-1009','isabela.ferreira@email.com','Rua 05, Águas Claras, Brasília - DF'),(6,'Karen Martins','693.471.582-56','99811-1011','karen.martins@email.com','QI 23, Lago Sul, Brasília - DF'),(7,'Mariana Gomes','714.825.936-67','99811-1013','mariana.gomes@email.com','QE 40, Guará II, Brasília - DF'),(8,'Olivia Carvalho','825.936.714-78','99811-1015','olivia.carvalho@email.com','Rua 08, Vicente Pires, Brasília - DF'),(9,'Queila Nascimento','936.714.825-89','99811-1017','queila.nascimento@email.com','QNQ 05, Ceilândia, Brasília - DF'),(10,'Sabrina Duarte','159.753.486-90','99811-1019','sabrina.duarte@email.com','Quadra 301, Samambaia Sul, Brasília - DF'),(11,'Vanessa Lopes','753.159.486-11','99811-1021','vanessa.lopes@email.com','SHN Quadra 01, Asa Norte, Brasília - DF'),(12,'Yasmin Araújo','486.753.159-22','99811-1023','yasmin.araujo@email.com','Rua Copalba, Águas Claras, Brasília - DF'),(13,'Amanda Vieira','951.486.753-33','99813-1025','amanda.vieira@email.com','QI 09, Lago Norte, Brasília - DF'),(14,'Débora Silva','357.951.486-44','99811-1027','debora.silva@email.com','Quadra 204, Recanto das Emas, Brasília - DF'),(15,'Fernanda Castro','864.357.951-55','99811-1029','fernanda.castro@email.com','Quadra 101, Riacho Fundo I, Brasília - DF'),(16,'Patrícia Lima','001.003.004-77','99999-9909','patricia.lima@email.com','Rua QNC 12, Taguatinga-DF');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `devolucao`
--

DROP TABLE IF EXISTS `devolucao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `devolucao` (
  `id_devolucao` int(11) NOT NULL AUTO_INCREMENT,
  `data_devolucao` date NOT NULL,
  `multa` double NOT NULL,
  `observacao` varchar(255) NOT NULL,
  PRIMARY KEY (`id_devolucao`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `devolucao`
--

LOCK TABLES `devolucao` WRITE;
/*!40000 ALTER TABLE `devolucao` DISABLE KEYS */;
INSERT INTO `devolucao` (`id_devolucao`, `data_devolucao`, `multa`, `observacao`) VALUES (1,'2025-08-05',0,'Vestido devolvido em perfeito estado'),(2,'2025-08-07',20,'Atraso de um dia na devolucao'),(3,'2025-08-09',0,'Sem observacoes'),(4,'2025-08-22',50,'Pequena avaria no tecido'),(5,'2025-08-23',0,'Vestido devolvido limpo'),(6,'2025-08-24',0,'Vestido devolvido sem ocorrencias'),(7,'2025-08-25',15,'Atraso na devolucao'),(8,'2025-08-26',0,'Vestido devolvido em perfeito estado'),(9,'2025-08-27',0,'Sem observacoes'),(10,'2025-08-28',30,'Pequena mancha removivel'),(11,'2025-08-29',0,'Vestido devolvido limpo'),(12,'2025-08-30',0,'Devolucao dentro do prazo'),(13,'2025-08-31',25,'Atraso de um dia'),(14,'2025-09-01',0,'Sem avarias'),(15,'2025-09-02',0,'Vestido devolvido em perfeito estado');
/*!40000 ALTER TABLE `devolucao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `salario` double NOT NULL,
  PRIMARY KEY (`id_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`id_funcionario`, `nome`, `cpf`, `telefone`, `email`, `cargo`, `salario`) VALUES (1,'Juliana Moreira','215.478.963-10','99822-1101','juliana.moreira@email.com','Vendedora',2500),(2,'Patrícia Albuquerque','326.589.174-21','99822-1102','patricia.albuquerque@email.com','Vendedora',2500),(3,'Renata Barbosa','437.691.285-32','99822-1103','renata.barbosa@email.com','Vendedora',2500),(4,'Sabrina Duarte','874.543.467-55','998221104','sabrina.duarte@email.com','Caixa',3500),(5,'Vanessa Lopes','648.543.987-00','998221105','vanessa.lopes@email.com','Gerente',4500);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locacao`
--

DROP TABLE IF EXISTS `locacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locacao` (
  `id_locacao` int(11) NOT NULL AUTO_INCREMENT,
  `data_locacao` date NOT NULL,
  `data_prevista_devolucao` date NOT NULL,
  `valor_total` double NOT NULL,
  `status` varchar(45) NOT NULL,
  `id_vestido` int(11) NOT NULL,
  `id_funcionario` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_devolucao` int(11) NOT NULL,
  `id_pagamento` int(11) NOT NULL,
  PRIMARY KEY (`id_locacao`),
  KEY `fk_locacao_vestido1_idx` (`id_vestido`),
  KEY `fk_locacao_funcionario1_idx` (`id_funcionario`),
  KEY `fk_locacao_cliente1_idx` (`id_cliente`),
  KEY `fk_locacao_devolucao1_idx` (`id_devolucao`),
  KEY `fk_locacao_pagamento1_idx` (`id_pagamento`),
  CONSTRAINT `fk_locacao_cliente1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_locacao_devolucao1` FOREIGN KEY (`id_devolucao`) REFERENCES `devolucao` (`id_devolucao`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_locacao_funcionario1` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id_funcionario`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_locacao_pagamento1` FOREIGN KEY (`id_pagamento`) REFERENCES `pagamento` (`id_pagamento`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_locacao_vestido1` FOREIGN KEY (`id_vestido`) REFERENCES `vestido` (`id_vestido`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locacao`
--

LOCK TABLES `locacao` WRITE;
/*!40000 ALTER TABLE `locacao` DISABLE KEYS */;
INSERT INTO `locacao` (`id_locacao`, `data_locacao`, `data_prevista_devolucao`, `valor_total`, `status`, `id_vestido`, `id_funcionario`, `id_cliente`, `id_devolucao`, `id_pagamento`) VALUES (1,'2025-08-01','2025-08-05',549.9,'Finalizada',1,1,1,1,1),(2,'2025-08-03','2025-08-07',150,'Finalizada',2,2,2,2,2),(3,'2025-08-05','2025-08-09',139.9,'Finalizada',3,3,3,3,3),(4,'2025-08-05','2025-08-10',749.9,'Finalizada',7,1,4,4,4),(5,'2025-08-08','2025-08-12',289.9,'Finalizada',4,4,5,5,5),(6,'2025-08-10','2025-08-14',100,'Finalizada',5,2,6,6,6),(7,'2025-08-12','2025-08-16',189.9,'Finalizada',6,3,7,7,7),(8,'2025-08-12','2025-08-17',689.9,'Finalizada',12,1,8,8,8),(9,'2025-08-14','2025-08-18',200,'Finalizada',9,4,9,9,9),(10,'2025-08-15','2025-08-19',250,'Finalizada',10,2,10,10,10),(11,'2025-08-16','2025-08-22',289.9,'Finalizada',4,3,11,11,11),(12,'2025-08-17','2025-08-23',300,'Finalizada',5,1,12,12,12),(13,'2025-08-18','2025-08-24',349.9,'Ativa',2,2,13,13,13),(14,'2025-08-19','2025-08-25',389.9,'Ativa',5,3,14,14,14),(15,'2025-08-20','2025-08-26',299.9,'Ativa',6,4,15,15,15);
/*!40000 ALTER TABLE `locacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagamento` (
  `id_pagamento` int(11) NOT NULL AUTO_INCREMENT,
  `forma_pagamento` varchar(45) NOT NULL,
  `valor_pago` double NOT NULL,
  `data_pagamento` date NOT NULL,
  PRIMARY KEY (`id_pagamento`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` (`id_pagamento`, `forma_pagamento`, `valor_pago`, `data_pagamento`) VALUES (1,'Pix',549.9,'2025-08-01'),(2,'Cartao',150,'2025-08-03'),(3,'Cartao',139.9,'2025-08-05'),(4,'Pix',749.9,'2025-08-05'),(5,'Dinheiro',289.9,'2025-08-08'),(6,'Pix',100,'2025-08-10'),(7,'Pix',189.9,'2025-08-12'),(8,'Cartao',689.9,'2025-08-12'),(9,'Pix',200,'2025-08-14'),(10,'Cartao',250,'2025-08-15'),(11,'Pix',289.9,'2025-08-16'),(12,'Cartao',300,'2025-08-17'),(13,'Pix',349.9,'2025-08-18'),(14,'Dinheiro',389.9,'2025-08-19'),(15,'Pix',299.9,'2025-08-20');
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vestido`
--

DROP TABLE IF EXISTS `vestido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vestido` (
  `id_vestido` int(11) NOT NULL AUTO_INCREMENT,
  `modelo` varchar(45) NOT NULL,
  `cor` varchar(45) NOT NULL,
  `tamanho` varchar(45) NOT NULL,
  `valor_locacao` double NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id_vestido`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vestido`
--

LOCK TABLES `vestido` WRITE;
/*!40000 ALTER TABLE `vestido` DISABLE KEYS */;
INSERT INTO `vestido` (`id_vestido`, `modelo`, `cor`, `tamanho`, `valor_locacao`, `status`) VALUES (1,'Vestido Longo Sereia','Preto','P',549.9,'Disponível'),(2,'Vestido Longo Princesa','Rosé','M',349.9,'Alugado'),(3,'Vestido Longo com Fenda','Verde Esmeralda','M',399.9,'Manutenção'),(4,'Vestido Tule Bordado','Marsala','G',289.9,'Reservado'),(5,'Vestido Ombro Único','Rosa Flúscia','GG',389.9,'Alugado'),(6,'Vestido Cetim Luxo','Vermelho','M',299.9,'Alugado'),(7,'Vestido Paetê Premium','Dourado','P',749.9,'Disponível'),(8,'Vestido Madrinha Elegance','Azul Serente','M',459.9,'Manutenção'),(9,'Vestido Festa Glamour','Prata','M',289.9,'Disponível'),(10,'Vestido Decote V','Terracota','G',289.9,'Disponível'),(11,'Vestido Renda Francesa','Coral','M',899.9,'Disponível'),(12,'Vestido Fluído Chiffon','Marrom','GG',689.9,'Disponível'),(13,'Vestido Festa Exclusive','Amarelo','M',379.9,'Disponível'),(14,'Vestido Corselet ','Azul Serenite','M',499.9,'Disponível');
/*!40000 ALTER TABLE `vestido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-22 16:43:58
