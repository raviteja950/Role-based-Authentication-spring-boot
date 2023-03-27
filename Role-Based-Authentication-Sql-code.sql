

--creating database
create database securityAuthentication;

--using the database
use securityAuthentication;


--Creating table
create table tbl_user(
userid int(11) NOT NULL auto_increment,
username varchar(255) NOT NULL,
password varchar(255) NOT NULL,
primary key(userid)
);

CREATE TABLE tbl_role (
  roleid int(11) NOT NULL AUTO_INCREMENT,
  name varchar(225) NOT NULL,
  PRIMARY KEY (roleid)
);

CREATE TABLE tbl_user_role (
  userid int(11) NOT NULL,
  roleid int(11) NOT NULL,
  KEY user_fk_idx (userid),
  KEY role_fk_idx (roleid),
  CONSTRAINT role_fk FOREIGN KEY (roleid) REFERENCES tbl_role (roleid),
  CONSTRAINT user_fk FOREIGN KEY (userid) REFERENCES tbl_user (userid)
);



--insering data to tables
INSERT INTO tbl_role (name) VALUES ('USER');
INSERT INTO tbl_role (name) VALUES ('ADMIN');


INSERT INTO tbl_user (username, password) VALUES ('Raviteja', '$2a$12$cIl4uhWBujtnjc.CXAeye.A6Zmix9biKLoVYyo0tgl1y/4lMFLlCm');
INSERT INTO tbl_user (username, password) VALUES ('Admin', '$2a$12$cIl4uhWBujtnjc.CXAeye.A6Zmix9biKLoVYyo0tgl1y/4lMFLlCm');



INSERT INTO tbl_user_role (userid, roleid) VALUES (1, 1); 
INSERT INTO tbl_user_role (userid, roleid) VALUES (2, 2); 


--checking wether the data in stored in the tables
select * from tbl_user;
select * from tbl_role;
select * from tbl_user_role;



------($2a$12$cIl4uhWBujtnjc.CXAeye.A6Zmix9biKLoVYyo0tgl1y/4lMFLlCm)---this is hashKey BCrypt of -1234




--droping the database
drop database security2;

--droping tables
drop table tbl_user;
drop table tbl_role;
drop table Auth_users_roles;