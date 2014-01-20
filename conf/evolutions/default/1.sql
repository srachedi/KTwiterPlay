# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tb_comments (
  id                        bigint not null,
  content                   varchar(255),
  post_id                   bigint,
  autor_id                  bigint,
  comment_date              timestamp,
  constraint pk_tb_comments primary key (id))
;

create table tb_likes (
  id                        bigint not null,
  member_id                 bigint,
  post_id                   bigint,
  comment_id                bigint,
  date_like                 timestamp,
  constraint pk_tb_likes primary key (id))
;

create table tb_members (
  id                        bigint not null,
  login                     varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  constraint pk_tb_members primary key (id))
;

create table tb_messages (
  id                        bigint not null,
  title                     varchar(255),
  message                   varchar(255),
  expediteur_id             bigint,
  destinataire_id           bigint,
  date_envoi                timestamp,
  constraint pk_tb_messages primary key (id))
;

create table tb_posts (
  id                        bigint not null,
  title                     varchar(255),
  content                   varchar(255),
  post_date                 timestamp,
  autor_id                  bigint,
  constraint pk_tb_posts primary key (id))
;

create table tb_profiles (
  id                        bigint not null,
  nom                       varchar(255),
  prenom                    varchar(255),
  sexe                      varchar(255),
  member_id                 bigint,
  role                      varchar(255),
  date_naissance            timestamp,
  date_inscription          timestamp,
  constraint pk_tb_profiles primary key (id))
;

create sequence tb_comments_seq;

create sequence tb_likes_seq;

create sequence tb_members_seq;

create sequence tb_messages_seq;

create sequence tb_posts_seq;

create sequence tb_profiles_seq;

alter table tb_comments add constraint fk_tb_comments_post_1 foreign key (post_id) references tb_posts (id) on delete restrict on update restrict;
create index ix_tb_comments_post_1 on tb_comments (post_id);
alter table tb_comments add constraint fk_tb_comments_autor_2 foreign key (autor_id) references tb_members (id) on delete restrict on update restrict;
create index ix_tb_comments_autor_2 on tb_comments (autor_id);
alter table tb_likes add constraint fk_tb_likes_member_3 foreign key (member_id) references tb_members (id) on delete restrict on update restrict;
create index ix_tb_likes_member_3 on tb_likes (member_id);
alter table tb_likes add constraint fk_tb_likes_post_4 foreign key (post_id) references tb_posts (id) on delete restrict on update restrict;
create index ix_tb_likes_post_4 on tb_likes (post_id);
alter table tb_likes add constraint fk_tb_likes_comment_5 foreign key (comment_id) references tb_comments (id) on delete restrict on update restrict;
create index ix_tb_likes_comment_5 on tb_likes (comment_id);
alter table tb_messages add constraint fk_tb_messages_expediteur_6 foreign key (expediteur_id) references tb_members (id) on delete restrict on update restrict;
create index ix_tb_messages_expediteur_6 on tb_messages (expediteur_id);
alter table tb_messages add constraint fk_tb_messages_destinataire_7 foreign key (destinataire_id) references tb_members (id) on delete restrict on update restrict;
create index ix_tb_messages_destinataire_7 on tb_messages (destinataire_id);
alter table tb_posts add constraint fk_tb_posts_autor_8 foreign key (autor_id) references tb_members (id) on delete restrict on update restrict;
create index ix_tb_posts_autor_8 on tb_posts (autor_id);
alter table tb_profiles add constraint fk_tb_profiles_member_9 foreign key (member_id) references tb_members (id) on delete restrict on update restrict;
create index ix_tb_profiles_member_9 on tb_profiles (member_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists tb_comments;

drop table if exists tb_likes;

drop table if exists tb_members;

drop table if exists tb_messages;

drop table if exists tb_posts;

drop table if exists tb_profiles;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists tb_comments_seq;

drop sequence if exists tb_likes_seq;

drop sequence if exists tb_members_seq;

drop sequence if exists tb_messages_seq;

drop sequence if exists tb_posts_seq;

drop sequence if exists tb_profiles_seq;

