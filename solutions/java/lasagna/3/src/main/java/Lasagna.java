public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minutesPassed){
        return expectedMinutesInOven() - minutesPassed;
    }
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    public int totalTimeInMinutes(int layers, int minutesPassed){
        int total = expectedMinutesInOven() - remainingMinutesInOven(minutesPassed) + preparationTimeInMinutes(layers); 
        return total;
    }
}