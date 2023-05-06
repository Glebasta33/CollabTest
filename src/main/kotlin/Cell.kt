data class Cell(
    val number: Int,
    val isOccupied: Boolean, //Занята клетка или нет
    val isBlack: Boolean, //Черная ли клетка
    val disc: Disc, //Черная ли шашка
)