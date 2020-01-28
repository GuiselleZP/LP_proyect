# Caso 1-C Otra Solución
'''
pool id_public("Publicación de artículos"):
	gate id_and("perra", and)

	event_start() ->() task id_y("Revisar Artículos") ->()
	gate id_z("¿Artículo OK?"):
		->("Correciones") task id_correct("Realizar correcciones") ->(, id_y)
		->("Aprobado")
		gate id_approved(, or, id_and):
			->("Siempre") task id_article("Redactar el arículo")
			->("Con ilustración") task id_desing("Realizar diseño")
			id_and ->() task id_graphic("Realizar diagramación") 
				->() event_end()
		->("Rechazado") event_end()
'''
