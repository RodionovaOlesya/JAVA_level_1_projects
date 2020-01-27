package ru.geekbrains.java.Dossier;

public class Main {

	public static void main(String[] args) {
		Staff [] staff = new Staff [5];
		staff[0] = new Staff("Иванов Иван Иванович", "повар", "ivanov@gmail.com", "+79161234567", 60000, 45);
		staff[1] = new Staff("Петров Петр Петрович", "водитель", "petrov@gmail.com", "+79162345678", 45000, 35);
		staff[2] = new Staff("Сидорова Иссидора Сидоровна", "посудомойка", "sidorova@gmail.com", "+79163475689", 30000, 55);
		staff[3] = new Staff("Андреев Андрей Андреевич", "официант", "andreev@gmail.com", "+79165678912", 37000, 22);
		staff[4] = new Staff("Серегина Светлана Сергеевна", "сомилье", "segerina@gmail.com", "+79163475690", 40000, 41);

		System.out.println("Сотрудник 1: " + staff[0].name + " Должность: " + staff[0].position + " Возраст: " + staff[0].age + " Оклад: " + staff[0].salary);
		System.out.println("Сотрудник 2: " + staff[1].name + " Должность: " + staff[1].position + " Возраст: " + staff[1].age + " Оклад: " + staff[1].salary);
		System.out.println("Сотрудник 3: " + staff[2].name + " Должность: " + staff[2].position + " Возраст: " + staff[2].age + " Оклад: " + staff[2].salary);
		System.out.println("Сотрудник 4: " + staff[3].name + " Должность: " + staff[3].position + " Возраст: " + staff[3].age + " Оклад: " + staff[3].salary);
		System.out.println("Сотрудник 5: " + staff[4].name + " Должность: " + staff[4].position + " Возраст: " + staff[4].age + " Оклад: " + staff[4].salary);

		System.out.println("Сотрудники старше 40 лет: ");
		for (int i = 0; i < staff.length; i++) {
			if (staff[i].age > 40) {
				System.out.println(String.format("%s, %s, %s, %s", staff[i].name, staff[i].position, staff[i].email, staff[i].telNum));
			}
		}
	}

		//String[] staffArray = new String[5];
			//staffArray[0] = staff1;
				//System.out.println("Список: " + Arrays.toString(staffArray));
}

