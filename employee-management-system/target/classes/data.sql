INSERT INTO users (id, username, password) VALUES 
(1, 'ADMIN', '$2a$12$dCVfmA3W8vx8Y75l7nYr7..B8eFfnqXmMrHs7VKmAsPbYIM5EiJGS');

INSERT INTO roles (id, name) VALUES (1, 'ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);

INSERT INTO EMPLOYEE (id, email, first_name, last_name) VALUES 
(1, 'anuradha.w@gmail.com', 'Anuradha', 'Wankhade'),
(2, 'shekhar.w@gmail.com', 'Shekhar', 'Wankhade'),
(3, 'shubh.s@gmail.com', 'Shubh', 'Singhania'),
(4, 'roshan.d@gmail.com', 'Roshan', 'Deitol'),
(5, 'alburt.s@gmail.com', 'Alburt', 'Stephew'),
(6, 'shake.s@gmail.com', 'Shake', 'Spear'),
(7, 'Rocky.k@gmail.com', 'Rocky', 'Khan'),
(8, 'bhushan.k@gmail.com', 'Bhushan', 'Kul'),
(9, 'akruti.s@gmail.com', 'Akruti', 'Shah'),
(10, 'jacky.c@gmail.com', 'Jacky', 'Chan'),
(11, 'aru.c@gmail.com', 'Aru', 'Chan');