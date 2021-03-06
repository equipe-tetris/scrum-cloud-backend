CREATE DATABASE `scrumcloud`

CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(70) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `tipo_usuario` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario_uk` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `equipe` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) NOT NULL,
  `descricao` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `data_criacao` date NOT NULL,
  `usuario` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `equipe_usuario_fk` (`usuario`),
  CONSTRAINT `equipe_usuario_fk` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `integrantes_equipe` (
  `id_equipe` bigint NOT NULL,
  `id_usuario` bigint NOT NULL,
  KEY `integrantes_equipe_FK` (`id_equipe`),
  KEY `integrantes_equipe_FK_1` (`id_usuario`),
  CONSTRAINT `integrantes_equipe_FK` FOREIGN KEY (`id_equipe`) REFERENCES `equipe` (`id`),
  CONSTRAINT `integrantes_equipe_FK_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sala_planning` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `data_criacao` date NOT NULL,
  `metrica_sala` varchar(20) NOT NULL,
  `equipe` bigint NOT NULL,
  `usuario` bigint DEFAULT NULL,
  `sm_provisorio` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_fk_equipe` (`equipe`),
  KEY `sala_planning_FK` (`usuario`),
  KEY `sala_planning_FK_1` (`sm_provisorio`),
  CONSTRAINT `id_fk_equipe` FOREIGN KEY (`equipe`) REFERENCES `equipe` (`id`),
  CONSTRAINT `sala_planning_FK` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`),
  CONSTRAINT `sala_planning_FK_1` FOREIGN KEY (`sm_provisorio`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- scrumcloud.tasks definition

CREATE TABLE `task` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `sala_planning` bigint NOT NULL,
  `conteudo` varchar(100) NOT NULL,
  `data_criacao` date DEFAULT NULL,
  `status` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `valor_final` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `task_FK` (`sala_planning`),
  CONSTRAINT `task_FK` FOREIGN KEY (`sala_planning`) REFERENCES `sala_planning` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- scrumcloud.task_votacao definition

CREATE TABLE `task_votacao` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `task` bigint DEFAULT NULL,
  `usuario` bigint DEFAULT NULL,
  `valor_voto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `task_votacao_FK` (`task`),
  KEY `task_votacao_FK_1` (`usuario`),
  CONSTRAINT `task_votacao_FK` FOREIGN KEY (`task`) REFERENCES `task` (`id`),
  CONSTRAINT `task_votacao_FK_1` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `alerta` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `mensagem_alerta` varchar(100) NOT NULL,
  `sala_planning` bigint DEFAULT NULL,
  `usuario` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `alerta_FK` (`sala_planning`),
  KEY `alerta_FK_1` (`usuario`),
  CONSTRAINT `alerta_FK` FOREIGN KEY (`sala_planning`) REFERENCES `sala_planning` (`id`),
  CONSTRAINT `alerta_FK_1` FOREIGN KEY (`usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;