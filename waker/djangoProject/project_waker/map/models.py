from django.db import models

# Create your models here.
class naviWhereDB(models.Model):
    name = models.CharField(max_length=50, null=False)
    x = models.CharField(max_length=50, null=False)
    y = models.CharField(max_length=50, null=False)

    def dic(self):
        fields = ['name', 'x', 'y']
        result = {}
        for field in fields:
            result[field] = self.__dict__[field]
        return result
