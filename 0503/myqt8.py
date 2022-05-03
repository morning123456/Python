import random
import sys
from PyQt5 import  uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from PyQt5.Qt import QMessageBox

from_class = uic.loadUiType("myqt08.ui")[0]

class MainClass(QMainWindow, from_class):
    def __init__(self):
        QMainWindow.__init__(self)
        self.setupUi(self)
        self.pb1.clicked.connect(self.myclick)
        self.pb2.clicked.connect(self.myclick)
        self.pb3.clicked.connect(self.myclick)
        self.pb4.clicked.connect(self.myclick)
        self.pb5.clicked.connect(self.myclick)
        self.pb6.clicked.connect(self.myclick)
        self.pb7.clicked.connect(self.myclick)
        self.pb8.clicked.connect(self.myclick)
        self.pb9.clicked.connect(self.myclick)
        self.pb10.clicked.connect(self.myclick)
        self.pbCall.clicked.connect(self.mycall)
        self.show()
     
    def mycall(self):
        str_tel = self.le.text()
        QMessageBox.about(self,'calling',str_tel)
        
            
    def myclick(self):
        str_new = self.sender().text()
        str_old = self.le.text()
        self.le.setText(str_old+str_new)
        
        print(str_new,str_new) 
       
    
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()