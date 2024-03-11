
class Tablero() {
    var jugador1 = Array(3) { Casilla() }
    var jugador2 = Array(3) { Casilla() }
    var dado = Dado(20)

    fun elegirJugadorInicial(): Array<Casilla> {
        val resultado = dado.lanzar()
        return if (resultado % 2 == 0) jugador1 else jugador2
    }
    fun colocarCarta(jugador: Int, posicion: Int, carta: Carta) {
        if (jugador == 1) {
            jugador1[posicion].carta = carta
        } else {
            jugador2[posicion].carta = carta
        }
    }

    fun lanzarDado(): Int {
        return (1..20).random()
    }

    fun aplicarNivelACarta(jugador: Int, posicion: Int) {
        val nivel = lanzarDado()
        if (jugador == 1) {
            jugador1[posicion].carta?.nivel = nivel
        } else {
            jugador2[posicion].carta?.nivel = nivel
        }
    }

}