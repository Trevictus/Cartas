class Dado(val caras: Int) {
    fun lanzar(): Int {
        return (1..caras).random()
    }
}