    create table user (
       id bigint not null,
        created_at datetime,
        email varchar(255) not null,
        enabled bit,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        locked bit,
        mobile varchar(255),
        password varchar(255) not null,
        role varchar(255),
        updated_at datetime,
        primary key (id)
    ) type=MyISAM
Hibernate: 
    
    create table user (
       id bigint not null,
        created_at datetime,
        email varchar(255) not null,
        enabled bit,
        first_name varchar(255) not null,
        last_name varchar(255) not null,
        locked bit,
        mobile varchar(255),
        password varchar(255) not null,
        role varchar(255),
        updated_at datetime,
        primary key (id)
    ) type=MyISAM
[2m2023-03-21 15:21:22.505[0;39m [32mDEBUG[0;39m [35m9052[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.hibernate.SQL                       [0;39m [2m:[0;39m 
    
    create table users_sequence (
       next_val bigint
    ) type=MyISAM
Hibernate: 
    
    create table users_sequence (
       next_val bigint
    ) type=MyISAM
[2m2023-03-21 15:21:22.507[0;39m [32mDEBUG[0;39m [35m9052[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.hibernate.SQL                       [0;39m [2m:[0;39m 
    
    insert into users_sequence values ( 1 )
Hibernate: 
    
    insert into users_sequence values ( 1 )
[2m2023-03-21 15:21:22.513[0;39m [32mDEBUG[0;39m [35m9052[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.hibernate.SQL                       [0;39m [2m:[0;39m 
    
    alter table user 
       drop index UK_ob8kqyqqgmefl0aco34akdtpe
Hibernate: 
    
    alter table user 
       drop index UK_ob8kqyqqgmefl0aco34akdtpe
[2m2023-03-21 15:21:22.516[0;39m [32mDEBUG[0;39m [35m9052[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.hibernate.SQL                       [0;39m [2m:[0;39m 
    
    alter table user 
       add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
Hibernate: 
    
    alter table user 
       add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
[2m2023-03-21 15:21:22.519[0;39m [32mDEBUG[0;39m [35m9052[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.hibernate.SQL                       [0;39m [2m:[0;39m 
    
    alter table user 
       drop index UK_cnjwxx5favk5ycqajjt17fwy1
Hibernate: 
    
    alter table user 
       drop index UK_cnjwxx5favk5ycqajjt17fwy1
[2m2023-03-21 15:21:22.523[0;39m [32mDEBUG[0;39m [35m9052[0;39m [2m---[0;39m [2m[           main][0;39m [36morg.hibernate.SQL                       [0;39m [2m:[0;39m 
    
    alter table user 
       add constraint UK_cnjwxx5favk5ycqajjt17fwy1 unique (mobile)
Hibernate: 
    
    alter table user 
       add constraint UK_cnjwxx5favk5ycqajjt17fwy1 unique (mobile)
