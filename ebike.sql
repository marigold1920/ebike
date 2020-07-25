-- MySQL dump 10.13  Distrib 8.0.20, for Linux (x86_64)
--
-- Host: localhost    Database: ebike
-- ------------------------------------------------------
-- Server version	8.0.20-0ubuntu0.20.04.1

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
-- Table structure for table `about`
--

DROP TABLE IF EXISTS `about`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `about` (
  `about_id` int NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `quote` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`about_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `about`
--

LOCK TABLES `about` WRITE;
/*!40000 ALTER TABLE `about` DISABLE KEYS */;
INSERT INTO `about` VALUES (1,'387 Quang Trung, GoVap','cephiroth@gmail.com','+84 27 008 005','Storm and SONDORS Premium Electric Bikes have been featured in major media publications from around the world, and for good reason. In record time, SONDORS became the best-selling electric bike in the U.S. and beyond.');
/*!40000 ALTER TABLE `about` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apparel`
--

DROP TABLE IF EXISTS `apparel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apparel` (
  `apparel_id` int NOT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `producer` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`apparel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apparel`
--

LOCK TABLES `apparel` WRITE;
/*!40000 ALTER TABLE `apparel` DISABLE KEYS */;
INSERT INTO `apparel` VALUES (1,'https://i.ibb.co/QY6J217/INTENSE-BEAR-PUR22-BLACK-MF-RED-VIRTUAL.webp','CALIFORNIA BEAR WATER BOTTLE 22OZ',15,'INTENSE LLC'),(2,'https://i.ibb.co/378vR0Q/INTENSE-LOGO-PUR22-BLACK-MF-RED-VIRTUAL.webp','INTENSE WATER BOTTLE 22OZ',15,'INTENSE LLC'),(3,'https://i.ibb.co/TqHBF3k/Blk-Tee-Front-2.webp','INTENSE MEN’S TEE BLACK',26,'INTENSE CYCLES INC.'),(4,'https://i.ibb.co/6vG5CCX/INTENSE-Red-Tee-Front.webp','INTENSE MEN’S TEE RED',26,'INTENSE CYCLES INC.'),(5,'https://i.ibb.co/2YkCSdf/INTENSE-Blk-Hoodie-FRONT.webp','INTENSE MEN’S ZIP-UP HOODIE BLACK',65,'INTENSE CYCLES INC.'),(6,'https://i.ibb.co/sJdcNSB/INTNSE-Red-Hat-Front-2.webp','INTENSE HAT FLATBILL RED',28,'INTENSE LLC'),(7,'https://i.ibb.co/8bMsbVv/INTENSE-jacket1.webp','INTENSE MEN\'S JACKET BLACK',99,'INTENSE LLC'),(8,'https://i.ibb.co/Cnp9p3C/IFR-JACKET1.png','INTENSE FACTORY RACING TECH ZIP-UP BLACK',99,'INTENSE LLC'),(9,'https://i.ibb.co/0QSN6nm/CORE-HAT-flatbill-front.png','INTENSE HAT FLATBILL BLACK',28,'INTENSE LLC'),(10,'https://i.ibb.co/1JvsP49/CORE-HAT-curvebill-front.png','INTENSE HAT CURVEBILL BLACK',28,'INTENSE LLC'),(11,'https://i.ibb.co/1GS8xcF/INTENSE-WATERBOTTLE1.png','INTENSE HYDRO ALUMINUM BOTTLE',39,'INTENSE LLC'),(12,'https://i.ibb.co/NxcvHks/IFR-SS-2.png','INTENSE FACTORY RACING TEE BLACK',36,'INTENSE LLC'),(13,'https://i.ibb.co/PDJgfJx/IFR-HAT1.png','INTENSE FACTORY RACING HAT',32,'INTENSE LLC'),(14,'https://i.ibb.co/dMzdHBV/Long-Sleeve-Front-2.png','INTENSE FACTORY RACING LONG SLEEVE TEE',45,'INTENSE LLC'),(15,'https://i.ibb.co/M9H8Xv3/Black-beanie-front1.png','INTENSE BEANIE BLACK',22,'INTENSE LLC'),(16,'https://i.ibb.co/bvcCcnf/IFR-BEANIE-RED.png','INTENSE FACTORY RACING BEANIE',22,'INTENSE LLC'),(17,'https://i.ibb.co/YTxZWH7/LEV-Integra-18.png','KS LEV INTEGRA DROPPER POST 125MM',300,'INTENSE CYCLES INC'),(18,'https://i.ibb.co/z7ThqD9/IFR-Apron-2.png','INTENSE FACTORY RACING SHOP APRON',39,'INTENSE LLC'),(19,'https://i.ibb.co/VpxS5RD/Floor-Mat-2.png','INTENSE FACTORY RACING SHOP MAT',169,'INTENSE LLC'),(20,'https://i.ibb.co/g4bVGhh/Wms-Tank-Front-2.png','INTENSE FACTORY RACING WOMENS TANK TOP BLACK',26,'INTENSE LLC');
/*!40000 ALTER TABLE `apparel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apparel_order_item`
--

DROP TABLE IF EXISTS `apparel_order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apparel_order_item` (
  `apparel_order_id` int NOT NULL,
  `quantity` int DEFAULT NULL,
  `apparel_id` int DEFAULT NULL,
  `invoice_id` int DEFAULT NULL,
  PRIMARY KEY (`apparel_order_id`),
  KEY `FKrl6c9dipftjulcluhp0jlrebp` (`apparel_id`),
  KEY `FK2ynclto99h6d5g095v1bigciw` (`invoice_id`),
  CONSTRAINT `FK2ynclto99h6d5g095v1bigciw` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`invoice_id`),
  CONSTRAINT `FKrl6c9dipftjulcluhp0jlrebp` FOREIGN KEY (`apparel_id`) REFERENCES `apparel` (`apparel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apparel_order_item`
--

LOCK TABLES `apparel_order_item` WRITE;
/*!40000 ALTER TABLE `apparel_order_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `apparel_order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike`
--

DROP TABLE IF EXISTS `bike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bike` (
  `bike_id` int NOT NULL,
  `characteristic` varchar(100) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  `motor` varchar(20) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `quote` varchar(255) DEFAULT NULL,
  `distance` varchar(20) DEFAULT NULL,
  `speed` varchar(20) DEFAULT NULL,
  `title` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`bike_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike`
--

LOCK TABLES `bike` WRITE;
/*!40000 ALTER TABLE `bike` DISABLE KEYS */;
INSERT INTO `bike` VALUES (1,'Foldable | All-Terrain | Power','Pistol | Black | White | Torch','Notion Fold X is our best seller in foldable transportation, and the deal choice for extremely smart, convenient riding no matter where you live or roam.','https://i.ibb.co/5WSQpGn/FOLD-X-BLACK.png','500 WAT','NOTION FOLD X',1199.99,NULL,'Our Most Loved Folding Model Kicks it up a Notch','40-60 MILES','20+ MPH','fold-x'),(2,'All-Terrain | Urban | Power','Torch | Graphite','Primer 27.5 Pro is special edition ready to redefine what\'s possible. Bring the unreachable within reach with this next-level, an unimaginable synergy of features and allure – making the excess, accessible at an exceptionally optimistic price.','https://i.ibb.co/nCwr00F/Primer-275-Blue-ELT-F-45-2.png','750 WAT','PRIMER 27.5 PRO',5699.99,NULL,'Astonishing Acceleration and Preposterous Performance at an Outlandish Price','30-50 MILES','20+ MPH','primer'),(3,'Foldable | Urban | Front Suspension','Black | White | Torch','Haul Smart Step is as fun as it is effortless – with an easy step through the frame, you’re off on your quick getaway. Haul Smart Step has the head turning design and premium components you love. Plus, in one simple fold, it’s half its size – making transporting and stowage as breezy as riding the wind. It’s cool, comfortable and competent, bringing you just a step away from being a happy, easy rider.','https://i.ibb.co/RCGqqdx/STEP-BLACK-BACKGROUND.png','350 WAT','HAUL SMART STEP',1199.99,NULL,'The Easygoing Ride','25-40 MILES','20+ MPH','smart-step'),(4,'All-Terrain | Urban | Power','Black | Torch | White','TRACER ELITE 48V 17.5Ah Li-ion battery nearly doubles your range, and when paired with a 500 watt motor, it offers extreme torque, towing capacity and hill-climbing power. And, with speed\'s up to 20 mph, SONDORS X is sure to add smiles to your miles.','https://i.ibb.co/Lk3cRCt/20-Tracer-Red-ELT-F-45.png','500 WAT','TRACER ELITE',7599.99,NULL,'Our \"Most Loved\" Fat Tire Taken To The Extreme','45-70 MILES','30+ MPH','tracer'),(5,'All-Terrain | Urban | Power','Torch | Graphite | Ghost','SONDORS MXS, the hardtail electric mountain bike SONDORS lovers have been longing for. At every angle, it’s all SONDORS, and extreme in every way. With the greatest performance, power, and adaptability of any model in the SONDORS lineup, MXS is designed to invite riders to push the limits of what’s possible.','https://i.ibb.co/JmGbyY5/MXS-BLACK-BACKGROUND.png','750 WAT','SONDORS MXS',1699.99,NULL,'The Power to Change Everything—Meet the Mountain Bike that Moves Mountains','40-55 MILES','25+ MPH','mxs'),(6,'Foldable | All-Terrain | Power','Torch | Graphite','INTENSE M16 is special edition ready to redefine what\'s possible. Bring the unreachable within reach with this next-level, foldable SONDORS, an unimaginable synergy of features and allure – making the excess, accessible at an exceptionally optimistic price.','https://i.ibb.co/ygLqB33/MY20-M16-EXP-F-45.png','750 WAT','INTENSE M16',5699.99,NULL,'Astonishing Acceleration and Preposterous Performance at an Outlandish Price','35-55 MILES','28+ MPH','m16');
/*!40000 ALTER TABLE `bike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike_order_item`
--

DROP TABLE IF EXISTS `bike_order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bike_order_item` (
  `bike_order_id` int NOT NULL,
  `quantity` int DEFAULT NULL,
  `bike_id` int DEFAULT NULL,
  `invoice_id` int DEFAULT NULL,
  PRIMARY KEY (`bike_order_id`),
  KEY `FK9dnke2mn55vsl843di8w2fvej` (`bike_id`),
  KEY `FK6hxt355obrkvld8wq1bf4rtfu` (`invoice_id`),
  CONSTRAINT `FK6hxt355obrkvld8wq1bf4rtfu` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`invoice_id`),
  CONSTRAINT `FK9dnke2mn55vsl843di8w2fvej` FOREIGN KEY (`bike_id`) REFERENCES `bike` (`bike_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike_order_item`
--

LOCK TABLES `bike_order_item` WRITE;
/*!40000 ALTER TABLE `bike_order_item` DISABLE KEYS */;
INSERT INTO `bike_order_item` VALUES (1,2,3,1),(2,2,6,1);
/*!40000 ALTER TABLE `bike_order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `difference`
--

DROP TABLE IF EXISTS `difference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `difference` (
  `bike_id` int NOT NULL,
  `content` varchar(100) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`bike_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `difference`
--

LOCK TABLES `difference` WRITE;
/*!40000 ALTER TABLE `difference` DISABLE KEYS */;
/*!40000 ALTER TABLE `difference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `elementor`
--

DROP TABLE IF EXISTS `elementor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `elementor` (
  `elementor_id` int NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`elementor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elementor`
--

LOCK TABLES `elementor` WRITE;
/*!40000 ALTER TABLE `elementor` DISABLE KEYS */;
INSERT INTO `elementor` VALUES (1,'Shop All Sondors 2020','It all began for SONDORS in February 2015, with the launch of SONDORS Original attracting worldwide attention through one of the most successful crowdfunding campaigns in history. In keeping with the momentum, SONDORS launched two additional multi-million dollar campaigns – all within the same year. Today, SONDORS Original is still one the most celebrated electric bikes in the U.S., even since being retired and replaced by the more powerful SONDORS X in early 2020.','https://i.ibb.co/JpMCdbc/Couple-Beach-scaled.jpg','The birth of an original'),(2,'Shop Sondors X','Emerging from the record-breaking success of SONDORS Original sprung one of our most powerful electric bikes, SONDORS X. The same head-turning Original design fitted with a powerful 500 watt motor and a 48V 17.5 Li-ion battery. SONDORS X offers SONDORS lovers and eBike enthusiasts everywhere unrivaled torque, extended range, extreme towing capacity, and unprecedented hill-climbing power, like never before.','https://i.ibb.co/tXZbqJ9/SONODORS-X1.jpg','The evolution of power'),(3,'Shop Sondors Thin','As unexplored coasts and hillsides across the globe became new adventure destinations with SONDORS signature all-terrain fat tire models: Original and X, our founder and visionary Storm Sondors became inspired to extend our mission to every city street and college campus in America. Thus, SONDORS Thin was born. A classic road bike in look and feel, with the unique styling and premium components that make it a SONDORS. A homage to traditional cyclists everywhere.','https://i.ibb.co/Fw6KRwn/SONDORS-SF-FRIDAY-01.jpg','Innovation is in our DNA'),(4,'Shop Sondors Fold X','While electric bike companies everywhere were busy trying to replicate our secret sauce for providing superior technology at prices within reach…we were creating what’s now been coined as “America’s most loved foldable eBike ever”: SONDORS Fold X. In one simple fold and less than ten seconds, SONDORS Fold X is ready for effortless stowing in just about any space. Superbly sturdy and versatile, Fold X is the electric bike for everyone','https://i.ibb.co/YN66g2t/PBF-9736-1.jpg','A perfect fit for any electric bike rider'),(5,'Shop All Sondors','Tens of thousands of people have purchased a new SONDORS without ever riding it, and now they’re obsessed. We’re SONDORS, the brand that has democratized access to premium electric transportation through one of the most successful crowdfunding campaigns in history. We didn’t just disrupt the industry, we revolutionized it. Welcome to the future of electric transportation, now go get what you came here for.',NULL,'We Are The Electric Bike Revolution');
/*!40000 ALTER TABLE `elementor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `invoice_id` int NOT NULL,
  `customer_address` varchar(250) DEFAULT NULL,
  `customer_email` varchar(100) DEFAULT NULL,
  `customer_name` varchar(100) DEFAULT NULL,
  `note` varchar(1000) DEFAULT NULL,
  `order_date` datetime(6) DEFAULT NULL,
  `customer_phone` varchar(11) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`invoice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (1,'1120 Quang Trung','loinhse63185@fpt.edu.vn','Victor Nguyễn','','2020-07-25 00:00:00.000000','0327008005',NULL);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specification`
--

DROP TABLE IF EXISTS `specification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `specification` (
  `specification_id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `value` varchar(100) DEFAULT NULL,
  `bike_id` int DEFAULT NULL,
  PRIMARY KEY (`specification_id`),
  KEY `FKp4vdcwhg0ykf2hfpiw8rbqn3c` (`bike_id`),
  CONSTRAINT `FKp4vdcwhg0ykf2hfpiw8rbqn3c` FOREIGN KEY (`bike_id`) REFERENCES `bike` (`bike_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specification`
--

LOCK TABLES `specification` WRITE;
/*!40000 ALTER TABLE `specification` DISABLE KEYS */;
INSERT INTO `specification` VALUES (117,'Motor','500 WATT',1),(118,'Controllor','15 AMP',1),(119,'Battery','48V 14Ah Li-ion battery with Panasonic® cells',1),(120,'Range','40-60 miles*',1),(121,'Speed','Up to 20 mph',1),(122,'Charging','3A Smart Charger Included',1),(123,'Throttle','100% electric ride',1),(124,'Wheel','Aluminum Rims',1),(125,'Gears','7-speed With Grip Shifter',1),(126,'Seat','Premium Ergonomic Gel',1),(127,'LCD Screen','Black/White Digital',1),(128,'Frame','Forged Aluminum',1),(129,'Tires','20x4\"',1),(130,'Total Weight','66 lbs',1),(131,'Standover Height','28”',1),(132,'Folded Dimensions','39” x 18” x 29”',1),(133,'Load Capacity','300 lbs',1),(134,'Motor','750 WATT',2),(135,'Controllor','25 AMP',2),(136,'Battery','48V 17.5Ah Lithium-ion battery with Panasonic® cells',2),(137,'Range','40-60 miles*',2),(138,'Speed','Up to 20 mph',2),(139,'Charging','3A Smart Charger Included',2),(140,'Throttle','100% electric ride',2),(141,'Breaks','Hydraulic with 180mm discs',2),(142,'Suspension','Adjustable Air Shocks',2),(143,'Wheel','Aluminum rims, front hub with sealed bearings',2),(144,'Crank Set','Premium 48T',2),(145,'Pedal Assist Sensor','12 magnet',2),(146,'Gears','7-speed with grip shifter',2),(147,'Seat','Premium ergonomic gel',2),(148,'Handlebars','Premium ergonomic',2),(149,'Kickstand','Heavy-duty',2),(150,'Seat Post','Suspension',2),(151,'Color LCD Display','Includes USB port and five levels of pedal assist, battery level, speed, distance traveled, etc.',2),(152,'Frame','Aluminum',2),(153,'Tires','26x4.9\"',2),(154,'Total Weight','75 lbs',2),(155,'Standover Height','31.5”',2),(156,'Load Capacity','300 lbs',2),(157,'Motor','350 WATT',3),(158,'Controllor','15 AMP',3),(159,'Battery','36V 10.4Ah Lithium-ion battery',3),(160,'Range','25-40 miles*',3),(161,'Speed','Up to 20 mph',3),(162,'Charging','2A Charger Included',3),(163,'Available Colors','Pearl, Torch or Black',3),(164,'Suspension','Front',3),(165,'Gears','7-speed with grip shifter',3),(166,'Frame','Aluminum',3),(167,'Tires','27.5\" x 3.0\"',3),(168,'Total Weight','',3),(169,'Standover Height','20.5\"',3),(170,'Seat Height','31.5\"-41.5\"',3),(171,'Load Capacity','300 lbs',3),(172,'Motor','500 WATT',4),(173,'Controllor','20 AMP',4),(174,'Battery','48V 17.5Ah Li-ion battery with Panasonic® cells',4),(175,'Range','40-60 miles*',4),(176,'Speed','Up to 20 mph',4),(177,'Charging','3A Smart Charger Included',4),(178,'Throttle','Thumb',4),(179,'Wheel','Aluminum Rims',4),(180,'Gears','7-speed With Grip Shifter',4),(181,'Seat','Premium Ergonomic Gel',4),(182,'LCD Screen','Black/White Digital',4),(183,'Frame','Forged Aluminum',4),(184,'Tires','26 x 4.9\"',4),(185,'Total Weight','67 lbs',4),(186,'Standover Height','30”',4),(187,'Load Capacity','300 lbs',4),(188,'Motor','750 Watt',5),(189,'Controllor','25 Amp',5),(190,'Battery','48V 17.5Ah Li-ion battery with Panasonic® cells',5),(191,'Range','40-60 miles*',5),(192,'Speed','Up to 20 mph',5),(193,'Charging','Includes 3A Smart Charger Included',5),(194,'Throttle','Thumb',5),(195,'Breaks','Hydraulic with 180mm discs',5),(196,'Suspension','Seat post and adjustable front fork AirShocks',5),(197,'Wheel','Aluminum rims, front hub with sealed bearings',5),(198,'Crank Set','Premium 48T',5),(199,'Pedal Assist Sensor','12 magnet',5),(200,'Gears','7-speed with grip shifter',5),(201,'Seat','Premium ergonomic gel',5),(202,'Handlebars','Premium ergonomic',5),(203,'Kickstand','Heavy-duty',5),(204,'Color LCD Display','Includes USB port and five levels of pedal assist, battery level, speed, distance traveled, etc.',5),(205,'Frame','Aluminum',5),(206,'Tires','Maxxis® 27.5 x 3.0\"',5),(207,'Total Weight','65 lbs',5),(208,'Standover Height','30.5”',5),(209,'Load Capacity','300 lbs',5),(210,'Motor','750 WATT',6),(211,'Controllor','25 AMP',6),(212,'Battery','48V 17.5Ah Lithium-ion battery with Panasonic® cells',6),(213,'Range','40-60 miles*',6),(214,'Speed','Up to 20 mph',6),(215,'Charging','3A Smart Charger Included',6),(216,'Throttle','100% electric ride',6),(217,'Brakes','Hydraulic with 180mm discs',6),(218,'Suspension','Adjustable Air Shocks',6),(219,'Wheel','Aluminum rims, front hub with sealed bearings',6),(220,'Crank Set','Premium 48T',6),(221,'Pedal Assist Sensor','12 magnet',6),(222,'Gears','7-speed with grip shifter',6),(223,'Seat','Premium ergonomic gel',6),(224,'Handlebars','Premium ergonomic',6),(225,'Kickstand','Heavy-duty',6),(226,'Seat Post','Suspension',6),(227,'Color LCD Display','Includes USB port and five levels of pedal assist, battery level, speed, distance traveled, etc.',6),(228,'Frame','Aluminum',6),(229,'Tires','26x4.9\"',6),(230,'Total Weight','75 lbs',6),(231,'Standover Height','31.5\"',6),(232,'Load Capacity','300 lbs',6);
/*!40000 ALTER TABLE `specification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-25 16:37:25
