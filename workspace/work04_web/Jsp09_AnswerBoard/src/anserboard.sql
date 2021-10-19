--2021,10,05 1교시
DROP SEQUENCE BOARDNOSQ;
DROP SEQUENCE GROUPNOSQ;

DROP TABLE ANSWERBOARD;

--긃 번호 시퀀스(PRIMARY KEY)
CREATE SEQUENCE BOARDNOSQ NOCACHE;

--그룹 번호 시퀀스(새로운 글을 등록할 때만)
CREATE TABLE ANSERBOARD(
	BOARDNO NUMBER PRIMARY KEY,
	GROUPNO NUMBER NOT NULL,
	GROUPSQ NUMBER NOT NULL,
	TITILETAB NUMBER NOT NULL,
	TITLE VARCHAR2(2000) NOT NULL,
	CONTENT VARCHAR2(4000) NOT NULL,
	WRITER VARCHAR2(1000) NOT NULL,
	REGDATE DATE NOT NULL
);

SELECT*FROM ANSERBOARD;

---------
--첫 번째 글 작성
INSERT INTO ANSERBOARD
VALUES(BOARDSQ.NEXTVAL, GROUPSQ.NEXTVAL, 1,0, '첫 번째 글','1번 글입니다.','유저1',SYSDATE);

--두 번째 글 작성
INSERT INTO ANSERBOARD
VALUES(BOARDSQ.NEXTVAL, GROUPSQ.NEXTVAL, 1,0, '두 번째 글','2번 글입니다.','유저2',SYSDATE);


