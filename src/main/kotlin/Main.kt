fun main() {

    //Создание пустого изменяемого списка для хранения объектов класса Cell
    val cells = mutableListOf<Cell>()

    //Наполнение списка пустыми клетками
    for (i in 0 until 64) {
        val cell = Cell(
            number = i,
            isOccupied = false,
            isBlack = i % 2 != 0,//если делится на ноль без остатка, значит чётное число
            disc = Disc(
                isBlack = false
            )
        )
        cells.add(cell)
    }

    //Пробегаемся по списку cells и выводим в консоль клетки
    for (x in 0 until 8) {
        for (y in 0 until 8) {
            val cell = cells[x + y]
            val isCellBlack = cell.isBlack
            val symbol = if (isCellBlack) "[X]" else "[O]"
            print(" $symbol ")
        }
        println("\n")
    }

}
