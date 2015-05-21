create table usuario (
	id BIGSERIAL NOT NULL,
	nome TEXT NOT NULL,
	email TEXT NOT NULL,
	senha TEXT NOT NULL,
	CONSTRAINT pk_usuario PRIMARY KEY (id)
);