use bc9c3xajw3wbdujl99ye;

SELECT Ninja.Nombre, Ninja.Rango FROM Ninja join Habilidad on Habilidad.Nombre;

-- Tabla Ninja
Create table Ninja(
	Id int primary key,
    Nombre varchar(250),
    Rango varchar(250),
    Aldea varchar(250)
);

-- Tabla Mision 
Create table Mision(
	Id int primary key,
    Descripcion varchar(250),
    Rango varchar(250),
    Recompensa varchar(255)
);

-- Tabla MisionNinja 
create table MisionNinja(
	ID_Ninja int,
    foreign key(ID_Ninja) references Ninja(Id),
    ID_Mision int,
    foreign key(ID_Mision) references Mision(Id),
    primary key(ID_ninja, ID_Mision),
    FechaInicio date,
    FechaFin date
);

-- Tabla Habilidad 
create table Habilidad(
	ID_Ninja int primary key,
    foreign key(ID_Ninja) references Ninja(Id),
    Nombre varchar(250),
    Descripcion varchar(250)
);