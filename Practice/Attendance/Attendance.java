package Practice.Attendance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Attendance{
    
   static List<String> members = new ArrayList<String>();
    List<String> participants = new ArrayList<>();
   static List<String> events = new ArrayList<>();

    Attendance(){
        members.add("Manish");
        members.add("Sai Manish S");
        
        System.out.println("Members list as follows");
        for(String member: members) {
        	System.out.println(member);
        }
    }

   public void addEvent(){
        Scanner sc1 = new Scanner(System.in);
        int noOfParticipants = 1;
        String eventName = "";
        while(!eventName.equalsIgnoreCase("NA")) {
        	System.out.println("Please enter the event name to stop adding please enter NA");
            eventName = sc1.next();
            if(eventName != null && !eventName.isBlank() && !eventName.equalsIgnoreCase("NA")) {
            	events.add(eventName);
        		noOfParticipants =  this.addParticipantsForEvent(eventName);
            }
            else {
        	
            }
        }
        sc1.close();
   }

   public int addParticipantsForEvent(String eventName){
        System.out.println("Please add each participant for the event : "+eventName);
        System.out.println("Please type NA to stop adding names");
        Scanner sc = new Scanner(System.in);
        String participant = "";
        int countParticipant = 1;
        while(!"NA".equalsIgnoreCase(participant)){

            System.out.println("You are adding the participant number "+countParticipant);
            participant = sc.nextLine();
            if(!(participant.equals("NA")) && !participant.equals("") && !"NA".equalsIgnoreCase(participant)){

                if(members.contains(participant) && !participants.contains(participant)){

                    participants.add(participant);
                    countParticipant++;

                }
                else{

                    System.out.println(participant + " is not a member or you have already added the participant");

                }
            }
            }
        System.out.println("Number of participants added "+(countParticipant-1));
        displayParticipants(participants, eventName);
        //sc.close();
        return countParticipant-1;
   }


   public void displayParticipants(List<String> participants, String eventName) {
	   System.out.println("Participants added for the event \"" +eventName+ "\" are as shown below");
       for(String name: participants){
           System.out.println(name);            
       }
       System.out.println("For event "+eventName +" total number of participants added "+(participants.size()));
   }
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.addEvent();

        

    }
    
}