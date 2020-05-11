# 카메라 센서를 이용한 졸음방지 시스템

=======
## 팀 소개
---------
- 팀명: 졸음낚시
- 서비스명: 웨이커

## Developers
* 김성희 

<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/kim_sung_hee.jpg" width="120" height="100"></p>

-서버 및 센서 데이터 관리(commiter)

* 김준석
<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/kim_jun_seok.jpg" width="120" height="100"></p>

-어플리케이션 개발

* 홍석윤
<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/hong_seok_yoon.jpg" width="120" height="100"></p>

-머신러닝 기술 개발(팀장) 

## 제품 설명
 ---------

- 졸음운전을 방지하여 운전자를 깨워주는 시스템.

- 졸음에 가까움 행위를 분석하여 해당 행위를 할 경우 휴대폰을 통해 알람을 울려 잠을 깨운 뒤 가까운 졸음쉼터를 찾아준다.

## 시스템 구성 다이어그램

<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/system diagram.png" width="680" height="400"></p>

### 개발 방법

- 졸음에 대한 판단재료 분석  

- 해당 현상과 평소에 대한 화상 데이터 수집 후 비교 딥러닝 훈련

- 운전자를 실시간으로 감시하며 졸음과 비슷한 행위가 감지될 시 알림

## 서버
 ---------
 - Amazon EC2
   * 프로젝트가 돌아갈 가상 컴퓨팅 환경. 
   * 개인 키페어를 사용자가 보관하여 로그인 정보를 보호하며 보안 그룹을 사용해 연결 가능한 프로토콜, 포트, IP의 범위를 쉡게 설정 가능.
 - Ubuntu Linux
   * Amazon EC2 에서 실행하는 운영체제
 - Django
   * 센서로부터 데이터를 받아서 학습된 모델로 전달하며 애플리케이션에 졸음 여부를 전달.
   * DB의 테이블을 객체와 연결해 쿼리없이 다룰 수 있음. (ORM(object-relational mapping)방식)
 - MariaDB
   * MySQL기반 오픈소스 DB이며 라이센스가 자유로움.
   * MySQL보다 가벼우며 완벽 호환.

### Django 구조 - MVT

 - Model: DB와 연결되는 부분
 - View: 컨트롤하는 부분
 - Template : 사용자에게 보여지는 부분

### 구현기술

* 회원가입
    - url주소 입력(app) -> View에서 Model을 거쳐 DB에 저장.

* 로그인
    - url주소 입력(app) -> View는 Model로부터 회원정보 불러와서 비밀번호 일치 여부확인 하고 client에 response

* 졸음 판별
    - url주소 입력(sensor) -> View는 모델 실행 후 졸음 여부 판단 후 졸았다면 졸았다는 정보 갱신.
    - url주소 입력(app) -> View를 거쳐서 갱신된 정보를 response.

## 센서
 ---------
<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/sensor.jpg" width="200" height="200"></p>
 - ESP32 CAM
   * 사진을 찍고 저장할 수 있는 모듈. 카메라 센서와 마이크로 sd카드를 장착함으로서 사용할 수 있다.
 - OV2640 카메라모듈
   * ESP32 CAM에 실제로 장착하여 사용하는 카메라 센서.
 - 스마트폰 내장 GPS 센서

 - Arduino sketch
   * 아두이노 개발 IDE로서 편집기, 컴파일러, 업로더 등이 합쳐진 소프트웨어 환경

### 구현기술

* 실시간 영상 전송
    - 카메라 센서를 통한 운전자의 사진(특히 눈)을 서버로 전송

## 기계 학습
---------
* Anaconda
    - scientific computing을 위한 data-science package들을 모아 놓은 파이선과 R 프로그램 언어를 위한 open-source distrivution.
    가상 환경을 제공하기 때문에 프로젝트 별로 알맞은 개발환경을 구성.

* Jupyter notebook
    - 코드를 block 단위로 끊어서 실행 가능하며 데이터 출력시 보기 좋게 가공.

* OpenCV
    - real time computer vision을 위한 프로그래밍 함수 라이브러리.

### 구현 기술

* 눈 깜박임 감지(Blink Detector)
    - 사진에서 눈을 뜬 상태인지 감은 상태인지 판별.

* 눈 깜박임 빈도 측정
    - Blink Detector를 사용하여 눈이 깜박이는 주기를 측정하고 주기가 일정 시간 이상 길어지면 졸음이라 판단.

* 눈 감김 정도 측정
    - Blink Detector를 사용하여 오랫동안 눈을 작게 뜨고 있을 때 졸음이라 판단.

## 어플리케이션
 ---------
 - Android Studio
   * 안드로이드용 어플리케이션을 제작하는데에 사용되는 개발 IDE

 - 카카오 네비게이션 api
   * 차량 위치 및 근처 휴게소, 졸음쉼터 등을 확인할 네이게이션 API

### 구현기술

* 네비게이션
    - 카카오 네비게이션 api를 사용하여 운전자의 차량 현위치를 확인 및 표시 

* 졸음 알림
    - 서버로부터 졸음 판별을 하였을 때 운전자가 졸았는지를 확인 후 졸았을 시에 이를 알려줄 수 있는 환경 개발
    
* 휴게소 서비스
    - 운전자가 졸았을시 근처의 휴게소를 자동 탐색 후 이를 알려주는 서비스 구현
