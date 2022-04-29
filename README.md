## fetch와 ajax로 공공데이터 화면에 출력하기

### 1. 공공데이터 활용신청 → 인증키 발급 받기

[기상청_관광코스별 관광지 상세 날씨 조회서비스](https://www.data.go.kr/data/15056912/openapi.do)

### 2. 스프링 프로젝트 만들기

- Spring Boot v2.5.13
- Gradle
- Dependencies
    - Spring Web
    - Spring Boot DevTools
    - Lombok
    - Mustache


### 3. application.yml 설정하기

```
server:
  port: 8080
  servlet:
    context-path: /
    encoding:
      charset: utf-8

spring:
  output:
    ansi:
      enabled: always
```

### 4. 컨트롤러에 공공데이터 받아오기

### 5. fetch로 데이터 받아서

### 6. ajax로 화면에 데이터 출력하기