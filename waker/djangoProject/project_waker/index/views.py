from django.shortcuts import render
from .models import ImageForModeling
# Create your views here.
def index(request):
    if request.method == "GET":
        if request.session.get('key')=='waker':
            return render(request, 'index.html')

        return render(request, 'key.html')


    elif request.method == "POST":
        #로그인 했을 때
        if request.session.get('key')=='waker':
            #이미지 업로드 요청 들어왔을 때
            if request.POST.get('where'):
                where = request.POST.get('where')
                image = request.FILES.getlist("image[]")
                for img in image:
                    path = 'dataset/self/' + where
                    ImageForModeling(image = img, path = path).save()
                return render(request, 'upload.html')

            #이미지 업로드, 삭제 중 하나의 옵션 선택했을 때
            if request.POST.get('btn')=='upload':
                return render(request, 'upload.html')
            elif request.POST.get('btn')=='delete':
                return render(request, 'delete.html')

            #이미지 삭제요청
            # if ~~~~:
            # deleteImage(requst, name)
            # return render(reqeust, 'delete.html')
            #이미지 수정요청
            # if ~~~~:
            # updateImage(request, name, rename)
            # return render(reqeust, 'delete.html')

            #로그인 후 첫 화면 (아직 업로드, 삭제 옵션 미선택했을 때)
            return render(request, 'index.html')

        #로그인 하지 않았을 때
        key = request.POST.get('key')

        data = {}
        if not key:
            data['error']="key를 입력해주세요."
        else:
            if key == 'waker':
                request.session['key']='waker'
            else:
                data['error']="key가 다릅니다."

        return render(request, 'key.html', data)

#
#def deleteImage(request, name):
#

#
#def updateImage(request, name, rename):
#
