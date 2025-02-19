fun main(){
    print("nhap 3 so thuc: ")
    val a = readLine()?.toDoubleOrNull() ?: -1.0

    val b = readLine()?.toDoubleOrNull() ?: -1.0
    val c = readLine()?.toDoubleOrNull() ?: -1.0
    if(a > 0 && b > 0 && c > 0 ){
        if(a + b > c && a + c > b && b + c > a ){
            println(" day la 1 tam giac")
        }
        else{
            println("day khong phai la tam giac ")
        }
    }
    else{
        println("nhap lai 3 so thuc ")
    }
}