import random
import sys
from PyQt5 import  uic
from PyQt5.QtWidgets import QApplication, QMainWindow

from_class = uic.loadUiType("myqt6.ui")[0]

class MainClass(QMainWindow, from_class):
    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show()
        
    def myclick(self):
        
        arr45 = list(range(1,45+1))
        for i in range(1000):
            rnd = int(random.random()*45)
            a = arr45[rnd]
            b = arr45[0]
            arr45[0] =a
            arr45[rnd] = b
        
        self.lbl1.setText(str(arr45[0]))
        self.lbl2.setText(str(arr45[1]))
        self.lbl3.setText(str(arr45[2]))
        self.lbl4.setText(str(arr45[3]))
        self.lbl5.setText(str(arr45[4]))
        self.lbl6.setText(str(arr45[5]))
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()