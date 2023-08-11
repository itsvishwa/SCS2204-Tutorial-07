def gcd(a: Int, b: Int): Int = b match{
    case 0 => a;
    case x if x > a => gcd(b, a);
    case _ => gcd(b, a%b); 
}

def isPrime(p: Int, n: Int): Boolean = n match{
    case x if (p == 1) => false; 
    case x if (x == p) => true;
    case x if gcd(p, x) > 1 => false;
    case x => isPrime(p, x+1)
}

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(isPrime(_, 2))
}

object Question03 extends App{
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    println(primeNumbers)
}
