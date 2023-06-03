-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Jun 03, 2023 at 06:03 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto`
--

-- --------------------------------------------------------

--
-- Table structure for table `inventario`
--

CREATE TABLE `inventario` (
  `codigo` int(11) NOT NULL,
  `articulo` varchar(150) NOT NULL,
  `cantidad` varchar(30) NOT NULL,
  `precio` varchar(10) NOT NULL,
  `categoria` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventario`
--

INSERT INTO `inventario` (`codigo`, `articulo`, `cantidad`, `precio`, `categoria`) VALUES
(1, 'computadora de escritorio HP, intel i5', '20', '$13,000', 'computadores'),
(3, 'audifonos xiaomi', '80', '$500', 'sonido'),
(5, 'iPhone 12', '30', '$25,000', 'celulares'),
(10, 'television Samsung 40\"', '87', '$3,500', 'televisores'),
(16, 'laptop HP 14\'\' intel i3', '60', '$8,000', 'laptops'),
(22, 'monitor ASUS 23\'\'', '20', '$3,000', 'monitores'),
(23, 'Xiaomi redmi 9', '30', '$2,500', 'celulares'),
(28, 'iphone 13 pro', '18', '$27,000', 'celulares'),
(29, 'monitor Samsung 27\'\'', '42', '$6,000', 'monitores'),
(30, 'mouse logitech', '108', '$400', 'mouse'),
(31, 'teclado mecanico 60%', '33', '$1,400', 'teclados'),
(32, 'laptop Dell 14\'\', intel i3', '30', '$7,000', 'laptops');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inventario`
--
ALTER TABLE `inventario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
