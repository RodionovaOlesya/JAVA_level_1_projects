package ru.geekbrains.java.Dossier;

public class Main {

	public static void main(String[] args) {
		Staff staff1 = new Staff("Иванов Иван Иванович", "повар", "ivanov@gmail.com", "+79161234567", 60000, 45);
		Staff staff2 = new Staff("Петров Петр Петрович", "водитель", "petrov@gmail.com", "+79162345678", 45000, 35);
		Staff staff3 = new Staff("Сидорова Иссидора Сидоровна", "посудомойка", "sidorova@gmail.com", "+79163475689", 30000, 55);
		Staff staff4 = new Staff("Андреев Андрей Андреевич", "официант", "andreev@gmail.com", "+79165678912", 37000, 22);
		Staff staff5 = new Staff("Серегина Светлана Сергеевна", "сомилье", "segerina@gmail.com", "+79163475690", 40000, 41);

		System.out.println("Сотрудник 1: " + staff1.name + " Должность: " + staff1.position + " Возраст: " + staff1.age + " Оклад: " + staff1.salary);
		System.out.println("Сотрудник 2: " + staff2.name + " Должность: " + staff2.position + " Возраст: " + staff2.age + " Оклад: " + staff2.salary);
		System.out.println("Сотрудник 3: " + staff3.name + " Должность: " + staff3.position + " Возраст: " + staff3.age + " Оклад: " + staff3.salary);
		System.out.println("Сотрудник 4: " + staff4.name + " Должность: " + staff4.position + " Возраст: " + staff4.age + " Оклад: " + staff4.salary);
		System.out.println("Сотрудник 5: " + staff5.name + " Должность: " + staff5.position + " Возраст: " + staff5.age + " Оклад: " + staff5.salary);

		//String[] staffArray = new String[5];
			//staffArray[0] = staff1;
				//System.out.println("Список: " + Arrays.toString(staffArray));
	}
 }
