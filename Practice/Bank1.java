enum Designation{
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THRUSDAY(4),FRIDAY(5),SATURDAY(6);

    private int value;
    Designation(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

class Bank1{
    public static void main(String[] args) {
        for(Designation d : Designation.values())
            System.out.println(d.getValue());
    }
}