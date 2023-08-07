def calculateSquare(numbers: List[Int]): List[Int] = {
  numbers.map(number => number * number)
}


object Question02 extends App{
    val inputList = List(1, 2, 3, 4, 5)
    val squaredNumbers = calculateSquare(inputList)
    println(squaredNumbers)
}


