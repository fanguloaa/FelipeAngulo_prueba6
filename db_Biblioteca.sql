Create database biblioteca;
use biblioteca;

create table categoria(
    idCategoria int primary key not null,
    nombreCategoria VARCHAR(100) not null,
    descripcionCategoria VARCHAR(500) not null
);

create table libro(
    idLibro int primary key not null,
    nombreLibro VARCHAR(100) not null,
    autorLibro VARCHAR(100) not null,
    editorial VARCHAR(100) not null,
    ejemplares int not null,
    categoria_id int not null,
    CONSTRAINT `fk_categoria_categoria_id` FOREIGN KEY (categoria_id)
    REFERENCES `categoria`(idCategoria) ON DELETE CASCADE ON UPDATE CASCADE
);
