package testapp

class Student {

    // Declaring variables
    String name
    String studentID
    String email
    String username
    String password

    String toString() {
        return name
    }

    static constraints = {
        name size: 10..100, blank: false
        studentID size: 10..50, blank: false, unique: true
    }

    static hasMany = [module: Module]

    static belongsTo = [course: Course]
}
