import pyowm


owm = pyowm.OWM("673f06fc0fe79af7f341e7df271f1c39")
city = owm.weather_manager().weather_at_place("Wroclaw,pl")
print(city.weather.temperature(unit="celsius"))