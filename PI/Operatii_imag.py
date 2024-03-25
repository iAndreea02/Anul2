import cv2
from matplotlib import pyplot as plt

path1 = r'squere.jpg'
path2 = r'logo.jpg'
img1 = cv2.imread(path1)
gri1 = cv2.cvtColor(img1, cv2.COLOR_BGR2GRAY)
(thresh1, im_bw1) = cv2.threshold(gri1, 128, 255, cv2.THRESH_BINARY)
img2 = cv2.imread(path2)
gri2 = cv2.cvtColor(img2, cv2.COLOR_BGR2GRAY)
(thresh1, im_bw2) = cv2.threshold(gri2, 128, 255, cv2.THRESH_BINARY)
reuniune = im_bw1 | im_bw2
intersectie = im_bw1 & im_bw2
complement = ~im_bw1
sauexclusiv = im_bw1 ^ im_bw2
plt.subplot(231), plt.imshow(img1, 'gray'), plt.title('patrat')
plt.subplot(232), plt.imshow(img2, 'gray'), plt.title('cerc')
plt.subplot(233), plt.imshow(reuniune, 'gray'), plt.title('reuniune')
plt.subplot(234), plt.imshow(intersectie, 'gray'), plt.title('intersecție')
plt.subplot(235), plt.imshow(complement, 'gray'), plt.title('complenent')
plt.subplot(236), plt.imshow(sauexclusiv, 'gray'), plt.title('disjuncție exclusivă')
plt.xlim([0, 200]);
plt.show();
cv2.waitKey(1000)
