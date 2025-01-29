package ru.aston.Beilov_DR.task1;

class q3_Study {

    private String course;

    q3_Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        q3_Study study = new q3_Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}