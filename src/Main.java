public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName= "Ivan" + " ";
        String middleName = "Ivanovich"+ " " ;
        String lastName = "Ivanov"+ " ";
        String fullName = lastName + firstName  + middleName ;
        System.out.println(fullName);
        System.out.println("Задача 2");
        System.out.println(fullName.toUpperCase());
        System.out.println("Задача 3");
        String fulName= "Иванов Семён Семёнович" ;
        fulName= fulName.replace("ё", "е") ;
        System.out.println(fulName);







}
}