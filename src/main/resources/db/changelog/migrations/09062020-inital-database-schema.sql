CREATE TABLE conference (
    id BIGINT NOT NULL,
    name VARCHAR(150) NOT NULL,
    date DATE NOT NULL,
    time TIME NOT NULL,
    room_id BIGINT NOT NULL
);

ALTER TABLE conference
    ADD CONSTRAINT pk_conference_id
        PRIMARY KEY (id);

CREATE SEQUENCE conference_id_seq INCREMENT 1 START 1;

CREATE TABLE room (
    id BIGINT NOT NULL,
    name VARCHAR(150) NOT NULL
);

ALTER TABLE room
    ADD CONSTRAINT pk_room_id
        PRIMARY KEY (id);

CREATE SEQUENCE room_id_seq INCREMENT 1 START 1;

CREATE TABLE participant (
    id BIGINT NOT NULL,
    name VARCHAR(150) NOT NULL,
    surname VARCHAR(150) NOT NULL,
    birth_date DATE NOT NULL
);

ALTER TABLE participant
    ADD CONSTRAINT pk_participant_id
        PRIMARY KEY (id);

CREATE SEQUENCE pk_participant_id_id_seq INCREMENT 1 START 1;