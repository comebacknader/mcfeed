USE `mcfeed`;

--
-- Table structure for table `price`
--

DROP TABLE IF EXISTS `price`;

CREATE TABLE `price` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ticker` varchar(5) NOT NULL UNIQUE,
  `price` varchar(255) NOT NULL UNIQUE,
  `user_type` varchar(50) NOT NULL,
  `ip_address` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

