import random
import sys
from PyQt5 import  uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5.Qt import QMessageBox

from_class = uic.loadUiType("myqt09.ui")[0]

class MainClass(QMainWindow, from_class):
    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.leMine.returnPressed.connect(self.myclick) #enter
        self.show()
     
            
    def myclick(self):
        me = self.leMine.text()
        com = ""
        re=""
        
        rnd =  random.random()
        
        
        if rnd > 0.66 : com="가위"
        elif rnd>0.33 : com ="바위"
        else : com ="보"
        
        if me=="가위" and com=="가위" : result="비김"
        if me=="가위" and com=="바위" : result="짐"
        if me=="가위" and com=="보" : result="이김"
        
        if me=="바위" and com=="가위" : result="이김"
        if me=="바위" and com=="바위" : result="비김"
        if me=="바위" and com=="보" : result="짐"
        
        if me=="보" and com=="가위" : result="짐"
        if me=="보" and com=="바위" : result="이김"
        if me=="보" and com=="보" : result="비김"
        
        
        self.leCom.setText(com)
        self.leResult.setText(result)
        
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()