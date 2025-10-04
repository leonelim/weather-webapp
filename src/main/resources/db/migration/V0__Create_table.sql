CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    login VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
    );
CREATE TABLE locations (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    user_id INT NOT NULL,
    latitude DECIMAL NOT NULL,
    longitude DECIMAL NOT NULL
);
CREATE TABLE sessions (
    id UUID PRIMARY KEY NOT NULL,
    user_id INT NOT NULL,
    expires_at TIMESTAMP
);