public class EighthTask {
    public static void main (String[] args){
        var totalHours = 640.0;
        var personHours = 8;
        var staff = totalHours / personHours;
        System.out.println("Всего работников в компании - " + staff + " человек");
        staff = staff + 94;
        var newHours = totalHours / staff;
        var minutes = ((newHours % 3) * 60);
        System.out.println("Если в компании работает " + staff + " человек, то всего " + newHours + " часов " + minutes + " минут работы может быть поделено между сотрудниками" );

    }
}
