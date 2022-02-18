package JDBC_and_Hibernate.JDBC.Task4;

/*
Задание 5
Используя IntelijIdea и JDBC cделайте выборку при помощи JOIN’s для таких заданий:
1) Получите контактные данные сотрудников (номера телефонов, место жительства).
2) Получите информацию о дате рождения всех холостых сотрудников и их номера.
3) Получите информацию обо всех менеджерах компании: дату рождения и номер телефона.
 */

public class Main {
    public static void main(String[] args) {
        DriverLoader.LoadDriver();
        System.out.println("Контактные данные сотрудников (номера телефонов, место жительства)");
        CompleteQueries.printQueryResult("select phone, city from employeeContactInfo " +
                "join employeePresonalInfo on employeeContactInfo.id = employeePresonalInfo.id",
                "phone", "city");

        System.out.println("Информация о дате рождения всех холостых сотрудников и их номера");
        CompleteQueries.printQueryResult("select birthdate, phone from employeeContactInfo " +
                        "join employeePresonalInfo on employeeContactInfo.id = employeePresonalInfo.id " +
                        "where maried = false",
                "birthdate", "phone");

        System.out.println("Информация обо всех менеджерах компании: дата рождения и номер телефона");
        CompleteQueries.printQueryResult("select birthdate, phone from employeeContactInfo " +
                        "join employeePresonalInfo on employeeContactInfo.id = employeePresonalInfo.id " +
                        "join emloyeeProfInfo on emloyeeProfInfo.id = employeePresonalInfo.id " +
                        "where position = 'Менеджер'",
                "birthdate", "phone");
    }
}
