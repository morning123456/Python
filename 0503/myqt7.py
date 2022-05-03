import random
import sys
from PyQt5 import  uic
from PyQt5.QtWidgets import QApplication, QMainWindow

from_class = uic.loadUiType("myqt07.ui")[0]

class MainClass(QMainWindow, from_class):
    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show()
        
    def myclick(self):
        
       first = self.le_first.text()
       last = self.le_last.text()
       
       ifirst = int(first)
       ilast = int(last)
       
       txt =""
       for i in range(ifirst,ilast+1):
           txt +=self.drawStar(i)
       
       self.te.setText(txt)
        
    def drawStar(self,cnt):
        ret = ""
        for i in range(cnt):
            ret +="*"
        ret +="\n" 
        return ret  
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()