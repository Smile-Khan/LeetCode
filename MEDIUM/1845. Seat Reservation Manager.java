QUESTION :-  1845. Seat Reservation Manager {
    

    https://leetcode.com/problems/seat-reservation-manager/description/?envType=daily-question&envId=2023-11-06

import java.util.PriorityQueue;

}

SOLUTION :-

class SeatManager {
    private PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            pq.add(i);
        }
    }

    public int reserve() {
        int seat = pq.poll();
        return seat;
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}


/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
