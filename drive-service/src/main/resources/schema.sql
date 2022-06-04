CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS app_folders
(

    id        uuid primary key default uuid_generate_v4(),
    name      text not null,
    parent_id uuid references app_folders (id)
);