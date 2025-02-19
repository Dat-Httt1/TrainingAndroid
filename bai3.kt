fun main() {
    print("nhap so thuc a: ")
    val a = readLine()?.toDoubleOrNull() ?: -1.0
    print("nhap so thuc b: ")
    val b = readLine()?.toDoubleOrNull() ?: -1.0
    print("nhap so thuc c: ")
    val c = readLine()?.toDoubleOrNull() ?: -1.0
    if (a > 0 && b > 0 && c > 0) {
        if (a + b > c && a + c > b && c + b > a) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                println("day la tam giac vuong ")
            } else {
                println("khong phai tam giac vuong")
            }
        } else {
            println("day khong phai tam giac")
        }
    }
}

