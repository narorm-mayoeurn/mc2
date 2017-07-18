INSERT INTO `authentication` (`username`, `password`)
VALUES ('jack', 'jack');
INSERT INTO `users` (`id`, `email`, `first_name`, `last_name`, `version`, `username`)
VALUES (3, 'jack@mc2.org', 'Jack', 'Jon', 1, 'jack');
INSERT INTO `authority` (`authority`, `username`)
VALUES ('ROLE_ADMIN', 'admin'),('ROLE_USER', 'user');
