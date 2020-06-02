@contestTest
  Feature: ContestTest
    Scenario: Test
      Then Click "Войти" button
      Then input Login
      Then input Password
      When Click login
      Then Tittle content "Рабочий кабинет" is visible
      Then Click "План график" text
      Then