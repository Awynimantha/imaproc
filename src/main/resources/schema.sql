CREATE TABLE IF NOT EXISTS "client"(
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    age INT NOT NULL CHECK (age >= 0), 
    previlage VARCHAR(100),
    password VARCHAR(200) NOT NULL
);