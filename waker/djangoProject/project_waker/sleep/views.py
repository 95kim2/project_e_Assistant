from django.shortcuts import render
from .models import UserDB
from django.http.response import HttpResponse

# Create your views here.
def sleep(request, device_id):
    data = {}
    if UserDB.objects.filter(device_id=device_id):
        user_info = UserDB.objects.get(device_id=device_id)
        user_info.result = 1
        user_info.save()

        return HttpResponse('ok')
    else:
        return HttpResponse('wrong device id')

def isSleep(request, user):
    user_info = UserDB.objects.get(user=user)
    if user_info.result == 1 :
        user_info.result = 0
        user_info.save()
        return HttpResponse('sleep')
    else:
        return HttpResponse('wake')

def reset(request, user):
    if UserDB.objects.filter(user=user):
        user_info = UserDB.objects.get(user=user)
        user_info.result = 0
        user_info.save()
        return HttpResponse('ok')
    else:
        return HttpResponse('wrong user')
