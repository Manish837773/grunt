import java.util.Arrays;

class VarArgs{
    public void displayList(int... list){
        for(int i : list)
            System.out.print(i + " ");
        System.out.println();
    }

    public void maxOfList(int... list){
        System.out.println(list[list.length-1]);
    }

    public int[] sortArray(int... list){
        Arrays.sort(list);
        System.out.println("Sorted LIST : ");
        for(int i : list)
            System.out.print(i + " ");
        System.out.println("");
        return list;
    }

    public void avarageList(int... list){
        int sum = 0;
        for(int i : list)
            sum += i;
        System.out.println("Avarge is "+(sum/list.length));
    }


    public static void main(String[] args) {
        VarArgs v = new VarArgs();
        v.displayList(1,2,3,4,5);
        v.avarageList(1,2,3,4,5);
        v.maxOfList(1,2,3,4,5);
        v.sortArray(1,2,3,4,5,0);
    }
}