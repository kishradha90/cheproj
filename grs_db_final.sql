CREATE DATABASE  IF NOT EXISTS `grs_system` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `grs_system`;
-- MySQL dump 10.16  Distrib 10.1.36-MariaDB, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: grs_system
-- ------------------------------------------------------
-- Server version	10.1.36-MariaDB

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
-- Table structure for table `announcements`
--

DROP TABLE IF EXISTS `announcements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `announcements` (
  `announcement_id` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `image_url` varchar(45) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`announcement_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `announcements`
--

LOCK TABLES `announcements` WRITE;
/*!40000 ALTER TABLE `announcements` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `city_id` int(11) NOT NULL,
  `city_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Pune'),(2,'Mumbai'),(3,'Nashik'),(4,'Kolhapur'),(5,'Solapur'),(6,'Beed');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grievances`
--

DROP TABLE IF EXISTS `grievances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grievances` (
  `grievance_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` varchar(45) DEFAULT NULL,
  `Grievance_type` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `status_details` varchar(45) DEFAULT NULL,
  `image_url` varchar(45) DEFAULT NULL,
  `file_date` date DEFAULT NULL,
  `resolve_date` date DEFAULT NULL,
  PRIMARY KEY (`grievance_id`),
  KEY `grv_per_fk` (`login_id`),
  CONSTRAINT `grv_per_fk` FOREIGN KEY (`login_id`) REFERENCES `persons` (`login_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grievances`
--

LOCK TABLES `grievances` WRITE;
/*!40000 ALTER TABLE `grievances` DISABLE KEYS */;
INSERT INTO `grievances` VALUES (1,'Niraj@gmail.com','Water','Water Supply','Water supply is off from 11-jan-2020','Pending','Working on it',NULL,'2019-12-05',NULL),(2,'Deepak@gmail.com','Electricity','Electricity Maintainance','Electricity Supply is Off','Resolved','Lights are on',NULL,'2019-12-22','2019-12-22'),(3,'Kiran@gmail.com','Garbage','Garbage','Collect garbage on Mahatma street','Pending','collected within 2 days ',NULL,'2020-01-02',NULL),(4,'Deepak@gmail.com','Street','Pot holes','Fix pot holes in lane no.2','Resolved','pot holes fixed',NULL,'2020-01-05','2020-01-07'),(5,'Nagesh2@yahoo.com','Water','Pipe Leakage','wastage of water please fix the problem as so','Resolved','Pipeline Fixed',NULL,'2020-01-06','2020-01-06');
/*!40000 ALTER TABLE `grievances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persons` (
  `role_id` int(11) DEFAULT NULL,
  `login_id` varchar(45) NOT NULL,
  `ward_id` int(11) DEFAULT NULL,
  `full_name` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `voter_id` varchar(45) DEFAULT NULL,
  `contact_no` varchar(45) DEFAULT NULL,
  `image_url` varchar(45) DEFAULT NULL,
  `address_line` varchar(200) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `pin_code` int(11) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`login_id`),
  KEY `FK_ward_id` (`ward_id`),
  KEY `FK_city_id` (`city_id`),
  KEY `FK_question_id` (`question_id`),
  KEY `per_role_fk` (`role_id`),
  CONSTRAINT `per_city_fk` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `per_quest_fk` FOREIGN KEY (`question_id`) REFERENCES `questions` (`question_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `per_role_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `per_ward_fk` FOREIGN KEY (`ward_id`) REFERENCES `ward` (`ward_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'Admin',1,'PMC','0000-00-00','NA','0','9999999999','pmc_image','NA',1,0,3,'Black','Admin@123'),(2,'Amit@gmail.com',3,'Amit Gangurade','1995-08-11','Male','771212','9689134444','amit_image','Mauli nivas',1,411041,1,'M.P.High School','Amit@123'),(2,'Chetanraut@gmail.com',5,'Chetan Raut','1994-06-14','Male','12345','9762483250','chetan_image','Matoshree',1,411058,1,'Amit','Chetan@123'),(3,'Deepak@gmail.com',7,'Deepak Padmule','1995-10-17','Male','101010','9689625671','deepak_image','Varsha Bunglow',1,411041,2,'Sanjay','Deepak@123'),(3,'Kiran@gmail.com',6,'Kiran Ghorband','1997-09-19','Female','101010','1234567890','niraj_image','Lal Mahal2',1,411058,3,'Black','Kiran@123'),(3,'Nagesh2@yahoo.com',5,' Nagesh Raghu','1994-12-09','Male','1234','8180048235','nagesh_image','Raghu house',1,411111,3,'White','Nagesh@123'),(3,'Niraj@gmail.com',5,'Niraj Gole','1997-09-19','Male','35614','7875930027','niraj_image','Lal Mahal',1,411052,3,'Black','Niraj@123'),(2,'Omkar@gmail.com',8,'Omkar Ghugare','1994-05-07','Male','32564','8308599454','omkar_image','pooja niwas',1,411012,2,'Z.p.Highschool','Omkar@1234'),(2,'Shiva@gmail.com',5,'Shivanand Rohinkar','1994-06-14','Male','12345','9762483250','shiva_image','Matoshree Nivas',1,411058,1,'Z.P. Parbhani','Shiva@123');
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `question_id` int(11) NOT NULL,
  `question` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'Which is your first school?'),(2,'What is the name of your Best-Friend?'),(3,'Which is your favourite colour?');
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratings`
--

DROP TABLE IF EXISTS `ratings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ratings` (
  `rating_id` int(11) NOT NULL AUTO_INCREMENT,
  `grievance_id` int(11) DEFAULT NULL,
  `login_id` varchar(45) DEFAULT NULL,
  `rating` int(5) DEFAULT NULL,
  PRIMARY KEY (`rating_id`),
  KEY `rat_per_fk` (`login_id`),
  KEY `rat_grv_fk` (`grievance_id`),
  CONSTRAINT `rat_grv_fk` FOREIGN KEY (`grievance_id`) REFERENCES `grievances` (`grievance_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `rat_per_fk` FOREIGN KEY (`login_id`) REFERENCES `persons` (`login_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratings`
--

LOCK TABLES `ratings` WRITE;
/*!40000 ALTER TABLE `ratings` DISABLE KEYS */;
/*!40000 ALTER TABLE `ratings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL,
  `role_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Admin'),(2,'Corporator'),(3,'Resident');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votes`
--

DROP TABLE IF EXISTS `votes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `votes` (
  `vote_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_id` varchar(45) DEFAULT NULL,
  `grievance_id` int(11) DEFAULT NULL,
  `vote_status` varchar(45) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`vote_id`),
  KEY `vt_per_fk` (`login_id`),
  KEY `vt_grv_fk` (`grievance_id`),
  CONSTRAINT `vt_grv_fk` FOREIGN KEY (`grievance_id`) REFERENCES `grievances` (`grievance_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vt_per_fk` FOREIGN KEY (`login_id`) REFERENCES `persons` (`login_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votes`
--

LOCK TABLES `votes` WRITE;
/*!40000 ALTER TABLE `votes` DISABLE KEYS */;
INSERT INTO `votes` VALUES (2,'Deepak@gmail.com',2,'Positive','All OK.....!!!'),(3,'Nagesh2@yahoo.com',5,'Positive','Good Work....');
/*!40000 ALTER TABLE `votes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ward`
--

DROP TABLE IF EXISTS `ward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ward` (
  `ward_id` int(11) NOT NULL,
  `ward_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ward_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ward`
--

LOCK TABLES `ward` WRITE;
/*!40000 ALTER TABLE `ward` DISABLE KEYS */;
INSERT INTO `ward` VALUES (1,'Kasaba'),(2,'Bibwewadi'),(3,'Kondhwa'),(4,'Yerawada'),(5,'Warje'),(6,'Kothrud'),(7,'Dhayari'),(8,'Dhankawadi'),(9,'Katraj'),(10,'Swargate');
/*!40000 ALTER TABLE `ward` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'grs_system'
--

--
-- Dumping routines for database 'grs_system'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-30  9:48:11
