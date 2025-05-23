INSERT INTO app_user (name, email, password) VALUES
    ('Aarav Sharma', 'aarav@gmail.com', 'Password'),
    ('Vivaan Khanna', 'vivaan.khanna@example.com', '$2a$10$examplePasswordHash2'),
    ('Aditya Verma', 'aditya.verma@example.com', '$2a$10$examplePasswordHash3'),
    ('Vihaan Kapoor', 'vihaan.kapoor@example.com', '$2a$10$examplePasswordHash4'),
    ('Arjun Patel', 'arjun.patel@example.com', '$2a$10$examplePasswordHash5'),
    ('Sai Reddy', 'sai.reddy@example.com', '$2a$10$examplePasswordHash6'),
    ('Ananya Nair', 'ananya.nair@example.com', '$2a$10$examplePasswordHash7'),
    ('Ishaan Thakur', 'ishaan.thakur@example.com', '$2a$10$examplePasswordHash8'),
    ('Aryan Rao', 'aryan.rao@example.com', '$2a$10$examplePasswordHash9'),
    ('Diya Singh', 'diya.singh@example.com', '$2a$10$examplePasswordHash10'),
    ('Kabir Joshi', 'kabir.joshi@example.com', '$2a$10$examplePasswordHash11'),
    ('Krishna Iyer', 'krishna.iyer@example.com', '$2a$10$examplePasswordHash12'),
    ('Reyansh Pandey', 'reyansh.pandey@example.com', '$2a$10$examplePasswordHash13'),
    ('Ayaan Mehta', 'ayaan.mehta@example.com', '$2a$10$examplePasswordHash14'),
    ('Anaya Mishra', 'anaya.mishra@example.com', '$2a$10$examplePasswordHash15'),
    ('Navya Kulkarni', 'navya.kulkarni@example.com', '$2a$10$examplePasswordHash16'),
    ('Naira Desai', 'naira.desai@example.com', '$2a$10$examplePasswordHash17'),
    ('Dhruv Saxena', 'dhruv.saxena@example.com', '$2a$10$examplePasswordHash18'),
    ('Sara Bajaj', 'sara.bajaj@example.com', '$2a$10$examplePasswordHash19'),
    ('Arnav Malhotra', 'arnav.malhotra@example.com', '$2a$10$examplePasswordHash20'),
    ('Rahul Kumar', 'rahul.kumar@example.com', '$2a$10$examplePasswordHash21'),
    ('Rohit Gupta', 'rohit.gupta@example.com', '$2a$10$examplePasswordHash22'),
    ('Pooja Sharma', 'pooja.sharma@example.com', '$2a$10$examplePasswordHash23'),
    ('Karan Singh', 'karan.singh@example.com', '$2a$10$examplePasswordHash24'),
    ('Sonia Mehta', 'sonia.mehta@example.com', '$2a$10$examplePasswordHash25'),
    ('Anil Kapoor', 'anil.kapoor@example.com', '$2a$10$examplePasswordHash26'),
    ('Deepak Verma', 'deepak.verma@example.com', '$2a$10$examplePasswordHash27'),
    ('Sneha Jain', 'sneha.jain@example.com', '$2a$10$examplePasswordHash28'),
    ('Ajay Mishra', 'ajay.mishra@example.com', '$2a$10$examplePasswordHash29'),
    ('Nisha Reddy', 'nisha.reddy@example.com', '$2a$10$examplePasswordHash30'),
    ('Vikas Joshi', 'vikas.joshi@example.com', '$2a$10$examplePasswordHash31'),
    ('Meena Desai', 'meena.desai@example.com', '$2a$10$examplePasswordHash32'),
    ('Rajesh Iyer', 'rajesh.iyer@example.com', '$2a$10$examplePasswordHash33'),
    ('Suresh Nair', 'suresh.nair@example.com', '$2a$10$examplePasswordHash34'),
    ('Kavita Singh', 'kavita.singh@example.com', '$2a$10$examplePasswordHash35'),
    ('Ankur Saxena', 'ankur.saxena@example.com', '$2a$10$examplePasswordHash36'),
    ('Geeta Bajaj', 'geeta.bajaj@example.com', '$2a$10$examplePasswordHash37'),
    ('Ramesh Malhotra', 'ramesh.malhotra@example.com', '$2a$10$examplePasswordHash38'),
    ('Seema Rao', 'seema.rao@example.com', '$2a$10$examplePasswordHash39'),
    ('Tarun Sharma', 'tarun.sharma@example.com', '$2a$10$examplePasswordHash40');

INSERT INTO user_roles (user_id, roles) VALUES
    (1, 'RIDER'),
    (2, 'DRIVER'),
    (3, 'RIDER'),
    (4, 'DRIVER'),
    (5, 'RIDER'),
    (6, 'DRIVER'),
    (7, 'RIDER'),
    (8, 'DRIVER'),
    (9, 'RIDER'),
    (10, 'DRIVER'),
    (11, 'RIDER'),
    (12, 'DRIVER'),
    (13, 'RIDER'),
    (14, 'DRIVER'),
    (15, 'RIDER'),
    (16, 'DRIVER'),
    (17, 'RIDER'),
    (18, 'DRIVER'),
    (19, 'RIDER'),
    (20, 'DRIVER'),
    (21, 'RIDER'),
    (22, 'DRIVER'),
    (23, 'RIDER'),
    (24, 'DRIVER'),
    (25, 'RIDER'),
    (26, 'DRIVER'),
    (27, 'RIDER'),
    (28, 'DRIVER'),
    (29, 'RIDER'),
    (30, 'DRIVER'),
    (31, 'RIDER'),
    (32, 'DRIVER'),
    (33, 'RIDER'),
    (34, 'DRIVER'),
    (35, 'RIDER'),
    (36, 'DRIVER'),
    (37, 'RIDER'),
    (38, 'DRIVER'),
    (39, 'RIDER'),
    (40, 'DRIVER');

INSERT INTO rider(user_id, rating) VALUES
(1,4.9);

INSERT INTO driver(user_id, rating, available, current_location) VALUES
    (1, 4.7, true, ST_GeomFromText('POINT(77.1025 28.7041)', 4326)),
    (2, 4.5, true, ST_GeomFromText('POINT(77.1804 28.1932)', 4326)),
    (3, 4.6, true, ST_GeomFromText('POINT(77.2021 28.1865)', 4326)),
    (4, 4.8, true, ST_GeomFromText('POINT(77.2210 28.2225)', 4326)),
    (5, 4.3, true, ST_GeomFromText('POINT(77.1900 28.2000)', 4326)),
    (6, 4.2, true, ST_GeomFromText('POINT(77.1850 28.2350)', 4326)),
    (8, 4.9, true, ST_GeomFromText('POINT(77.2015 28.2180)', 4326)),
    (7, 4.4, true, ST_GeomFromText('POINT(77.2102 28.1891)', 4326)),
    (9, 4.1, true, ST_GeomFromText('POINT(77.1986 28.1753)', 4326)),
    (10, 4.0, true, ST_GeomFromText('POINT(77.1925 28.2217)', 4326)),
    (11, 4.7, true, ST_GeomFromText('POINT(77.1857 28.2068)', 4326)),
    (12, 4.5, true, ST_GeomFromText('POINT(77.2143 28.1946)', 4326)),
    (13, 4.6, true, ST_GeomFromText('POINT(77.1875 28.1895)', 4326)),
    (14, 4.8, true, ST_GeomFromText('POINT(77.2312 28.1784)', 4326)),
    (15, 4.3, true, ST_GeomFromText('POINT(77.1982 28.2123)', 4326)),
    (16, 4.9, true, ST_GeomFromText('POINT(77.1754 28.1867)', 4326)),
    (17, 4.2, true, ST_GeomFromText('POINT(77.2070 28.2333)', 4326)),
    (18, 4.4, true, ST_GeomFromText('POINT(77.1872 28.1755)', 4326)),
    (19, 4.1, true, ST_GeomFromText('POINT(77.2111 28.1992)', 4326)),
    (20, 4.0, true, ST_GeomFromText('POINT(77.1809 28.2204)', 4326)),
    (21, 4.7, true, ST_GeomFromText('POINT(77.1935 28.2021)', 4326)),
    (22, 4.5, true, ST_GeomFromText('POINT(77.2188 28.1898)', 4326)),
    (23, 4.6, true, ST_GeomFromText('POINT(77.2064 28.1773)', 4326)),
    (24, 4.8, true, ST_GeomFromText('POINT(77.2205 28.2309)', 4326)),
    (25, 4.3, true, ST_GeomFromText('POINT(77.1941 28.1839)', 4326)),
    (26, 4.9, true, ST_GeomFromText('POINT(77.2048 28.2056)', 4326)),
    (27, 4.2, true, ST_GeomFromText('POINT(77.1820 28.2271)', 4326)),
    (28, 4.4, true, ST_GeomFromText('POINT(77.1978 28.1975)', 4326)),
    (29, 4.1, true, ST_GeomFromText('POINT(77.2010 28.1840)', 4326)),
    (30, 4.0, true, ST_GeomFromText('POINT(77.2203 28.2128)', 4326)),
    (31, 4.7, true, ST_GeomFromText('POINT(77.1896 28.1860)', 4326)),
    (32, 4.5, true, ST_GeomFromText('POINT(77.1974 28.2030)', 4326)),
    (33, 4.6, true, ST_GeomFromText('POINT(77.1831 28.1798)', 4326)),
    (34, 4.8, true, ST_GeomFromText('POINT(77.2044 28.2109)', 4326)),
    (35, 4.3, true, ST_GeomFromText('POINT(77.1928 28.2375)', 4326)),
    (36, 4.9, true, ST_GeomFromText('POINT(77.2037 28.2150)', 4326)),
    (37, 4.2, true, ST_GeomFromText('POINT(77.1856 28.2231)', 4326)),
    (38, 4.4, true, ST_GeomFromText('POINT(77.2115 28.1957)', 4326)),
    (39, 4.1, true, ST_GeomFromText('POINT(77.1808 28.2185)', 4326)),
    (40, 4.0, true, ST_GeomFromText('POINT(77.2055 28.1876)', 4326));

INSERT INTO wallet (user_id, balance) VALUES
    (1, 100),
    (2, 500);


