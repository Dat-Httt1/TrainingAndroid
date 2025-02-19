fun main(){
    print("Nhap vao so nguyen x: ")
    var x = readLine()
    if (x!= null){
        if(x.toInt() > 0)
            println("day la so nguyen duong")
        else {
            println("day la so nguyen am")
        }
    }
    else {
        println("so nhap khong hop le")
    }

}