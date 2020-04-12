# 안면 인식을 이용한 출결 확인 시스템 

* 팀명 : 
 
    모두의 e조교
* 제품/서비스명(브랜드) :

    출결 알림e

## 문제 제기 
<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/nowproblem.jpg" width="400" height="300"></p>

* 현재 많은 대학에서 사용하는 학생증을 이용한 출결관리는 학생들의 지지를 받지 못함 

* 현행 출결시스템을 악용하여 편법 및 불법을 저지르는 인원 多

* 현행 출석시스템 유지에 많은 cost 발생 

## 제품 설명
* 안면 인식 시스템을 이용한 출결 확인 어플리케이션

* 개개인의 얼굴 스캔 후 식별 방식이 아닌 한 번에 다수의 인원 식별 

* 로그인 한 인원의 직급에 따른 서비스 제공
    - 교수, 조교 : 강의 중인 학생 명단 열람 및 출결 확인
    - 학생 : 출결을 위한 얼굴 데이터 저장 및 수강 중인 과목에 대한 출결 현황 확인

## 개발 방법 
1. 출결 관리 대상자의 얼굴 데이터 저장

2. 수집된 데이터들을 머신 러닝 방식을 통한 분석

3. 분석한 데이터를 바탕으로 출석한 사람 식별 후 출석/미출석 여부 테이터 저장  

4. 출석 여부 대상자들에게 알리는 시스템 구현 

## 개발 환경  
* Amazon EC2

    -24시간 구동되는 서버 개설
* Django 

    -python 언어를 이용한 웹 서버 개설

* PyCharm 

    -python 기반의 프로그래밍

* OpenCV

    -파이썬에서 지원하는 이미지 프로세싱에 중점을 둔 라이브러리

* Android Studio

    -안드로이드용 어플리케이션 개발 
* Discord

    -개발자 회의 실시 

## 시스템 구성도
<p align="center"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/system.jpg" width="400" height="300"></p>

## 기대 성과
* 신속, 정확한 출결 

* 대리 출석 등 출석에 대한 편법 행위 방지

* 하드웨어 사용보다 편리한 유지 및 보수 
## Developers
* 김성희 

<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/kim_sung_hee.jpg" width="400" height="300"></p>

-서버 및 데이터 관리(commiter)

* 김준석
<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/kim_jun_seok.jpg" width="400" height="300"></p>
-어플리케이션 개발

* 홍석윤
<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/hong_seok_yoon.jpg" width="400" height="300"></p>
-머신러닝 

## 개발 일정(milestone)

1. 데이터베이스 서버 구축 및 실험 데이터 수집, 어플리케이션 디자인 (~2020/05/03)

2. 기계학습 모델 구현(~2020/05/13) 

3. 학습된 자료를 통한 1차 테스트 및 점검(어플리케이션 X)(~2020/05/16) 

4. 어플리케이션에 데이터 이식 및 완성(~2020/05/26)

5. 어플리케이션을 통한 2차 테스트 및 점검(~2020/05/31)

6. Closed Beta Test(~2020/06/07)





