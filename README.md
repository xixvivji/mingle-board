# mingle-board
MingleBoard: 커뮤니티 플랫폼 백엔드
RESTful API 서버

---

## 프로젝트 소개

**MingleBoard**는 누구나 자유롭게 글을 남기고, 토론하며, 소통할 수 있는 커뮤니티/게시판 백엔드입니다.  
기업 서비스, 사내 커뮤니티, 동아리, 스터디 등 다양한 환경에서 활용할 수 있도록 설계

---

## 주요 기능

- **회원 관리 및 인증**
  - 회원가입, 로그인 (JWT 기반)
  - 계정 상태 관리(휴면, 차단 등)
  - 이메일 인증

- **게시글/댓글 서비스**
  - 게시글/댓글 CRUD
  - 대댓글, 좋아요, 신고 기능
  - 카테고리, 태그 분류

- **검색 서비스**
  - ElasticSearch 기반 빠른 검색
  - 카테고리/태그/작성자/내용별 필터링

- **관리자 기능**
  - 신고/삭제/통계 대시보드
  - 계정 및 게시글 관리

- **API 문서화**
  - Swagger(OpenAPI) 지원

- **마이크로서비스 구조**
  - 서비스별 독립적 개발/배포
  - API Gateway 통한 통합 진입점

---

## 기술 스택

- **Java 17 / Spring Boot**
- **Spring Cloud / Eureka (서비스 디스커버리)**
- **Spring Security + JWT**
- **JPA(Hibernate), MySQL**
- **ElasticSearch**
- **Redis (캐싱/세션)**
- **Docker, Docker Compose**
- **Swagger (OpenAPI)**

---

## 폴더 구조

```
mingle-board/
 ├── api-gateway/
 ├── user-service/
 ├── post-service/
 ├── comment-service/
 ├── category-service/
 ├── report-service/
 ├── search-service/
 └── common-lib/   # 공통 DTO, 유틸리티
```

---

## 개발 및 실행 방법

1. **환경 구성**
   - Java 17, Docker, MySQL, ElasticSearch

2. **프로젝트 빌드**
   ```
   mvn clean package
   ```

3. **통합 실행 (Docker Compose)**
   ```
   docker-compose up --build
   ```

4. **API 문서 확인**
   - http://localhost:{포트}/swagger-ui/index.html

---

## 기여 방법

1. 이슈 및 PR 등록
2. 브랜치 네이밍: `feature/{기능명}`, `fix/{버그명}` 등
3. 코드 리뷰 및 승인 후 병합

---


## 임시 계획
추후 변경 예정

- 기능 추가 및 기존 기능 향상
- 코드 구조 개선 및 가독성 향상
