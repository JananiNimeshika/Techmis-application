-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 20, 2021 at 02:57 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `d_id` char(5) NOT NULL,
  `d_name` varchar(20) NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `d_p_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`d_id`, `d_name`, `gender`, `d_p_no`) VALUES
('1', 'savidu', 'M', 772233546);

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `stu_id` char(6) NOT NULL,
  `cu_id` char(15) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int(11) NOT NULL,
  `status` enum('0','1') NOT NULL,
  PRIMARY KEY (`stu_id`,`day`,`type`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`stu_id`, `cu_id`, `day`, `type`, `hours`, `status`) VALUES
('2', 'ICT2123', '2021-01-01', 'P', 4, '1'),
('1', 'ICT2113', '2021-01-08', 'T', 3, '1'),
('3', 'ICT2142', '2021-01-03', 'T', 4, '1'),
('4', 'ICT2142', '2021-01-05', 'P', 2, '0'),
('5', 'ENG2122', '2021-01-17', 'T', 2, '1');

-- --------------------------------------------------------

--
-- Table structure for table `attendances`
--

DROP TABLE IF EXISTS `attendances`;
CREATE TABLE IF NOT EXISTS `attendances` (
  `stu_id` char(6) NOT NULL,
  `sub_id` varchar(20) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int(11) DEFAULT NULL,
  `status` enum('0','1') DEFAULT NULL,
  PRIMARY KEY (`stu_id`,`sub_id`,`day`,`type`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendances`
--

INSERT INTO `attendances` (`stu_id`, `sub_id`, `day`, `type`, `hours`, `status`) VALUES
('2', 'ICT2123', '2021-01-01', 'P', 4, '1'),
('1', 'ICT2113', '2021-01-08', 'T', 3, '1'),
('3', 'ICT2142', '2021-01-03', 'T', 4, '1'),
('4', 'ICT2142', '2021-01-05', 'P', 2, '0'),
('5', 'ENG2122', '2021-01-17', 'T', 2, '1');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `cu_id` char(4) NOT NULL,
  `cu_dept_id` char(6) NOT NULL,
  `cu_name` varchar(10) NOT NULL,
  PRIMARY KEY (`cu_id`),
  KEY `cu_dept_id` (`cu_dept_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`cu_id`, `cu_dept_id`, `cu_name`) VALUES
('cu01', 'depICT', 'ICT');

-- --------------------------------------------------------

--
-- Table structure for table `dean`
--

DROP TABLE IF EXISTS `dean`;
CREATE TABLE IF NOT EXISTS `dean` (
  `de_id` char(5) NOT NULL,
  `de_name` varchar(20) NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `de_p_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`de_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `demonstrator`
--

DROP TABLE IF EXISTS `demonstrator`;
CREATE TABLE IF NOT EXISTS `demonstrator` (
  `ad_id` char(5) NOT NULL,
  `ad_name` varchar(20) NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `ad_p_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`ad_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `dept_id` char(6) NOT NULL,
  `dept_name` varchar(40) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dept_id`, `dept_name`) VALUES
('depICT', 'Information Communication Technology');

-- --------------------------------------------------------

--
-- Table structure for table `final_marks`
--

DROP TABLE IF EXISTS `final_marks`;
CREATE TABLE IF NOT EXISTS `final_marks` (
  `sub_id` varchar(10) NOT NULL,
  `stu_id` int(10) NOT NULL,
  `theory` varchar(100) NOT NULL,
  `practical` varchar(100) NOT NULL,
  PRIMARY KEY (`sub_id`,`stu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `final_marks`
--

INSERT INTO `final_marks` (`sub_id`, `stu_id`, `theory`, `practical`) VALUES
('ICT2133', 1, '66', '77'),
('ICT2123', 2, '77', '55'),
('ICT2113', 4, '88', '66'),
('ENG2122', 3, '98', '55'),
('ICT2142', 7, '67', '86'),
('ICT2153', 1, '87', '53'),
('TCS2112', 6, '67', '85'),
('TCS2122', 4, '89', '65');

-- --------------------------------------------------------

--
-- Table structure for table `ict_ca`
--

DROP TABLE IF EXISTS `ict_ca`;
CREATE TABLE IF NOT EXISTS `ict_ca` (
  `sub_id` char(7) NOT NULL,
  `stu_id` char(6) NOT NULL,
  `q1` decimal(5,2) DEFAULT NULL,
  `q2` decimal(5,2) DEFAULT NULL,
  `q3` decimal(5,2) DEFAULT NULL,
  `q4` decimal(5,2) DEFAULT NULL,
  `ass1` decimal(5,2) DEFAULT NULL,
  `ass2` decimal(5,2) DEFAULT NULL,
  `ass3` decimal(5,2) DEFAULT NULL,
  `mid` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`sub_id`,`stu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ict_ca`
--

INSERT INTO `ict_ca` (`sub_id`, `stu_id`, `q1`, `q2`, `q3`, `q4`, `ass1`, `ass2`, `ass3`, `mid`) VALUES
('ICT2133', '1', '44.00', '77.00', '99.00', '99.00', '55.00', '66.00', '55.00', '55.00'),
('ICT2123', '2', '33.00', '44.00', '88.00', '77.00', '66.00', '44.00', '66.00', '88.00'),
('ICT2113', '4', '22.00', '44.00', '77.00', '55.00', '44.00', '77.00', '44.00', '77.00'),
('ENG2122', '3', '66.00', '88.00', '77.00', '44.00', '22.00', '44.00', '33.00', '22.00'),
('ICT2142', '7', '44.00', '55.00', '88.00', '99.00', '66.00', '88.00', '44.00', '99.00'),
('ICT2153', '1', '88.00', '66.00', '55.00', '33.00', '88.00', '99.00', '33.00', '44.00'),
('TCS2112', '6', '44.00', '55.00', '77.00', '88.00', '34.00', '65.00', '76.00', '44.00'),
('TCS2122', '4', '33.00', '98.00', '54.00', '67.00', '87.00', '32.00', '78.00', '98.00');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
CREATE TABLE IF NOT EXISTS `lecturer` (
  `lec_id` char(5) NOT NULL,
  `lec_dept_id` char(6) NOT NULL,
  `lec_name` varchar(20) NOT NULL,
  `lec_address` varchar(40) NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `lec_p_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`lec_id`),
  KEY `lec_dept_id` (`lec_dept_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lec_id`, `lec_dept_id`, `lec_name`, `lec_address`, `gender`, `lec_p_no`) VALUES
('1', 'depICT', 'randula', 'school road, rathnapura', 'F', 751122345);

-- --------------------------------------------------------

--
-- Table structure for table `medical`
--

DROP TABLE IF EXISTS `medical`;
CREATE TABLE IF NOT EXISTS `medical` (
  `stu_id` char(6) NOT NULL,
  `cu_id` char(15) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int(11) NOT NULL,
  PRIMARY KEY (`stu_id`,`day`,`type`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical`
--

INSERT INTO `medical` (`stu_id`, `cu_id`, `day`, `type`, `hours`) VALUES
('1', 'ICT2113', '2021-01-03', 'T', 5),
('2', 'ICT2123', '2021-01-08', 'P', 3),
('1', 'ICT2113', '2021-01-30', 'P', 4),
('3', 'ICT2143', '2021-01-08', 'T', 5),
('6', 'ICT2142', '2021-01-15', 'P', 5);

-- --------------------------------------------------------

--
-- Table structure for table `medicals`
--

DROP TABLE IF EXISTS `medicals`;
CREATE TABLE IF NOT EXISTS `medicals` (
  `stu_id` char(6) NOT NULL,
  `sub_id` varchar(15) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int(11) DEFAULT NULL,
  PRIMARY KEY (`stu_id`,`sub_id`,`day`,`type`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicals`
--

INSERT INTO `medicals` (`stu_id`, `sub_id`, `day`, `type`, `hours`) VALUES
('1', 'ICT2113', '2020-12-03', 'T', 5),
('2', 'ICT2123', '2021-01-08', 'P', 3),
('1', 'ICT2113', '2021-01-30', 'P', 4),
('3', 'ICT2153', '2021-01-08', 'T', 5),
('6', 'ICT2142', '2021-01-15', 'P', 5);

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
CREATE TABLE IF NOT EXISTS `notice` (
  `no` int(100) NOT NULL AUTO_INCREMENT,
  `date` varchar(100) NOT NULL,
  `title` varchar(255) NOT NULL,
  `notice` varchar(255) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`no`, `date`, `title`, `notice`) VALUES
(1, '2020-01-05', 'regarding quizes', '2nd quiz will be held on next thursday'),
(2, '2021-01-22', 'campus reopen', 'university will be reopen for academic in 25 of february'),
(3, '2021-02-05', 'mid examination', 'economic mid will be held on next week. so be prepared.'),
(4, '2021-01-25', 'scholarship', 'you can apply for scholarship. closing date will be exceed 2 days.'),
(5, '2021-01-30', 'musical program', 'faculty of technology music team will held a musical program');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `stu_id` char(6) NOT NULL,
  `stu_dept_id` char(6) NOT NULL,
  `menter_id` char(5) NOT NULL,
  `stu_name` varchar(25) NOT NULL,
  `stu_address` varchar(40) NOT NULL,
  `gender` enum('M','F') NOT NULL,
  `stu_b_day` date NOT NULL,
  `stu_p_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`stu_id`),
  KEY `stu_dept_id` (`stu_dept_id`),
  KEY `menter_id` (`menter_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`stu_id`, `stu_dept_id`, `menter_id`, `stu_name`, `stu_address`, `gender`, `stu_b_day`, `stu_p_no`) VALUES
('1', '2', '4', 'randula', 'vidyala mawatha', 'F', '2020-12-01', 976544),
('2', '2', '5', 'kavindi', 'school road,badulla', 'F', '2021-11-04', 712345678),
('3', '2', '7', 'Janani', 'temple road,Neluwa', 'F', '2021-01-28', 712345568),
('4', '2', '8', 'Savidu', 'matara', 'M', '2021-01-25', 775566890),
('5', '2', '9', 'kasuni', 'hospital road,maharagama', 'F', '2021-01-19', 752341125),
('6', '2', '5', 'Lakshan', 'school road,monaragala', 'M', '2021-10-13', 764453783),
('7', '2', '9', 'sumudu', 'pansala road,deniyaya', 'F', '2021-01-12', 778995423),
('8', '2', '5', 'dashini', 'hakmana', 'F', '2021-01-19', 778896543),
('9', '2', '5', 'dinuka', 'wallawaya', 'M', '2021-01-26', 712233849),
('10', '2', '4', 'nirasha', 'weligama', 'F', '2021-01-12', 784435223);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `sub_id` char(7) NOT NULL,
  `sub_cu_id` char(4) NOT NULL,
  `sub_name` varchar(50) NOT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `sub_cu_id` (`sub_cu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sub_id`, `sub_cu_id`, `sub_name`) VALUES
('ICT2133', 'cu01', 'Object Oriented Analysis & Design'),
('ICT2123', 'cu01', 'Object Oriented Development'),
('ICT2113', 'cu01', 'Data Structures and Algorithms'),
('ENG2122', 'cu01', 'English III'),
('ICT2142', 'cu01', 'Professional Issues in IT'),
('ICT2153', 'cu01', 'Internet Application Development'),
('TCS2112', 'cu01', 'Business Economics'),
('TCS2122', 'cu01', 'Soft Skills');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
CREATE TABLE IF NOT EXISTS `subjects` (
  `sub_dept_id` int(10) NOT NULL,
  `sub_id` varchar(100) NOT NULL,
  `sub_name` varchar(100) NOT NULL,
  `lec_id` varchar(100) NOT NULL,
  PRIMARY KEY (`sub_dept_id`,`sub_id`,`lec_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`sub_dept_id`, `sub_id`, `sub_name`, `lec_id`) VALUES
(3, 'ICT2133', 'object oriented development', '22'),
(3, 'ICT2123', 'object oriented development', '21'),
(3, 'ICT2113', 'Data structure and algorithms', '20'),
(3, 'ENG2122', 'English III', '19'),
(3, 'ICT2142', 'Professional Issues in ICT', '20'),
(3, 'ICT2153', 'Internet application development', '26'),
(3, 'TCS2112', 'Economic', '28'),
(3, 'TCS2122', 'Soft Skills', '23');

-- --------------------------------------------------------

--
-- Table structure for table `tecnical_officer`
--

DROP TABLE IF EXISTS `tecnical_officer`;
CREATE TABLE IF NOT EXISTS `tecnical_officer` (
  `tec_id` char(5) NOT NULL,
  `tec_dept_id` char(6) NOT NULL,
  `tec_name` varchar(20) DEFAULT NULL,
  `gender` enum('F','M') NOT NULL,
  `tec_p_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`tec_id`),
  KEY `tec_dept_id` (`tec_dept_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tecnical_officer`
--

INSERT INTO `tecnical_officer` (`tec_id`, `tec_dept_id`, `tec_name`, `gender`, `tec_p_no`) VALUES
('1', 'depICT', 'kavindi', 'F', 711122334);

-- --------------------------------------------------------

--
-- Table structure for table `time_table`
--

DROP TABLE IF EXISTS `time_table`;
CREATE TABLE IF NOT EXISTS `time_table` (
  `time` varchar(15) NOT NULL,
  `mon` varchar(15) NOT NULL,
  `tue` varchar(15) NOT NULL,
  `wed` varchar(15) NOT NULL,
  `thu` varchar(15) NOT NULL,
  `fri` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `time_table`
--

INSERT INTO `time_table` (`time`, `mon`, `tue`, `wed`, `thu`, `fri`) VALUES
('0', 'sub1', 'sub2', 'sub3', 'sub4', 'sub5'),
('08.00', 'ICT2133', 'ICT2122', 'ICT2153', 'ICT2142', 'ICT2133');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` char(5) NOT NULL,
  `user_pwd` varchar(15) NOT NULL,
  `user_role` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_pwd`, `user_role`) VALUES
('1', 'admin', 'admin_test'),
('2', '111', 'Lectrue'),
('3', '111', 'Tech officer'),
('4', '1234', 'student');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
