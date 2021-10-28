package sky.pro;


public class Main {

    public static void main(String[] args) {
        // write your code here
        // task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        // task 2
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);
        //task 3
        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела —" + fullName);
        //task 4
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName1);
        //task 5
        String fullName2 = "Ivanov Ivan Ivanovich";
        int value = fullName2.indexOf(' ');
        int value2 = fullName2.lastIndexOf(' ');
        String lastName2 = fullName2.substring(0, value);
        String firstName2 = fullName2.substring(value + 1, value2);
        String middleName2 = fullName2.substring(value2 + 1, fullName2.length());
        System.out.println("Имя сотрудника — " + firstName2);
        System.out.println("Фамилия сотрудника — " + lastName2);
        System.out.println("Отчество сотрудника — " + middleName2);
        //task 6
        String fullName3 = "ivanov ivan ivanovich";
        char[] c = fullName3.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i + 1] = Character.toUpperCase(c[i + 1]);

            }
        }
        String fullName4 = new String(c);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв —   " + fullName4);

    }

}
