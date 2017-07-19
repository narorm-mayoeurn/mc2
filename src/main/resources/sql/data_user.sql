INSERT INTO `authentication` (`username`, `password`, `enabled`)
VALUES
	('jack', 'jack', true),
	('jame', 'jame', true);
INSERT INTO `users` (`email`, `first_name`, `last_name`, `version`, `username`)
VALUES ('jack@mc2.org', 'Jack', 'Jon', 1, 'jack');

INSERT INTO `authority` (`authority`, `username`)
VALUES ('ROLE_ADMIN', 'jack'),('ROLE_USER', 'jack');

INSERT INTO `accommodations` (`id`, `email`, `image`, `logo`, `name`, `phone`, `type`)
VALUES
	(1, 'info@resort-inn.com', 'g1.jpg', NULL, 'Resort Inn', '9543451244', 'Hotel'),
	(2, 'contact@queen-motel.com', 'g2.jpg', NULL, 'Queen', '9405541177', 'Motel'),
	(3, 'contact@Mc1970.com', 'g3.jpg', NULL, 'Mc1970', '6507648875', 'Motel'),
	(4, 'info@Ace-hotel.com', 'g4.jpg', NULL, 'Ace Hotel', '4503457754', 'Hotel'),
	(5, 'double@doubletree.com', 'g5.jpg', NULL, 'Double Tree Hotel', '7804562345', 'Hotel'),
	(6, 'contact@grandhyatt.com', 'g6.jpg', NULL, 'Grand Hyatt Hotel', '9703356664', 'Hotel');



INSERT INTO `addresses` (`id`, `city`, `state`, `street`, `accommodation_id`)
VALUES
	(1, 'Coralville', 'IA', '2431 James St', 1),
	(2, 'Coralville', 'IA', '300 E 9th St', 2),
	(3, 'Iowa City', 'IA', '210 S Dubuque', 3),
	(4, 'Des Moines', 'IA', '201 E Locust St', 4),
	(5, 'Ames', 'IA', '2100 Green Hills', 5),
	(6, 'Boone', 'IA', '1745 SE Marshall', 6);






INSERT INTO `rooms` (`id`, `is_available`, `price`, `room_number`, `type`, `accommodation_id`, image)
VALUES
	(1, 1, 80, '101', 'Single Room', 1, 'r1.jpg'),
	(2, 1, 150, '102', 'Deluxe Room', 1, 'r2.jpg'),
	(3, 1, 30, '200', 'Single Room', 2, 'r3.jpg'),
	(4, 1, 40, '201', 'Twin Room', 2, 'r4.jpg'),
	(5, 1, 90, '150', 'Single Room', 3, 'r1.jpg'),
	(6, 1, 100, '151', 'Deluxe Room', 3, 'r2.jpg'),
	(7, 1, 200, '119', 'Luxury Room', 4, 'r3.jpg'),
	(8, 1, 150, '118', 'Twin Room', 4, 'r4.jpg');
