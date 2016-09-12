-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: store-locator
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Table structure for table `stores`
--

DROP TABLE IF EXISTS `stores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stores` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `updatedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stores`
--

LOCK TABLES `stores` WRITE;
/*!40000 ALTER TABLE `stores` DISABLE KEYS */;
INSERT INTO `stores` VALUES (1,'Webster Hall, East Village, New York, NY, USA','2016-09-12 21:23:30',40.73157240711056,-73.98916686230467,'Forbidden Planet','Call Entertainer and Comic Retailer','','General Store','2016-09-12 21:23:30'),(2,'7605 Tonnele Ave, North Bergen, NJ 07047, USA','2016-09-12 21:24:44',40.80489745917097,-74.0204736059265,'The Home Depot','Mr John Doe','','Laundry','2016-09-12 21:24:44'),(3,'188 St/73 Av, Queens, NY 11366, USA','2016-09-12 21:26:00',40.733848780079796,-73.78274405651854,'Apple Fifth Avenue','Steve Jobs','','Telecom Store','2016-09-12 21:26:00'),(4,'Elizabeth, NJ, USA','2016-09-12 21:27:37',40.66038023450305,-74.17164290600584,'The Mills at Jersey Garden','Jane Doe','','Other','2016-09-12 21:27:37'),(5,'New Dorp, Staten Island, NY 10306, USA','2016-09-12 21:28:46',40.573532311267115,-74.11720479183958,'Postal Connections','Steve Parker','','Laundry','2016-09-12 21:28:46'),(6,'East Flatbush, Brooklyn, NY, USA','2016-09-12 21:30:49',40.64813845408582,-73.93041575604246,'Cars Collection','Steven Gerrard','','Other','2016-09-12 21:30:49'),(7,'The Container Store, Elizabeth, NJ, USA','2016-09-12 21:33:54',40.66259393367294,-74.18348754101561,'The Container Store','Jack and Jill','','Telecom Store','2016-09-12 21:33:54'),(8,'New Providence, NJ, USA','2016-09-12 21:34:46',40.68967324528612,-74.41694701367186,'Uqilo 6th Avenue','Mr Prakash Singh','','Medical Store','2016-09-12 21:35:03');
/*!40000 ALTER TABLE `stores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-12 21:35:59
