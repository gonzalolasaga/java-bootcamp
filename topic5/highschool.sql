CREATE DATABASE  IF NOT EXISTS `high-school` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `high-school`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: high-school
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assist`
--

DROP TABLE IF EXISTS `assist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assist` (
  `idStudent` int(11) NOT NULL,
  `idCourse` int(11) NOT NULL,
  `partial1` decimal(10,0) DEFAULT NULL,
  `partial2` decimal(10,0) DEFAULT NULL,
  `partial3` decimal(10,0) DEFAULT NULL,
  `final` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`idStudent`,`idCourse`),
  KEY `ForeignKeyCourse_idx` (`idCourse`),
  CONSTRAINT `ForeignKeyCourse` FOREIGN KEY (`idCourse`) REFERENCES `course` (`idCourse`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ForeignKeyStudent` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idStudent`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assist`
--

LOCK TABLES `assist` WRITE;
/*!40000 ALTER TABLE `assist` DISABLE KEYS */;
INSERT INTO `assist` VALUES (1,1,8,5,6,7),(1,2,5,3,6,2),(1,3,6,8,7,6),(1,4,5,2,7,8),(1,5,6,3,8,8),(2,1,7,6,8,8),(2,2,7,8,5,6),(2,3,5,2,3,5),(2,4,8,5,6,7),(2,5,6,2,6,7),(3,1,8,6,8,5),(3,3,7,5,6,8),(3,4,5,2,3,4),(3,5,6,7,8,10),(4,1,9,2,5,6),(4,2,5,3,2,5),(4,3,8,5,6,7),(4,4,7,6,8,8),(4,5,7,4,4,5),(5,1,9,8,9,10),(5,3,1,4,4,6),(5,4,10,6,4,6),(5,5,6,3,8,8),(6,1,2,2,2,2),(6,2,6,3,3,2),(6,3,6,8,7,6),(6,4,5,2,3,4),(6,5,7,6,8,8),(7,1,2,5,6,5),(7,2,5,4,3,4),(7,3,8,5,6,7),(7,4,6,7,8,10),(7,5,6,2,6,7),(8,1,5,6,8,6),(8,2,5,2,3,5),(8,3,1,4,4,6),(8,4,7,4,4,5),(8,5,7,4,4,5),(9,1,3,5,2,4),(9,2,8,5,6,8),(9,3,8,5,6,7),(9,4,6,7,8,10),(9,5,5,8,9,10),(10,1,4,4,6,6),(10,2,5,2,3,5),(10,3,6,7,8,10),(10,5,10,10,9,10),(11,1,3,4,3,5),(11,2,5,2,3,5),(11,5,6,2,6,7),(12,1,3,5,6,7),(12,2,5,2,3,4),(12,5,5,2,3,4),(13,1,3,2,1,4),(13,5,6,7,8,10),(14,1,1,2,3,4),(14,2,5,4,3,4),(14,5,6,2,6,7),(15,1,6,5,6,6),(15,5,5,2,3,4),(16,1,5,6,9,9),(16,2,6,4,5,6),(16,5,6,3,6,7),(17,1,5,6,6,7),(17,5,7,4,4,5),(18,1,6,8,5,6),(18,2,5,1,2,3),(18,5,6,7,8,5),(19,1,7,5,6,8),(19,2,6,8,7,6),(19,5,6,3,4,5),(20,1,3,5,7,4),(20,4,7,6,8,8),(20,5,6,2,6,7),(21,2,5,3,2,3),(21,3,6,8,7,6),(21,4,6,8,7,6),(22,2,5,2,3,4),(22,3,8,5,6,7),(22,4,1,4,4,6),(23,2,7,8,5,10),(23,3,6,8,7,6),(23,4,6,3,8,8),(24,2,5,2,5,6),(24,3,7,6,8,8),(24,4,7,5,6,6),(25,2,6,3,3,2),(25,3,6,7,8,10),(25,4,6,3,4,6),(26,2,10,6,3,9),(26,3,6,7,4,5),(26,4,6,8,7,6),(27,3,6,8,7,6),(27,4,6,4,6,7),(28,3,7,5,6,3),(28,4,7,5,6,6),(29,3,6,3,8,8),(29,4,1,4,4,6),(30,3,1,4,4,6),(30,4,7,5,6,6);
/*!40000 ALTER TABLE `assist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `consult1`
--

DROP TABLE IF EXISTS `consult1`;
/*!50001 DROP VIEW IF EXISTS `consult1`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `consult1` (
  `nameCourse` tinyint NOT NULL,
  `Student` tinyint NOT NULL,
  `Teacher` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `consult2`
--

DROP TABLE IF EXISTS `consult2`;
/*!50001 DROP VIEW IF EXISTS `consult2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `consult2` (
  `Student` tinyint NOT NULL,
  `idReg` tinyint NOT NULL,
  `Course` tinyint NOT NULL,
  `partial1` tinyint NOT NULL,
  `partial2` tinyint NOT NULL,
  `partial3` tinyint NOT NULL,
  `final` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `idCourse` int(11) NOT NULL,
  `idTeacher` int(11) DEFAULT NULL,
  `nameCourse` varchar(45) DEFAULT NULL,
  `hoursByWeek` int(11) DEFAULT NULL,
  `scheduleTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCourse`),
  KEY `ForeingKeyTeacher_idx` (`idTeacher`),
  CONSTRAINT `ForeingKeyTeacher` FOREIGN KEY (`idTeacher`) REFERENCES `teacher` (`idTeacher`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,1,'Algebra',16,4),(2,1,'Mathematical Analysis',20,5),(3,2,'Programming',20,5),(4,3,'Computer Science',16,4),(5,3,'Linear Algebra',20,5);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `idStudent` int(11) NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `idReg` int(11) DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  PRIMARY KEY (`idStudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Franco','Rojas',1,'1992-02-12'),(2,'Renzo','Mendez',2,'1992-03-10'),(3,'Maria','Chavez',3,'1991-02-22'),(4,'Carmen','Gonzalez',4,'1993-12-01'),(5,'Julio','Oroquieta',5,'1992-02-05'),(6,'Denisse','Diaz',6,'1992-11-29'),(7,'Myriam','Castro',7,'1991-01-19'),(8,'Antonella','Martinez',8,'1993-12-12'),(9,'Matias','Palermo',9,'1991-12-25'),(10,'Juan','Prado',10,'1994-06-17'),(11,'Jorge','Lasaga',11,'1992-07-24'),(12,'Octacvio','Parle',12,'1992-08-23'),(13,'Joaquin','Auzmendi',13,'1991-10-27'),(14,'Mirta','Etchechuri',14,'1992-11-15'),(15,'Catalina','Mendieta',15,'1993-12-16'),(16,'Uma','Romero',16,'1992-12-07'),(17,'Diego','Luna',17,'1993-11-06'),(18,'Francisco','Cepas',18,'1992-02-12'),(19,'Benito','Sanchez',19,'1991-03-09'),(20,'Franco','Gutierrez',20,'1994-02-03'),(21,'Diego','Moreno',21,'1992-07-04'),(22,'Sebastian','Ruiz',22,'1993-03-28'),(23,'Antonio','Ponzio',23,'1992-04-27'),(24,'Alonso','Torres',24,'1991-02-12'),(25,'Martin','Rodriguez',25,'1992-05-25'),(26,'Agustin','Huerta',26,'1994-12-19'),(27,'Miguel','Blanco',27,'1993-08-17'),(28,'Andres','Caballero',28,'1992-08-19'),(29,'Blas','Garrido',29,'1991-11-21'),(30,'Juan','Muñoz',30,'1991-09-22');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `idTeacher` int(11) NOT NULL,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  PRIMARY KEY (`idTeacher`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Pedro','Rivarola','1985-01-02'),(2,'Jorge','Perez','1984-02-03'),(3,'Leticia','Amendola','1968-02-11');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'high-school'
--

--
-- Dumping routines for database 'high-school'
--
/*!50003 DROP PROCEDURE IF EXISTS `procedure1` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `procedure1`(IN c varchar(30))
BEGIN
	select * from consult1
    where consult1.nameCourse = c;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `procedure2` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `procedure2`(IN id int)
BEGIN
	select * from consult2
    where consult2.idReg = id
    order by consult2.final desc,consult2.Course desc;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `consult1`
--

/*!50001 DROP TABLE IF EXISTS `consult1`*/;
/*!50001 DROP VIEW IF EXISTS `consult1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `consult1` AS select `c`.`nameCourse` AS `nameCourse`,concat(`s`.`lastName`,' ',`s`.`firstName`) AS `Student`,concat(`t`.`lastName`,' ',`t`.`firstName`) AS `Teacher` from (((`course` `c` join `student` `s`) join `teacher` `t`) join `assist` `a`) where ((`a`.`idCourse` = `c`.`idCourse`) and (`s`.`idStudent` = `a`.`idStudent`) and (`c`.`idTeacher` = `t`.`idTeacher`)) order by `s`.`lastName` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `consult2`
--

/*!50001 DROP TABLE IF EXISTS `consult2`*/;
/*!50001 DROP VIEW IF EXISTS `consult2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `consult2` AS select concat(`s`.`lastName`,' ',`s`.`firstName`) AS `Student`,`s`.`idReg` AS `idReg`,`c`.`nameCourse` AS `Course`,`a`.`partial1` AS `partial1`,`a`.`partial2` AS `partial2`,`a`.`partial3` AS `partial3`,`a`.`final` AS `final` from ((`course` `c` join `student` `s`) join `assist` `a`) where ((`s`.`idStudent` = `a`.`idStudent`) and (`c`.`idCourse` = `a`.`idCourse`)) order by `a`.`partial1`,`a`.`partial2`,`a`.`partial3` desc */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-31 11:28:42
