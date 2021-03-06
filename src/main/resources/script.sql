create sequence hibernate_sequence start with 1 increment by 1;
create table abonnement (id bigint not null, nom varchar(255), primary key (id));
create table abonnement_utilisateur (utilisateurs_id bigint not null, abonnements_id bigint not null);
create table emotion (id bigint not null, code varchar(255), nom varchar(255), emotion_id bigint, primary key (id));
create table gif (dtype varchar(31) not null, id bigint not null, date_heure_ajout timestamp, legende varchar(255), url varchar(255), nom_fichier_original varchar(255), jour_date date, utilisateur_id bigint, primary key (id));
create table jour (date date not null, nb_points integer not null, gif_id bigint, primary key (date));
create table reaction (id bigint not null, date_heure timestamp, emotion_id bigint, gif_id bigint, utilisateur_id bigint, primary key (id));
create table theme (id bigint not null, nom varchar(255), primary key (id));
create table utilisateur (id bigint not null, date_heure_inscription timestamp, email varchar(255), mot_de_passe varchar(255), nb_points integer not null, nom varchar(255), prenom varchar(30), theme_id bigint, primary key (id));
alter table abonnement_utilisateur add constraint UK_w89m6yrqmy3r69dvsndb6j9m unique (abonnements_id);
alter table abonnement_utilisateur add constraint FKpm6nqsnyw75nkieqmpukaf4c7 foreign key (abonnements_id) references abonnement;
alter table abonnement_utilisateur add constraint FK6h38swv6g21ob1vi0qxsdb1i0 foreign key (utilisateurs_id) references utilisateur;
alter table emotion add constraint FKdsk15dv9j19od6ffn8id5ahbe foreign key (emotion_id) references emotion;
alter table gif add constraint FKc7tpureov5khi3mnp3aivan2w foreign key (jour_date) references jour;
alter table gif add constraint FKvfc9dbl7nxswsaq560qgjuk4 foreign key (utilisateur_id) references utilisateur;
alter table jour add constraint FK6f1cqult1qodurxglwbw64tv5 foreign key (gif_id) references gif;
alter table reaction add constraint FK7dh6d3ymslekeyhl1t662ekik foreign key (emotion_id) references emotion;
alter table reaction add constraint FK85e1wxmt3cisy8qw9or9m0du3 foreign key (gif_id) references gif;
alter table reaction add constraint FKleetkhnmwd976sh66h2868g7k foreign key (utilisateur_id) references utilisateur;
alter table utilisateur add constraint FK1hcph3iur5lnjlgpbg1ibens2 foreign key (theme_id) references theme;
create sequence hibernate_sequence start with 1 increment by 1;
create table abonnement (id bigint not null, nom varchar(255), primary key (id));
create table abonnement_utilisateur (utilisateurs_id bigint not null, abonnements_id bigint not null);
create table emotion (id bigint not null, code varchar(255), nom varchar(255), emotion_id bigint, primary key (id));
create table gif (dtype varchar(31) not null, id bigint not null, date_heure_ajout timestamp, legende varchar(255), url varchar(255), nom_fichier_original varchar(255), jour_date date, utilisateur_id bigint, primary key (id));
create table jour (date date not null, nb_points integer not null, gif_id bigint, primary key (date));
create table reaction (id bigint not null, date_heure timestamp, emotion_id bigint, gif_id bigint, utilisateur_id bigint, primary key (id));
create table theme (id bigint not null, nom varchar(255), primary key (id));
create table utilisateur (id bigint not null, date_heure_inscription timestamp, email varchar(255), mot_de_passe varchar(255), nb_points integer not null, nom varchar(255), prenom varchar(30), theme_id bigint, primary key (id));
alter table abonnement_utilisateur add constraint UK_w89m6yrqmy3r69dvsndb6j9m unique (abonnements_id);
alter table abonnement_utilisateur add constraint FKpm6nqsnyw75nkieqmpukaf4c7 foreign key (abonnements_id) references abonnement;
alter table abonnement_utilisateur add constraint FK6h38swv6g21ob1vi0qxsdb1i0 foreign key (utilisateurs_id) references utilisateur;
alter table emotion add constraint FKdsk15dv9j19od6ffn8id5ahbe foreign key (emotion_id) references emotion;
alter table gif add constraint FKc7tpureov5khi3mnp3aivan2w foreign key (jour_date) references jour;
alter table gif add constraint FKvfc9dbl7nxswsaq560qgjuk4 foreign key (utilisateur_id) references utilisateur;
alter table jour add constraint FK6f1cqult1qodurxglwbw64tv5 foreign key (gif_id) references gif;
alter table reaction add constraint FK7dh6d3ymslekeyhl1t662ekik foreign key (emotion_id) references emotion;
alter table reaction add constraint FK85e1wxmt3cisy8qw9or9m0du3 foreign key (gif_id) references gif;
alter table reaction add constraint FKleetkhnmwd976sh66h2868g7k foreign key (utilisateur_id) references utilisateur;
alter table utilisateur add constraint FK1hcph3iur5lnjlgpbg1ibens2 foreign key (theme_id) references theme;
