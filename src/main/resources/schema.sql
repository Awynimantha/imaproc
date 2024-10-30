CREATE TABLE IF NOT EXISTS "client"(
    id SERIAL PRIMARY KEY,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    age INT NOT NULL CHECK (age >= 0), 
    previlage VARCHAR(100),
    password VARCHAR(200) NOt NULL,
    
)