from django.db import models
import os
# Create your models here.

def upload_path(instance, filename):
    return "{}/{}".format(instance.path, filename)

class ImageForModeling(models.Model):
    path = models.CharField(max_length=100, null=False)
    image = models.ImageField(upload_to=upload_path, null=False, blank=True)
