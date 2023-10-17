package bt2.sapXepHocVienTheoDiem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStudent {
    static List<Student> listStudent = new ArrayList<>();

    static {
        listStudent.add(new Student(3, "duc", 10));
        listStudent.add(new Student(1, "binh", 8));
        listStudent.add(new Student(2, "anh", 9));
    }

    public static void bubbleSort() {
        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = 0; j < listStudent.size() - 1; j++) {
                if (listStudent.get(j).getStudentId() > listStudent.get(j + 1).getStudentId()) {
                    Student temp = listStudent.get(j);
                    listStudent.set(j, listStudent.get(j + 1));
                    listStudent.set(j + 1, temp);
                }
            }
        }
    }

    public static void insertSort() {
        for (int i = 0; i < listStudent.size(); i++) {
            Student currentStudent = listStudent.get(i);
            int k;
            for (k = i - 1; k >= 0 && listStudent.get(k).getScore() < currentStudent.getScore(); k--) {
                listStudent.set(k + 1, listStudent.get(k));
            }
            listStudent.set(k + 1, currentStudent);
        }
    }

    public static void selectionSort() {
        for (int i = 0; i < listStudent.size() - 1; i++) {
            Student currentMin = listStudent.get(i);
            int currentIndex = i;
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(j).getName().compareTo(currentMin.getName()) < 0) {
                    currentMin = listStudent.get(j);
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                Student temp = listStudent.get(i);
                listStudent.set(i, currentMin);
                listStudent.set(currentIndex, temp);
            }
        }
    }

    public static void main(String[] args) {
        for (Student list : listStudent) {
            System.out.println(list.toString());
        }
        bubbleSort();
        System.out.println("Danh sách sinh viên sau khi bubbleSort theo ID là: \n" + listStudent.toString());
        insertSort();
        System.out.println("Danh sách sinh viên sau khi insertSort theo điểm (giảm dần) là: \n" + listStudent.toString());
        selectionSort();
        System.out.println("Danh sách sinh viên sau khi selectionSort theo tên (A->Z) là: \n" + listStudent.toString());

    }
}
