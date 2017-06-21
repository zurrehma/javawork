-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2017 at 02:11 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `menu`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `userName` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`userName`, `password`, `email`) VALUES
('admin', 'admin', 'admin@namal.edu.pk');

-- --------------------------------------------------------

--
-- Table structure for table `friday`
--

DROP TABLE IF EXISTS `friday`;
CREATE TABLE IF NOT EXISTS `friday` (
  `Meal` varchar(40) DEFAULT NULL,
  `Items` varchar(40) DEFAULT NULL,
  `fullPrice` int(20) DEFAULT NULL,
  `halfPrice` int(20) DEFAULT NULL,
  `startTime` varchar(40) DEFAULT NULL,
  `endTime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `friday`
--

INSERT INTO `friday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, NULL, NULL),
('Breakfast', 'Hash Browns', 65, 45, NULL, NULL),
('Breakfast', 'Cinamon Rolls', 65, 45, NULL, NULL),
('Lunch', 'Pitta Rolls', 45, 45, NULL, NULL),
('Lunch', 'Roti', 7, 7, NULL, NULL),
('Lunch', 'Mutton Qeema', 85, 55, NULL, NULL),
('Lunch', 'Lassi(Namkeen)', 35, 25, NULL, NULL),
('Dinner', 'Macaroni', 65, 45, NULL, NULL),
('Dinner', 'Enchilda', 80, 80, NULL, NULL),
('Dinner', 'Tea', 20, 20, NULL, NULL),
('Lunch', 'pizza', 100, 100, '12:00', '12:00');

-- --------------------------------------------------------

--
-- Table structure for table `monday`
--

DROP TABLE IF EXISTS `monday`;
CREATE TABLE IF NOT EXISTS `monday` (
  `Meal` varchar(40) NOT NULL,
  `Items` varchar(40) NOT NULL,
  `fullPrice` int(20) NOT NULL,
  `halfPrice` int(20) NOT NULL,
  `startTime` varchar(40) NOT NULL,
  `endTime` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monday`
--

INSERT INTO `monday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, '', ''),
('Breakfast', 'Paratha', 15, 15, '', ''),
('Breakfast', 'Fried Eggs', 20, 20, '', ''),
('Lunch', 'Chicken Cheese Zingers', 120, 120, '', ''),
('Lunch', 'Chicken Pizza', 170, 170, '', ''),
('Lunch ', 'Kheer', 50, 30, '', ''),
('Dinner', 'Tea', 20, 20, '', ''),
('Dinner', 'Roti', 7, 7, '', ''),
('Dinner', 'Lemon Chicken', 85, 55, '', ''),
('Breakfast', 'Baked Cheese', 45, 30, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `saturday`
--

DROP TABLE IF EXISTS `saturday`;
CREATE TABLE IF NOT EXISTS `saturday` (
  `Meal` varchar(40) DEFAULT NULL,
  `Items` varchar(40) DEFAULT NULL,
  `fullPrice` int(20) DEFAULT NULL,
  `halfPrice` int(20) DEFAULT NULL,
  `startTime` varchar(40) DEFAULT NULL,
  `endTime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saturday`
--

INSERT INTO `saturday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, NULL, NULL),
('Breakfast', 'Muffins', 40, 40, NULL, NULL),
('Breakfast', 'French Toast', 45, 45, NULL, NULL),
('Lunch', 'Beef Pulao', 85, 55, NULL, NULL),
('Lunch', 'Roti', 7, 7, NULL, NULL),
('Lunch', 'Special Daal', 35, 20, NULL, NULL),
('Dinner', 'Tea', 20, 20, NULL, NULL),
('Dinner', 'Naan', 10, 10, NULL, NULL),
('Dinner', 'Chicken Fingers', 80, 45, NULL, NULL),
('Dinner', 'Fajita', 65, 45, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `sunday`
--

DROP TABLE IF EXISTS `sunday`;
CREATE TABLE IF NOT EXISTS `sunday` (
  `Meal` varchar(40) DEFAULT NULL,
  `Items` varchar(40) DEFAULT NULL,
  `fullPrice` int(20) DEFAULT NULL,
  `halfPrice` int(20) DEFAULT NULL,
  `startTime` varchar(40) DEFAULT NULL,
  `endTime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sunday`
--

INSERT INTO `sunday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, NULL, NULL),
('Breakfast', 'Lassi(Meethi)', 40, 25, NULL, NULL),
('Breakfast', 'Halwa Pori', 45, 45, NULL, NULL),
('Breakfast', 'Aloo Paratha', 25, 25, NULL, NULL),
('Lunch', 'Baked Potatoes', 45, 30, NULL, NULL),
('Lunch', 'Pasta Salad', 50, 25, NULL, NULL),
('Lunch', 'Masala Rice', 40, 20, NULL, NULL),
('Dinner', 'Baked Zitti', 75, 55, NULL, NULL),
('Dinner', 'Caprese Salad', 55, 55, NULL, NULL),
('Dinner', 'Capuccino(Coffee)', 35, 35, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `thursday`
--

DROP TABLE IF EXISTS `thursday`;
CREATE TABLE IF NOT EXISTS `thursday` (
  `Meal` varchar(40) DEFAULT NULL,
  `Items` varchar(40) DEFAULT NULL,
  `fullPrice` int(20) DEFAULT NULL,
  `halfPrice` int(20) DEFAULT NULL,
  `startTime` varchar(40) DEFAULT NULL,
  `endTime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `thursday`
--

INSERT INTO `thursday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, NULL, NULL),
('Breakfast', 'Cereal(Chocklete)', 50, 30, NULL, NULL),
('Breakfast', 'Fried Eggs', 30, 30, NULL, NULL),
('Lunch', 'Quesdilla', 50, 35, NULL, NULL),
('Lunch', 'Panini', 60, 40, NULL, NULL),
('Lunch', 'Lasi(Methi)', 40, 25, NULL, NULL),
('Dinner', 'Lamb Chops', 105, 65, NULL, NULL),
('Dinner', 'Bread Roll', 55, 35, NULL, NULL),
('Dinner', 'Mashed Potatos', 75, 45, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tuesday`
--

DROP TABLE IF EXISTS `tuesday`;
CREATE TABLE IF NOT EXISTS `tuesday` (
  `Meal` varchar(40) NOT NULL,
  `Items` varchar(40) NOT NULL,
  `fullPrice` int(20) NOT NULL,
  `halfPrice` int(20) NOT NULL,
  `startTime` varchar(40) NOT NULL,
  `endTime` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tuesday`
--

INSERT INTO `tuesday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, '', ''),
('Breakfast', 'Pancakes', 80, 50, '', ''),
('Breakfast', 'French Toast', 50, 30, '', ''),
('Lunch', 'Tuna Salad', 80, 50, '', ''),
('Lunch', 'Sushi', 100, 60, '', ''),
('Lunch', 'Beef Sandwich', 90, 50, '', ''),
('Dinner', 'Meatballs', 60, 35, '', ''),
('Dinner', 'Ground Beef', 70, 35, '', ''),
('Dinner', 'Roti', 7, 7, '', ''),
('Dinner', 'Coffee', 30, 30, '01:59', '01:59');

-- --------------------------------------------------------

--
-- Table structure for table `wednesday`
--

DROP TABLE IF EXISTS `wednesday`;
CREATE TABLE IF NOT EXISTS `wednesday` (
  `Meal` varchar(40) DEFAULT NULL,
  `Items` varchar(40) DEFAULT NULL,
  `fullPrice` int(20) DEFAULT NULL,
  `halfPrice` int(20) DEFAULT NULL,
  `startTime` varchar(40) DEFAULT NULL,
  `endTime` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wednesday`
--

INSERT INTO `wednesday` (`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`) VALUES
('Breakfast', 'Tea', 20, 20, NULL, NULL),
('Breakfast', 'Waffle', 80, 50, NULL, NULL),
('Breakfast', 'Buritto', 70, 40, NULL, NULL),
('Lunch', 'Chicken Biryani', 90, 55, NULL, NULL),
('Lunch', 'Roti', 7, 7, NULL, NULL),
('Lunch', 'Bhindi', 30, 20, NULL, NULL),
('Dinner', 'Taco', 70, 50, NULL, NULL),
('Dinner', 'Spaghetti', 65, 40, NULL, NULL),
('Dinner', 'Lasagneia', 45, 30, NULL, NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
