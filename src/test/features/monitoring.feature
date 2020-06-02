@monitoring

Feature: Monitoring
  Scenario: Test
    Then Click "Войти" button
    Then input Login
    Then input Password
    When Click login
    Then Tittle content "Рабочий кабинет" is visible
    When Click "Организация" text
    When Click "Сотрудники" text
    Then Tittle content "Сотрудники" is visible
    When Click "Реквизиты компании" text
    Then Tittle content "Реквизиты" is visible
    When Click "План график" text
    Then Tittle content "План-график" is visible
    When Click "Аффилированность" text
    Then Tittle content "Аффилированность" is visible
    When Click "Заявки" text
    Then Tittle content "Заявки" is visible
    When Click "Согласование" text
    When Click "Голосование" text
    Then Tittle content "Голосование" is visible
    When Click "Комиссии" text
    Then Tittle content "Комиссии" is visible
    When Click "Договора" text
    Then Tittle content "Договора" is visible
    When Click "Виды закупок" text
    When Click "Тендеры" text
    Then Tittle content "Тендеры" is visible
    When Click "Конкурсы" text
    Then Tittle content "Конкурсы" is visible
