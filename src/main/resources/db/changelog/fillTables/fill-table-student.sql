--liquibase formatted sql
--changeset sergei:56ad66df-145a-47ab-aff5-13e862292781

INSERT INTO student (name, mark) VALUES 
('Winnie-the-Pooh', 'sufficient'),
('Piglet', 'good'),
('Eeyore', 'perfect')
;

--rollback DROP TABLE student;