
    create table title_basics (
       tconst varchar(255) not null,
        end_year smallint,
        genres binary(255),
        is_adult boolean,
        primary_title varchar(255),
        runtime_minutes smallint,
        start_year smallint,
        title_type varchar(255),
        primary key (tconst)
    );
