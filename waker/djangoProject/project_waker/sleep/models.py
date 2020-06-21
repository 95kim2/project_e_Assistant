from django.db import models
import os
# Create your models here.

class UserDB(models.Model):
    user = models.CharField(max_length=100, null=False)
    device_id = models.CharField(max_length=100, null=False)
    result = models.IntegerField()
