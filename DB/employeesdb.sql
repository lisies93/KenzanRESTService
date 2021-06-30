-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema employeesdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `employeesdb` ;

-- -----------------------------------------------------
-- Schema employeesdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `employeesdb` DEFAULT CHARACTER SET utf8 ;
USE `employeesdb` ;

-- -----------------------------------------------------
-- Table `employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `employee` ;

CREATE TABLE IF NOT EXISTS `employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `middle_initial` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `date_of_birth` DATE NULL,
  `date_of_employment` DATE NULL,
  `status` TINYINT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS karen;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'karen' IDENTIFIED BY 'password';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'karen';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `employee`
-- -----------------------------------------------------
START TRANSACTION;
USE `employeesdb`;
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (1, 'Lois', 'H', 'Walker', '1977-04-09', '2016-03-06', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (2, 'Brenda', 'S', 'Robinson', '1977-04-10', '2016-03-07', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (3, 'Joe', 'W', 'Robinson', '1977-04-11', '2016-03-08', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (4, 'Diane', 'I', 'Evans', '1977-04-12', '2016-03-09', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (5, 'Benjamin', 'R', 'Russell', '1977-04-17', '2016-03-10', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (6, 'Patrick', 'F', 'Bailey', '1977-04-18', '2016-03-11', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (7, 'Nancy', 'T', 'Baker', '1977-04-19', '2016-03-12', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (8, 'Carol', 'V', 'Murphy', '1977-04-20', '2016-03-13', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (9, 'Frances', 'B', 'Young', '1959-09-06', '2016-03-14', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (10, 'Diana', 'T', 'Peterson', '1959-09-07', '2016-03-15', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (11, 'Ralph', 'L', 'Flores', '1975-05-02', '2016-03-16', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (12, 'Jack', 'C', 'Alexander', '1975-05-03', '2017-05-01', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (13, 'Melissa', 'Q', 'King', '1975-05-04', '2002-02-05', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (14, 'Wayne', 'G', 'Watson', '1975-05-05', '2002-02-06', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (15, 'Cheryl', 'O', 'Scott', '1975-05-06', '2002-02-07', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (16, 'Paula', 'G', 'Diaz', '1975-05-07', '2002-02-08', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (17, 'Joshua', 'T', 'Stewart', '1975-05-08', '2002-02-09', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (18, 'Theresa', 'G', 'Lee', '1992-05-12', '1998-07-04', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (19, 'Julia', 'S', 'Scott', '1992-05-13', '1998-07-05', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (20, 'Thomas', 'Q', 'Lewis', '1967-04-10', '1998-07-06', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (21, 'Carol', 'J', 'Edwards', '1967-04-11', '2016-07-01', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (22, 'Matthew', 'L', 'Turner', '1967-04-12', '2016-07-02', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (23, 'Joan', 'C', 'Stewart', '1967-04-13', '2001-03-05', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (24, 'Ruby', 'R', 'Rogers', '1980-01-05', '2001-03-06', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (25, 'Carolyn', 'V', 'Hayes', '1958-10-03', '2001-03-07', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (26, 'Anne', 'L', 'Russell', '1958-10-04', '2001-03-08', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (27, 'Daniel', 'K', 'Cooper', '1990-01-01', '2014-06-03', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (28, 'Roger', 'L', 'Roberts', '1969-07-07', '2014-06-04', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (29, 'Maria', 'W', 'Walker', '1969-07-08', '1998-01-10', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (30, 'Brenda', 'M', 'Butler', '1963-06-12', '2003-01-04', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (31, 'Lillian', 'X', 'Brown', '1981-12-05', '2003-01-05', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (32, 'Amy', 'B', 'Howard', '1981-12-06', '2003-01-06', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (33, 'Gregory', 'X', 'Edwards', '1981-12-07', '2003-01-07', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (34, 'Roy', 'Z', 'Griffin', '1991-08-05', '2003-01-08', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (35, 'Richard', 'Y', 'Mitchell', '1991-08-06', '2003-01-09', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (36, 'Mary', 'P', 'Wilson', '1967-01-12', '2003-01-10', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (37, 'Aaron', 'N', 'Price', '1969-10-02', '1997-03-07', 1);
INSERT INTO `employee` (`id`, `first_name`, `middle_initial`, `last_name`, `date_of_birth`, `date_of_employment`, `status`) VALUES (38, 'Donna', 'R', 'Brown', '1969-10-03', '1997-03-08', 1);

COMMIT;

