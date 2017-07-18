INSERT INTO `authentication` (`username`, `password`)
VALUES
	('jack', 'jack'),
	('jame', 'jame');
INSERT INTO `users` (`id`, `email`, `first_name`, `last_name`, `version`, `username`)

INSERT INTO `authority` (`authority`, `username`)
VALUES ('ROLE_ADMIN', 'admin'),('ROLE_USER', 'user');

INSERT INTO `accommodations` (`id`, `email`, `image`, `logo`, `name`, `phone`, `type`)
VALUES
	(1, 'info@resort-inn.com', 'g1.jpg', NULL, 'Resort Inn', '(954) 345 1244', 'Hotel'),
	(2, 'contact@queen-motel.com', 'g2.jpg', NULL, 'Queen', '(940) 554 1177', 'Motel'),
	(3, 'contact@Mc1970.com', 'g3.jpg', NULL, 'Mc1970', '(650) 764 8875', 'Motel'),
	(4, 'info@Ace-hotel.com', 'g4.jpg', NULL, 'Ace Hotel', '(450) 345 7754', 'Hotel'),
	(5, 'double@doubletree.com', 'g5.jpg', NULL, 'Double Tree Hotel', '(780) 456 2345', 'Hotel'),
	(6, 'contact@grandhyatt.com', 'g6.jpg', NULL, 'Grand Hyatt Hotel', '(970) 335 6664', 'Hotel');



INSERT INTO `addresses` (`id`, `city`, `state`, `street`, `accommodation_id`)
VALUES
	(1, 'Coralville', 'IA', '2431 James St', 1),
	(2, 'Coralville', 'IA', '300 E 9th St', 2),
	(3, 'Iowa City', 'IA', '210 S Dubuque', 3),
	(4, 'Des Moines', 'IA', '201 E Locust St', 4),
	(5, 'Ames', 'IA', '2100 Green Hills', 5),
	(6, 'Boone', 'IA', '1745 SE Marshall', 6);






INSERT INTO `rooms` (`id`, `is_available`, `price`, `room_number`, `type`, `accommodation_id`)
VALUES
	(1, 1, 80, '101', 'Single', 1),
	(2, 1, 150, '102', 'Double', 1),
	(3, 1, 30, '200', 'Single', 2),
	(4, 1, 40, '201', 'Twin', 2),
	(5, 1, 90, '150', 'Single', 3),
	(6, 1, 100, '151', 'Deluxe', 3),
	(7, 1, 200, '119', 'Luxury', 4),
	(8, 1, 150, '118', 'Twin', 4);
