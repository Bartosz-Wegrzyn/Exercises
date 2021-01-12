# i=1
#
# while i < 8:
#     a = input("Calculator: ")   # 1+1, 5**3-(10/4), etc.
#     w = "print(" + a + ")"
#     exec(w)

#
# a = {1 : "jeden",2: "dwa",3: "tri"}
# b= input()
# print(a.get(int(b), 404))
# i += 1

#
# haslo = "dupa"
#
#
# for i in range(8):
#     g = input("Zdaguj! ")
#     if g == haslo:
#         print("Brawo!")
#         exit()
#     i += 1
# print("zjebałeś")


# letter = 3
#
# for letter in "abcdefghijklmnoprstuwzyc":
#     print(letter)

#
# def rise(a, b):
#     return a ** b
#
#
# print(rise(2, 100))
# fala = open("src/eqt-chromo-sc.wav", "r")
#
# fala.playsound()
#
# fala.close()


# import simpleaudio as sa
#
# filename = 'src/eqt-chromo-sc.wav'
# wave_obj = sa.WaveObject.from_wave_file(filename)
# play_obj = wave_obj.play()
# play_obj.wait_done()  # Wait until sound has finished playing

while True:

    file = open("Obrazek.jpg", "r")

    a=input()

    file.write("\n" + a)

    file.close()