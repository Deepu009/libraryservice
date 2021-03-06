-- Insertiung some data to LIBRARY_BOOK table:
INSERT INTO LIBRARY_BOOK(ENTRY_ID, PRICE, BOOK_ID, BOOK_NAME, BOOK_TYPE, AUTHOR, ISBN_CODE, BOOK_STATUS, DATE_OF_ENTRY, PUBLISHED_ON, MEMBER_ID)
	SELECT * FROM (
		select 1, 375.0 , '8100WF' , 'Wings of Fire', 'AUTOBIOGRAPHY','A P J Abdul Kalam‎', '81-7371-146-1', 'ISSUED', '2020-06-01T13:54:24.976+05:30','1999',2  FROM DUAL UNION
		select 2, 375.0 , '8100WF' , 'Wings of Fire', 'AUTOBIOGRAPHY','A P J Abdul Kalam‎', '81-7371-146-1', 'ISSUED', '2020-06-01T13:54:24.976+05:30','1999',1 FROM DUAL UNION
		select 3, 375.0 , '8100WF' , 'Wings of Fire', 'AUTOBIOGRAPHY','A P J Abdul Kalam‎', '81-7371-146-1', 'AVAILABLE', '2020-06-01T13:54:24.976+05:30','1999',NULL  FROM DUAL UNION
		select 4, 375.0 , '8100WF' , 'Wings of Fire', 'AUTOBIOGRAPHY','A P J Abdul Kalam‎', '81-7371-146-1', 'AVAILABLE', '2020-06-01T13:54:24.976+05:30','1999',NULL  FROM DUAL UNION
		select 5, 345.0 , '810HP1' , 'Harry Potter and the Philosophers Stone', 'FANTASY','J. K. Rowling‎', '0-7475-3269-9', 'AVAILABLE', '2020-06-01T13:54:24.976+05:30','1997',NULL  FROM DUAL UNION
		select 6, 345.0 , '810HP1' , 'Harry Potter and the Philosophers Stone', 'FANTASY','J. K. Rowling‎', '0-7475-3269-9', 'ISSUED', '2020-06-01T13:54:24.976+05:30','1997',1  FROM DUAL UNION
		select 7, 345.0 , '810HP1' , 'Harry Potter and the Philosophers Stone', 'FANTASY','J. K. Rowling‎', '0-7475-3269-9', 'AVAILABLE', '2020-06-01T13:54:24.976+05:30','1997',NULL FROM DUAL
	) WHERE NOT EXISTS (SELECT * FROM LIBRARY_BOOK);

	
-- Insertiung some data to LIBRARY_MEMBER table:
INSERT INTO LIBRARY_MEMBER(MEMBER_ID, NAME ,CONTACT, ADDRESS, EXPIRATION_DATE_OF_MEMBERSHIP, START_DATE_OF_MEMBERSHIP, MEMBER_STATUS, NUMBER_OF_BOOK_ISSUED)
	SELECT * FROM (
		select  1, 'Mahesh' ,'9900099001', 'Manyata Tech Park Bangalore-560045', '2021-06-12T13:54:24.976+05:30', '2020-06-01T13:54:24.976+05:30', 'ACTIVE', 2 FROM DUAL UNION
		select  2, 'Arjun' ,'9900099002', 'Manyata Tech Park Bangalore-560045', '2021-06-12T13:54:24.976+05:30', '2020-06-01T13:54:24.976+05:30', 'ACTIVE', 1 FROM DUAL
	) WHERE NOT EXISTS (SELECT * FROM LIBRARY_MEMBER);
	
	
-- Insertiung some data to LIBRARY_BOOK_TRANSACTIONS table:	
INSERT INTO LIBRARY_BOOK_TRANSACTIONS(TRANSACTION_ID, BOOK_ID, BOOK_NAME, ISSUED_ON, RETURNED_ON, TRANSACTION_STATUS, FK2_LIBRARY_BOOK_ENTRYID, FK2_LIBRARY_MEMBER_MEMBERID)
	SELECT * FROM (
        select  1, '810HP1', 'Harry Potter and the Philosophers Stone', '2020-06-02T13:54:24.976+05:30', '2020-06-05T13:54:24.976+05:30', 'ISSUED', 5 ,2 FROM DUAL UNION
		select  2, '8100WF', 'Wings of Fire', '2020-06-02T13:54:24.976+05:30', NULL, 'ISSUED', 1 ,1 FROM DUAL UNION
		select  3, '810HP1', 'Harry Potter and the Philosophers Stone', '2020-06-03T13:54:24.976+05:30', NULL, 'ISSUED', 6 ,1 FROM DUAL UNION
		select  4, '8100WF', 'Wings of Fire', '2020-06-05T13:54:24.976+05:30', NULL, 'ISSUED', 2 ,2 FROM DUAL UNION
		select  5, '810HP1', 'Harry Potter and the Philosophers Stone', '2020-06-02T13:54:24.976+05:30', '2020-06-05T13:54:24.976+05:30', 'RETURNED', 5 ,2 FROM DUAL
	) WHERE NOT EXISTS (SELECT * FROM LIBRARY_BOOK_TRANSACTIONS);