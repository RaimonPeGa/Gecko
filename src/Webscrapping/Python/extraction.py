import csv
from selenium import webdriver

from heroe import heroe


driver = webdriver.Chrome()


driver.get("https://overwatch.blizzard.com/es-es/heroes/")


heroes = driver.find_elements_by_class_name("hero-card")


productos = []


for hero in heroes:
    # Crear un nuevo producto
    heroe = heroes()

    heroe.nombre = hero.find_element_by_class_name("hero-name").text

    heroe.clase = hero.find_element_by_class_name("hero-class").text

    heroe.descripcion = hero.find_element_by_class_name("hero-description").text

    heroe.append(heroe)


with open("heroes.csv", "w") as archivo:
    escritor = csv.writer(archivo)
    escritor.writerow(["Nombre", "Rol", "Descripción"])
    for producto in productos:
        escritor.writerow([heroe.nombre, heroe.rol, heroe.descripcion])

driver.close()


