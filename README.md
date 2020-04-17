# HotelProyectIS
## Sistemas para Hotel

#### Descripción 

Es un sistema web para un hotel

#### Funciones

- [ ] Reservación 
- [ ] Editar Reservación
- [ ] Cancelar Reservación
- [ ] Mostrar Reservación
- [ ] Registrar Cliente
- [ ] Editar Cliente
- [ ] Eliminar Cliente 
- [ ] Agregar Habitación
- [ ] Eliminar Habitación
- [ ] Disponibilidad   

#### Diagrama de clases

**Reservación**

| Atributo       | Tipo   | Formato    |
| :------------- | ------ | ---------- |
| idReservacion  | Int    |            |
| fechaLlegada   | Date   | 2020-03-14 |
| fechaSalida    | Date   | 2020-03-14 |
| NumAdultos     | Int    |            |
| NumNinos       | Int    |            |
| tipoHabitacion | String |            |
| precio         | double |            |
| idCliente      | Int    |            |

**Cliente**

| Atributo  | Tipo   |
| --------- | ------ |
| idCliente | Int    |
| nombre    | String |
| apellido  | String |
| telefono  | Int    |
| corrreo   | String |
| tipoPago  | String |

**Habitación**

| Atributo         | Tipo   |
| ---------------- | ------ |
| NumeroHabitacion | Int    |
| Piso             | String |
| NumPersonas      | Int    |
| TipoHabitacion   | String |

