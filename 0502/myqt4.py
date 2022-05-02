import random
import sys
from PyQt5 import  uic
from PyQt5.QtWidgets import QApplication, QMainWindow

from_class = uic.loadUiType("myqt04.ui")[0]

class MainClass(QMainWindow, from_class):
    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.show()
        
    def myclick(self):
        a = self.le_mine.text()
        rnd = int(random.random()*2)
          
        if rnd==1 : com="홀"
        else : com="짝"
        
        if a == com : result="이김"
        else : result = "짐"
        
        self.le_com.setText(com)
        self.le_re.setText(result)
        
        
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()