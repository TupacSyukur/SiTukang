-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2023 at 05:43 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `situkang`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone_number` varchar(13) NOT NULL,
  `address` text NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `username`, `name`, `phone_number`, `address`, `password`) VALUES
(1, 'afrierl', 'Afri Almuharram', '081374853968', 'Batam', '0000'),
(2, 'rifqiar', 'Rifqi Aulia Rahman', '081376668541', 'Bandung', '0000'),
(3, 'rexcyptr', 'Rexcy Putra', '082166527165', 'Pontianak', '0000'),
(4, 'bimaptr', 'Bima Putra Setiabudi', '085675442131', 'Bekasi', '0000'),
(5, 'ekyputra', 'Rifky Aulia Putra', '081376548876', 'Tanggerang', '0000'),
(6, 'johanalibasa', 'Johan Alibasa', '0822666128865', 'Bandung', '0000');

-- --------------------------------------------------------

--
-- Table structure for table `work`
--

CREATE TABLE `work` (
  `idWr` int(10) NOT NULL,
  `nameWr` varchar(50) NOT NULL,
  `fees` double NOT NULL,
  `category` varchar(50) NOT NULL,
  `estimation` int(10) NOT NULL,
  `description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `work`
--

INSERT INTO `work` (`idWr`, `nameWr`, `fees`, `category`, `estimation`, `description`) VALUES
(1, 'Plumbing', 300000, 'Home', 2, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla at dolor ut mi luctus sagittis a sed quam. In hac habitasse platea dictumst. Ut quis nunc lorem. Mauris id aliquam.'),
(2, 'Changing Tires', 15000, 'Vehicle', 1, 'Curabitur sit amet justo eu odio porta viverra. Sed pellentesque ornare vulputate. Pellentesque eget lectus tellus. Proin auctor rhoncus mi, vitae finibus massa venenatis id.'),
(3, 'Cable Management', 100000, 'House', 2, 'Cras non blandit lacus. Sed eget ornare quam. Curabitur in erat sem. Maecenas sit amet arcu tortor. Ut quam tortor, iaculis vitae dictum quis, porta.'),
(6, 'Housekeeping', 200000, 'House', 1, 'Our house is very dirty and we all very busy so we can\'t do the chores.'),
(7, 'Cleaning', 100000, 'House', 1, 'Cleaning the house'),
(8, 'Tire changing', 3000000, 'Car', 1, 'change the tire with ---'),
(9, 'change tire', 3000000, 'car', 1, '---'),
(10, 'abs', 125000, 'phone', 1, 'abc');

-- --------------------------------------------------------

--
-- Table structure for table `worker`
--

CREATE TABLE `worker` (
  `id` int(10) NOT NULL,
  `username` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone_number` varchar(13) NOT NULL,
  `address` text NOT NULL,
  `password` varchar(50) NOT NULL,
  `expertise` varchar(20) DEFAULT NULL,
  `fees` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `worker`
--

INSERT INTO `worker` (`id`, `username`, `name`, `phone_number`, `address`, `password`, `expertise`, `fees`) VALUES
(1, 'tukanghiji', 'TukangHiji', '08522', 'Bandung', '0000', 'Plumbing', 50000),
(3, 'paluarit', 'Toko Malu', '081358627', 'Bojongsoang', '0000', 'Vehicle', 40000),
(4, 'jatidiri', 'Jati Diri Service', '082265775421', 'Bogor', '0000', 'House', 10000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`,`phone_number`);

--
-- Indexes for table `work`
--
ALTER TABLE `work`
  ADD PRIMARY KEY (`idWr`);

--
-- Indexes for table `worker`
--
ALTER TABLE `worker`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `work`
--
ALTER TABLE `work`
  MODIFY `idWr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `worker`
--
ALTER TABLE `worker`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
