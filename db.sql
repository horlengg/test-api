CREATE TABLE tb_product(
	id SERIAL PRIMARY KEY,
	product_name VARCHAR(50),
	product_price DECIMAL(10,2),
	product_qty INTEGER
);
INSERT INTO tb_product(product_name,product_price,product_qty) VALUES 
('CARABAO',30.33,20),('STING',330.33,25),('PEPSI',304.33,88);