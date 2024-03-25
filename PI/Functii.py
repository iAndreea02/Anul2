
import cv2
from matplotlib import pyplot as plt

path = "logo.jpg"
img =cv2.imread(path)
gri = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
(thresh1,im_bw1)=cv2.threshold(gri,128,255,cv2.THRESH_BINARY)
plt.subplot(121),plt.imshow(img,'gray')
plt.subplot(122),plt.imshow(im_bw1,'gray')
print('prag',thresh1)
plt.xlim([0,256])
plt.show()
cv2.waitKey(1000)