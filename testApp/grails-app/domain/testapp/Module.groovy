package testapp

class Module {

    String title
    String code
    String department
    int credit
    String description
    Lecturer moduleLeader

    String toString() {
       return title
    }

    static constraints = {
        code size: 5..10, blank: false, unique: true
    }

    static hasMany = [student: Student]

    static belongsTo = [course: Course, student: Student]
}
