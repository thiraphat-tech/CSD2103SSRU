public class MergeArray {

    // เมธอดสำหรับรวม Array ที่เรียงลำดับแล้ว 2 ตัว
    public static int[] merge(int[] left, int[] right) {

        // สร้าง Array ใหม่เพื่อเก็บผลลัพธ์
        int[] result = new int[left.length + right.length];

        // i ใช้ชี้ตำแหน่งใน Array left
        int i = 0;

        // j ใช้ชี้ตำแหน่งใน Array right
        int j = 0;

        // k ใช้ชี้ตำแหน่งใน Array result
        int k = 0;

        // วนลูปจนกว่า Array ใด Array หนึ่งจะหมด
        while (i < left.length && j < right.length) {

            // เปรียบเทียบค่าของ left กับ right
            if (left[i] <= right[j]) {

                // ถ้า left น้อยกว่าหรือเท่ากับ ให้นำไปเก็บใน result
                result[k] = left[i];

                // เลื่อนไปสมาชิกตัวถัดไปของ left
                i++;

            } else {

                // ถ้า right น้อยกว่า ให้นำไปเก็บใน result
                result[k] = right[j];

                // เลื่อนไปสมาชิกตัวถัดไปของ right
                j++;
            }

            // เลื่อนตำแหน่งของ result ไปช่องถัดไป
            k++;
        }

        // ถ้า left ยังมีข้อมูลเหลือ ให้นำมาใส่ต่อทั้งหมด
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        // ถ้า right ยังมีข้อมูลเหลือ ให้นำมาใส่ต่อทั้งหมด
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        // ส่ง Array ที่รวมเสร็จแล้วกลับไป
        return result;
    }

    // เมธอดหลักของโปรแกรม
    public static void main(String[] args) {

        // สร้าง Array ฝั่งซ้าย (เรียงลำดับแล้ว)
        int[] left = {1, 4, 7, 9};

        // สร้าง Array ฝั่งขวา (เรียงลำดับแล้ว)
        int[] right = {2, 3, 5, 8};

        // เรียกใช้เมธอด merge() และเก็บผลลัพธ์ไว้ใน result
        int[] result = merge(left, right);

        // แสดงข้อความ
        System.out.print("Merged Array : ");

        // วนลูปแสดงข้อมูลทุกตัวใน result
        for (int num : result) {
        System.out.print(num + " ");
}
        System.out.println(); // ขึ้นบรรทัดใหม่
    }
}