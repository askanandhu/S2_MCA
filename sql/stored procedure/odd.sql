CREATE DEFINER=`root`@`localhost` PROCEDURE `odd`(in num int)
BEGIN
DECLARE odd VARCHAR(255) DEFAULT "NUMBER IS ODD";
DECLARE even VARCHAR(255) DEFAULT "NUMBER IS EVEN";

if (num%2=0)
THEN
	select even;
else
	select odd;
end if;
END