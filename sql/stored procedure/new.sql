CREATE DEFINER=`root`@`localhost` PROCEDURE `new_procedure`()
BEGIN
DECLARE fact INT DEFAULT 1;
DECLARE num INT DEFAULT 5;
WHILE num >  0
DO 
SET fact= fact*num;
SET num=num-1;
END WHILE;
SELECT fact;
END