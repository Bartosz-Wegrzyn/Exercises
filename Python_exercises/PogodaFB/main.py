import facebook
import pyowm

token = 'EAAErk3lKgk8BAEeOZC4XB0Dn2Blqn8WlwtNiZCuvWm3XerEJC59ZCZBma31oHOJglzolwlnySYdWEzXrYByvk3IiWxRZAqoqeqQRyUtvWBiKR6vpfacCbTqxHQg2X1OhBNTId8uj72pKb3PO8cFZCRvQqmQlTJzfJv3pzZCJJKQbli4VZA2Pa4dnQ0fo1CUmfU32K3txgxBKvZB2StFDUPmwryAZCVq3wJHpOTpbJ3luWxeQZDZD'
fb = facebook.GraphAPI(access_token=token)
owm = pyowm.OWM("673f06fc0fe79af7f341e7df271f1c39")
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
