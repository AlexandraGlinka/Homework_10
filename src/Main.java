public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        System.out.println("Задача 1");
//        Напишите четыре строки:
//        С именем firstName — для хранения имени.
//                С именем middleName — для хранения отчества.
//                С именем lastName — для хранения фамилии.
//                С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//                Выведите в консоль фразу: «ФИО сотрудника — …».
//        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
}