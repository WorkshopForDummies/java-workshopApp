CREATE USER workshop_user WITH PASSWORD 'workshop_password';
CREATE DATABASE workshop_db;
ALTER DATABASE workshop_db OWNER TO workshop_user;
GRANT CONNECT ON DATABASE workshop_db TO workshop_user;
GRANT ALL PRIVILEGES ON DATABASE workshop_db TO workshop_user;
