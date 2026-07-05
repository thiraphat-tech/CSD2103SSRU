รายวิชา: Design and Analysis of Algorithms  
หัวข้อ: Array, Stack, Queue

วัตถุประสงค์
โปรเจกต์นี้จัดทำขึ้นเพื่อทบทวนการใช้โครงสร้างข้อมูลพื้นฐานในภาษา Java ได้แก่
- Array
- Stack
- Queue

AlgorithmReview/
│
├── src/
│ ├── ArrayCaseStudy.java
│ ├── StackCaseStudy.java
│ └── QueueCaseStudy.java

Case Study 1: Array (วิเคราะห์คะแนนนักศึกษา)

## แนวคิด
ใช้ Array เก็บคะแนนนักศึกษา 10 คน และคำนวณค่าสถิติ

```java
int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

Output ตัวอย่าง
thiraphat@MacBook-Air--Thiraphat CSD2103_2570 %  /usr/bin/env /Library/Java/JavaVirtualMachines
/jdk-24.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/thiraphat
/Library/Application\ Support/Code/User/workspaceStorage/bab186380cfd73205b97ff91561f2e6e/redha
t.java/jdt_ws/CSD2103_2570_4434e8db/bin ArrayCaseStudy 
Total Score : 62
Average Score : 6.2
Highest Score : 10
Lowest Score : 2
Students with score >= 7 : 5

Students needing review
Student 3 Score = 4
Student 8 Score = 3
Student 10 Score = 2

Time Complexity : O(n)

Case Study 2: Stack (Undo System)
แนวคิด ใช้ Stack จัดการคำสั่งแบบ LIFO (Last In First Out)

คำสั่งที่ใช้
push() → เพิ่มคำสั่ง
pop() → Undo คำสั่งล่าสุด
isEmpty() → ตรวจสอบก่อน pop

Output ตัวอย่าง
thiraphat@MacBook-Air--Thiraphat CSD2103_2570 %  /usr/bin/env /Library/Java/JavaVirtualMachines
/jdk-24.jdk/Contents/Home/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/thiraphat
/Library/Application\ Support/Code/User/workspaceStorage/bab186380cfd73205b97ff91561f2e6e/redha
t.java/jdt_ws/CSD2103_2570_4434e8db/bin StackCaseStudy 
Current Stack
[Type Data, Type Structure, Delete Structure, Type Algorithm, Type Java]

Undo Operation
Undo 1: Type Java
Undo 2: Type Algorithm

Undo Summary
Last command undone: Type Java
Second last command undone: Type Algorithm

Stack After Undo
[Type Data, Type Structure, Delete Structure]

Safety Check
Stack is not empty

LIFO Explanation
Stack uses LIFO (Last In First Out)
The last command added is the first one removed.
Example: 'Type Java' is removed first, then 'Type Algorithm'

Time Complexity
push()    : O(1)
pop()     : O(1)
peek()    : O(1)
isEmpty() : O(1)

Case Study 3: Queue (ระบบผู้ป่วย)
แนวคิด ใช้ Queue จัดการผู้ป่วยแบบ FIFO (First In First Out)

ลำดับเริ่มต้น

P001, P002, P003, P004, P005

เหตุการณ์
P001 และ P002 ได้รับบริการแล้ว
เพิ่ม P006 และ P007
ตรวจสอบคนถัดไปด้วย peek()
ตรวจสอบจำนวนคิวด้วย size()