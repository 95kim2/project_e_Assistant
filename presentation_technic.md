 # 서버
 -------
 - Amazon EC2
   * 프로젝트가 돌아갈 가상 컴퓨팅 환경이다. 
   * 개인 키페어를 사용자가 보관하여 로그인 정보를 보호하며 보안 그룹을 사용해 연결 가능한 프로토콜, 포트, IP의 범위를 쉡게 설정 가능하다.
 - Django
   * 센서로부터 데이터를 받아서 학습된 모델로 전달하며 애플리케이션에 졸음 여부를 전달한다.
   * DB의 테이블을 객체와 연결해 쿼리없이 다룰 수 있다. (ORM(object-relational mapping)방식)
 - MariaDB
   * MySQL기반 오픈소스 DB이며 라이센스가 자유롭다.
   * MySQL보다 가벼우며 완벽 호환이 된다.


#### Django 구조 - MVT

- Model: DB와 연결되는 부분
 - View: 컨트롤하는 부분
 - Template : 사용자에게 보여지는 부분
 

#### 동작원리

1. 회원가입
- url주소 입력(app) -> View에서 Model을 거쳐 DB에 저장.

2. 로그인
- url주소 입력(app) -> View는 Model로부터 회원정보 불러와서 비밀번호 일치 여부확인 하고 client에 response

3. 졸음 판별
- url주소 입력(sensor) -> View는 모델 실행 후 졸음 여부 판단 후 졸았다면 졸았다는 정보 갱신.
- url주소 입력(app) -> View를 거쳐서 갱신된 정보를 response.
