# Ejemplo 1 - diagrama_1.png
[Link del ejemplo](https://drive.google.com/drive/folders/1qJ6oZafDHtiSlfTDWPh6AIaQrvaIWhgl?usp=sharing)

```
t_pool = "Requerimiento Organismo de control"
pool (t_pool):
	
	t_director = "Director"
	t_user = "Usuario Responsable"
	t_submit_info = "Ingresar Información Requerimiento"
	t_answer = "Responder Requerimiento"
	t_check = "Revisar y Completar Respuesta"
	t_correct = "¿Respuesta correcta?"
	t_send = "Enviar Respuesta"

	line user(t_user):
		task answer
	@ line director(t_director)

	start -> task(t_submit_info) -> task answer(t_answer)-> task(t_check)\
	-> get(t_correct, exclusion,):
		->("Sí") task(t_send) -> event_end
		->("No", tk.answer) 
```

Diagrama que se busca programar:

![Diagrama 1](./images/img_00.png){width=70%}\
