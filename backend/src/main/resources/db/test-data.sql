DELETE FROM post;
INSERT INTO post(ID, VERSION, CREATIONDATE, UPDATEDATE, MESSAGE, TITLE, EMAIL, URL) VALUES
 (1, 0, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'Boa tarde, o meu nome é João Faustino e procuro a minha francesinha perdida', 'Jovem vegano procura sustento', 'joao.faustino@academiadecodigo.org', '777888'),
 (2, 0, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 'Hello, Im looking for my childhood friend', 'Missing friend', 'mail@gmail.com', '777888'),
 (3, 0, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 'I just lost my son at the carnival of the city of townsville has anyone seen him? please help me find him.', 'My son is missing', 'mail@gmail.com', '777888'),
 (4, 0, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 'Has someone seen MC Potato from the 29th bootcamp? please let us know!', 'No name', 'mail@gmail.com', '777888');

DELETE FROM crowdpost;
INSERT INTO crowdpost(ID, VERSION, CREATIONDATE, UPDATEDATE, MESSAGE, TITLE, EMAIL, URL, MONEYNEEDED) VALUES
 (1, 0, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 'Boa tarde, o meu nome é João Faustino e procuro a minha francesinha perdida', 'Jovem vegano procura sustento', 'joao.faustino@academiadecodigo.org', '777888', '1000'),
 (2, 0, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 'Hello, Im looking for my childhood friend', 'Missing friend', 'mail@gmail.com', '777888', '134'),
 (3, 0, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 'Bruno', 'Ferreira', 'mail@gmail.com', '777888', '9348'),
 (4, 0, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 'trolololol I DID IT', 'No name', 'mail@gmail.com', '777888', '43');
