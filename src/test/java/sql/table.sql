DROP TABLE IF EXISTS USER;
CREATE TABLE USER (
  id INT(32) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(32) NOT NULL,
  password VARCHAR(32) NOT NULL ,
  create_time DATETIME,
  last_login DATETIME
);

INSERT USER(username, password, create_time, last_login) VALUES (
    "张明",
  "123456",
  current_time,
  current_time
);
INSERT USER(username, password, create_time, last_login) VALUES (
  "陈伟",
  "123456",
  current_time,
  current_time
);
INSERT USER(username, password, create_time, last_login) VALUES (
  "吴高大",
  "123456",
  current_time,
  current_time
);

SELECT * FROM USER;