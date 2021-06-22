  Feature: Un usuario quiere aprender a automatizar  en screenplay en un curso de choucair academy

    @scenario1
    Scenario Outline: Buscar un curso para hacer una automatizacion
      Given : Valeria quiere aprender a automatizar en la academia choucair
      When : ella busque el curso  en la plataforma de academia choucair
      |Curso   |
      |<Curso> |
      Then : ella entra al curso Automatizacion de pruebas

    Examples:
      |Curso|
      |Induccion corporativa|

