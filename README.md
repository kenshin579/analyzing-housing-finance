## 카카오페이 서버개발 사전과제

> 주택 금융 서비스 API 개발

### 개요

국내 주택금융 신용보증 기관으로부터 년도별 각 금융기관(은행)에서 신용보증한 금액에 대한
데이터가 주어집니다. 이를 기반으로 아래 기능명세에 대한 API 를 개발하고 각 기능별 Unit
Test 코드를 개발하세요

### Prerequisites

- Java 1.8 +
- Spring Boot 2.1.4 +
- JPA
- Gradle

### 요구 사항 및 문제해결 전략

- 공통 해결 전략
  - 다른 플랫폼(ex. MySQL) 에 종속 되지 않도록 구현한다. (ex. 내장형 DB 사용)
  - 어플리케이션의 DB 변경은 빈번하게 일어 나지 않음으로 캐싱 고려

- [x] CSV -> DB 로 저장하는 API 개발 
  - 어플리케이션이 시작될때 로컬에 저장하고 있는 CSV 파일을 읽고 DB 에 로드한다.
    - 저장하고 있는 CSV 파일이 없다면 에러로그를 찍고 정상 구동에 실패 하도록 한다.
     
- [x] 주택금융 공급 금융기관(은행) 목록을 출력하는 API 를 개발

  - 최상위 Entity 가 각 은행의 목록을 가지고 있다.

- [x] 년도별 각 금융기관의 지원금액 합계를 출력하는 API 를 개발

  - bank_id 와 year 가 row 끼리 묶으면 된다.
  - Comparable 인터페이스를 구현해 연도별 정렬한다.

- [x] 각 년도별 각 기관의 전체 지원금액 중에서 가장 큰 금액의 기관명을 출력하는 API 개발

  - Comparable 인터페이스를 구현해 비교한다.
  - Stream 식으로 비교

- [x] 전체 년도(2005~2016)에서 특정은행의 지원금액 평균 중에서 가장 작은 금액과 큰
  금액을 출력하는 API 개발

  - 각 년도별 비교하는 메소드 구현 

- [ ] 특정 은행의 특정 달에 대해서 2018 년도 해당 달에 금융지원 금액을 예측하는 API
  개발

  - 회귀 분석부터 접근할 예정

- [ ] API 인증을 위해 JWT 사용

  - 스프링 시큐리티 사용 

- [ ] 로컬에 대한 CSV 를 업데이트 할 수 있는 API를 추가로 개발한다.
  - 첨부파일 형태로 CSV 파일을 업데이트 하면 DB 도 업데이트 하도록 한다.
  

  
