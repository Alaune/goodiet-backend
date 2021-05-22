
CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `measure_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ingredient_measure_id_fk` (`measure_id`),
  CONSTRAINT `ingredient_measure_id_fk` FOREIGN KEY (`measure_id`) REFERENCES `measure` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabla de ingredientes';


CREATE TABLE `ingredient_recipe` (
  `recipe_id` int NOT NULL,
  `ingredient_id` int NOT NULL,
  `quantity` int NOT NULL,
  `extended_info` varchar(4000) DEFAULT NULL,
  KEY `ingredient_recipe_ingredient_id_fk` (`ingredient_id`),
  KEY `ingredient_recipe_recipe_id_fk` (`recipe_id`),
  CONSTRAINT `ingredient_recipe_ingredient_id_fk` FOREIGN KEY (`ingredient_id`) REFERENCES `ingredient` (`id`),
  CONSTRAINT `ingredient_recipe_recipe_id_fk` FOREIGN KEY (`recipe_id`) REFERENCES `recipe` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `measure` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabla con los tipos de medidas';


CREATE TABLE `recipe` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `rate` int DEFAULT NULL,
  `difficulty` int DEFAULT NULL,
  `time_taken` int DEFAULT NULL,
  `steps` varchar(4000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `category_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `recipe_category_id_fk` (`category_id`),
  CONSTRAINT `recipe_category_id_fk` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tabla de recetas';