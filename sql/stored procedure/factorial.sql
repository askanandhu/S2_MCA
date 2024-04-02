CREATE DEFINER=`root`@`localhost` PROCEDURE `factorial`( IN num int)
BEGIN
DECLARE fact INT DEFAULT 1;
WHILE num >  0
DO 
SET fact= fact*num;
SET num=num-1;
END WHILE;
SELECT fact;
END