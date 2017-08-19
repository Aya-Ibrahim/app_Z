-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 19, 2017 at 01:41 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Zedler`
--

-- --------------------------------------------------------

--
-- Table structure for table `followingsettingscontrol`
--

CREATE TABLE `followingsettingscontrol` (
  `UserFrom` int(11) NOT NULL,
  `UserTo` int(11) NOT NULL,
  `Notification` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `followingsettingscontrol`
--

INSERT INTO `followingsettingscontrol` (`UserFrom`, `UserTo`, `Notification`) VALUES
(3, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `followship`
--

CREATE TABLE `followship` (
  `UserTo` int(11) NOT NULL,
  `UserFrom` int(11) NOT NULL,
  `Following` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `followship`
--

INSERT INTO `followship` (`UserTo`, `UserFrom`, `Following`) VALUES
(1, 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `friendship`
--

CREATE TABLE `friendship` (
  `UserFrom` int(11) NOT NULL,
  `UserTo` int(11) NOT NULL,
  `FS_RequestTime` timestamp NULL DEFAULT NULL,
  `Status_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `friendship`
--

INSERT INTO `friendship` (`UserFrom`, `UserTo`, `FS_RequestTime`, `Status_ID`) VALUES
(1, 3, '2017-07-23 21:22:46', 0),
(4, 1, '2017-07-15 13:36:42', 1),
(4, 5, '0000-00-00 00:00:00', 0);

-- --------------------------------------------------------

--
-- Table structure for table `settings`
--

CREATE TABLE `settings` (
  `Settings_ID` int(11) NOT NULL,
  `broadcasting` tinyint(1) NOT NULL DEFAULT '1',
  `follow_me` tinyint(4) NOT NULL DEFAULT '1',
  `show_fname_only` tinyint(4) NOT NULL DEFAULT '1',
  `show_pp_to_followers` tinyint(1) NOT NULL DEFAULT '1',
  `about_me_to_followers` tinyint(4) NOT NULL DEFAULT '1',
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `settings`
--

INSERT INTO `settings` (`Settings_ID`, `broadcasting`, `follow_me`, `show_fname_only`, `show_pp_to_followers`, `about_me_to_followers`, `User_ID`) VALUES
(11, 0, 1, 1, 0, 0, 1),
(12, 0, 0, 0, 0, 0, 3),
(13, 0, 1, 0, 0, 0, 4);

-- --------------------------------------------------------

--
-- Table structure for table `settingscontrol`
--

CREATE TABLE `settingscontrol` (
  `UserFrom` int(11) NOT NULL,
  `UserTo` int(11) NOT NULL,
  `SC_GPS` tinyint(1) NOT NULL DEFAULT '1',
  `SC_Status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `settingscontrol`
--

INSERT INTO `settingscontrol` (`UserFrom`, `UserTo`, `SC_GPS`, `SC_Status`) VALUES
(1, 4, 0, 1),
(4, 1, 1, 1),
(4, 5, 1, 1),
(5, 4, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `Status_ID` int(11) NOT NULL,
  `Status_Type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`Status_ID`, `Status_Type`) VALUES
(0, 'pending'),
(1, 'accepted'),
(2, 'declined'),
(3, 'blocked'),
(4, 'none');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `User_ID` int(11) NOT NULL,
  `UserFirstName` varchar(50) NOT NULL,
  `UserSecondName` varchar(50) NOT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `UserMail` varchar(50) NOT NULL,
  `UserPassword` varchar(25) NOT NULL,
  `UserAboutMe` varchar(4000) DEFAULT NULL,
  `UserCountry` varchar(100) DEFAULT NULL,
  `UserCoinNo` int(11) DEFAULT NULL,
  `UserLongitude` double DEFAULT NULL,
  `UserLatitude` double DEFAULT NULL,
  `UserPic` varchar(250) DEFAULT NULL,
  `UserCurrentLocation` varchar(250) DEFAULT NULL,
  `UserStatus` varchar(4000) DEFAULT NULL,
  `fake_home_loc_langitude` varchar(100) DEFAULT NULL,
  `fake_home_loc_latitude` varchar(100) DEFAULT NULL,
  `is_live` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`User_ID`, `UserFirstName`, `UserSecondName`, `UserName`, `UserMail`, `UserPassword`, `UserAboutMe`, `UserCountry`, `UserCoinNo`, `UserLongitude`, `UserLatitude`, `UserPic`, `UserCurrentLocation`, `UserStatus`, `fake_home_loc_langitude`, `fake_home_loc_latitude`, `is_live`) VALUES
(1, 'Mohamed', 'Ashraf', 'mido.ashraf', 'mohamedes335@gmail.com', '0123735385', 'ðŸ‘š', '', NULL, 31.365551, 30.138131, NULL, NULL, 'Ramadan Kareem :)', '', '', 0),
(2, 'Sherief', 'Mohamed', 'shm', 'sherief.mohamed@yahoo.com', '123456789', NULL, '', NULL, 31.343849, 30.067744, NULL, NULL, 'Working ...', '', '', 0),
(3, 'kareem', 'mohamed', 'kimo', 'k.mohamed@yahoo.com', '123456789', 'asdasd', '', NULL, 31.346653, 30.060442, NULL, NULL, 'Hello !', '', '', 0),
(4, 'ahmed', 'mostafa', 'ahmed.mostafa', 'ah_m@yahoo.com', '123456789', 'ðŸŽŠðŸŽ‰', '', NULL, 31.351255, 30.060089, NULL, NULL, 'Ramadan kareem', '', '', 0),
(5, 'ahmed', 'sasasa', 'sdasaasf', 'mmom@yahoo.com', '123456789', 'ðŸ˜Ž', '', NULL, 31.345138, 30.059642, NULL, NULL, 'ramadan kareem', '', '', 0),
(6, 'aya', 'ikf', 'aya', 'a@rr.com', 'test123', NULL, 'Cairo', NULL, NULL, NULL, NULL, NULL, NULL, '5432', '2313', 1),
(8, 'aya', 'ikf', 'aya11', 'a@xrr.com', 'test123', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `video`
--

CREATE TABLE `video` (
  `Video_ID` int(11) NOT NULL,
  `VideoTitle` varchar(100) NOT NULL,
  `VideoLocationStatus` tinyint(1) DEFAULT NULL,
  `VideoChatStatus` tinyint(1) DEFAULT NULL,
  `VideoViews` int(11) DEFAULT NULL,
  `User_ID` int(11) NOT NULL,
  `UserVideoURL` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `followingsettingscontrol`
--
ALTER TABLE `followingsettingscontrol`
  ADD PRIMARY KEY (`UserFrom`,`UserTo`),
  ADD KEY `UserTo` (`UserTo`);

--
-- Indexes for table `followship`
--
ALTER TABLE `followship`
  ADD PRIMARY KEY (`UserTo`,`UserFrom`),
  ADD KEY `FS_userFrom` (`UserFrom`);

--
-- Indexes for table `friendship`
--
ALTER TABLE `friendship`
  ADD PRIMARY KEY (`UserFrom`,`UserTo`),
  ADD UNIQUE KEY `FS_RequestTime_UNIQUE` (`FS_RequestTime`),
  ADD KEY `FS_Status_FK_idx` (`Status_ID`),
  ADD KEY `FS_USER_2_FK_idx` (`UserTo`);

--
-- Indexes for table `settings`
--
ALTER TABLE `settings`
  ADD PRIMARY KEY (`Settings_ID`),
  ADD KEY `Settings_User_FK_idx` (`User_ID`);

--
-- Indexes for table `settingscontrol`
--
ALTER TABLE `settingscontrol`
  ADD PRIMARY KEY (`UserFrom`,`UserTo`),
  ADD KEY `SC_User_ID_2_idx` (`UserTo`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`Status_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`User_ID`),
  ADD UNIQUE KEY `UserName_UNIQUE` (`UserName`);

--
-- Indexes for table `video`
--
ALTER TABLE `video`
  ADD PRIMARY KEY (`Video_ID`),
  ADD KEY `Video_User_FK_idx` (`User_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `settings`
--
ALTER TABLE `settings`
  MODIFY `Settings_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `followship`
--
ALTER TABLE `followship`
  ADD CONSTRAINT `FS_userFrom` FOREIGN KEY (`UserFrom`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FS_userTo` FOREIGN KEY (`UserTo`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `friendship`
--
ALTER TABLE `friendship`
  ADD CONSTRAINT `FS_Status_FK` FOREIGN KEY (`Status_ID`) REFERENCES `status` (`Status_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FS_USER_1_FK` FOREIGN KEY (`UserFrom`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FS_USER_2_FK` FOREIGN KEY (`UserTo`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `settings`
--
ALTER TABLE `settings`
  ADD CONSTRAINT `Settings_User_FK` FOREIGN KEY (`User_ID`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `settingscontrol`
--
ALTER TABLE `settingscontrol`
  ADD CONSTRAINT `SC_User_ID_1` FOREIGN KEY (`UserFrom`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `SC_User_ID_2` FOREIGN KEY (`UserTo`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `video`
--
ALTER TABLE `video`
  ADD CONSTRAINT `Video_User_FK` FOREIGN KEY (`User_ID`) REFERENCES `user` (`User_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
