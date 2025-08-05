# CRUD 게시판 프로젝트

### 1. 프로젝트 소개

본 프로젝트는 『코딩 자율학습 스프링 부트 3: 자바 백엔드 개발 입문』 교재를 기반으로 개발한 CRUD(Create, Read, Update, Delete) 기능이 구현된 게시판 웹 애플리케이션입니다.

스프링 부트와 JPA를 활용하여 MVC 패턴의 기본적인 구조를 학습하고, 데이터베이스와 객체 간의 관계를 이해하는 것을 목표로 하였습니다.

### 2. 주요 기능

-   **게시글 생성(Create):** 게시글 제목과 내용을 입력하여 새로운 글을 등록합니다.

-   **게시글 조회(Read):** 게시글 목록과 개별 게시글의 상세 내용을 조회합니다.

-   **게시글 수정(Update):** 기존 게시글의 제목과 내용을 수정하고 저장합니다.

-   **게시글 삭제(Delete):** 특정 게시글을 삭제합니다.

### 3. 기술 스택

-   **Backend:** Java

-   **Framework:** Spring Boot 3, Spring Data JPA

-   **Database:** H2

-   **Build Tool:** Gradle

-   **View Engine:** mustache


### 4. 프로젝트 구조

```
src/main
├── java
│   └── com.github.SeonhwanNo_dev.stock
│       ├── controller
│       │   └── ArticleController.java       // HTTP 요청을 처리하는 컨트롤러
│       │   └── MemberController.java    
│       │   └── ThirdController.java     
│       ├── model
│       │   ├── dto
│       │   │   └── ArticleForm.java         // DTO(Data Transfer Object)
│       │   │   └── MemberForm.java   
│       │   ├── entity
│       │   │   └── Article.java             // 데이터베이스와 매핑되는 엔티티
│       │   │   └── Member.java             
│       │   └── repository
│       │       └── ArticleRepository.java   // 데이터베이스 CRUD를 담당하는 리포지토리
│       │       └── MemberRepository.java   
│       └── ThirdProjectApplication.java // 메인 애플리케이션
└── resources
    ├── templates
    │   ├── articles
    │   │   ├── edit.html                 // 게시글 수정 페이지
    │   │   └── index.html                // 게시글 상세 보기
    │   │   └── new.html                  // 게시글 생성 폼
    │   │   └── show.html                 // 전체 게시글 보기    
    │   ├── members
    │   │   └── index.html                // 멤버 상세 보기
    │   │   └── new.html                  // 멤버 생성 폼
    │   │   └── show.html                 // 멤버 전체 보기  
    │   └── common
    │       ├── header.html              // 공통 헤더
    │       └── footer.html              // 공통 푸터
    └── application.properties         // 환경 설정 파일

```

### 5. 프로젝트 실행 방법

1.  **의존성 설치:**
    * 프로젝트 루트 디렉토리에서 터미널을 열고 다음 명령어를 실행하여 필요한 라이브러리를 설치합니다.
    ```bash
    ./gradlew build
    ```
2.  **애플리케이션 실행:**
    * 다음 명령어로 애플리케이션을 실행합니다.
    ```bash
    ./gradlew bootRun
    ```
3.  **웹 접속:**
    * 웹 브라우저를 열고 `http://localhost:8080/articles/new` 에 접속하여 프로젝트를 확인합니다.

### 6. 프로젝트를 통해 배운 점

-   **Spring Boot와 JPA:** Spring Boot와 JPA를 사용하여 복잡한 설정 없이도 효율적으로 백엔드 애플리케이션을 개발하는 방법을 익혔습니다.
-   **MVC 패턴:** 컨트롤러, DTO, 엔티티, 리포지토리로 이어지는 MVC 패턴의 역할과 데이터 흐름을 명확하게 이해했습니다.
-   **RESTful API:** RESTful 원칙에 따라 게시글 생성, 조회, 수정, 삭제를 위한 API를 설계하고 구현했습니다.
