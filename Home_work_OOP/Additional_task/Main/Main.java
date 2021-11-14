package Home_work_OOP.Additional_task.Main;

import Home_work_OOP.Additional_task.Address.Address;

public class Main {

    /*
        Задание
        Используя IDEA, создайте проект c пакетом.
        Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
        street, house, apartment.
        Для каждого поля, создать метод с двумя методами доступа (get, set)
        Создать экземпляр класса Address.
        В поля экземпляра записать информацию о почтовом адресе.
        Выведите на экран значения полей, описывающих адрес.
     */

    /*
     * Ініціалізація захищених полів через сеттери
     */
    public static void setAddressInfo(Address argAddress)
    {
        argAddress.setCountry("Ukraine");
        argAddress.setCity("Kyiv");
        argAddress.setStreet("Shevchenka");
        argAddress.setApartment(4);
        argAddress.setHouse(54);
        argAddress.setIndex(13245);
    }

    /*
     * Зчтування захищених полів через геттери
     */
    public static void printAddressInfo(Address argAddress)
    {
        String formatString = "Країна: %s\nМісто: %s\nВулиця: %s\nДім: %d\nКвартира: %d\nІндекс: %d\n";
        System.out.print(String.format(formatString, argAddress.getCountry(), argAddress.getCity(),
                argAddress.getStreet(), argAddress.getHouse(), argAddress.getApartment(), argAddress.getIndex()));
    }

    public static void main(String[] args) {
        Address someAddress = new Address();

        setAddressInfo(someAddress);            // Заповнення об'єкту інформацією
        printAddressInfo(someAddress);          // Зчитування інформації об'єкту

        /*
            Країна: Ukraine
            Місто: Kyiv
            Вулиця: Shevchenka
            Дім: 54
            Квартира: 4
            Індекс: 13245
         */
    }
}
