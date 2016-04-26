-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 26 Avril 2016 à 18:15
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `animal`
--

-- --------------------------------------------------------

--
-- Structure de la table `animal`
--

CREATE TABLE IF NOT EXISTS `animal` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `description` text,
  `taille` int(11) DEFAULT NULL,
  `nourriture` varchar(50) DEFAULT NULL,
  `poids` int(11) DEFAULT NULL,
  `image` varchar(500) DEFAULT NULL,
  `video` text,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `animal`
--

INSERT INTO `animal` (`id`, `nom`, `description`, `taille`, `nourriture`, `poids`, `image`, `video`, `type`) VALUES
(1, 'Renard', 'viande', 20, 'viande', 60, 'http://www.espritsciencemetaphysiques.com/wp-content/uploads/2015/07/animaux-totems-4.jpg', NULL, 2),
(4, 'Panda', 'bambou', 30, 'bambou', 600, 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUTExMVFhUXFx0XGBcYFxcYGBoYGh0XGB0XGhcYHSggGh0lHRcVIjEhJSkrLi4uGB8zODMtNygtLisBCgoKDg0OGxAQGi0dHSUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALcBFAMBIgACEQEDEQH/xAAcAAACAgMBAQAAAAAAAAAAAAAEBQMGAAIHAQj/xAA7EAABAgQEAwUGBQQCAwEAAAABAhEAAwQhBRIxQQZRYRMicYGRMqGxwdHwBxRSYuEjM0LxcpIkQ4Il/8QAGgEAAwEBAQEAAAAAAAAAAAAAAQIDAAQFBv/EACURAAICAgICAgIDAQAAAAAAAAABAhEhMQMSQVETIjJxYYGhBP/aAAwDAQACEQMRAD8A7QI9ePIww70AFrJrC', NULL, 2),
(3, 'Gorille', 'banane', 90, 'banne', 600, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDCqj3RFw1Tp2oVOAcCluyCB-k8hE3G3RNFl6_n4ySlTSQhbPodA', NULL, 2);

-- --------------------------------------------------------

--
-- Structure de la table `image`
--

CREATE TABLE IF NOT EXISTS `image` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idAnimal` int(10) DEFAULT NULL,
  `lienSource` varchar(500) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`),
  KEY `possede` (`idAnimal`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `localisation`
--

CREATE TABLE IF NOT EXISTS `localisation` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idAnimal` int(10) DEFAULT NULL,
  `posX` varchar(20) DEFAULT NULL,
  `posY` varchar(20) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`),
  KEY `vivre` (`idAnimal`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
