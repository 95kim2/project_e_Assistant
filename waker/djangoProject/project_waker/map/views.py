from django.shortcuts import render
from django.http.response import HttpResponse
from .models import naviWhereDB
# Create your views here.
def map(request):
    data = {}
    if request.method == 'GET':
        data['error'] = ''
        return render(request, 'map.html')
    elif request.method == 'POST':
        destination = request.POST.get('where')
        if naviWhereDB.objects.filter(name=destination):
            entries = naviWhereDB.objects.get(name=destination)
            data['name'] = entries.name;
            data['x'] = entries.x;
            data['y'] = entries.y;
            return render(request, 'map2.html', data)
        else:
            data['error'] = 'wrong destination'
            return render(request, 'map.html', data)
