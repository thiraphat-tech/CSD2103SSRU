import java.util.Stack;

public class StackCaseStudy {

    public static void main(String[] args) {

        // สร้าง Stack สำหรับเก็บคำสั่ง
        Stack<String> stack = new Stack<>();

        // เพิ่มคำสั่งทั้งหมดลงใน Stack
        stack.push("Type Data");
        stack.push("Type Structure");
        stack.push("Delete Structure");
        stack.push("Type Algorithm");
        stack.push("Type Java");

        // แสดงคำสั่งทั้งหมด
        System.out.println("Current Stack");
        System.out.println(stack);

        // Undo คำสั่งล่าสุด 2 ครั้ง
        System.out.println("\nUndo Operation");

        String undo1 = null;
        String undo2 = null;

        if (!stack.isEmpty()) {
            undo1 = stack.pop();
            System.out.println("Undo 1: " + undo1);
        } else {
            System.out.println("Stack is empty (cannot undo)");
        }

        if (!stack.isEmpty()) {
            undo2 = stack.pop();
            System.out.println("Undo 2: " + undo2);
        } else {
            System.out.println("Stack is empty (cannot undo)");
        }

        // แสดงคำสั่งที่ถูก Undo
        System.out.println("\nUndo Summary");
        System.out.println("Last command undone: " + undo1);
        System.out.println("Second last command undone: " + undo2);

        // สถานะ Stack หลัง Undo
        System.out.println("\nStack After Undo");
        System.out.println(stack);

        // ตรวจสอบ Stack ว่าว่างหรือไม่
        System.out.println("\nSafety Check");
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }

        // อธิบาย LIFO
        System.out.println("\nLIFO Explanation");
        System.out.println("Stack uses LIFO (Last In First Out)");
        System.out.println("The last command added is the first one removed.");
        System.out.println("Example: 'Type Java' is removed first, then 'Type Algorithm'");

        // Time Complexity
        System.out.println("\nTime Complexity");
        System.out.println("push()    : O(1)");
        System.out.println("pop()     : O(1)");
        System.out.println("peek()    : O(1)");
        System.out.println("isEmpty() : O(1)");
    }
}
