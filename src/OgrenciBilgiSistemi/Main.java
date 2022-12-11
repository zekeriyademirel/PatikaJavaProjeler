package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course matSozlu = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course fizSozlu = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course kimSozlu = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        matSozlu.addTeacher(t1);
        fizik.addTeacher(t2);
        fizSozlu.addTeacher(t2);
        kimya.addTeacher(t3);
        kimSozlu.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015",
                mat,matSozlu, fizik,fizSozlu, kimya,kimSozlu);
        s1.addBulkExamNote(50, 50, 40,30,70,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133",
                mat,matSozlu,fizik,fizSozlu,kimya,kimSozlu);
        s2.addBulkExamNote(100, 100, 40,70,50,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312",
                mat,matSozlu,fizik,fizSozlu,kimya,kimSozlu);
        s3.addBulkExamNote(50, 70, 40,40,80,75);
        s3.isPass();

    }
}

