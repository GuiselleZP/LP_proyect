# Ejemplo 3

## Diagrama que se busca programar

![Diagrama 3](./images/img_02.png){ width=50% }\

## Código fuente realizado

```
t_pool = "Evalueción de Candidato"

pool(t_pool):
	t_l1 = "Director de Recursos humanos"
	t_l2 = "Área Solicitante"
	t_l3 = "Psicólogo"
	
	t_psy = "Realizar y Caificar Pruebas psicotécnicas"
	t_tec = "Realizar y calificar pruebas técnicas"
	t_continue = "¿Candidato continúa el proceso?"
	t_inter = "Realizar y Caificar Entrevista"
	
	@ line director(t_l1)
	line applicant(t_l2):
		ev.tec, tk.inter_2, gt.continue_2
	line psychologist(t_l3):
		tk.inter_3, ev.end_2

	start str -> task psy(t_psy) -> task inter_1(t_inter) ->
		gate continue_1(t_continue, exclusive):
			->("No") end end_1
			->("Sí") task tec(t_tec) -> task inter_2(t_inter) ->
				gate continue_2(t_continue, exclusive,):
					->("No", ev.end_1)
					->("Sí") task inter_3(t_inter) -> end end_2
```
