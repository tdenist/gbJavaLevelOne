public class HomeWorkApp {

    public static void main(String[] args) {

        Employee[] arrayEmployee = new Employee[5];
        arrayEmployee[0] = new Employee("Сидоров Роман Сергеевич",
                "начальник отдела",
                "SidorovRS@gmail.com",
                "89104567826",
                120000,
                55);
        arrayEmployee[1] = new Employee("Петров Олег Михайлович",
                "старший программист",
                "PetrovOM@gmail.com",
                "89107536521",
                100000,
                41);
        arrayEmployee[2] = new Employee("Лебедева Галина Сергеевна",
                "программист",
                "LebedevaGS@gmail.com",
                "89106549852",
                80000,
                33);
        arrayEmployee[3] = new Employee("Осипов Александр Евгеньевич",
                "старший тестировщик",
                "OsipovAE@gmail.com",
                "89106354985",
                80000,
                32);
        arrayEmployee[4] = new Employee("Торопова Любовь Михайловна",
                "тестировщик",
                "ToropovaLMS@gmail.com",
                "89105586621",
                60000,
                25);

        for (int i = 0; i < arrayEmployee.length; i++){

            if(arrayEmployee[i].age > 40){
                arrayEmployee[i].getEmployeeInfo();
                System.out.println();
            }
        }
    }
}
