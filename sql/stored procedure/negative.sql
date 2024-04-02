CREATE DEFINER=`root`@`localhost` PROCEDURE `negative`(in num int)
BEGIN
DECLARE nega VARCHAR(255) DEFAULT concat(num," IS NEGATIVE");
DECLARE pos VARCHAR(255) DEFAULT concat(num," IS POSITIVE");
DECLARE zer VARCHAR(255) DEFAULT concat(num," IS ZERO");

if (num=0)
THEN
	select zer;
elseif (num>0)
then
	select pos;
else
	select nega;
end if;
END