CREATE DEFINER=`root`@`localhost` PROCEDURE `dayview`(in d date)
BEGIN
declare dt varchar(100) default concat("day name is ",dayname(d));
select dt;
END