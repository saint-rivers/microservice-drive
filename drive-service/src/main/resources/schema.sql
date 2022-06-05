CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS app_folders
(

    id        uuid primary key default uuid_generate_v4(),
    name      text not null,
    parent_id uuid references app_folders (id)
);

CREATE TABLE IF NOT EXISTS content
(
    id            uuid primary key default uuid_generate_v4(),
    display_name  text not null,
    resource_name text not null,
    content_type  varchar(15),
    folder_id     uuid not null references app_folders (id)
);