CREATE DEFINER=`root`@`localhost` PROCEDURE `grade`(in g varchar(10))
BEGIN
DECLARE grade VARCHAR(255) DEFAULT concat("your grade is ",g);
select grade;
END