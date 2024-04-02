use university;
create table student (Name varchar(20),Student_number int primary key ,class int,major varchar(15));
insert into student values ("Smith",17,1,"cs");
insert into student values ("Brown",8,2,"cs");

create table course (course_name varchar(30),course_number varchar(20) primary key,credit_hours int,department varchar(15));
insert into course values ("tntro to computer science","CS1310",4,"CS"),("Data structures","CS3320",4,"cs"),("discrete mathematics","MATH2410",3,"MATH"),("Database","CS3380",3,"cs");

create table section (section_identifier int primary key,course_number varchar(20),semester varchar(10),year int,instructor varchar(20),foreign key(course_number) references course(course_number));
insert into section values (85,"MATH2410","Fall",07,"King"),(92,"CS1310","Fall",07,"Anderson"),(102,"CS3320","Spring",08,"Knuth"),(112,"MATH2410","Fall",08,"Chang"),(119,"CS1310","Fall",08,"Anderson"),(135,"CS3380","Fall",08,"Stone");

create table grade_report (student_number int ,section_identifier int ,grade varchar(10),foreign key (student_number) references  student (student_number),foreign key (section_identifier) references section(section_identifier),primary key (student_number,section_identifier));
insert into grade_report values (17,112,"B"),(8,85,"A"),(8,92,"A"),(8,102,"B"),(8,135,"A");

create table prerequisite(course_number varchar(20),prerequisite_number varchar(20),