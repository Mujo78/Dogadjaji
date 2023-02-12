-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: d181
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `categoryid` int NOT NULL AUTO_INCREMENT,
  `url_ikona` varchar(255) DEFAULT NULL,
  `name_category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'https://cdn-icons-png.flaticon.com/512/1165/1165156.png','Nogometni event'),(2,'https://cdn-icons-png.flaticon.com/512/33/33838.png','Basket'),(3,'https://cdn-icons-png.flaticon.com/512/687/687113.png','American soccer event');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category_eventi`
--

DROP TABLE IF EXISTS `category_eventi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category_eventi` (
  `category_categoryid` int NOT NULL,
  `eventi_eventid` int NOT NULL,
  UNIQUE KEY `UK_9w9wu8rern5cxyfolsg4wf3jo` (`eventi_eventid`),
  KEY `FKlomo6ql80002sy6ddpwr84p2l` (`category_categoryid`),
  CONSTRAINT `FKaarfc5m11u5n81kww4tlrv1mw` FOREIGN KEY (`eventi_eventid`) REFERENCES `event` (`eventid`),
  CONSTRAINT `FKlomo6ql80002sy6ddpwr84p2l` FOREIGN KEY (`category_categoryid`) REFERENCES `category` (`categoryid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_eventi`
--

LOCK TABLES `category_eventi` WRITE;
/*!40000 ALTER TABLE `category_eventi` DISABLE KEYS */;
/*!40000 ALTER TABLE `category_eventi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comments` (
  `commentid` int NOT NULL AUTO_INCREMENT,
  `datum` varchar(10) DEFAULT NULL,
  `text` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`commentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments`
--

LOCK TABLES `comments` WRITE;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event` (
  `eventid` int NOT NULL AUTO_INCREMENT,
  `datum` varchar(10) DEFAULT NULL,
  `name_event` varchar(255) DEFAULT NULL,
  `opis` varchar(1024) DEFAULT NULL,
  `url_photo` varchar(500) DEFAULT NULL,
  `kategorija_categoryid` int DEFAULT NULL,
  `lokacija_locationid` int DEFAULT NULL,
  PRIMARY KEY (`eventid`),
  KEY `FKqpgi7qkdkdxm4ox5lhdgppxun` (`kategorija_categoryid`),
  KEY `FKcdmyfesa7q6wp9n9veufq4jrf` (`lokacija_locationid`),
  CONSTRAINT `FKcdmyfesa7q6wp9n9veufq4jrf` FOREIGN KEY (`lokacija_locationid`) REFERENCES `location` (`locationid`),
  CONSTRAINT `FKqpgi7qkdkdxm4ox5lhdgppxun` FOREIGN KEY (`kategorija_categoryid`) REFERENCES `category` (`categoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (6,'2022-12-17','Zajedničko gledanje - World Cup','SVE','https://images.unsplash.com/photo-1637203723757-a9b26181e1ad?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8d29ybGQlMjBjdXB8ZW58MHx8MHx8&w=1000&q=80',1,1),(7,'2022-12-10','Zajedničko gledanje - World Cup','sve','https://images.unsplash.com/photo-1637203723757-a9b26181e1ad?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8d29ybGQlMjBjdXB8ZW58MHx8MHx8&w=1000&q=80',1,1),(8,'2022-12-04','Zajedničko gledanje - World Cup','se','https://images.unsplash.com/photo-1637203723757-a9b26181e1ad?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8d29ybGQlMjBjdXB8ZW58MHx8MHx8&w=1000&q=80',1,2),(9,'2022-02-06','American soccer cup','Američki fudbal.','https://images.squarespace-cdn.com/content/v1/54d10203e4b0d299700879e5/1630036315087-PWH1RGH2AZ6IHRWXX2ZU/us_open_cup_trophy_2018_final_big.jpg?format=1000w',3,5);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `locationid` int NOT NULL AUTO_INCREMENT,
  `url_ikona` varchar(255) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `name_location` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`locationid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'https://dynamic-media-cdn.tripadvisor.com/media/photo-o/21/e8/1d/e3/caption.jpg?w=700&h=500&s=1','Zenica, prelijep grad.','Zenica'),(2,'https://dynamic-media-cdn.tripadvisor.com/media/photo-o/21/e8/1d/49/caption.jpg?w=700&h=-1&s=1','Travnik, najljepši grad u BiH.','Travnik'),(3,'https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Sarajevo_City_Panorama.JPG/1920px-Sarajevo_City_Panorama.JPG','Sarajevo grade moj.','Sarajevo'),(4,'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Mostar_Old_Town_Panorama_2007.jpg/1200px-Mostar_Old_Town_Panorama_2007.jpg','Stari most, prelijepo.','Mostar'),(5,'https://static.mondo.ba/Picture/563009/jpeg/Banjaluka.jpeg?ts=2022-06-01T13:39:13','..','Banja Luka');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_events`
--

DROP TABLE IF EXISTS `location_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location_events` (
  `location_locationid` int NOT NULL,
  `events_eventid` int NOT NULL,
  UNIQUE KEY `UK_sesbalgrgkc37o5pp23ti7a5m` (`events_eventid`),
  KEY `FKh9csi4pitfcnnfjg9248wonrt` (`location_locationid`),
  CONSTRAINT `FK7x439aalgqlrw6pdfmup3qyf` FOREIGN KEY (`events_eventid`) REFERENCES `event` (`eventid`),
  CONSTRAINT `FKh9csi4pitfcnnfjg9248wonrt` FOREIGN KEY (`location_locationid`) REFERENCES `location` (`locationid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_events`
--

LOCK TABLES `location_events` WRITE;
/*!40000 ALTER TABLE `location_events` DISABLE KEYS */;
/*!40000 ALTER TABLE `location_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userid` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `sifra` varchar(255) DEFAULT NULL,
  `roleid` int DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (10,'admin@gmail.com','admin','admin','$2a$10$j2b37LXHPaZKFhpg98v0W..J7Zu4RtVRaPX3T61zKQeEJzIz78vdi',1),(11,'prvi@gmail.com','prvi','prvi','$2a$10$ZzfCnwHdEu1q5K/.l.4gF.oFVHofapqDR/jm0WG4RYyqQ8e/pCSmK',0),(15,'drugi@gmail.com','drugi','drugi','$2a$10$jceTayS5M5owh.5jNdfW2uMKw235MZXGXLWcHuiq1gwwnmq1tYmoC',0),(16,'treci@gmail.com','treciKorisnik','treci','$2a$10$YexiD9Aiys5IE79KgoUF6uUtBEobe3JUb.GjBX9ItdpLlen.D1.Yi',0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-16 23:50:07
