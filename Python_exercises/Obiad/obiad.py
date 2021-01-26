# 1. Napisz funkcje 3 funckje - zrobZupe(), zrob2Danie(), zrobDeser(). Niech kazda z nich zwraca jakis string jaka to zupa - dowolnie
# 2. Potem napisz funkcje zrobObiad('zupa', '2danie', 'deser') ktora zrobi wszystkie 3 dania (wywola wszystkie funkcje).
# 3. Jesli ktos nie chce jest zupy, moze wywolac zrobObiad('2danie', 'deser'), wtedy zrobZupe nie powinna byc wywolana


# 1
def zrobZupe():
    return "pomidorowa"

def zrob2Danie():
    return "schaboszczak"

def zrobDeser():
    return "ciastko"


# 2
def zrobObiad(*dania):
    obiad = []
    if "zupa" in dania:
        obiad.append(zrobZupe())
    if "2danie" in dania:
        obiad.append(zrob2Danie())
    if "deser" in dania:
        obiad.append(zrobDeser())

    return obiad

# 3
obiad = zrobObiad("2danie", "deser")

# ######
print(obiad)