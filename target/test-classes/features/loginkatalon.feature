Feature:Funcionalidad Concertar una cita Katalon
  Rule:Yo como usuario quiero concertar una cita en katalon
  de manera exitosa

    Background: Ingresar a la web
      Given que el usuario ingresa a la web Cura Healthcare
      And presiona el boton para concretar una cita



    Scenario Outline:Validar que se concerta la cita
      When ingresa el usuario <user>
      And ingresa el password <password>
      And presiona el boton login para concertar datos
      And seleccionar una instalacion <facility>
      And marcar para la readmisnion
      And seleccionar un programa <Program>
      And seleccionar una fecha <Visit>
      And ingresa un comentario <comment>
      And confirma la reserva
      Then validar que los datos sean ingresados correctamente <facility>,<Program> ,<Visit> y <comment>
      Examples:
        | user     | password           | facility                        | Program  | Visit      | comment       |
        | John Doe | ThisIsNotAPassword | Hongkong CURA Healthcare Center | Medicaid | 10/02/2023 | QA Automation |



