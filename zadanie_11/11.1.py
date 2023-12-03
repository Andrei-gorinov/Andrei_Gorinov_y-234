
def get_repo_info():
    repo_name = entry.get()
    api_url = f"https://habr.com/ru/post/453444/{repo_name}"

    response = requests.get(api_url)
    if response.status_code == 200:
        data = {
            'company': None,
            'created_at': None,
            'email': None,
            'id': None,
            'name': None,
            'url': None
        }

        json_data = response.json()
        data['company'] = json_data['owner'].get('company')
        data['created_at'] = json_data.get('created_at')
        data['email'] = json_data['owner'].get('email')
        data['id'] = json_data['owner'].get('id')
        data['name'] = json_data['name']
        data['url'] = json_data['owner'].get('url')

        with open('repo_info.json', 'w') as file:
            json.dump(data, file)
        
        label.config(text="Информация сохранена в файле repo_info.json")
    else:
        label.config(text="Ошибка при получении информации о репозитории")

# Создаем графический интерфейс с помощью tkinter
    window = Tk()
    window.title("Получение информации о репозитории")
    window.geometry("400x150")

    label = Label(window, text="Введите имя репозитория:")
    label.pack()

    entry = Entry(window)
    entry.pack()

    button = Button(window, text="Получить информацию", command=get_repo_info)
    button.pack()

    window.mainloop()
