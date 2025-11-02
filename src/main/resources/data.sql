-- Categorias
INSERT INTO category (id, descricao) VALUES
(1, 'Curso'),
(2, 'Oficina');

-- Participantes
INSERT INTO participant (id, nome, email) VALUES
(1, 'José Silva', 'jose@gmail.com'),
(2, 'Tiago Faria', 'tiago@gmail.com'),
(3, 'Maria do Rosário', 'maria@gmail.com'),
(4, 'Teresa Silva', 'teresa@gmail.com');

-- Atividades
INSERT INTO activity (id, nome, descricao, preco, category_id) VALUES
(1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1),
(2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00, 2);

-- Blocos (ligados a atividades)
INSERT INTO block (id, inicio, fim, activity_id) VALUES
(1, '2017-09-25T08:00:00Z', '2017-09-25T11:00:00Z', 1),
(2, '2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z', 2),
(3, '2017-09-26T08:00:00Z', '2017-09-26T11:00:00Z', 2);

-- Relação N:N entre atividades e participantes
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 4);