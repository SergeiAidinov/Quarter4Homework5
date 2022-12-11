--liquibase formatted sql
--changeset sergei:a9b4b21b-c38d-492e-9f19-8e267ba2c92a
--CREATE TYPE IF NOT EXISTS possible_mark AS ENUM ('insufficient', 'sufficient', 'good', 'perfect');

CREATE TABLE IF NOT EXISTS student (
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(25) NOT NULL,
    mark  VARCHAR(12) NOT NULL

);

--rollback DROP TABLE student;