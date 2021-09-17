--liquibase formatted sql

--chanset davimachado:SC-04
CREATE TABLE IF NOT EXISTS usuario (
    id SMALLINT  AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70) NOT NULL,
    email VARCHAR(70) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    tipo_usuario VARCHAR(50) NOT NULL
);
