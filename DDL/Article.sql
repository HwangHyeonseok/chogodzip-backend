DROP TABLE IF EXISTS ARTICLE;

create table ARTICLE
(
    ARTICLE_ID      BIGINT PRIMARY KEY AUTO_INCREMENT,
    TITLE           VARCHAR(50)     NOT NULL,
    CONTENT         LONGTEXT        NOT NULL,
    THUMBNAIL       VARCHAR(255)    NOT NULL,
    CREATED_AT      DATETIME default now()
);

SELECT * FROM ARTICLE;

DELETE FROM ARTICLE WHERE ARTICLE_ID = 1;