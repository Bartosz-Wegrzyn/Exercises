from mnist import MNIST

mndata = MNIST('scr')

images, labels = mndata.load_training()
# images, labels = mndata.load_testing()
print(mndata.display(images[1]))