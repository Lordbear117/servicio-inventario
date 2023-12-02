CREATE DATABASE IF NOT EXISTS tienda_electronica;

USE tienda_electronica;

-- Tabla categoria
CREATE TABLE categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

-- Tabla proveedor
CREATE TABLE proveedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    contacto VARCHAR(100),
    direccion VARCHAR(255)
);

-- Tabla inventario
CREATE TABLE inventario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL,
    cantidad INT NOT NULL,
    categoria_id INT NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);

-- Tabla proveedor_producto
CREATE TABLE proveedor_producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    proveedor_id INT NOT NULL,
    producto_id INT NOT NULL,
    FOREIGN KEY (proveedor_id) REFERENCES proveedor(id),
    FOREIGN KEY (producto_id) REFERENCES inventario(id)
);

-- Otras tablas que puedas necesitar

-- Ejemplo adicional: Tabla cliente
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(20),
    direccion VARCHAR(255)
);


SELECT * FROM inventario;

SELECT * FROM categoria;

INSERT INTO inventario VALUES (1,'Laptop Dell XPS 13','Laptop modelo 2023 de gama alta',20000.00,97,1);
INSERT INTO inventario VALUES (1,'Computadora HP Desktop','Torre para trabajo',15000.00,21,2);

INSERT INTO categoria VALUES (1,'Laptops');
INSERT INTO categoria VALUES (2,'Computadoras Escritorio');
INSERT INTO categoria VALUES (3,'Mouse y Teclado');
INSERT INTO categoria VALUES (4,'Bocinas');

