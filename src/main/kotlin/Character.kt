data class Character(val name: String, val Class: String, val subclass: String? = "") {
    var XP: Long = 0
    var level = 0
    var ATT = 20
    var DEF = 20
    var SPD = 20
    var SP = 0
    //var items = mutableListOf<Item>()
    //var badges = mutableListOf<Badge>()
    //lateinit var role: Role
}
