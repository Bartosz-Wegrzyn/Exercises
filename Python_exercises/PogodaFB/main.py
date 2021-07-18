import facebook
import pyowm

token = 'Your Token'
fb = facebook.GraphAPI(access_token=token)
owm = pyowm.OWM("Your Token")
city = owm.weather_manager().weather_at_place("Gdańsk")


def get_temp():
    tem = city.weather.temperature(unit="celsius")
    tem = tem["temp"]
    return tem


def get_dict():
    clo = city.weather("Gdańsk")
    return clo


temp = get_temp()
dic = city.weather.to_dict()
clouds = dic["clouds"]
rain = dic["rain"]
if clouds == "{}":
    clouds = 0
print(rain)
if rain == "{}":
    r = "Pada."
else:
    r = "Nie pada."

# rain = is_rain()
# print(rain)

post = f"""
    Temperatura {temp}°C
    Zachmurzenie: {clouds}%
    {r}
    """
print(post)
fb.put_object(parent_object="me", connection_name="feed", message=post)
