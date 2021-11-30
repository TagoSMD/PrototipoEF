
CREATE DATABASE Multibodegas2;
USE Multibodegas2;


-- -----------------------------------------------------
-- TABLAS DE SEGURIDAD
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Table `umg`.`tbl_modulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_modulo` (
  `PK_id_Modulo` INT NOT NULL,
  `nombre_modulo` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_modulo` VARCHAR(200) NULL DEFAULT NULL,
  `estado_modulo` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_Modulo`))
ENGINE=INNODB DEFAULT CHARSET=latin1;
INSERT INTO `Multibodegas2`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('0000', 'Seguridad', 'Asignación', '1');
INSERT INTO `Multibodegas2`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('1000', 'Finanzas', 'Asignación', '1');
INSERT INTO `Multibodegas2`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('2000', 'Hotelería', 'Asignación', '1');
INSERT INTO `Multibodegas2`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('3000', 'Comercial', 'Asignación', '1');

-- -----------------------------------------------------
-- Table `umg`.`tbl_aplicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_aplicacion` (
  `PK_id_aplicacion` INT NOT NULL,
  `nombre_aplicacion` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_aplicacion` VARCHAR(200) NULL DEFAULT NULL,
  `no_reporteAsociado` INT NULL DEFAULT NULL,
  `estado_aplicacion` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_aplicacion`))
ENGINE=INNODB DEFAULT CHARSET=latin1;

-- -----------------------------------------------------
-- Table `umg`.`tbl_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_usuario` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `nombre_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `username_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `password_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `correo_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `cambio_password` TINYINT NULL DEFAULT NULL,
  `estado_usuario` TINYINT NULL DEFAULT NULL,
  `ultima_conexion` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_usuario`))
ENGINE=INNODB DEFAULT CHARSET=latin1;

-- -----------------------------------------------------
-- Table `umg`.`tbl_bitacora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_bitacora` (
  `PK_id_bitacora` INT NOT NULL AUTO_INCREMENT,
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `fecha` VARCHAR(25)  null DEFAULT NULL,
  `hora` VARCHAR(25) NULL DEFAULT NULL,
  `host1` VARCHAR(45) NULL DEFAULT NULL,
  `ip` VARCHAR(25) NULL DEFAULT NULL,
  `accion` VARCHAR(50) NULL DEFAULT NULL,
  `tabla` VARCHAR(45) NULL DEFAULT NULL,
`PK_id_Modulo` int (25) NULL DEFAULT NULL,
PRIMARY KEY (`PK_id_bitacora`),
 CONSTRAINT `fk_PK_id_Modulo`
 FOREIGN KEY (`PK_id_Modulo`)
REFERENCES `umg`.`tbl_modulo` (`PK_id_Modulo`)
)
ENGINE=INNODB DEFAULT CHARSET=latin1;

-- -----------------------------------------------------
-- Table `umg`.`tbl_perfil_encabezado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_perfil_encabezado` (
  `PK_id_perfil` INT NOT NULL,
  `nombre_perfil` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_perfil` VARCHAR(200) NULL DEFAULT NULL,
  `estado_perfil` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_perfil`))
ENGINE=INNODB DEFAULT CHARSET=latin1;
INSERT INTO `Multibodegas2`.`tbl_perfil_encabezado` (`PK_id_perfil`, `nombre_perfil`, `descripcion_perfil`, `estado_perfil`) VALUES ('1', 'perfil1', 'prueba en el perfil 1', '1');

-- -----------------------------------------------------
-- Table `umg`.`tbl_perfil_detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_perfil_detalle` (
  `PK_id_perfil` INT NOT NULL,
  `PK_id_aplicacion` INT NOT NULL,
  `ingresar` TINYINT NULL DEFAULT NULL,
  `consultar` TINYINT NULL DEFAULT NULL,
  `modificar` TINYINT NULL DEFAULT NULL,
  `eliminar` TINYINT NULL DEFAULT NULL,
  `imprimir` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_perfil`, `PK_id_aplicacion`),
    CONSTRAINT `fk_Perfil_detalle_Aplicacion1`
    FOREIGN KEY (`PK_id_aplicacion`)
    REFERENCES `Multibodegas2`.`tbl_aplicacion` (`PK_id_aplicacion`),
  CONSTRAINT `fk_Perfil_detalle_Perfil1`
    FOREIGN KEY (`PK_id_perfil`)
    REFERENCES `Multibodegas2`.`tbl_perfil_encabezado` (`PK_id_perfil`))
ENGINE=INNODB DEFAULT CHARSET=latin1;
INSERT INTO `Multibodegas2`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2004', '1', '1', '1', '1', '1');
INSERT INTO `Multibodegas2`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2204', '1', '1', '1', '1', '1');
INSERT INTO `Multibodegas2`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2205', '1', '1', '1', '1', '1');
INSERT INTO `Multibodegas2`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2001', '1', '1', '1', '1', '1');
INSERT INTO `Multibodegas2`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2002', '1', '1', '1', '1', '1');

-- -----------------------------------------------------
-- Table `umg`.`tbl_usuario_aplicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_usuario_aplicacion` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `PK_id_aplicacion` INT NOT NULL,
  `ingresar` TINYINT NULL DEFAULT NULL,
  `consulta` TINYINT NULL DEFAULT NULL,
  `modificar` TINYINT NULL DEFAULT NULL,
  `eliminar` TINYINT NULL DEFAULT NULL,
  `imprimir` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_usuario`, `PK_id_aplicacion`),
    CONSTRAINT `fk_tbl_usuario_aplicacion_tbl_aplicacion1`
    FOREIGN KEY (`PK_id_aplicacion`)
    REFERENCES `Multibodegas2`.`tbl_aplicacion` (`PK_id_aplicacion`),
  CONSTRAINT `fk_Usuario_aplicacion_Usuario1`
    FOREIGN KEY (`PK_id_usuario`)
    REFERENCES `Multibodegas2`.`tbl_usuario` (`PK_id_usuario`))
ENGINE=INNODB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `umg`.`tbl_usuario_perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_usuario_perfil` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `PK_id_perfil` INT NOT NULL,
  PRIMARY KEY (`PK_id_usuario`, `PK_id_perfil`),
    CONSTRAINT `fk_Usuario_perfil_Perfil1`
    FOREIGN KEY (`PK_id_perfil`)
    REFERENCES `Multibodegas2`.`tbl_perfil_encabezado` (`PK_id_perfil`),
  CONSTRAINT `fk_Usuario_perfil_Usuario1`
    FOREIGN KEY (`PK_id_usuario`)
    REFERENCES `Multibodegas2`.`tbl_usuario` (`PK_id_usuario`))
ENGINE=INNODB DEFAULT CHARSET=latin1;

-- -----------------------------------------------------
-- Table `umg`.`tbl_aplicacion_a_modulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Multibodegas2`.`tbl_aplicacion_a_modulos` (
  `PK_id_modulo` INT(25) NOT NULL,
`PK_id_aplicacion` INT NOT NULL,
  PRIMARY KEY (`PK_id_modulo`,`PK_id_aplicacion` ),
    CONSTRAINT `fk_tbl_aplicacion_a_modulos_aplicacion1`
    FOREIGN KEY (`PK_id_aplicacion`)
    REFERENCES `Multibodegas2`.`tbl_aplicacion` (`PK_id_aplicacion`),
  CONSTRAINT `fk_tbl_aplicacion_a_modulos_modulo`
    FOREIGN KEY (`PK_id_modulo`)
    REFERENCES `Multibodegas2`.`tbl_modulo` (`PK_id_Modulo`))
ENGINE=INNODB DEFAULT CHARSET=latin1;

-- -----------------------------------------------------
-- Insert usuarios (Hoteleria)
-- -----------------------------------------------------
INSERT INTO `tbl_usuario` 
VALUES ('1', 'admin', 'admin', 'admin', '8cb2237d0679ca88db6464eac60da96345513964', 'esduardo@gmail.com', '1', '1', '2021-05-02 21:00:48'),
('2', 'jefferson', 'davila', 'jeff', '8cb2237d0679ca88db6464eac60da96345513964', 'jeff@gmail.com', '1', '1', '2021-05-02 21:00:48'),
('3', 'leonel', 'dominguez', 'laionel', '8cb2237d0679ca88db6464eac60da96345513964', 'leonel@gmail.com', '1', '1', '2021-05-02 21:00:48'),
('4', 'luis', 'gomes', 'luisk', '8cb2237d0679ca88db6464eac60da96345513964', 'luisg@gmail.com', '1', '1', '2021-05-02 21:00:48'),
('5', 'gerson', 'lee', 'gersonl', '8cb2237d0679ca88db6464eac60da96345513964', 'gersonl@gmail.com', '1', '1', '2021-05-02 21:00:48');

-- -----------------------------------------------------
-- TABLAS DE MULTIBODEGAS
-- -----------------------------------------------------

CREATE TABLE bodegas
(
	codigo_bodega VARCHAR(5) PRIMARY KEY,
    nombre_bodega VARCHAR(60) NOT NULL,
    estatus_bodega VARCHAR(1) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;

INSERT INTO `Multibodegas2`.`bodegas` 
VALUES 
('1', 'blanca', '1'),
('2', 'electronica', '1'),
('3', 'deportiva', '1'),
('4', 'cosmeticos', '1'),
('5', 'libreria', '1');


CREATE TABLE lineas
(
	codigo_linea VARCHAR(5) PRIMARY KEY NOT NULL,
    nombre_linea VARCHAR(60) NOT NULL,
    estatus_linea VARCHAR(1) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;

INSERT INTO `Multibodegas2`.`lineas` 
VALUES 
('1', 'blanca', '1'),
('2', 'electronica', '1'),
('3', 'deportiva', '1'),
('4', 'cosmeticos', '1'),
('5', 'libreria', '1');

CREATE TABLE marcas
(
	codigo_marca VARCHAR(5) PRIMARY KEY NOT NULL,
    nombre_marca VARCHAR(60)NOT NULL,
    estatus_marca VARCHAR(1)NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;
INSERT INTO `Multibodegas2`.`marcas` 
VALUES 
('1', 'cocacola', '1'),
('2', 'señorial', '1'),
('3', 'lala', '1'),
('4', 'sears', '1'),
('5', 'kerns', '1'),
('6', 'bic', '1'),
('7', 'la granja', '1'),
('8', 'bimbo', '1'),
('9', 'claro ', '1'),
('10', 'splash', '1'),
('11', 'Toledo', '1'),
('12', 'Bremen', '1'),
('13', 'Virginia', '1'),
('14', 'FUD', '1'),
('15', 'Dos Pinos Pizza', '1'),
('16', 'Natural', '1'),
('17', 'Piña´s', '1'),
('18', 'Hambueguesa', '1'),
('19', 'Hass', '1'),
('20', 'La Chula', '1');

CREATE TABLE productos
(
	codigo_producto VARCHAR(18) PRIMARY KEY NOT NULL,
    nombre_producto VARCHAR(60)NOT NULL,
    codigo_linea VARCHAR(5)NOT NULL,
    codigo_marca VARCHAR(5)NOT NULL,
    existencia_producto FLOAT(10,2)NOT NULL,
    estatus_producto VARCHAR(1)NOT NULL,
    FOREIGN KEY (codigo_linea) REFERENCES lineas(codigo_linea),
    FOREIGN KEY (codigo_marca) REFERENCES marcas(codigo_marca)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE existencias
(
	codigo_bodega VARCHAR(5)NOT NULL,
    codigo_producto VARCHAR(18)NOT NULL,
    saldo_existencia FLOAT(10,2)NOT NULL,
    PRIMARY KEY (codigo_bodega, codigo_producto),
	FOREIGN KEY (codigo_bodega) REFERENCES bodegas(codigo_bodega),
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto)
) ENGINE=INNODB DEFAULT CHARSET=latin1;


CREATE TABLE vendedores
(
	codigo_vendedor VARCHAR(5) PRIMARY KEY NOT NULL,
    nombre_vendedor VARCHAR(60)NOT NULL,
    direccion_vendedor VARCHAR(60)NOT NULL,
    telefono_vendedor VARCHAR(50)NOT NULL,
    nit_vendedor VARCHAR(20)NOT NULL,
    estatus_vendedor VARCHAR(1) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;
INSERT INTO 
`Multibodegas2`.`vendedores` 
VALUES 
('1', 'serveceria gallo', 'zona 2 3-00', '51169327', '456789', '1'),
('2', 'cañareal', 'zona12 8-00', '2200800', '7890',  '1'),
('3', 'walmart', 'zona6', '51169326', '26008785',  '1'),
('4', 'Sears', 'zona1', '26007089', '56667899',  '1'),
('5', 'Distefano', 'zona17', '22001234', '77009000',  '1');



CREATE TABLE clientes
(
	codigo_cliente VARCHAR(5) PRIMARY KEY NOT NULL,
    nombre_cliente VARCHAR(60) NOT NULL,
    direccion_cliente VARCHAR(60)NOT NULL,
    nit_cliente VARCHAR(20) NOT NULL,
    telefono_cliente VARCHAR(50) NOT NULL,
    codigo_vendedor VARCHAR(5) NOT NULL,
    estatus_cliente VARCHAR(1) NOT NULL,
    FOREIGN KEY (codigo_vendedor) REFERENCES vendedores(codigo_vendedor)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

INSERT INTO `Multibodegas2`.`clientes`
VALUES 
('1', 'JUAN', 'ZONA 6', '1232445', '4453453',  '1', '1'),
('2', 'CARLOS', 'ZONA 5', '532434', '3435334', '1', '1'),
('3', 'VERA', 'ZONA 4', '645544', '4343435','1', '1'),
('4', 'DIEGO', 'ZONA 8', '434355', '7676655','1', '1'),
('5', 'IVAN', 'ZONA 9', '665544', '6565454',  '1', '1');

create table moneda(
	id_moneda varchar(10) primary key NOT NULL, 
    nombre_moneda varchar(20) NOT NULL,
    estatus_moneda char(1) NOT NULL
)engine = InnoDB default charset=latin1;


create table sucursal (
id_sucursal int auto_increment primary key NOT NULL,
nombre varchar(20) not null NOT NULL,
direccion varchar(20) not null NOT NULL,
telefono varchar(20) not null NOT NULL
)engine=Innodb default charset=latin1;


INSERT INTO `Multibodegas2`.`sucursal`
VALUES 
('33435', 'Quetzal', '0', '0'),
('33335', 'Dolar', '0', '0'),
('45333', 'Yuan', '1', '0'),
('56441', 'Peso', '1', '0'),
('55456', 'Sol',  '1', '0');
create table proveedor(
id_proveedor int auto_increment primary key NOT NULL,
nombre varchar(128)NOT NULL,
direccion varchar(128) NOT NULL
)engine=Innodb default charset=latin1;

INSERT INTO `Multibodegas2`.`proveedor`
VALUES 
('33435', 'Quetzal', '0'),
('33335', 'Dolar', '0'),
('45333', 'Yuan', '1'),
('56441', 'Peso', '1'),
('55456', 'Sol',  '1');
create table compra_encabezado(
id_compraE int NOT NULL primary key,
id_sucursal int NOT NULL,
id_proveedor int NOT NULL,
total double ,
fecha date NOT NULL,
foreign key (id_proveedor) references
proveedor(id_proveedor),
foreign key (id_sucursal) references
sucursal(id_sucursal)
)engine=Innodb default charset=latin1;

create table compra_detalle(
id_inventario int primary key NOT NULL,
id_compraE int NOT NULL,
id_moneda varchar(10)NOT NULL,
cantidad int NOT NULL,

foreign key (id_compraE) references
compra_encabezado(id_compraE),
foreign key(id_moneda) references
moneda(id_moneda)
)engine=Innodb default charset=latin1;

CREATE TABLE ventas_encabezado
(
	documento_ventaenca VARCHAR(10) PRIMARY KEY NOT NULL,
    codigo_cliente VARCHAR(5) NOT NULL,
    fecha_ventaenca DATE NOT NULL,
    total_ventaenca FLOAT(10,2),
    estatus_ventaenca VARCHAR(1) NOT NULL,
    FOREIGN KEY (codigo_cliente) REFERENCES clientes(codigo_cliente)
) ENGINE=INNODB DEFAULT CHARSET=latin1;
CREATE TABLE ventas_detalle
(
	documento_ventaenca VARCHAR(10) NOT NULL,
    codigo_producto VARCHAR(18) NOT NULL,
    cantidad_ventadet FLOAT(10,2) NOT NULL,
    costo_ventadet FLOAT(10,2) NOT NULL,
    precio_ventadet FLOAT(10,2) NOT NULL,
    codigo_bodega VARCHAR(5) NOT NULL,
    PRIMARY KEY (documento_ventaenca, codigo_producto),
    FOREIGN KEY (documento_ventaenca) REFERENCES ventas_encabezado(documento_ventaenca),
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_producto),
    FOREIGN KEY (codigo_bodega) REFERENCES bodegas(codigo_bodega)
) ENGINE=INNODB DEFAULT CHARSET=latin1;


// TRIGGERS


NUEVO_CLIENTE-- Insertar
DELIMITER |
create trigger NUEVO_CLIENTE AFTER INSERT ON clientes
FOR EACH ROW BEGIN 
insert into tbl_bitacora(PK_id_usuario, fecha, accion) values ( current_user(), NOW(), "Nuevo CLiente AGREGADO");
END;
|

Registro_EliminadoV -- Borrar
DELIMITER |
create trigger Registro_EliminadoV AFTER DELETE ON bodegas
FOR EACH ROW BEGIN 
insert into tbl_bitacora(PK_id_usuario, fecha, accion) values ( current_user(), NOW(), "Registro Eliminado en BODDEGA");
END;
|


Registro_Eliminado2 -- Borrar
DELIMITER |
create trigger Registro_Eliminado2 AFTER INSERT ON productos
FOR EACH ROW BEGIN 
insert into tbl_bitacora(PK_id_usuario, fecha, accion) values ( current_user(), NOW(), "Registro Eliminado En Productos");
END;
|


//PROCESO ALMACENADO

DELIMITER $$
USE `multibodegas2`$$
CREATE PROCEDURE `LLamada por codigo` ()
BEGIN
SELECT * FROM marcas
Where  codigo_marca = 1;
END$$

DELIMITER ;

