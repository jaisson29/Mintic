# Consultar BD
SHOW DATABASES;
# Crear base de datos
CREATE DATABASE grupo_24;

# Conectar a base de datos
USE grupo_24;

# Crear tabla
CREATE TABLE mascotas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(80) NOT NULL,
    tipo_mascota VARCHAR(30) NOT NULL,
    raza VARCHAR(15) NOT NULL,
    edad_mascota INT NOT NULL,
    observacion TEXT NOT NULL
);

# Mostrar tablas
SHOW TABLES;
# Campos de la tabla
DESCRIBE mascotas;