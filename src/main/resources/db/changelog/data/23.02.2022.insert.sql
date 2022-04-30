----liquibase formatted sql
----changeset Abzal:sport.insert.23.02
INSERT INTO public.sport (id, sport_name) VALUES (nextval('sport_seq'), 'Футбол');
INSERT INTO public.sport (id, sport_name) VALUES (nextval('sport_seq'), 'Теннис');
INSERT INTO public.sport (id, sport_name) VALUES (nextval('sport_seq'), 'Баскетбол');
--
--
--changeset Damir:user.inserts
INSERT INTO public.users (id, email, password, phone, first_name,last_name) VALUES (nextval('user_seq'), 'test1@gmail.com', '123', '87058465511', 'Damir','Daraboz');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test2@gmail.com', '123', '87058465501');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test3@gmail.com', '123', '87058465502');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test4@gmail.com', '123', '87058465503');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test5@gmail.com', '123', '87058465504');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test6@gmail.com', '123', '87058465505');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test7@gmail.com', '123', '87058465506');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test8@gmail.com', '123', '87058465507');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test9@gmail.com', '123', '87058465508');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test10@gmail.com', '123', '87058465509');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test11@gmail.com', '123', '87058465510');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test12@gmail.com', '123', '87058465512');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test13@gmail.com', '123', '87058465513');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test14@gmail.com', '123', '87058465514');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test15@gmail.com', '123', '87058465515');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test16@gmail.com', '123', '87058465516');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test17@gmail.com', '123', '87058465517');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test18@gmail.com', '123', '87058465518');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test19@gmail.com', '123', '87058465519');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test20@gmail.com', '123', '87058465520');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test21@gmail.com', '123', '87058465521');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test22@gmail.com', '123', '87058465522');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test23@gmail.com', '123', '87058465523');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test24@gmail.com', '123', '87058465524');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test25@gmail.com', '123', '87058465525');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test26@gmail.com', '123', '87058465526');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test27@gmail.com', '123', '87058465527');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test28@gmail.com', '123', '87058465528');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test29@gmail.com', '123', '87058465529');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test30@gmail.com', '123', '87058465530');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test31@gmail.com', '123', '87058465531');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test32@gmail.com', '123', '87058465532');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test33@gmail.com', '123', '87058465533');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test34@gmail.com', '123', '87058465534');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test35@gmail.com', '123', '87058465535');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test36@gmail.com', '123', '87058465536');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test37@gmail.com', '123', '87058465537');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test38@gmail.com', '123', '87058465538');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test39@gmail.com', '123', '87058465539');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test40@gmail.com', '123', '87058465540');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test41@gmail.com', '123', '87058465541');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test42@gmail.com', '123', '87058465542');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test43@gmail.com', '123', '87058465543');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test44@gmail.com', '123', '87058465544');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test45@gmail.com', '123', '87058465545');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test46@gmail.com', '123', '87058465546');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test47@gmail.com', '123', '87058465547');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test48@gmail.com', '123', '87058465548');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test49@gmail.com', '123', '87058465549');
INSERT INTO public.users (id, email, password, phone) VALUES (nextval('user_seq'), 'test50@gmail.com', '123', '87058465550');
--company.inserts
INSERT INTO public.company (id, company_name, email, password, phone,blocked) VALUES (nextval('company_seq'), 'Arai plaza', 'comp1@gmail.com', 'comp', '8776626201',false);
INSERT INTO public.company (id, company_name, email, password, phone,blocked) VALUES (nextval('company_seq'), 'FootballKZ', 'comp2@gmail.com', 'comp', '8776626201',false);
INSERT INTO public.company (id, company_name, email, password, phone,blocked) VALUES (nextval('company_seq'), 'AlmatyFootball', 'comp3@gmail.com', 'comp', '8776626201',false);
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Pride', 'comp4@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Mid', 'comp5@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Alash Arena', 'comp6@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Almaty Arena', 'comp7@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Kairat Arena', 'comp8@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Riptide', 'comp9@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Taraz Arena', 'comp10@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'PlayF', 'comp11@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Sarykemer Arena', 'comp12@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Janatas Arena', 'comp13@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Karatau Arena', 'comp14@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Minbulak Arena', 'comp15@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Karaganda Arena', 'comp16@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Oiyk Arena', 'comp17@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Aktau Arena', 'comp18@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Abzal Dikiy Daniar', 'comp19@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Aksai Arena', 'comp20@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Daraboz Abzal', 'comp21@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Abzal Abdilda', 'comp22@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Rekit Abzal', 'comp23@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Akkent Arena', 'comp24@gmail.com', 'comp', '8776626201');
INSERT INTO public.company (id, company_name, email, password, phone) VALUES (nextval('company_seq'), 'Raimbek Arena', 'comp25@gmail.com', 'comp', '8776626201');
--
----inserts.specification
insert into public.specification (id, width, height, cover, roof_type, shower, dressing_room, parking, tribune) values (nextval('specification_seq'), 23, 4, 'паркет', 'некрытый', false, true, true, false);
insert into public.specification (id, width, height, cover, roof_type, shower, dressing_room, parking, tribune) values (nextval('specification_seq'), 34, 9, 'паркет', 'крытый', false, true, true, true);
insert into public.specification (id, width, height, cover, roof_type, shower, dressing_room, parking, tribune) values (nextval('specification_seq'), 33, 7, 'паркет', 'крытый', true, false, false, true);

--
--insert into public.comment (id,text,stars,user_id,playground_id) values (nextval('comment_seq'),'Dikiy Abzal',4.8,1,2);