create table if not exists content (
    id bigserial primary key,
    title varchar(255) not null,
    url varchar(255) not null,
    type varchar(50) not null,
    published_at timestamp with time zone not null
);

create table if not exists subscribers (
    id bigserial primary key,
    email varchar(255) not null
);
