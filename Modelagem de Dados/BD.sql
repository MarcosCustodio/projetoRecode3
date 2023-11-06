CREATE DATABASE spacetur;
USE spaceTur;

CREATE TABLE usuario (
id_usuario INT AUTO_INCREMENT PRIMARY KEY,
nome_usuario VARCHAR(200) NOT NULL,
cpf_usuario VARCHAR(11) NOT NULL,
telefone_usuario VARCHAR(11),
email_usuario VARCHAR(50) NOT NULL,
senha_usuario VARCHAR(6) NOT NULL

);

ALTER TABLE compra ADD FOREIGN KEY(id_destino) REFERENCES Destino (id_destino);
ALTER TABLE compra ADD FOREIGN KEY(id_usuario) REFERENCES usuario (id_usuario);