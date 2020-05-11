# 카메라 센서를 이용한 졸음방지 시스템

* 팀명 : 
 
    졸음낚시
* 제품/서비스명(브랜드) :

    웨이커

## 문제 제기 
<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/sleep.png" width="400" height="300"></p>

* 졸음운전은 방심, 부주의에 기인할 수도 있지만 피곤에 의한 생리현상인 경우도 있는데  
    심한 경우에는 본인이 졸고 있다는 자각도 없어 도로 위의 시한폭탄이 될 수 있다.

* 부주의 운전에 의한 사고가 졸음운전에 의한 사고보다 횟수는 많지만 사망자 수는 오히려 졸음운전에 의한 사고가 앞선다.  
    이는 졸음운전이 굉장히 치명적인 사고를 유발할 수 있음을 보여준다.

* 한국에는 졸음쉼터 등 지친 운전자들을 위한 장소가 마련되어 있지만 졸음을 인식하지 못한다면 깨닫지 못한 채 큰 사고를 낼 수 있다.

* 졸음을 깨는 껌, 음악 틀어놓기, 창문 열기 등 졸음을 방지하기 위한 여러가지 방법이 있지만
    동승자가 없다면 이후에도 졸음운전이 계속될 수 있다.

## 제품 설명
* 졸음운전을 방지하여 운전자를 깨워주는 시스템.

* 졸음에 가까움 행위를 분석하여 해당 행위를 할 경우 휴대폰을 통해 알람을 울려 잠을 깨운 뒤 가까운 졸음쉼터를 찾아준다.

## 개발 방법 
1. 졸음에 대한 판단재료 분석  

2. 해당 현상과 평소에 대한 화상 데이터 수집 후 비교 딥러닝 훈련

3. 운전자를 실시간으로 감시하며 졸음과 비슷한 행위가 감지될 시 알림

## 개발 환경  
* Amazon EC2

    -24시간 구동되는 서버 개설
    
* Django 

    -python 기반 오픈소스 웹 프레임워크(3-clause BSD License)
    
* MariaDB

    -데이터베이스 오픈소스 라이브러리(GPLv2 License, LGPLv2.1(client libraries))
*Anaconda

    -python 머신러닝 프로그래밍을 위한 IDE

* OpenCV

    -python에서 지원하는 이미지 프로세싱에 중점을 둔 라이브러리(3-clause BSD License)

* Android Studio

    -안드로이드용 어플리케이션 개발 IDE
    
## 시스템 구성도
<p align="center"><img src="https://github.com/95kim2/project_waker/blob/master/image/system.jpg" width="520" height="390"></p>

## 기대 성과
* 운전자의 졸음운전 방지

* 졸음운전으로 인한 사고 시 발생할 수 있는 운전자, 동승자, 및 상대 차량 탑승자와 일반 보행자의 생명 보호

* 운전자를 혼자 보내도 가족들이 안심할 수 있는 환경 구성
## Developers
* 김성희 

<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/kim_sung_hee.jpg" width="300" height="225"></p>

-서버 및 데이터 관리(commiter)

* 김준석
<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/kim_jun_seok.jpg" width="300" height="225"></p>

-어플리케이션 개발

* 홍석윤
<p align="left"><img src="https://github.com/95kim2/project_waker/blob/master/image/hong_seok_yoon.jpg" width="300" height="225"></p>
-머신러닝(팀장) 

## 개발 일정(milestone)

1. 데이터베이스 서버 구축 및 실험 데이터 수집, 어플리케이션 디자인 (~2020/05/03)

2. 기계학습 모델 구현(~2020/05/13) 

3. 학습된 자료를 통한 1차 테스트 및 점검(어플리케이션 X)(~2020/05/16) 

4. 어플리케이션에 데이터 이식 및 완성(~2020/05/26)

5. 어플리케이션을 통한 2차 테스트 및 점검(~2020/05/31)

6. Closed Beta Test(~2020/06/07)





