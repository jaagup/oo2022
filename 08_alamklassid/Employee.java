public class Employee extends Staff{
    Person person;
    Integer dataAccess;
    Integer roomAccess;
    Integer breakRoomAccessTimes = 0;

    public Employee(Person person, Integer dataAccess, Integer roomAccess) {
        this.person = person;
        this.dataAccess = dataAccess;
        this.roomAccess = roomAccess;
    }
    public void breakRoomAccessTimes(){
        breakRoomAccessTimes += 1;
    }
}
