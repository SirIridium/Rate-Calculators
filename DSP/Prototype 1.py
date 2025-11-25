import math
import numpy as np


#this is a prototype to see if it is useful to specifically dyson sphere program (DSP)
#this prototype will focus on the method, I will probably create objects and java later

#this first part will be helping calculate resource demand so I can optimize production

CargoCarryMax=120 #120/sec

#4 magnets per green
magnetsPerGreen=4

def TargetMinToSecGreen(x):
    greenTarget=x/60
    magnetsNeededPerSec=(greenTarget)*magnetsPerGreen
    return magnetsNeededPerSec
test=TargetMinToSecGreen(4000)
print("\nmagnets per second needed =", test)
print("magnets per minute needed =", test*60,"\n")
print("Iron needed for magnets per second=",test*4)
print("Iron needed for magnets per minute=",test*60,"\n")