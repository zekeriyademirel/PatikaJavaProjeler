package OgrenciBilgiSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course matSozlu;
    Course fizik;
    Course fizSozlu;
    Course kimya;
    Course kimSozlu;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course matSozlu,
            Course fizik, Course fizSozlu, Course kimya, Course kimSozlu) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.matSozlu = matSozlu;
        this.fizik = fizik;
        this.fizSozlu = fizSozlu;
        this.kimya = kimya;
        this.kimSozlu = kimSozlu;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matSozlu, int fizik, int fizSozlu, int kimya, int kimSozlu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (matSozlu >= 0 && matSozlu <= 100) {
            this.matSozlu.note = matSozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fizSozlu >= 0 && fizSozlu <= 100) {
            this.fizSozlu.note = fizSozlu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kimSozlu >= 0 && kimSozlu <= 100) {
            this.kimSozlu.note = kimSozlu;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.matSozlu.note == 0 || this.fizik.note == 0
                || this.fizSozlu.note == 0 || this.kimya.note == 0 || this.kimSozlu.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.mat.note = (this.mat.note * 0.80 + this.matSozlu.note * 0.20);
        this.fizik.note = (this.fizik.note * 0.80 + this.fizSozlu.note * 0.20);
        this.kimya.note = (this.kimya.note * 0.80 + this.kimSozlu.note * 0.20);

        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}

