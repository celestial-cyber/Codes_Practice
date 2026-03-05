//problem - smart elevator simulator - multi storey building

//1. elevator starts at ground floor 0 processes a sequence of floor reuests enteretd by the user 
// task is to simulate the movement of the elevator floor to floor by follwing rules 
// 1. the building as floors numbered from 0 to maxFloor (inclusive)
//2.the elevator always starst at floor 0
//3.the user provides multiple floor requests 
//4. any requested floor -less than 0 or - greater than maxFloor must e rejected and skipped 
//5. the elevator must move ne floor at a time 
//move up if the target floor is higher 
//move down if the target floor is lower 

//6. while moving the elevator must print the current floor at each stop 
//7. when the elevator reaches a requested floor , it must:
//------------>stop 
//-------------print a stopping message 
//8. if the elevator is already on the reuqested floor print a message indicating this 

//after all valid requests are processed the elevator must stop 
//input -> an int maxFloor - max floor of the building 
// an integrer N = no of floor requested (each representing a requested floor)
// output -> print message indicating - invalid floor requests, elevator direction (up or down) 
//current floor during enviironment, stopping at a floor, print a final message where no more requests remain 

//constraints - 1<= maxFloor<=100, 1<=N<=20 , floor number can be any integer =ve or -ve 

// 10 4 5 2 12 -1 
//floor 12 is invalid skipped 
//floor -1 is invalid skipped
//elevatr starting at 0
//going up 
//current floor =1 
//current floor = 2
// stopping at floor 2 
//going up
//current floor 3 
//current floor 4
//current floor 5 

//stopping at floor 5 
//no more request elevator should be stopped

import java.util.*;

class Program1 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int maxFloor = in.nextInt();
        int N = in.nextInt();

        int request[] = new int[N];

        // take input
        for (int i = 0; i < N; i++) {
            request[i] = in.nextInt();
        }

        int currentFloor = 0;
        System.out.println("Elevator starting at floor 0");

        for (int i = 0; i < N; i++) {

            int target = request[i];

            // invalid floor
            if (target < 0 || target > maxFloor) {
                System.out.println("Floor " + target + " is invalid. Skipped.");
                continue;
            
            // already there
            if (currentFloor == target) {
                System.out.println("Already on floor " + target);
                continue;
            }

            // moving UP
            if (target > currentFloor) {
                System.out.println("Going Up");
                while (currentFloor < target) {
                    currentFloor++;
                    System.out.println("Current Floor = " + currentFloor);
                }
            }

            // moving DOWN
            else {
                System.out.println("Going Down");
                while (currentFloor > target) {
                    currentFloor--;
                    System.out.println("Current Floor = " + currentFloor);
                }
            }

            System.out.println("Stopping at floor " + currentFloor);
        }

        System.out.println("No more requests. Elevator stopped.");
    }
}