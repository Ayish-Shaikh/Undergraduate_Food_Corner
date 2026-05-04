INSERT INTO category (id, name, type) VALUES (1, 'Main Course', 'MAIN_COURSE');
INSERT INTO category (id, name, type) VALUES (2, 'Street Food', 'STREET_FOOD');
INSERT INTO category (id, name, type) VALUES (3, 'Sweets', 'SWEETS');
INSERT INTO category (id, name, type) VALUES (4, 'Beverages', 'BEVERAGES');

INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (1, 'Ilish Bhapa', 'Steamed hilsa in mustard', 220.0, 1, '/images/ilishbhapa.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (2, 'Kosha Mangsho', 'Slow cooked mutton curry', 280.0, 1, '/images/koshamangsho.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (3, 'Bhoger Khichuri', 'Rice and lentil comfort bowl', 120.0, 1, '/images/khichudi.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (4, 'Phuchka', 'Tamarind water crispy puri', 60.0, 2, '/images/phuchka.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (5, 'Ghugni', 'Spiced yellow pea curry', 80.0, 2, '/images/ghugni.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (6, 'Jhal Muri', 'Spicy puffed rice mix', 50.0, 2, '/images/jhalmuri.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (7, 'Mishti Doi', 'Sweet fermented yoghurt', 70.0, 3, '/images/mistidoi.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (8, 'Sandesh', 'Fresh chhena sweet', 90.0, 3, '/images/sandesh.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (9, 'Rasgulla', 'Soft spongy chhena balls', 80.0, 3, '/images/rosogolla.png');
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES (10, 'Aam Panna', 'Raw mango cooler', 60.0, 4, null);
INSERT INTO menu_item (id, name, description, price, category_id, image_url) VALUES(11, 'Lassi', 'Sweet yoghurt drink', 70.0, 4, null);