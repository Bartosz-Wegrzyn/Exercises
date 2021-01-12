import tkinter as tk
import colors as c

# ####### GUI #########
# class Game(tk.Frame):
#     def __init__(self):
#         tk.Frame.__init__(self)
#         self.grid()
#         self.master.title("Towers_of_Hanoi")
#
#         self.main_grid = tk.Frame(self, bg=c.GRID_COLOR, bd=3, width=600, height=600)
#         self.main_grid.grid(pady=(100, 0))
#         self.mainloop()
#
#     def make_GUI(self):
#         self.cells = []
#         for i in range(2):
#             cell_frame = tk.Frame(self.main_grid, bg=c.EMPTY_CELL_COLOR, wigth=150, height=150)
#             cell_frame.grid(row=0, column=i, padx=5, pady=5)
#
#
# Game()

##### Logic #######


Tower1 = [4, 3, 2, 1, 0]
Tower2 = []
Tower3 = []

# Game loop
while True:
    Tower_number= int(input("skąd pobrać?: "))

    if Tower_number == 1:
        Hand = Tower1.pop()
    elif Tower_number ==2:
        Hand = Tower2.pop()
    elif Tower_number ==3:
        Hand = Tower3.pop()
    else:
        pass


    while True:
        Where_put = int(input("Gdzie postawić?: "))
        if Where_put == 1:
            if Tower1[-1] > Hand or Tower1 == None:
                Tower1.append(Hand)
                break
            else:
                print("Nie możesz tu postawić")
                continue
        elif Where_put == 2:
            if Tower1[-1] > Hand or Tower1 == None:
                Tower2.append(Hand)
                break
            else:
                print("Nie możesz tu postawić")
                continue
        elif Where_put == 3:
            if Tower3[-1] > Hand or Tower3 == []:
                Tower3.append(Hand)
                break
            else:
                print("Nie możesz tu postawić")
                continue





    print(Tower1)
    print(Tower2)
    print(Tower3)

    if Tower3 == [4, 3, 2, 1, 0]: break
    # input("Gdzie położyć?: ")

input("Wygrałeś! ")