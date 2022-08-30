public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";

        if (fullName.contains("ё")) {
            System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
        }
        else if (fullName.contains("Ё")) {
            System.out.println("Данные ФИО сотрудника — " + fullName.replace("Ё", "Е"));
        }
    }
}