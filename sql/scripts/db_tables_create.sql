\c urban_transportt

CREATE TABLE transport(
    id       SERIAL PRIMARY KEY,
    type     INTEGER NOT NULL,
    number   INTEGER NOT NULL UNIQUE,
    interval INTEGER NOT NULL
);

CREATE TABLE station(
    id         SERIAL PRIMARY KEY,
    street     VARCHAR(30) NOT NULL,
    time_range INTEGER     NOT NULL
);

CREATE TABLE route(
    id           SERIAL PRIMARY KEY,
    transport_id INTEGER REFERENCES transport(id),
    station_id   INTEGER REFERENCES station(id),
    CONSTRAINT route_unique UNIQUE (transport_id)
);