from django.urls import path
from . import views

app_name='sleep'
urlpatterns = [
    path('<str:device_id>', views.sleep, name='sleep'),
    path('isSleep/<str:user>', views.isSleep, name='isSleep'),
    path('reset/<str:user>', views.reset, name='reset'),
]
