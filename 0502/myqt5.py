
import sys
from PyQt5 import  uic
from PyQt5.QtWidgets import QApplication, QMainWindow

from_class = uic.loadUiType("myqt05.ui")[0]

class MainClass(QMainWindow, from_class):
    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show()
        
    def myclick(self):
        a = self.le.text()
      
        aa = int(a)
      
        txt = ""
        for i in range(1,9+1):
            txt += str(aa)+"*"+str(i)+"=" +str(aa*i)+"\n"
        self.te_2.setText(txt)
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()