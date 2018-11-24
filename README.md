# spring-boot-jdbc-join
how to perform join operation in spring boot with jdbc template

CREATE TABLE t1 (
    id INT PRIMARY KEY,
    pattern VARCHAR(50) NOT NULL,
    name varchar(250)
);
 
CREATE TABLE t2 (
    id VARCHAR(50) PRIMARY KEY,
    pattern VARCHAR(50) NOT NULL,
    data varchar(250)
);


INSERT INTO t1(id, pattern,name)
VALUES(1,'Divot','Basant'),
      (2,'Brick','Santosh'),
      (3,'Grid','Chinmaya');
 
INSERT INTO t2(id, pattern,data)
VALUES('A','Brick','B'),
      ('B','Grid','S'),
      ('C','Diamond','C');
      
      
Query :  SELECT  t1.id, t2.new_id,t1.name,t2.data FROM t1 JOIN t2 ON t1.pattern = t2.pattern;      
      
