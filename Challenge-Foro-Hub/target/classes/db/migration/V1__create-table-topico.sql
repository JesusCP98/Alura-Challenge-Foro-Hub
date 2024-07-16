
create table topico(

    id bigint not null auto_increment,
    curso varchar(100) not null,
    titulo varchar(100) not null,
    mensaje varchar(700) not null,
    estado boolean,
    primary key(id)

);
