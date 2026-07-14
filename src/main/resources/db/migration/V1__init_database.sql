create table authorities (
    authority_id bigint auto_increment primary key,
    title varchar(100) not null unique
);

create table users (
    user_id bigint auto_increment primary key,
    email varchar(100) unique not null,
    password varchar(255) not null,
    name varchar(255) not null,
    surname varchar(255) not null,
    authority_id bigint not null,
    foreign key (authority_id) references authorities(authority_id)
);

create table products (
    product_id bigint auto_increment primary key,
    title varchar(255) not null unique,
    type varchar(40) not null
);

create table recipes (
    recipe_id bigint auto_increment primary key,
    title varchar(255) not null,
    cooking_time integer,
    difficulty varchar(10) not null,
    servings integer,
    path_to_image varchar(255),
    calories_per_serving decimal(6,1),
    user_id bigint,
    foreign key (user_id) references users(user_id) on delete set null
);

create table steps (
    step_id bigint auto_increment primary key,
    step_number integer not null,
    content varchar(1000) not null,
    path_to_image varchar(255),
    recipe_id bigint not null,
    foreign key (recipe_id) references recipes(recipe_id) on delete cascade,
    unique (recipe_id, step_number)
);

create table ingredients (
    ingredient_id bigint auto_increment primary key,
    quantity decimal(6,1),
    unit varchar(20),
    recipe_id bigint not null,
    product_id bigint not null,
    foreign key (recipe_id) references recipes(recipe_id) on delete cascade,
    foreign key (product_id) references products(product_id),
    unique (recipe_id, product_id)
);