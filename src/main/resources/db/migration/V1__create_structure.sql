CREATE TABLE cap(
    sku_id INT NOT NULL PRIMARY KEY,
    name VARCHAR(250),
    price NUMERIC(9,2),
    seller VARCHAR(250),
    thumbnail_hd VARCHAR(250),
    in_stock TINYINT
);

INSERT INTO cap VALUES (78993000, 'Boné Preto', 79.9, 'Luiz Gustavo', 'https://dummyimage.com/600x400/000/fff', 1);