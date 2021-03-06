# 자바 프로젝트

## src55 - AJAX를 이용하여 Front-End와 Back-End를 분리한다.
학습목표
    - 페이지 컨트롤러에서 JSON 데이터를 출력할 수 있다.
    - 자바스크립트의 AJAX를 이용하여 서버에 데이터를 요청할 수 있다.
    - 자바스크립트를 이용하여 UI를 제어할 수 있다.
    - 프론트 컨트롤러를 여러 개 설정할 수 있다.
    - ContextLoaderListener의 용도를 이해하고 설정할 수 있다.
    - 자바스크립트 파일을 압축하는 방법을 이해하고 압축할 수 있다.
    - jquery 라이브러리를 사용할 수 있다.
    - bootstrap 라이브러리를 사용할 수 있다.
    - npm을 사용하여 프론트엔드(css/javascript) 라이브러리를 관리할 수 있다.
작업내용
    - 컴포넌트의 관리 주체를 분리한다.
    - 웹 관련 컴포넌트는 DispatcherServlet이 관리하고,
      서비스, DAO 등 공통으로 사용하는 컴포넌트는 ContextLoaderListener가 관리한다.
    - /json/* 요청을 관리할 프론트 컨트롤러를 설정한다.
    - JSON 데이터를 리턴할 프론트 컨트롤러를 설정한다.
    

## src54 - 트랜잭션 적용
학습목표
    - 애노테이션 또는 XML 기반으로 트랜잭션을 설정하고 사용할 수 있다.
    - 트랜잭션의 전파 정책을 이해한다.
작업내용
    - XML에 트랜잭션 관리자 및 정책을 설정한다.

## src53 - 서비스 컴포넌트 적용
학습목표
    - 서비스 컴포넌트의 역할을 이해하고 만들 수 있다.
작업내용
    - 페이지 컨트롤러는 서비스 컴포넌트를 경유하여 DAO를 사용한다.

## src52 - Spring WebMVC 기타 설정
학습목표
    - view resolver의 역할을 이해하고 설정할 수 있다.
    - Path Variable을 사용할 수 있다.
    - Matrix Variable을 사용할 수 있다.
    - 목록의 페이징을 다룰 수 있다.
    - Interceptor를 다룰 수 있다.
작업내용
    - 프론트 컨트롤러의 스프링 설정에 뷰 리졸버 설정을 추가한다.
    - 프론트 컨트롤러의 URL 맵핑을 *.do 에서 /app/* 으로 변경한다.
    - Path Variable을 처리할 객체를 등록한다.
    - 페이지 파라미터에 Matrix Variable을 적용한다.
    - 목록 데이터를 페이지 단위로 가져온다.
    - 인터셉터를 사용하여 로그인 여부를 검사한다.
    
## src51 - Spring WebMVC 기본 적용
학습목표
    - Spring WebMVC를 사용하여 웹 애플리케이션을 만들 수 있다.
    - Spring WebMVC의 구동 원리를 이해한다.
작업내용
    - 기존에 작성했던 프론트 컨트롤러인 DispatcherServlet을 Spring WebMVC 클래스로 대체한다.
    - 기존에 작성했던 필터인 CharacterEncodingFilter를 Spring WebMVC 클래스로 대체한다.
    - @RequestParam, @RequestMapping 애노테이션을 Spring WebMVC 애노테이션으로 대체한다.
    - 문자열 파라미터 값을 java.sql.Date 객체로 변환시키는 커스텀 프로퍼티 에디터를 등록한다.
학습목표
    - 스프링 WebMVC의 프론트 컨트롤러를 프로젝트에 적용할 수 있다.
    - 스프링 WebMVC의 규칙에 따라 페이지 컨트롤러를 만들 수 있다.
    - @InitBinder 애노테이션을 사용할 수 있다.
    - 커스텀 프로퍼티 에디터를 사용하여 클라이언트 파라미터 값을 요청 핸들러의 파라미터 값으로 변환할 수 있다.
    - @ControllerAdvice 애노테이션을 사용할 수 있다.
    
## src50 - mybatis와 Spring IoC 컨테이너 연동하기
학습목표 
    - mybatis를 Spring IoC 컨테이너와 연동할 수 있다.
    - Spring 설정 파일에 mybatis 객체와 관련된 정보를 설정하고 구동원리를 이해한다.
작업내용
    - mybatis 스프링 연동 라이브러리를 가져온다.
    - 스프링 설정 파일에 mybatis 설정을 추가한다.
    - DAO 클래스를 인터페이스로 전환한다.
    - SQL 맵퍼 파일을 DAO 인터페이스에 맞춰 변경한다. 

## src49 - 요청 핸들러의 파라미터 값을 자동 주입하기
학습목표
    - Reflection API를 사용하여 메서드의 파라미터 값을 다룰 수 있다.
    - 스프링 WebMVC 구동 원리를 이해한다.
작업내용
    - 요청 핸들러의 파라미터를 분석하여 그 값을 자동으로 주입시킨다.

## src48 - CRUD 페이지 컨트롤러들을 한 개의 클래스로 묶기
학습목표
    - CRUD 기능을 한 개의 클래스로 묶어서 다룰 수 있다.
    - Reflection API를 사용하여 메서드를 찾고 호출할 수 있다.
작업내용
    - CRUD 각 기능 별로 나뉘어져 있는 클래스들을 한 개의 클래스로 묶는다. 

## src47 - PageController 인터페이스 대신 애노테이션을 사용하여 호출할 메서드를 지정하기
학습목표
    - Reflection API를 사용하여 클래스의 애노테이션 및 메서드 정보를 다룰 수 있다.
작업내용
    - 프론트 컨트롤러는 페이지 컨트롤러의 메서드를 찾을 때 @RequestMapping 애노테이션이 붙은 
      메서드를 찾아 호출하게 한다.
    - 즉 PageController 인터페이스를 구현하는 제약으로부터 탈출!

## src46 - 페이지 컨트롤러를 POJO로 변경한다.
학습목표
    - POJO의 의미를 이해한다.
    - 스프링 IoC 컨테이너를 사용하여 페이지 컨트롤러를 관리할 수 있다.
작업내용
    - 기존의 페이지 컨트롤러인 서블릿 클래스들을 POJO 클래스로 변경한다.

## src45 - Facade 패턴을 적용하여 Front Controller를 구현한다.
학습목표 
    - Facade 패턴을 이해한다.
    - Front Controller를 도입하고 적용할 수 있다.
    - 서블릿 오류에 대한 전용 페이지 설정할 수 있다.
작업내용
    - 컨트롤러들의 공통 기능을 모아 프론트 컨트롤러에게 위임한다.
     

## src44 - EL과 JSTL 적용
학습목표
    - EL과 JSTL을 사용할 수 있다.
작업내용
    - JSP 페이지에서 자바 코드를 JSTL 태그와 EL 코드로 대체한다.

## src43 - JSP 전용 태그 적용 
학습목표
    - JSP 전용 태그(JSP action tag)를 사용할 수 있다.
작업내용
    - include, forward를 JSP 전용 태그로 처리한다.
    - ServletRequest 에서 값을 꺼내는 부분을 JSP 전용 태그로 처리한다. 
    
## src42 - JSP 적용
학습목표
    - JSP를 적용하여 MVC 아키텍처를 완성한다.
    - JSP를 활용할 수 있다.
작업내용
    - 서블릿에서 수행하던 UI 출력을 JSP로 옮긴다.

## src41 - 쿠키와 세션 기술 적용
학습목표
    - 쿠키와 세션을 이용하여 로그인을 처리할 수 있다.
    - Referer 헤더의 용도를 이해한다.
작업내용
    - 쿠키를 이용하여 아이디를 기억하는 로그인 폼 만들기
    - 세션을 이용하여 로그인 사용자 정보를 보관하고 사용하기
    - 로그인 후 Referer 헤더 값을 참조하여 이전 페이지로 이동하게 한다.
    
## src40 - Filter, Listener 기술 적용
학습목표
    - 필터의 구동 원리를 이해하고 적용할 수 있다.
    - FilterConfig 객체를 사용하여 web.xml에 있는 init-param 값을 사용할 수 있다.
    - 리스너의 구동 원리를 이해하고 적용할 수 있다.
    - 컨텍스트 파라미터를 설정하고 사용할 수 있다.
작업내용
    - Filter에서 클라이언트 데이터 인코딩 지정을 수행한다.
      (CharacterEncodingFilter)
    - ServletContextListener 구현체에서 스프링 IoC 컨테이너 준비
      (ContextLoaderListener, WebApplicationContextUtils)

## src39 - forward, include 기술 적용 
학습목표
    - forward와 include의 용도를 이해하고 적용할 수 있다.
작업내용
    - 오류 처리 코드를 별도의 서블릿으로 분리하여 forward 한다.
    - 팀 상세보기 화면을 여러 서블릿으로 분리하여 include 한다.

## src38 - refresh, redirect 기술 적용
학습목표
    - refresh와 redirect의 동작을 이해하고 사용할 수 있다.
작업내용
    - 등록, 변경, 삭제 후 refresh와 redirect를 적용하기

## src37 - 서블릿 기술 적용
학습목표
    - 서블릿을 만들고 배치할 수 있다.
    - HTML 페이지를 만들 수 있다.
작업내용 
    - 기존의 컨트롤러를 서블릿으로 전환한다.
    
## src36 - Tomcat 서블릿 컨테이너 적용 
학습목표
    - 톰캣 서버를 구축하고 실행할 수 있다.
    - 서블릿을 만들고 배치할 수 있다.
    - Adapter 설계 패턴의 원리를 이해한다.
작업내용
    - 톰캣 서버를 설치한다.
    - 서블릿 관련 라이브러리를 가져온다.
    - 클라이언트 요청을 받아서 컨트롤러에게 전달할 DispatchServlet을 만든다.

## src35 - Spring 프레임워크의 IoC 컨테이너 적용
학습목표
    - Spring IoC 컨테이너를 설정할 수 있다.
    - Spring IoC 컨테이너를 사용하여 객체를 관리할 수 있다.
    - URL Encoding과 URL Decoding의 원리를 이해한다.
작업내용
    - Spring IoC 컨테이너 관련 라이브러리 추가 
    - 기존의 ApplicationContext를 Spring IoC 컨테이너로 대체한다.
    - 클라이언트가 보낸 데이터를 리턴할 때 URL Decoding 한다. 

## src34 - 테이블에 Foreign Key 적용하기
학습목표
    - FK의 용도를 이해한다.
    - 컬럼에 FK를 설정할 수 있다.
    - 여러 테이블의 데이터를 조인하여 결과를 조회할 수 있다.
작업내용 
    - 기존의 테이블에서 FK를 적용한 새 테이블을 만든다.
    - SQL 맵퍼 파일을 변경한다.

## src33 - Data Persistence Framework인 Mybatis를 적용하라!
학습목표
    - JDBC 대신 Mybatis를 사용했을 때 이점을 이해한다.
    - Mybatis를 설정하고 코드에 적용할 수 있다.
작업내용
    - Mybatis 프레임워크 관련 의존 라이브러리 가져온다.
    - Mybatis 설정 파일을 준비한다.
    - SqlSessionFactory를 준비한다.
    - DAO에 SqlSessionFactory를 의존 객체로 주입한다.
    - DAO는 JDBC 코드 대신 SqlSession을 사용하여 데이터를 처리한다.

## src32 - DB 커넥션 풀을 적용하여 DB 연결 객체를 효율적으로 관리하라.
학습목표
    - "pooling 기법(일정 수량의 객체를 만들어 놓고 재사용하는 방법)"을 이해한다.
    - "flyweight 디자인 패턴"을 이해하고 구현할 수 있다.
    - "proxy 디자인 패턴"을 이해하고 구현할 수 있다.
    - DB 커넥션 풀 개념을 이해하고 구현할 수 있다.
작업내용
    - DB 커넥션에 대해 "pooling 기법"을 적용하여 DB 커넥션 풀을 만든다.
    - Connection 객체의 close() 메서드를 재정의하기 위해 proxy 패턴을 적용한다.

## src31 - DAO에 JDBC 적용
학습목표
    - JDBC API 사용을 익힌다.
    - gradle을 이용하여 의존 라이브러리를 관리하는 방법을 익힌다.
작업내용
    - gradle을 이용하여 JDBC driver를 자동으로 다운로드하고 classpath에 등록한다.
    - DAO 클래스에 JDBC API를 적용한다.

## src30 - 멀티스레드 적용
학습목표
    - 멀티스레드를 적용하여 다중 클라이언트 요청을 처리할 수 있다.
    - 스레드의 동작을 이해한다.
    - 싱글스레드 방식의 문제점을 안다.
작업내용
    - HTTPServer에서 클라이언트 요청을 처리할 때 멀티스레드를 적용한다.

## src29 - HTTP 프로토콜 적용
학습목표
    - HTTP 요청 프로토콜과 HTTP 응답 프로토콜을 이해한다.
    - HTTP 프로토콜에 따라 네트워크 프로그램을 작성할 수 있다.
작업내용
    - HTTP 프로토콜에 따라 요청을 처리할 웹서버를 만든다.
    - AppSever에 웹 서버 기능을 추가한다.

## src28 - 소켓 프로그래밍을 적용하여 Client/Server 환경을 구축하라!
학습목표
    - 네트워크 프로그래밍을 익힌다.
    - 클라이언트/서버 개념을 이해하고 만들 수 있다.
    - 프로토콜의 개념을 이해한다.
작업내용
    - PMS 프로그램을 서버와 클라이언트로 분리한다.

## src27 - serialize/deserialize 기법을 사용하여 객체 데이터를 관리하라!
학습목표
    - Serializable 객체를 다룰 수 있다.
    - Java I/O 스트림 클래스의 사용법을 익힌다.
    - 파일 입출력에 대한 예외 처리를 방법을 익힌다.
작업내용
    - 도메인 클래스에 sirialize 기능을 활성화시킨다.
    - 객체를 저장하고 읽을 수 있도록 DAO를 변경한다.

## src26 - Command 디자인 패턴을 적용하여 명령어 단위로 클래스를 쪼개라!
학습목표
    - Command 디자인 패턴을 이해하고 적용할 수 있다.
작업내용
    - 기존의 컨트롤러 클래스를 메서드 단위로 쪽개서 클래스로 분리한다.
    - 사칙연산(+, -, *, /)를 수행하는 컨트롤러를 작업한다.
```
명령> calc
식을 입력하세요? 3 + 5
3 + 5 = 8

명령> calc
식을 입력하세요? 3 ^ 5
^ 연산은 지원하지 않습니다.

명령>
```

## src25 - 예외 처리 문뻐을 적용하여 예외가 발생하더라도 시스템을 멈추지 말라!
학습목표
    - 예외 클래스를 만들고 사용하는 방법을 익힌다.
    - 예외를 처리하는 방법을 익힌다.
작업내용
    - 사용자 입력에서 오류가 발생했을 때 적절한 조치를 취한 후에 계속 실행하도록 만든다.

## src24 - File I/O를 적용하여 데이터를 보관하라!
학습목표
    - File I/O 사용법을 익힌다.
작업내용
    - DAO에 파일 입출력을 적용하여 데이터 퍼시스턴스(persistence)를 관리한다.

## src23 - IoC 컨테이너를 적용하라!
학습목표
    - IoC 컨테이너의 동작 원리와 사용법을 익힌다.
    - Reflection API 사용법을 익힌다.
    - File, URL 사용법을 익힌다.
    - Annotation 기술의 응용 방법을 배운다.
작업내용
    - IoC 컨테이너를 사용하여 DAO와 컨트롤러 객체를 관리한다. 

## src22 - DAO에 대해 geralization을 적용하라!
학습목표
    - generalization의 방법을 익힌다.
    - 제네릭을 다루는 방법을 익힌다.
    - 추상클래스와 추상메서드를 활용하는 방법을 익힌다.
작업내용
    - DAO의 공통 분모를 추출하여 수퍼 클래스로 정의한다.
    - 수퍼 클래스에 대해 추상 클래스와 추상 메서드를 적용한다.

## src21 - 컨트롤러에 인터페이스 적용
- 학습목표
    - 인터페이스의 정의와 활용 방법을 익힌다.
    - HashMap을 응용하는 방법을 익힌다.
- 작업내용
    - App 클래스와 XxxxController 클래스 사이에 호출 규칙을 인터페이스로 정의한다.
    - 기존의 컨트롤러를 인터페이스 구현체로 변경한다.
    - HashMap에 컨트롤러를 저장하여 메뉴 이름으로 찾는다.
    
## src20 - 수업 정보를 관리할 수 있는 CRUD 기능 추가
- 학습목표
    - 기존에 배운 문법을 활용하는 방법을 익힌다.
- 작업내용
    - 수업 정보의 등록/조회/변경/삭제할 수 있는 기능을 만든다.
```
> java -classpath bin bitcamp.java106.pms.App
명령> classroom/add
[수업 등록]
수업명? 자바106기
시작일? 2018-2-26
종료일? 2018-8-20
교실번호? 강남401호

명령> classroom/add
[수업 등록]
수업명? 자바107기
시작일? 2018-3-26
종료일? 2018-9-20
교실번호? 강남501호

명령> classroom/list
[수업 목록]
0, 자바106기, 2018-2-26 ~ 2018-8-20, 강남401호
1, 자바107기, 2018-3-26 ~ 2018-9-20, 강남501호

명령> classroom/update
[수업 정보 변경]
변경할 수업 번호? 0
수업명(자바106기)? Java 106 (입력하지 않으면 기존 값)
시작일(2018-2-26)? 2018-2-27 (입력하지 않으면 기존 값)
종료일(2018-8-20)? 2018-8-21 (입력하지 않으면 기존 값)
교실번호(강남401호)? 강남403호 (입력하지 않으면 기존 값)
변경하시겠습니까?(y/N) y
변경하였습니다.
변경하시겠습니까?(y/N) n
취소하였습니다.

명령> classroom/delete
[수업 삭제]
삭제할 수업 번호? 0
정말 삭제하시겠습니까?(y/N) y
삭제하였습니다.
변경하시겠습니까?(y/N) n
취소하였습니다.

```

## src19 - 자바에서 제공하는 컬렉션 클래스를 적용하라. 또한 제넥릭을 사용하라!
- 학습목표
    - java.util 패키지의 컬렉션 클래스를 사용하여 객체 목록을 다룰 수 있다.
    - 제네릭을 적용할 수 있다.
- 작업내용
    - DAO 클래스에 자바 컬렉션 클래스를 적용한다.
    - 제네릭을 적용하여 형변환 코드를 제거한다.

## src18 - 컬렉션 클래스 적용
- 학습목표
    - 컬렉션 클래스의 역할을 이해한다.
    - 배열을 이용한 컬렉션 클래스를 만들 수 있다.
    - 컬렉션 클래스를 이용하여 객체(의 주소) 목록을 다룰 수 있다.
- 작업내용
    - DAO 클래스에서 객체 목록을 다루는 코드를 ArrayList 클래스로 분리한다.
    - 기존의 DAO 클래스는 ArrayList를 이용하여 객체를 다룬다.  

## src17 - 팀 작업을 관리할 수 있는 CRUD 기능 추가
- 학습목표
    - 기존에 배운 문법을 활용하는 방법을 익힌다.
    - "high cohesion"의 의미와 이유를 이해한다.
- 작업내용
    - 팀에서 수행할 작업을 등록/조회/변경/삭제할 수 있는 기능을 만든다.
    - Team 클래스에서 팀 회원 관리 기능을 TeamMemberDao로 분리한다.
      이렇게 함으로써 Team 클래스가 좀 더 "high cohesion"을 유지하게 만든다.
```
> java -classpath bin bitcamp.java106.pms.App
명령> team/add
팀명? 비트비트
...

명령> task/add 비트비트
작업명? UI 프로토타입 만들기
시작일? 2018-1-1 (시작일을 지정하지 않으면 팀 시작일을 사용한다.)
종료일? 2018-1-7 (종료일을 지정하지 않으면 팀 종료일을 사용한다.)
작업자? hong (작업자를 지정하지 않으면 null 값을 저장한다.)

명령> task/add 비트비트
작업명? UI 프로토타입 만들기
시작일? 2017-12-20 (시작일이 팀 시작일 보다 이전이면 팀 시작일을 값으로 사용한다.)
종료일? 2018-12-7 (종료일이 팀 종료일 보다 크면 팀 종료일을 값으로 사용한다.)
작업자? park (존재하지 않는 사용자 아이디일 경우 null 값으로 저장한다.)

명령> task/list 비트비트
0, UI 프로토타입 만들기, 2018-1-1, 2018-1-7, hong
1, UI 명세서 만들기, 2018-1-8, 2018-1-15, kim

명령> task/view 비트비트
작업번호? 1
작업명: UI 명세서 만들기
시작일: 2018-1-8
종료일: 2018-1-15
작업자: (작업자가 지정되지 않았을 경우 빈 문자열을 출력한다.)
작업자: 작업중

명령> task/update 비트비트
변경할 작업의 번호? 1
작업명(UI 명세서 만들기)? UI 명세서 작성 (값을 지정하지 않으면 원래 값을 사용한다.)
시작일(2018-1-8)? 2018-1-7    (값을 지정하지 않으면 원래 값을 사용한다.)
종료일(2018-1-15)? 2018-1-14  (값을 지정하지 않으면 원래 값을 사용한다.)
작업자(kim)? lee (값을 지정하지 않으면 원래 값을 사용한다.)
변경하시겠습니까? (y/N) y
저장하였습니다. (취소하면 "취소하였습니다."를 출력하라)

명령> task/update 비트비트
삭제할 작업의 번호? 9
해당 작업이 없습니다.

명령> task/delete 비트비트
삭제할 작업의 번호? 0
정말 삭제하시겠습니까? (y/N) y
삭제하였습니다. (취소하면 "취소하였습니다."를 출력하라)

명령> task/delete 비트비트
삭제할 작업의 번호? 9
해당 작업이 없습니다.

명령> task/state 비트비트
상태를 변경할 작업의 번호? 1
'UI 명세서 작성' 작업의 상태: 작업중(1)
변경할 상태? (0: 작업대기, 1: 작업중, 9: 작업완료) 9
작업의 상태를 '작업완료'(으)로 변경하였습니다.

명령> task/state 비트비트
상태를 변경할 작업의 번호? 1
'UI 명세서 작성' 작업의 상태: 작업중(1)
변경할 상태? (0: 작업대기, 1: 작업중, 9: 작업완료) 5
올바르지 않은 값입니다. 이전 상태를 유지합니다!

명령> task/state 비트비트
상태를 변경할 작업의 번호? 8
해당 작업이 없습니다.

```

## src16 - 캡슐화 적용
- 학습목표
    - 사용자 정의 데이터 타입에 대해 캡슐화를 적용하고 겟터와 셋터의 활용법을 익힌다.
- 작업내용
    - domain 패키지에 있는 사용자 정의 데이터 타입 클래스에 겟터, 셋터를 적용한다.

## src15 - 팀 멤버 관리 기능 추가
- 학습목표
    - 자바 문법을 활용하는 것을 연습한다.
    - 기존 시스템을 유지보수하는 것을 연습힌다.
- 작업내용
    - 팀 멤버를 관리하는 기능을 추가한다.
```
> java -classpath bin bitcamp.java106.pms.App
명령> team/add
팀명? 비트비트
...

명령> team/add
팀명? 바이트바이트
...

명령> member/add
아이디? hong
...

명령> member/add
아이디? kim
...

명령> team/member/add 오호라
오호라 팀은 존재하지 않습니다.

명령> team/member/add 비트비트
추가할 멤버의 아이디는? hong
추가하였습니다.

명령> team/member/add 비트비트
추가할 멤버의 아이디는? kim
추가하였습니다.

명령> team/member/add 비트비트
추가할 멤버의 아이디는? hong
이미 등록된 회원입니다.

명령> team/member/add 비트비트
추가할 멤버의 아이디는? lee
lee 회원은 없습니다.

명령> team/member/list 비트비트
회원들: hong, kim

명령> team/member/delete 비트비트
삭제할 팀원은? hong
삭제하였습니다.

명령> team/member/delete 비트비트
삭제할 팀원은? hong
이 팀의 회원이 아닙니다.

```

## src14 - DAO 클래스 분리(리팩토링)
- 학습목표
    - 기존 클래스의 역할 중에 일부를 분리하는 방법을 익힌다.
    - DAO 역할에 대해 이해한다.
- 작업내용
    - 컨트롤러 클래스에서 데이터를 보관처리하는 코드 부분을 별도의 클래스로 분리한다.

## src13 - 날짜 값을 다루는 java.sql.Date 클래스 적용(리팩토링)
- 학습목표
    - java.sql.Date 클래스의 사용법을 익힌다.
- 작업내용
    - 팀, 게시물 정보를 입력/변경할 때 날짜 값을 Date 객체에 저장한다.

## src12 - 생성자 도입(리팩토링)
- 학습목표
    - 생성자의 사용법을 익힌다.
    - 생성자 문법의 존재 의미를 이해한다.
- 작업내용
    - XxxController 객체를 생성할 때 필수 값으로 Scanner 객체를 받도록 변경한다.

## src11 - 인스턴스 변수와 인스턴스 메서드의 활용(리팩토링)
- 학습목표
    - 인스턴스 변수의 사용법을 익힌다.
    - 인스턴스 메서드의 사용법을 익힌다.
- 작업내용
    - 스태틱 변수와 스태틱 메서드로 만든 기존 코드를 인스턴스 변수와 인스턴스 메서드로 변경한다.

## src10 - 문법의 활용
- 학습목표
  - 클래스 문법을 활용하여 게시판 데이터를 저장할 메모리를 설계할 수 있다.
  - 메서드를 사용하여 코드를 기능 별로 묶을 수 있다.
  - 클래스 문법을 활용하여 관련 메서드들을 묶을 수 있다.
- 작업내용
  - 게시판 데이터를 등록, 조회, 변경, 삭제하는 기능을 추가한다.
```
> java -classpath bin bitcamp.java106.pms.App
명령> board/add
[게시글 등록]
제목? 제목1
내용? 내용1
등록일? 2018-1-1

명령> board/add
[게시글 등록]
제목? 제목2
내용? 내용2
등록일? 2018-1-1

명령> board/add
[게시글 등록]
제목? 제목3
내용? 내용3
등록일? 2018-1-1

명령> board/list
[게시글 목록]
0, 제목1, 2018-1-1
1, 제목2, 2018-1-1
2, 제목3, 2018-1-1

명령> board/view 1
[게시글 조회]
제목: 제목2
내용: 내용2
등록일: 2018-1-1

명령> board/update 1
[게시글 변경]
제목(제목2): 제목2x
내용(내용2): 내용2x
변경하였습니다.

명령> board/delete 1
[게시글 삭제]
정말 삭제하시겠습니까?(Y/n) y
삭제하였습니다.

명령> board/list
0, 제목1, 2018-1-1
2, 제목3, 2018-1-1
```


## src09 - 리팩토링(facade 설계 기법 응용)
- 학습목표
  - 다른 클래스를 사용할 때 유지보수하기 좋은 구조로 만드는 방법을 배운다.
- 작업내용
  - App 클래스에 사용자가 입력한 메뉴에 따라 컨트롤러의 각 메서드를 호출하는 코드를 컨트롤러에게 옮긴다.

## src08 - 리팩토링(클래스 활용)
- 학습목표
  - 클래스 문법을 이용하여 관련 기능을 관리하기 쉽게 묶는 방법을 배운다.
- 작업내용
  - 팀관련 기능을 별도의 클래스로 분리한다.
  - 회원관리 기능을 별도의 클래스로 분리한다.
  - 기능 추가는 없다.

## src07 - 리팩토링(메서드 활용)
- 학습목표
  - 반복되는 코드를 메서드로 분리하는 연습을 한다.
- 작업내용
  - 팀/회원 관리 코드에서 반복되는 코드를 메서드로 분리한다.
  - 기능 추가는 없다.

## src06 - 유지보수 경험
- 학습목표
  - 기존의 코드 규칙에 따라 새 기능을 추가하는 훈련을 한다.
- 작업내용
  - 팀 정보 변경 및 삭제 기능을 추가한다.
  - 회원 정보 변경 및 삭제 기능을 추가한다.
- 실행 결과
```
> java -classpath bin bitcamp.java106.pms.App
명령> team/update okok
해당 이름의 팀이 없습니다.

명령> team/update aaa
팀명(aaa)? okok
설명(aaaaaaa)? okokok
최대인원(5)? 10
시작일(2018-5-5)? 2018-5-10
종료일(2018-8-8)? 2018-8-8
변경하였습니다.

명령> team/delete okok
해당 이름의 팀이 없습니다.

명령> team/delete aaa
정말 삭제하시겠습니까?(Y/n) y
삭제하였습니다.

명령> team/delete aaa
정말 삭제하시겠습니까?(Y/n) n

명령>

// 나머지 회원 변경과 삭제가 동일하다.

```

## src05 - 메서드 적용(리팩토링)
- 학습목표
  - 메서드를 사용하여 코드를 기능 단위로 분리하는 방법을 배운다.
- 작업내용
  - 추가하는 기능없다.
  - 메서드 문법을 사용하여 코드를 정리한다.

## src04 - 문법의 활용
- 학습목표
  - 변수, 상수, 연산자, 조건문/반복문(일부), 클래스 문법의 활용을 통해 프로그래밍을 익숙하게 한다.
- 작업내용
  - 사용자로부터 팀 또는 회원 정보를 입력 받아 저장한다.
  - 사용자의 명령에 따라 팀 또는 회원 정보를 출력한다.
- 실행결과
```
> java -classpath bin bitcamp.java106.pms.App
명령> (사용자을 입력을 기다리고 있어야 한다.)
명령> help
팀 등록 명령 : team/add
팀 조회 명령 : team/list
팀 상세조회 명령 : team/view 팀명
회원 등록 명령 : member/add
회원 조회 명령 : member/list
회원 상세조회 명령 : member/view 아이디
종료 : quit

명령> team/add
팀명? 비트비트
설명? 자바 프로젝트 팀
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20

명령> team/add
팀명? 비트비트2
설명? 자바 프로젝트 팀2
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20

명령> team/list
비트비트, 5, 2018-05-05 ~ 2018-08-20
비트비트2, 5, 2018-05-05 ~ 2018-08-20

명령> team/view 비트비트2
팀명: 비트비트2
설명: 자바 프로젝트 팀2
최대인원: 5
기간: 2018-05-05 ~ 2018-08-20

명령> team/view 비트오케이
해당 이름의 팀이 없습니다.

명령> team/view
팀명을 입력하시기 바랍니다.

명령> member/add
아이디? hong
이메일? hong@test.com
암호? 1111

명령> member/add
아이디? leem
이메일? leem@test.com
암호? 1111

명령> member/list
hong, hong@test.com, 1111
leem, leem@test.com, 1111

명령> member/view leem
아이디: leem
이메일: leem@test.com
암호: 1111

명령> member/view okok
해당 아이디의 회원이 없습니다.

명령> member/view
아이디를 입력하시기 바랍니다.

명령> memeber/list
명령어가 올바르지 않습니다.

명령> quit
안녕히가세요!

>
```

## src03 - 클래스와 배열
- 학습목표
  - 클래스를 사용하여 입력 데이터를 묶어서 저장하는 방법을 익힌다.
  - 배열을 사용하여 여러 개의 데이터를 다루는 방법을 익힌다.
  - for 반복문을 사용하여 배열을 다루는 방법을 이해한다.
  - if 조건문을 사용하는 방법을 이해한다.
  - 문자열을 비교하는 방법을 이해한다.
- 작업 내용
  - 사용자로부터 팀정보를 입력 받아 출력하라.
  - 입력은 최대 5개까지 가능하다.
  - 5개를 넘으면 바로 출력한다.
- 실행 결과
```
> java -classpath bin bitcamp.java106.pms.App
팀명? 비트비트
설명? 자바 프로젝트 팀
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20
계속 입력하시겠습니까?(Y/n) Y
팀명? 비트비트2
설명? 자바 프로젝트 팀2
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20
계속 입력하시겠습니까?(Y/n) Y
팀명? 비트비트3
설명? 자바 프로젝트 팀3
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20
계속 입력하시겠습니까?(Y/n) n
--------------------------------
비트비트, 5명, 2018-05-05 ~ 2018-08-20
비트비트2, 5명, 2018-05-05 ~ 2018-08-20
비트비트3, 5명, 2018-05-05 ~ 2018-08-20
```

## src02 - 키보드 입력 과 변수
- 학습목표
  - 키보드로부터 데이터를 입력 받는 방법을 익힌다.
  - 사용자가 입력한 값을 메모리에 보관하는 방법을 익힌다.
- 작업내용
  - 사용자로부터 팀 정보를 입력 받아 출력하라.
- 실행 결과
```
> java -classpath bin bitcamp.java106.pms.App
팀명? 비트비트
설명? 자바 프로젝트 팀
최대인원? 5
시작일? 2018-05-05
종료일? 2018-08-20
---------------------------
팀명: 비트비트
설명:
자바 프로젝트 팀
최대인원: 5명
일자: 2018-05-05 ~ 2018-08-20
>
```

## src01 - 컴파일과 실행
- 학습목표
  - 메이븐(Maven) 프로젝트 폴더 구조에서 자바 코드를 작성하고, 컴파일하고 실행하는 방법을 익힌다.
  - 도메인 이름을 이용하여 패키지를 관리하는 방법을 익힌다.
- 작업 내용
  - "Hello, world!"를 출력하는 자바 애플리케이션을 작성하라

## src00 - 프로젝트 폴더 준비
- 학습목표
  - 프로젝트 폴더를 준비한다.

```
src/
  main/
    java/  
      자바 소스 파일(.java)을 두는 폴더.
    resources/
      자바 프로그램 설정 파일(.xml, .properties 등)을 두는 폴더.
    webapp/
      웹 관련 파일(.html, .css, .js, .gif, .jsp 등)을 두는 폴더.
  test/
    java/
      단위 테스트 관련 자바 소스 파일을 두는 폴더.
    resources/
      단위 테스트 설정 파일을 두는 폴더.
```
