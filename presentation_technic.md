# 카메라 센서를 이용한 졸음방지 시스템

* 팀명 : 
 
    졸음낚시
* 제품/서비스명(브랜드) :

    웨이커
## Developers
* 김성희 

<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/kim_sung_hee.jpg" width="300" height="225"></p>

-서버 및 데이터 관리(commiter)

* 김준석
<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/kim_jun_seok.jpg" width="300" height="225"></p>

-어플리케이션 개발

* 홍석윤
<p align="left"><img src="https://github.com/95kim2/project_e_Assistant/blob/master/image/hong_seok_yoon.jpg" width="300" height="225"></p>

-머신러닝(팀장) 

## 기계 학습
* Anaconda

    - scientific computing을 위한 data-science package들을 모아 놓은 파이선과 R 프로그램 언어를 위한 open-source distrivution.
    가상 환경을 제공하기 때문에 프로젝트 별로 알맞은 개발환경을 구성할 수 있다.

* Jupyter notebook

    - 코드를 block 단위로 끊어서 실행 가능하며 데이터 출력시 보기 좋게 가공해준다.

* OpenCV

    - real time computer vision을 위한 프로그래밍 함수 라이브러리.

##구현 기술

*눈 깜박임 감지(Blink Detector)

    - 사진에서 눈을 뜬 상태인지 감은 상태인지 판별한다.

*눈 깜박임 빈도 측정

    - Blink Detector를 사용하여 눈이 깜박이는 주기를 측정하고 주기가 일정 시간 이상 길어지면 졸음이라 판단한다.

*눈 감김 정도 측정

    - Blink Detector를 사용하여 오랫동안 눈을 작게 뜨고 있을 때 졸음이라 판단한다.