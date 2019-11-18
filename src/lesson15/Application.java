package lesson15;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        // create hashmap of groups (name, students)
        Map<String, List<Student>> groups = new HashMap<>();

        //add groups
        for (int i = 1; i <= 3; i++) {
            groups.put("CS-" + i + "1", new ArrayList<>());
        }

        // print out map
        System.out.println(groups);

        //create students
        Student student0 = new Student("Nazer", 14);
        Student student1 = new Student("Oleg", 56);
        Student student2 = new Student("Ivan", 46);
        Student student3 = new Student("Ruslan", 24);
        Student student4 = new Student("Igor", 18);

        // get iterator for entry
        Iterator<Map.Entry<String, List<Student>>> groupIter = groups.entrySet().iterator();



        // add students to the group
        while (groupIter.hasNext()) {
            Map.Entry<String, List<Student>> next = groupIter.next();
            if (next.getKey().equalsIgnoreCase("CS-11")) {
                next.getValue().add(student0);
                next.getValue().add(student1);
                next.getValue().add(student3);
            } else if (next.getKey().equalsIgnoreCase("CS-21")) {
                next.getValue().add(student2);
            } else {
                next.getValue().add(student4);
            }
        }


        // show the map
        System.out.println();
        Iterator<Map.Entry<String, List<Student>>> groupIter2 = groups.entrySet().iterator();
        while (groupIter2.hasNext()) {
            Map.Entry<String, List<Student>> next = groupIter2.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }

        // get iterator
        System.out.println();
        Iterator<Map.Entry<String, List<Student>>> groupIter3 = groups.entrySet().iterator();
        while (groupIter3.hasNext()) {
            Map.Entry<String, List<Student>> next = groupIter3.next();
            if (next.getKey().equalsIgnoreCase("CS-11")) {
                next.getValue().remove(2);
            }
        }

        // in second group if name of student is "Oleg" delete him

        // show the content of the map
        System.out.println();
        Iterator<Map.Entry<String, List<Student>>> groupIter4 = groups.entrySet().iterator();
        while (groupIter4.hasNext()) {
            Map.Entry<String, List<Student>> next = groupIter4.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }

    }

}
