#!/bin/bash

docker rm -f workshop_db || true
docker run -d --env POSTGRES_PASSWORD=password -p 5432:5432 --name workshop_db postgres:alpine
sleep 4
PGPASSWORD=password psql -h 127.0.0.1 -p 5432 -U postgres -f create-database.ddl