import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // เพิ่มผู้ป่วย P001 - P005
        queue.offer("P001");
        queue.offer("P002");
        queue.offer("P003");
        queue.offer("P004");
        queue.offer("P005");

        // เรียกผู้ป่วยออก 2 คน
        System.out.println("Patients served:");

        if (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        if (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        // เพิ่มผู้ป่วยใหม่
        queue.offer("P006");
        queue.offer("P007");

        // ผู้ป่วยคนถัดไป
        System.out.println("\nNext patient: " + queue.peek());

        // จำนวนผู้ป่วยที่รอ
        System.out.println("Waiting patients: " + queue.size());

        // สถานะ Queue
        System.out.println("\nCurrent Queue:");
        System.out.println(queue);

        // อธิบาย FIFO
        System.out.println("\nQueue uses FIFO (First In First Out)");
        System.out.println("The first patient who arrives is served first.");

        // Time Complexity
        System.out.println("\nTime Complexity");
        System.out.println("offer() : O(1)");
        System.out.println("remove() : O(1)");
        System.out.println("peek() : O(1)");
    }
}
