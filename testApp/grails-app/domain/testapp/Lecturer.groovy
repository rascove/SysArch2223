package testapp

class Lecturer {

    String name
    String position
    String department
    String subject
    String research
    String username
    String password

    String toString() {
        return name
    }

    static constraints = {
        name size: 10..100, blank: false, unique: true
        courseLed nullable: true
    }

    static hasOne = [courseLed: Course]

    static hasMany = [modulesLed: Module]
}
