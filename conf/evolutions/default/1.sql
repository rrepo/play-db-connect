create table picture_properties(
  mind_id bigint(20) not null auto_increment,
) engine=innodb charset=utf8mb4;

# --- !Downs

drop table picture_properties;