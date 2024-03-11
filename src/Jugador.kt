class Jugador {
    var cartas = Array(3) { Carta("", 0, 0, 0) }

    fun asignarCartasIniciales() {
        cartas[0] = Carta("Esqueleto", 10, 10, 1)
        cartas[1] = Carta("Fantasma", 15, 5, 1)
        cartas[2] = Carta("Lobo", 20, 20, 1)
    }
}