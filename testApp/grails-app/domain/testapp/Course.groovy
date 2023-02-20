package testapp

class Course {

    // Declaring variables
    String department
    String courseTitle
    int noOfStudents
    Date startDate
    Lecturer courseLeader

    String toString() {
        return courseTitle
    }

    static constraints = {
        department size: 5..15, blank: false
        courseTitle size: 15..30, blank: false, unique: true
        noOfStudents min: 10
    }

    static hasMany = [student: Student, module: Module]
}
