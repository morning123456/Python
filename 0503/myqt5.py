
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
        txt+="{}*{}={}\n".format(aa,1,1*aa)
        txt+="{}*{}={}\n".format(aa,2,2*aa)
        txt+="{}*{}={}\n".format(aa,3,3*aa)
        txt+="{}*{}={}\n".format(aa,4,4*aa)
        txt+="{}*{}={}\n".format(aa,5,5*aa)
        txt+="{}*{}={}\n".format(aa,6,6*aa)
        txt+="{}*{}={}\n".format(aa,7,7*aa)
        txt+="{}*{}={}\n".format(aa,8,8*aa)
        txt+="{}*{}={}\n".format(aa,9,9*aa)
        
        self.te_2.setText(txt)
        
if __name__ == "__main__" :
    app = QApplication(sys.argv)
    window = MainClass()
    app.exec_()